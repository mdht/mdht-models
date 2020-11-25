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
 * A representation of the model object '<em><b>History And Physical Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHistoryAndPhysicalNote2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='USRealmHeader2TemplateId HistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit HistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2 HistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent HistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection HistoryAndPhysicalNote2Code HistoryAndPhysicalNote2CodeP HistoryAndPhysicalNote2ComponentOf HistoryAndPhysicalNote2AllergiesSectionEntriesOptional2 HistoryAndPhysicalNote2GeneralStatusSection HistoryAndPhysicalNote2HistoryOfPastIllnessSection2 HistoryAndPhysicalNote2MedicationsSectionEntriesOptional2 HistoryAndPhysicalNote2PhysicalExamSection2 HistoryAndPhysicalNote2ResultsSectionEntriesOptional2 HistoryAndPhysicalNote2ReviewOfSystemsSection HistoryAndPhysicalNote2SocialHistorySection2 HistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2 HistoryAndPhysicalNote2FamilyHistorySection2 HistoryAndPhysicalNote2InformationRecipientIntendedRecipient HistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity HistoryAndPhysicalNote2ComponentOfEncompassingEncounterId HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime HistoryAndPhysicalNote2ComponentOfEncompassingEncounter' templateId.root='2.16.840.1.113883.10.20.22.1.3' templateId.extension='2015-08-01' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.HistoryAndPhysicalNote2Code='HistoryAndPhysicalNote2CodeP' constraints.validation.info='HistoryAndPhysicalNote2InformationRecipient HistoryAndPhysicalNote2Participant HistoryAndPhysicalNote2InFulfillmentOf HistoryAndPhysicalNote2AssessmentSection HistoryAndPhysicalNote2PlanOfTreatmentSection2 HistoryAndPhysicalNote2AssessmentAndPlanSection2 HistoryAndPhysicalNote2ChiefComplaintSection HistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection HistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2 HistoryAndPhysicalNote2InstructionsSection2 HistoryAndPhysicalNote2ProblemSectionEntriesOptional2 HistoryAndPhysicalNote2ProceduresSectionEntriesOptional2 HistoryAndPhysicalNote2ReasonForVisitSection HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant HistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation' constraints.validation.warning='HistoryAndPhysicalNote2HistoryOfPresentIllnessSection HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS' constraints.validation.query='HistoryAndPhysicalNote2InformationRecipientIntendedRecipient HistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity HistoryAndPhysicalNote2ComponentOfEncompassingEncounterId HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant HistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation HistoryAndPhysicalNote2ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNote2InformationRecipient constraints.validation.error='HistoryAndPhysicalNote2InformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNote2Participant constraints.validation.error='HistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNote2ComponentOf constraints.validation.error='HistoryAndPhysicalNote2ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNote2ComponentOfEncompassingEncounter constraints.validation.error='HistoryAndPhysicalNote2ComponentOfEncompassingEncounterId HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS' constraints.validation.info='HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant HistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS' constraints.validation.query='EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS' constraints.validation.warning='EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS EncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty constraints.validation.error='HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant constraints.validation.error='HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity'"
 *        annotation="duplicates"
 * @generated
 */
public interface HistoryAndPhysicalNote2 extends USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) and  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
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
	boolean validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
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
	boolean validateHistoryAndPhysicalNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'34117-2\' or value.code = \'11492-6\' or value.code = \'28626-0\' or value.code = \'34774-0\' or value.code = \'34115-6\' or value.code = \'34116-4\' or value.code = \'34095-0\' or value.code = \'34096-8\' or value.code = \'51849-8\' or value.code = \'47039-3\' or value.code = \'34763-3\' or value.code = \'34094-3\' or value.code = \'34138-8\'))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2InformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2Participant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf-&gt;exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(rim::ActRelationship))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2InFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2AssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2GeneralStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(DiagnosticChain diagnostics,
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
	boolean validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection2))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2InstructionsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2PhysicalExamSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2ReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2SocialHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateHistoryAndPhysicalNote2FamilyHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null)-&gt;reject(intendedRecipient-&gt;one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(rim::Role)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(p : cda::Participant1 | p.typeCode = vocab::ParticipationType::IND and not ( p.associatedEntity.classCode = vocab::RoleClassAssociative::PRS  or p.associatedEntity.classCode = vocab::RoleClassAssociative::NOK or p.associatedEntity.classCode = vocab::RoleClassAssociative::CAREGIVER or p.associatedEntity.classCode = vocab::RoleClassAssociative::AGNT or p.associatedEntity.classCode = vocab::RoleClassAssociative::GUAR or p.associatedEntity.classCode = vocab::RoleClassAssociative::ECON or p.associatedEntity.isNullFlavorDefined() ) or p.associatedEntity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() &gt;= 8) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() &gt;= 8) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() &gt;= 8))))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() &gt;= 12) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() &gt;= 12) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() &gt;= 12))))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() &gt;= 14) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() &gt;= 14) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() &gt;= 14))))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject((not value.oclIsUndefined() and value.size() &gt; 8 implies value.size() &gt;= 15) and ((not low.value.oclIsUndefined() and low.value.size() &gt; 8 implies low.value.size() &gt;= 15) and (not high.value.oclIsUndefined() and high.value.size() &gt; 8 implies high.value.size() &gt;= 15)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).responsibleParty-&gt;excluding(null)-&gt;reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).responsibleParty-&gt;excluding(null)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).encounterParticipant-&gt;excluding(null)-&gt;reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null).encounterParticipant-&gt;excluding(null)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(responsibleParty-&gt;one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(encounterParticipant-&gt;exists(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null).encompassingEncounter-&gt;excluding(null)-&gt;reject(location-&gt;one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf-&gt;excluding(null)-&gt;reject(encompassingEncounter-&gt;one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AllergiesSectionEntriesOptional2)'"
	 * @generated
	 */
	AllergiesSectionEntriesOptional2 getAllergiesSectionEntriesOptional2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::PlanOfTreatmentSection2)'"
	 * @generated
	 */
	PlanOfTreatmentSection2 getPlanOfTreatmentSection2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ChiefComplaintSection)'"
	 * @generated
	 */
	ChiefComplaintSection getChiefComplaintSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)'"
	 * @generated
	 */
	ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::HistoryOfPastIllnessSection2)'"
	 * @generated
	 */
	HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ImmunizationsSectionEntriesOptional2)'"
	 * @generated
	 */
	ImmunizationsSectionEntriesOptional2 getImmunizationsSectionEntriesOptional2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::InstructionsSection2)'"
	 * @generated
	 */
	InstructionsSection2 getInstructionsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationsSectionEntriesOptional2)'"
	 * @generated
	 */
	MedicationsSectionEntriesOptional2 getMedicationsSectionEntriesOptional2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ProblemSectionEntriesOptional2)'"
	 * @generated
	 */
	ProblemSectionEntriesOptional2 getProblemSectionEntriesOptional2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ReasonForVisitSection)'"
	 * @generated
	 */
	ReasonForVisitSection getReasonForVisitSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::ResultsSectionEntriesOptional2)'"
	 * @generated
	 */
	ResultsSectionEntriesOptional2 getResultsSectionEntriesOptional2();

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
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()-&gt;select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::VitalSignsSectionEntriesOptional2)'"
	 * @generated
	 */
	VitalSignsSectionEntriesOptional2 getVitalSignsSectionEntriesOptional2();

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
	public HistoryAndPhysicalNote2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HistoryAndPhysicalNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HistoryAndPhysicalNote2
