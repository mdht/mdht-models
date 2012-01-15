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
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(ConsultationSummary) <em>Get Allergies Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional(ConsultationSummary)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(136));
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
  protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(MedicationsSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(MedicationsSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(137));
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
  protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProblemSectionEntriesOptional getProblemSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(138));
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
  protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(ResultsSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(ResultsSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ResultsSectionEntriesOptional getResultsSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(139));
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
  protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(140));
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
  protected static final String GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(EncountersSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(EncountersSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  EncountersSectionEntriesOptional getEncountersSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(141));
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
  protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FamilyHistorySection))->asSequence()->first().oclAsType(FamilyHistorySection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FamilyHistorySection))->asSequence()->first().oclAsType(FamilyHistorySection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  FamilyHistorySection getFamilyHistorySection(ConsultationSummary consultationSummary)
  {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(142));
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
  protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FunctionalStatusSection))->asSequence()->first().oclAsType(FunctionalStatusSection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FunctionalStatusSection))->asSequence()->first().oclAsType(FunctionalStatusSection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  FunctionalStatusSection getFunctionalStatusSection(ConsultationSummary consultationSummary)
  {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(143));
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
  protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(144));
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
  protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(ProceduresSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(ProceduresSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(145));
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
  protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicalEquipmentSection))->asSequence()->first().oclAsType(MedicalEquipmentSection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicalEquipmentSection))->asSequence()->first().oclAsType(MedicalEquipmentSection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  MedicalEquipmentSection getMedicalEquipmentSection(ConsultationSummary consultationSummary)
  {
		if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(146));
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
  protected static final String GET_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PayersSection))->asSequence()->first().oclAsType(PayersSection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PayersSection))->asSequence()->first().oclAsType(PayersSection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PayersSection getPayersSection(ConsultationSummary consultationSummary)
  {
		if (GET_PAYERS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(147));
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
  protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  PlanOfCareSection getPlanOfCareSection(ConsultationSummary consultationSummary)
  {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(148));
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
  protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(SocialHistorySection))->asSequence()->first().oclAsType(SocialHistorySection)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(SocialHistorySection))->asSequence()->first().oclAsType(SocialHistorySection)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  SocialHistorySection getSocialHistorySection(ConsultationSummary consultationSummary)
  {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(149));
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
  protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(VitalSignsSectionEntriesOptional)";

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
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(VitalSignsSectionEntriesOptional)
	 * @param consultationSummary The receiving '<em><b>Consultation Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(ConsultationSummary consultationSummary)
  {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_SUMMARY, ConsoltocPackage.Literals.CONSULTATION_SUMMARY.getEAllOperations().get(150));
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