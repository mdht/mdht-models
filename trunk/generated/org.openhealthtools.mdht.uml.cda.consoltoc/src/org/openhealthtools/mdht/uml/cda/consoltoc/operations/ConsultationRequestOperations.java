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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest;
import org.openhealthtools.mdht.uml.cda.consoltoc.util.ConsoltocValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Request</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getReasonForReferralSection() <em>Get Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getAdvanceDirectivesSectionEntriesOptional() <em>Get Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getEncountersSectionEntriesOptional() <em>Get Encounters Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsultationRequestOperations extends GeneralHeaderConstraintsOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConsultationRequestOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(ConsultationRequest) <em>Get Allergies Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllergiesSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(ConsultationRequest) <em>Get Allergies Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllergiesSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(136));
      try
      {
        GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (AllergiesSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ConsultationRequest) <em>Get Assessment And Plan Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssessmentAndPlanSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))->asSequence()->first().oclAsType(consol::AssessmentAndPlanSection)";

  /**
   * The cached OCL query for the '{@link #getAssessmentAndPlanSection(ConsultationRequest) <em>Get Assessment And Plan Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssessmentAndPlanSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))->asSequence()->first().oclAsType(consol::AssessmentAndPlanSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  AssessmentAndPlanSection getAssessmentAndPlanSection(ConsultationRequest consultationRequest)
  {
    if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(137));
      try
      {
        GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
    return (AssessmentAndPlanSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(ConsultationRequest) <em>Get History Of Present Illness Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHistoryOfPresentIllnessSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPresentIllnessSection)";

  /**
   * The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(ConsultationRequest) <em>Get History Of Present Illness Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHistoryOfPresentIllnessSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPresentIllnessSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(ConsultationRequest consultationRequest)
  {
    if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(138));
      try
      {
        GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
    return (HistoryOfPresentIllnessSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getPhysicalExamSection(ConsultationRequest) <em>Get Physical Exam Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalExamSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)";

  /**
   * The cached OCL query for the '{@link #getPhysicalExamSection(ConsultationRequest) <em>Get Physical Exam Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhysicalExamSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->first().oclAsType(consol::PhysicalExamSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  PhysicalExamSection getPhysicalExamSection(ConsultationRequest consultationRequest)
  {
    if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(139));
      try
      {
        GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
    return (PhysicalExamSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getReasonForReferralSection(ConsultationRequest) <em>Get Reason For Referral Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReasonForReferralSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))->asSequence()->first().oclAsType(consol::ReasonForReferralSection)";

  /**
   * The cached OCL query for the '{@link #getReasonForReferralSection(ConsultationRequest) <em>Get Reason For Referral Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReasonForReferralSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))->asSequence()->first().oclAsType(consol::ReasonForReferralSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  ReasonForReferralSection getReasonForReferralSection(ConsultationRequest consultationRequest)
  {
    if (GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(140));
      try
      {
        GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY);
    return (ReasonForReferralSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getMedicationsSectionEntriesOptional(ConsultationRequest) <em>Get Medications Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicationsSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::MedicationsSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getMedicationsSectionEntriesOptional(ConsultationRequest) <em>Get Medications Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicationsSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::MedicationsSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(141));
      try
      {
        GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (MedicationsSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(ConsultationRequest) <em>Get Problem Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProblemSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getProblemSectionEntriesOptional(ConsultationRequest) <em>Get Problem Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProblemSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProblemSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  ProblemSectionEntriesOptional getProblemSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(142));
      try
      {
        GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (ProblemSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional(ConsultationRequest) <em>Get Procedures Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProceduresSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProceduresSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getProceduresSectionEntriesOptional(ConsultationRequest) <em>Get Procedures Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProceduresSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ProceduresSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(143));
      try
      {
        GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (ProceduresSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getResultsSectionEntriesOptional(ConsultationRequest) <em>Get Results Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultsSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ResultsSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getResultsSectionEntriesOptional(ConsultationRequest) <em>Get Results Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultsSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ResultsSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  ResultsSectionEntriesOptional getResultsSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(144));
      try
      {
        GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (ResultsSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getAdvanceDirectivesSectionEntriesOptional(ConsultationRequest) <em>Get Advance Directives Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvanceDirectivesSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getAdvanceDirectivesSectionEntriesOptional(ConsultationRequest) <em>Get Advance Directives Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdvanceDirectivesSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AdvanceDirectivesSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(145));
      try
      {
        GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (AdvanceDirectivesSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getEncountersSectionEntriesOptional(ConsultationRequest) <em>Get Encounters Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncountersSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(consol::EncountersSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getEncountersSectionEntriesOptional(ConsultationRequest) <em>Get Encounters Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncountersSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(consol::EncountersSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  EncountersSectionEntriesOptional getEncountersSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(146));
      try
      {
        GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (EncountersSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getFamilyHistorySection(ConsultationRequest) <em>Get Family History Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamilyHistorySection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)";

  /**
   * The cached OCL query for the '{@link #getFamilyHistorySection(ConsultationRequest) <em>Get Family History Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFamilyHistorySection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->first().oclAsType(consol::FamilyHistorySection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  FamilyHistorySection getFamilyHistorySection(ConsultationRequest consultationRequest)
  {
    if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(147));
      try
      {
        GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
    return (FamilyHistorySection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getFunctionalStatusSection(ConsultationRequest) <em>Get Functional Status Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionalStatusSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)";

  /**
   * The cached OCL query for the '{@link #getFunctionalStatusSection(ConsultationRequest) <em>Get Functional Status Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionalStatusSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->first().oclAsType(consol::FunctionalStatusSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  FunctionalStatusSection getFunctionalStatusSection(ConsultationRequest consultationRequest)
  {
    if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(148));
      try
      {
        GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
    return (FunctionalStatusSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional(ConsultationRequest) <em>Get Immunizations Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImmunizationsSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional(ConsultationRequest) <em>Get Immunizations Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImmunizationsSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::ImmunizationsSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(149));
      try
      {
        GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (ImmunizationsSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getMedicalEquipmentSection(ConsultationRequest) <em>Get Medical Equipment Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicalEquipmentSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)";

  /**
   * The cached OCL query for the '{@link #getMedicalEquipmentSection(ConsultationRequest) <em>Get Medical Equipment Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicalEquipmentSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection))->asSequence()->first().oclAsType(consol::MedicalEquipmentSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  MedicalEquipmentSection getMedicalEquipmentSection(ConsultationRequest consultationRequest)
  {
    if (GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(150));
      try
      {
        GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION__EOCL_QRY);
    return (MedicalEquipmentSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getPlanOfCareSection(ConsultationRequest) <em>Get Plan Of Care Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanOfCareSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)";

  /**
   * The cached OCL query for the '{@link #getPlanOfCareSection(ConsultationRequest) <em>Get Plan Of Care Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanOfCareSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->first().oclAsType(consol::PlanOfCareSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  PlanOfCareSection getPlanOfCareSection(ConsultationRequest consultationRequest)
  {
    if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(151));
      try
      {
        GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
    return (PlanOfCareSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getSocialHistorySection(ConsultationRequest) <em>Get Social History Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSocialHistorySection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)";

  /**
   * The cached OCL query for the '{@link #getSocialHistorySection(ConsultationRequest) <em>Get Social History Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSocialHistorySection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->first().oclAsType(consol::SocialHistorySection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  SocialHistorySection getSocialHistorySection(ConsultationRequest consultationRequest)
  {
    if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(152));
      try
      {
        GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
    return (SocialHistorySection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(ConsultationRequest) <em>Get Vital Signs Section Entries Optional</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitalSignsSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)";

  /**
   * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(ConsultationRequest) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitalSignsSectionEntriesOptional(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(consol::VitalSignsSectionEntriesOptional)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(ConsultationRequest consultationRequest)
  {
    if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(153));
      try
      {
        GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
    return (VitalSignsSectionEntriesOptional) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getChiefComplaintSection(ConsultationRequest) <em>Get Chief Complaint Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChiefComplaintSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->first().oclAsType(consol::ChiefComplaintSection)";

  /**
   * The cached OCL query for the '{@link #getChiefComplaintSection(ConsultationRequest) <em>Get Chief Complaint Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChiefComplaintSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->first().oclAsType(consol::ChiefComplaintSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  ChiefComplaintSection getChiefComplaintSection(ConsultationRequest consultationRequest)
  {
    if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(154));
      try
      {
        GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
    return (ChiefComplaintSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(ConsultationRequest) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChiefComplaintAndReasonForVisitSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->first().oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

  /**
   * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(ConsultationRequest) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChiefComplaintAndReasonForVisitSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->first().oclAsType(consol::ChiefComplaintAndReasonForVisitSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(ConsultationRequest consultationRequest)
  {
    if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(155));
      try
      {
        GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
    return (ChiefComplaintAndReasonForVisitSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getGeneralStatusSection(ConsultationRequest) <em>Get General Status Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralStatusSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->first().oclAsType(consol::GeneralStatusSection)";

  /**
   * The cached OCL query for the '{@link #getGeneralStatusSection(ConsultationRequest) <em>Get General Status Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralStatusSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->first().oclAsType(consol::GeneralStatusSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  GeneralStatusSection getGeneralStatusSection(ConsultationRequest consultationRequest)
  {
    if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(156));
      try
      {
        GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
    return (GeneralStatusSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(ConsultationRequest) <em>Get History Of Past Illness Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHistoryOfPastIllnessSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPastIllnessSection)";

  /**
   * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(ConsultationRequest) <em>Get History Of Past Illness Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHistoryOfPastIllnessSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(consol::HistoryOfPastIllnessSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(ConsultationRequest consultationRequest)
  {
    if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(157));
      try
      {
        GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
    return (HistoryOfPastIllnessSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #getPayersSection(ConsultationRequest) <em>Get Payers Section</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayersSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static final String GET_PAYERS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)";

  /**
   * The cached OCL query for the '{@link #getPayersSection(ConsultationRequest) <em>Get Payers Section</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayersSection(ConsultationRequest)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PAYERS_SECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection))->asSequence()->first().oclAsType(consol::PayersSection)
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  PayersSection getPayersSection(ConsultationRequest consultationRequest)
  {
    if (GET_PAYERS_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST, ConsoltocPackage.Literals.CONSULTATION_REQUEST.getEAllOperations().get(158));
      try
      {
        GET_PAYERS_SECTION__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PAYERS_SECTION__EOCL_QRY);
    return (PayersSection) query.evaluate(consultationRequest);
  }

  /**
   * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.4.1')";

  /**
   * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsTemplateId(ConsultationRequest, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.1275.1.1.4.1')
   * @param consultationRequest The receiving '<em><b>Consultation Request</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  public static  boolean validateGeneralHeaderConstraintsTemplateId(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsoltocPackage.Literals.CONSULTATION_REQUEST);
      try
      {
        VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(consultationRequest))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsoltocValidator.DIAGNOSTIC_SOURCE,
             ConsoltocValidator.CONSULTATION_REQUEST__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(consultationRequest, context) }),
             new Object [] { consultationRequest }));
      }
      return false;
    }
    return true;
  }

} // ConsultationRequestOperations