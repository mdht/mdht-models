/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPlugin;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary;

import org.openhealthtools.mdht.uml.cda.consoltoc.util.ConsoltocValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryEncountersSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Encounters Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getAdvanceDirectivesSectionEntriesOptional() <em>Get Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getEncountersSectionEntriesOptional() <em>Get Encounters Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsultationSummaryOperations extends GeneralHeaderConstraintsOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConsultationSummaryOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryAllergiesSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryAllergiesSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryAllergiesSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Allergies Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryAllergiesSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryAllergiesSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryAllergiesSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryMedicationsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryMedicationsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryMedicationsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Medications Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryMedicationsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryMedicationsSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryMedicationsSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryProblemSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryProblemSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryProblemSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Problem Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryProblemSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryProblemSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryProblemSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryResultsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Results Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryResultsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryResultsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Results Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryResultsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryResultsSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryResultsSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Advance Directives Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Advance Directives Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryAdvanceDirectivesSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryEncountersSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Encounters Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryEncountersSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryEncountersSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Encounters Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryEncountersSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryEncountersSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryEncountersSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryFamilyHistorySection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryFamilyHistorySection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryFamilyHistorySection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryFamilyHistorySection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryFamilyHistorySection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryFamilyHistorySection"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryFunctionalStatusSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryFunctionalStatusSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryFunctionalStatusSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Functional Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryFunctionalStatusSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryFunctionalStatusSection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryFunctionalStatusSection"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryImmunizationsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryImmunizationsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryImmunizationsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Immunizations Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryImmunizationsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryImmunizationsSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryImmunizationsSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryProceduresSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Procedures Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryProceduresSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryProceduresSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Procedures Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryProceduresSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryProceduresSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryProceduresSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryMedicalEquipmentSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryMedicalEquipmentSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryMedicalEquipmentSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Medical Equipment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryMedicalEquipmentSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryMedicalEquipmentSection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryMedicalEquipmentSection"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryPayersSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryPayersSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryPayersSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Payers Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryPayersSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryPayersSection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PAYERS_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryPayersSection"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryPlanOfCareSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryPlanOfCareSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryPlanOfCareSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryPlanOfCareSection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryPlanOfCareSection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryPlanOfCareSection"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummarySocialHistorySection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummarySocialHistorySection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummarySocialHistorySection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummarySocialHistorySection(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummarySocialHistorySection(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummarySocialHistorySection"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateConsultationSummaryVitalSignsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryVitalSignsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))";

  /**
	 * The cached OCL invariant for the '{@link #validateConsultationSummaryVitalSignsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Vital Signs Section Entries Optional</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateConsultationSummaryVitalSignsSectionEntriesOptional(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateConsultationSummaryVitalSignsSectionEntriesOptional(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL,
						 ConsoltocPlugin.INSTANCE.getString("ConsultationSummaryVitalSignsSectionEntriesOptional"),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(ConsultationSummary) <em>Get Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(ConsultationSummary) <em>Get Allergies Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(154));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getMedicationsSectionEntriesOptional(ConsultationSummary) <em>Get Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::MedicationsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getMedicationsSectionEntriesOptional(ConsultationSummary) <em>Get Medications Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::MedicationsSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(155));
			try {
				GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (MedicationsSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(ConsultationSummary) <em>Get Problem Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional(ConsultationSummary) <em>Get Problem Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProblemSectionEntriesOptional getProblemSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(156));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProblemSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getResultsSectionEntriesOptional(ConsultationSummary) <em>Get Results Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ResultsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getResultsSectionEntriesOptional(ConsultationSummary) <em>Get Results Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ResultsSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ResultsSectionEntriesOptional getResultsSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(157));
			try {
				GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ResultsSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSectionEntriesOptional(ConsultationSummary) <em>Get Advance Directives Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSectionEntriesOptional(ConsultationSummary) <em>Get Advance Directives Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(158));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AdvanceDirectivesSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getEncountersSectionEntriesOptional(ConsultationSummary) <em>Get Encounters Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEncountersSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(consol::EncountersSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getEncountersSectionEntriesOptional(ConsultationSummary) <em>Get Encounters Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEncountersSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(consol::EncountersSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  EncountersSectionEntriesOptional getEncountersSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(159));
			try {
				GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (EncountersSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(ConsultationSummary) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)";

  /**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(ConsultationSummary) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  FamilyHistorySection getFamilyHistorySection(ConsultationSummary consultationSummary)
  {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(160));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection(ConsultationSummary) <em>Get Functional Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)";

  /**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection(ConsultationSummary) <em>Get Functional Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  FunctionalStatusSection getFunctionalStatusSection(ConsultationSummary consultationSummary)
  {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(161));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional(ConsultationSummary) <em>Get Immunizations Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional(ConsultationSummary) <em>Get Immunizations Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(162));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional(ConsultationSummary) <em>Get Procedures Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProceduresSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getProceduresSectionEntriesOptional(ConsultationSummary) <em>Get Procedures Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProceduresSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(163));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProceduresSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(ConsultationSummary) <em>Get Medical Equipment Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)";

  /**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection(ConsultationSummary) <em>Get Medical Equipment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  MedicalEquipmentSection getMedicalEquipmentSection(ConsultationSummary consultationSummary)
  {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(164));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
		return (MedicalEquipmentSection) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getPayersSection(ConsultationSummary) <em>Get Payers Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPayersSection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)";

  /**
	 * The cached OCL query for the '{@link #getPayersSection(ConsultationSummary) <em>Get Payers Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPayersSection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PAYERS_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PayersSection getPayersSection(ConsultationSummary consultationSummary)
  {
		if (GET_PAYERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(165));
			try {
				GET_PAYERS_SECTION__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYERS_SECTION__EOCL_QRY);
		return (PayersSection) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getPlanOfCareSection(ConsultationSummary) <em>Get Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

  /**
	 * The cached OCL query for the '{@link #getPlanOfCareSection(ConsultationSummary) <em>Get Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPlanOfCareSection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PlanOfCareSection getPlanOfCareSection(ConsultationSummary consultationSummary)
  {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(166));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ConsultationSummary) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)";

  /**
	 * The cached OCL query for the '{@link #getSocialHistorySection(ConsultationSummary) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  SocialHistorySection getSocialHistorySection(ConsultationSummary consultationSummary)
  {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(167));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(ConsultationSummary) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)";

  /**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(ConsultationSummary) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(168));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(consultationSummary);
	}

  /**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.3.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.3.1')
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateGeneralHeaderConstraintsTemplateId(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsoltocValidator.DIAGNOSTIC_SOURCE,
						 ConsoltocValidator.CONSULTATION_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consultationSummary, context) }),
						 new Object [] { consultationSummary }));
			}
			return false;
		}
		return true;
	}

} // ConsultationSummaryOperations