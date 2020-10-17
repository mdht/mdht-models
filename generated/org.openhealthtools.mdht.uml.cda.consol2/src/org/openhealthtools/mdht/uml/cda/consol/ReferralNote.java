/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referral Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getReferralNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='USRealmHeader2TemplateId ReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2 ReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent ReferralNoteCode ReferralNoteCodeP ReferralNoteInformationRecipient ReferralNoteProblemSection2 ReferralNoteAllergiesSection2 ReferralNoteMedicationsSection2 ReferralNoteReasonForReferralSection2 ReferralNoteInformationRecipientIntendedRecipientPersonName ReferralNoteInformationRecipientIntendedRecipientInformationRecipient ReferralNoteInformationRecipientIntendedRecipient ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson ReferralNoteParticipantCaregiverTypeCode ReferralNoteParticipantCaregiverAssociatedEntity ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityClassCode ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity' templateId.root='2.16.840.1.113883.10.20.22.1.14' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.ReferralNoteCode='ReferralNoteCodeP' constraints.validation.warning='ReferralNoteParticipantCaregiver ReferralNoteParticipantCallbackContact ReferralNotePlanOfTreatmentSection2 ReferralNoteResultsSection2 ReferralNoteFunctionalStatusSection2 ReferralNoteNutritionSection ReferralNoteMentalStatusSection ReferralNoteInformationRecipientIntendedRecipientAddr ReferralNoteInformationRecipientIntendedRecipientTelecom ReferralNoteParticipantCallbackContactAssociatedEntityAddr' constraints.validation.info='ReferralNoteAdvanceDirectivesSectionEntriesOptional2 ReferralNoteHistoryOfPresentIllnessSection ReferralNoteImmunizationsSection2 ReferralNoteProceduresSectionEntriesOptional2 ReferralNoteReviewOfSystemsSection ReferralNoteSocialHistorySection2 ReferralNoteVitalSignsSection2 ReferralNotePhysicalExamSection2 ReferralNoteAdvanceDirectivesSectionEntriesOptional2b ReferralNoteMedicalEquipmentSection2 ReferralNoteAssessmentSection ReferralNoteAssessmentAndPlanSection2 ReferralNoteHistoryOfPastIllnessSection2 ReferralNoteGeneralStatusSection ReferralNoteFamilyHistorySection2 ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization' constraints.validation.query='ReferralNoteInformationRecipientIntendedRecipientPersonName ReferralNoteInformationRecipientIntendedRecipientAddr ReferralNoteInformationRecipientIntendedRecipientTelecom ReferralNoteInformationRecipientIntendedRecipientInformationRecipient ReferralNoteInformationRecipientIntendedRecipient ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson ReferralNoteParticipantCaregiverTypeCode ReferralNoteParticipantCaregiverAssociatedEntity ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityAddr ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityClassCode ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity' constraints.validation.dependOn.ReferralNoteParticipantCaregiverAssociatedEntityClassCode='ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipient constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipientIntendedRecipient constraints.validation.warning='ReferralNoteInformationRecipientIntendedRecipientAddr ReferralNoteInformationRecipientIntendedRecipientTelecom' constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipientInformationRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipientIntendedRecipientPerson constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipientPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiver typeCode='IND' constraints.validation.error='ReferralNoteParticipantCaregiverTypeCode ReferralNoteParticipantCaregiverAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiverAssociatedEntity constraints.validation.error='ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson' constraints.validation.dependOn.ReferralNoteParticipantCaregiverAssociatedEntityClassCode='ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson constraints.validation.error='ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContact typeCode='CALLBCK' constraints.validation.error='ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContactAssociatedEntity constraints.validation.error='ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityClassCode ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson' constraints.validation.warning='ReferralNoteParticipantCallbackContactAssociatedEntityAddr' classCode='ASSIGNED' constraints.validation.info='ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson constraints.validation.error='ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName'"
 * @generated
 */
public interface ReferralNote extends USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReferralNoteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReferralNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;one(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))-&gt;select(typeCode=vocab::ParticipationType::IND)-&gt;notEmpty()'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiver(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))-&gt;select(typeCode=vocab::ParticipationType::CALLBCK)-&gt;notEmpty()'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContact(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))'"
	 * @generated
	 */
	boolean validateReferralNotePlanOfTreatmentSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))'"
	 * @generated
	 */
	boolean validateReferralNoteHistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteImmunizationsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteProblemSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateReferralNoteProceduresSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteResultsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))'"
	 * @generated
	 */
	boolean validateReferralNoteReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))'"
	 * @generated
	 */
	boolean validateReferralNoteSocialHistorySection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteVitalSignsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteFunctionalStatusSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))'"
	 * @generated
	 */
	boolean validateReferralNotePhysicalExamSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))'"
	 * @generated
	 */
	boolean validateReferralNoteNutritionSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection))'"
	 * @generated
	 */
	boolean validateReferralNoteMentalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteMedicalEquipmentSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteAllergiesSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))'"
	 * @generated
	 */
	boolean validateReferralNoteAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteAssessmentAndPlanSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteHistoryOfPastIllnessSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))'"
	 * @generated
	 */
	boolean validateReferralNoteGeneralStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteMedicationsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection2))'"
	 * @generated
	 */
	boolean validateReferralNoteReasonForReferralSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))'"
	 * @generated
	 */
	boolean validateReferralNoteFamilyHistorySection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null).intendedRecipient-&gt;excluding(null).informationRecipient-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null).intendedRecipient-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (not addr-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null).intendedRecipient-&gt;excluding(null)-&gt;reject((telecom-&gt;isEmpty() or telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (not telecom-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null).intendedRecipient-&gt;excluding(null)-&gt;reject(informationRecipient-&gt;one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null)-&gt;reject(intendedRecipient-&gt;one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::IND).associatedEntity-&gt;excluding(null).associatedPerson-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::IND).associatedEntity-&gt;excluding(null)-&gt;reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::IND).associatedEntity-&gt;excluding(null)-&gt;reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and \nlet value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in \nvalue = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::IND).associatedEntity-&gt;excluding(null)-&gt;reject(associatedPerson-&gt;one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::IND)-&gt;select(typeCode=vocab::ParticipationType::IND)-&gt;reject(typeCode=vocab::ParticipationType::IND)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::IND)-&gt;select(typeCode=vocab::ParticipationType::IND)-&gt;reject(associatedEntity-&gt;one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity-&gt;excluding(null).associatedPerson-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (not addr-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity-&gt;excluding(null)-&gt;reject((telecom-&gt;isEmpty() or telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not telecom-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity-&gt;excluding(null)-&gt;reject(classCode=vocab::RoleClassAssociative::ASSIGNED)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity-&gt;excluding(null)-&gt;reject(associatedPerson-&gt;one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK).associatedEntity-&gt;excluding(null)-&gt;reject(scopingOrganization-&gt;one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK)-&gt;reject(typeCode=vocab::ParticipationType::CALLBCK)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK)-&gt;select(typeCode=vocab::ParticipationType::CALLBCK)-&gt;reject(associatedEntity-&gt;one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlanOfTreatmentSection2)'"
	 * @generated
	 */
	PlanOfTreatmentSection2 getPlanOfTreatmentSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AdvanceDirectivesSectionEntriesOptional2)'"
	 * @generated
	 */
	AdvanceDirectivesSectionEntriesOptional2 getAdvanceDirectivesSectionEntriesOptional2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::HistoryOfPresentIllnessSection)'"
	 * @generated
	 */
	HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ImmunizationsSection2)'"
	 * @generated
	 */
	ImmunizationsSection2 getImmunizationsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProblemSection2)'"
	 * @generated
	 */
	ProblemSection2 getProblemSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProceduresSectionEntriesOptional2)'"
	 * @generated
	 */
	ProceduresSectionEntriesOptional2 getProceduresSectionEntriesOptional2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ResultsSection2)'"
	 * @generated
	 */
	ResultsSection2 getResultsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ReviewOfSystemsSection)'"
	 * @generated
	 */
	ReviewOfSystemsSection getReviewOfSystemsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::SocialHistorySection2)'"
	 * @generated
	 */
	SocialHistorySection2 getSocialHistorySection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::VitalSignsSection2)'"
	 * @generated
	 */
	VitalSignsSection2 getVitalSignsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::FunctionalStatusSection2)'"
	 * @generated
	 */
	FunctionalStatusSection2 getFunctionalStatusSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PhysicalExamSection2)'"
	 * @generated
	 */
	PhysicalExamSection2 getPhysicalExamSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AdvanceDirectivesSectionEntriesOptional2)'"
	 * @generated
	 */
	AdvanceDirectivesSectionEntriesOptional2 getAdvanceDirectivesSectionEntriesOptional2b();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::NutritionSection)'"
	 * @generated
	 */
	NutritionSection getNutritionSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MentalStatusSection)'"
	 * @generated
	 */
	MentalStatusSection getMentalStatusSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicalEquipmentSection2)'"
	 * @generated
	 */
	MedicalEquipmentSection2 getMedicalEquipmentSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AllergiesSection2)'"
	 * @generated
	 */
	AllergiesSection2 getAllergiesSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AssessmentSection)'"
	 * @generated
	 */
	AssessmentSection getAssessmentSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AssessmentAndPlanSection2)'"
	 * @generated
	 */
	AssessmentAndPlanSection2 getAssessmentAndPlanSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::HistoryOfPastIllnessSection2)'"
	 * @generated
	 */
	HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::GeneralStatusSection)'"
	 * @generated
	 */
	GeneralStatusSection getGeneralStatusSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationsSection2)'"
	 * @generated
	 */
	MedicationsSection2 getMedicationsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ReasonForReferralSection2)'"
	 * @generated
	 */
	ReasonForReferralSection2 getReasonForReferralSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::FamilyHistorySection2)'"
	 * @generated
	 */
	FamilyHistorySection2 getFamilyHistorySection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralNote init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ReferralNote
