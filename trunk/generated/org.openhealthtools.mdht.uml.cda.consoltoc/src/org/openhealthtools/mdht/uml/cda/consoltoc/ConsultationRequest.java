/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consultation Request</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage#getConsultationRequest()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.1275.1.1.4.1' constraints.validation.error='ConsultationRequestTemplateId'"
 * @generated
 */
public interface ConsultationRequest extends GeneralHeaderConstraints
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(AllergiesSectionEntriesOptional)'"
	 * @generated
	 */
  AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AssessmentAndPlanSection))->asSequence()->first().oclAsType(AssessmentAndPlanSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AssessmentAndPlanSection))->asSequence()->first().oclAsType(AssessmentAndPlanSection)'"
	 * @generated
	 */
  AssessmentAndPlanSection getAssessmentAndPlanSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HistoryOfPresentIllnessSection))->asSequence()->first().oclAsType(HistoryOfPresentIllnessSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HistoryOfPresentIllnessSection))->asSequence()->first().oclAsType(HistoryOfPresentIllnessSection)'"
	 * @generated
	 */
  HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PhysicalExamSection))->asSequence()->first().oclAsType(PhysicalExamSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PhysicalExamSection))->asSequence()->first().oclAsType(PhysicalExamSection)'"
	 * @generated
	 */
  PhysicalExamSection getPhysicalExamSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ReasonForReferralSection))->asSequence()->first().oclAsType(ReasonForReferralSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ReasonForReferralSection))->asSequence()->first().oclAsType(ReasonForReferralSection)'"
	 * @generated
	 */
  ReasonForReferralSection getReasonForReferralSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(MedicationsSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicationsSectionEntriesOptional))->asSequence()->first().oclAsType(MedicationsSectionEntriesOptional)'"
	 * @generated
	 */
  MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProblemSectionEntriesOptional))->asSequence()->first().oclAsType(ProblemSectionEntriesOptional)'"
	 * @generated
	 */
  ProblemSectionEntriesOptional getProblemSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(ProceduresSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ProceduresSectionEntriesOptional))->asSequence()->first().oclAsType(ProceduresSectionEntriesOptional)'"
	 * @generated
	 */
  ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(ResultsSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ResultsSectionEntriesOptional))->asSequence()->first().oclAsType(ResultsSectionEntriesOptional)'"
	 * @generated
	 */
  ResultsSectionEntriesOptional getResultsSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(AdvanceDirectivesSectionEntriesOptional))->asSequence()->first().oclAsType(AdvanceDirectivesSectionEntriesOptional)'"
	 * @generated
	 */
  AdvanceDirectivesSectionEntriesOptional getAdvanceDirectivesSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(EncountersSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(EncountersSectionEntriesOptional))->asSequence()->first().oclAsType(EncountersSectionEntriesOptional)'"
	 * @generated
	 */
  EncountersSectionEntriesOptional getEncountersSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FamilyHistorySection))->asSequence()->first().oclAsType(FamilyHistorySection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FamilyHistorySection))->asSequence()->first().oclAsType(FamilyHistorySection)'"
	 * @generated
	 */
  FamilyHistorySection getFamilyHistorySection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FunctionalStatusSection))->asSequence()->first().oclAsType(FunctionalStatusSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(FunctionalStatusSection))->asSequence()->first().oclAsType(FunctionalStatusSection)'"
	 * @generated
	 */
  FunctionalStatusSection getFunctionalStatusSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ImmunizationsSectionEntriesOptional))->asSequence()->first().oclAsType(ImmunizationsSectionEntriesOptional)'"
	 * @generated
	 */
  ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicalEquipmentSection))->asSequence()->first().oclAsType(MedicalEquipmentSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(MedicalEquipmentSection))->asSequence()->first().oclAsType(MedicalEquipmentSection)'"
	 * @generated
	 */
  MedicalEquipmentSection getMedicalEquipmentSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PlanOfCareSection))->asSequence()->first().oclAsType(PlanOfCareSection)'"
	 * @generated
	 */
  PlanOfCareSection getPlanOfCareSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(SocialHistorySection))->asSequence()->first().oclAsType(SocialHistorySection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(SocialHistorySection))->asSequence()->first().oclAsType(SocialHistorySection)'"
	 * @generated
	 */
  SocialHistorySection getSocialHistorySection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(VitalSignsSectionEntriesOptional)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(VitalSignsSectionEntriesOptional))->asSequence()->first().oclAsType(VitalSignsSectionEntriesOptional)'"
	 * @generated
	 */
  VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ChiefComplaintSection))->asSequence()->first().oclAsType(ChiefComplaintSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ChiefComplaintSection))->asSequence()->first().oclAsType(ChiefComplaintSection)'"
	 * @generated
	 */
  ChiefComplaintSection getChiefComplaintSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ChiefComplaintAndReasonForVisitSection))->asSequence()->first().oclAsType(ChiefComplaintAndReasonForVisitSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ChiefComplaintAndReasonForVisitSection))->asSequence()->first().oclAsType(ChiefComplaintAndReasonForVisitSection)'"
	 * @generated
	 */
  ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(GeneralStatusSection))->asSequence()->first().oclAsType(GeneralStatusSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(GeneralStatusSection))->asSequence()->first().oclAsType(GeneralStatusSection)'"
	 * @generated
	 */
  GeneralStatusSection getGeneralStatusSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(HistoryOfPastIllnessSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(HistoryOfPastIllnessSection))->asSequence()->first().oclAsType(HistoryOfPastIllnessSection)'"
	 * @generated
	 */
  HistoryOfPastIllnessSection getHistoryOfPastIllnessSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PayersSection))->asSequence()->first().oclAsType(PayersSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(PayersSection))->asSequence()->first().oclAsType(PayersSection)'"
	 * @generated
	 */
  PayersSection getPayersSection();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConsultationRequest init();
} // ConsultationRequest
