/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Subject Event</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getStudySubjectEvent()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Study Subject EventTemplateId Study Subject EventCode Study Subject EventCodeP Study Subject EventMoodCode Study Subject EventValue Study Subject EventId Study Subject EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode Study Subject EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP Study Subject EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode Study Subject EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode Study Subject EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue Study Subject EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP Study Subject EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode Study Subject EventseriousEventAssociationSeriousEventClassCode Study Subject EventseriousEventAssociationSeriousEventCodeP Study Subject EventseriousEventAssociationSeriousEventCode Study Subject EventseriousEventAssociationSeriousEventMoodCode Study Subject EventseriousEventAssociationSeriousEventValue Study Subject EventseriousEventAssociationTypeCode Study Subject EventseriousEventAssociationSeriousEvent Study Subject EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode Study Subject EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP Study Subject EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode Study Subject EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode Study Subject EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue Study Subject EventstudyTreatmentActionTakenAssociationTypeCode Study Subject EventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken Study Subject EventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode Study Subject EventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode Study Subject EventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode Study Subject EventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue Study Subject EventotherTreatmentActionTakenAssociationTypeCode Study Subject EventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken Study Subject EventeventSubCategoryAssociationeventSubCategoryClassCode Study Subject EventeventSubCategoryAssociationeventSubCategoryCodeP Study Subject EventeventSubCategoryAssociationeventSubCategoryCode Study Subject EventeventSubCategoryAssociationeventSubCategoryMoodCode Study Subject EventeventSubCategoryAssociationeventSubCategoryValue Study Subject EventeventSubCategoryAssociationTemplateId Study Subject EventeventSubCategoryAssociationTypeCode Study Subject EventeventSubCategoryAssociationAdverseEventSubCategory Study Subject EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode Study Subject EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP Study Subject EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode Study Subject EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode Study Subject EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue Study Subject EventstudyTreatmentCausalityAssociationTypeCode Study Subject EventstudyTreatmentCausalityAssociationStudyTreatmentCausality Study Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode Study Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode Study Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode Study Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue Study Subject EventnonStudyTreatmentCausalityAssociationTypeCode Study Subject EventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality Study Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudy Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1 Study Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudy Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1 Study Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudy Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1 Study Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudy Subject EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1 Study Subject EventpatternAssociationeventPatternClassCode Study Subject EventpatternAssociationeventPatternCodeP Study Subject EventpatternAssociationeventPatternCode Study Subject EventpatternAssociationeventPatternMoodCode Study Subject EventpatternAssociationeventPatternValue Study Subject EventpatternAssociationTypeCode Study Subject EventpatternAssociationAdverseEventPattern Study Subject EventoutcomeAssociationeventOutcomeClassCode Study Subject EventoutcomeAssociationeventOutcomeCodeP Study Subject EventoutcomeAssociationeventOutcomeCode Study Subject EventoutcomeAssociationeventOutcomeMoodCode Study Subject EventoutcomeAssociationeventOutcomeValue Study Subject EventoutcomeAssociationTypeCode Study Subject EventoutcomeAssociationAdverseEventOutcome Study Subject EventtoxicityAssociationtoxicityGradeClassCode Study Subject EventtoxicityAssociationtoxicityGradeCodeP Study Subject EventtoxicityAssociationtoxicityGradeCode Study Subject EventtoxicityAssociationtoxicityGradeMoodCode Study Subject EventtoxicityAssociationtoxicityGradeValue Study Subject EventtoxicityAssociationtoxicityGradeValueP Study Subject EventtoxicityAssociationTypeCode Study Subject EventtoxicityAssociationToxicityGrade Study Subject EventeventCategoryAssociationeventCategoryClassCode Study Subject EventeventCategoryAssociationeventCategoryCodeP Study Subject EventeventCategoryAssociationeventCategoryCode Study Subject EventeventCategoryAssociationeventCategoryMoodCode Study Subject EventeventCategoryAssociationeventCategoryValue Study Subject EventeventCategoryAssociationTypeCode' templateId.root='2.16.840.1.113883.10.20.23.102' classCode='OBS' code.code='C49562' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event - Reported'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventeventSubCategoryAssociation constraints.validation.error='eventSubCategoryAssociationTemplateId eventSubCategoryAssociationTypeCode eventSubCategoryAssociationAdverseEventSubCategory eventSubCategoryAssociationeventSubCategoryClassCode eventSubCategoryAssociationeventSubCategoryCodeP eventSubCategoryAssociationeventSubCategoryCode eventSubCategoryAssociationeventSubCategoryMoodCode eventSubCategoryAssociationeventSubCategoryValue' templateId.root='null' typeCode='COMP' constraints.validation.query='eventSubCategoryAssociationeventSubCategoryClassCode eventSubCategoryAssociationeventSubCategoryCodeP eventSubCategoryAssociationeventSubCategoryCode eventSubCategoryAssociationeventSubCategoryMoodCode eventSubCategoryAssociationeventSubCategoryValue' constraints.validation.dependOn.eventSubCategoryAssociationeventSubCategoryCode='eventSubCategoryAssociationeventSubCategoryCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventeventSubCategoryAssociationeventSubCategory classCode='OBS' constraints.validation.error='eventSubCategoryClassCode eventSubCategoryCode eventSubCategoryCodeP eventSubCategoryMoodCode eventSubCategoryValue' code.code='C83212' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Sub-category' constraints.validation.dependOn.eventSubCategoryCode='eventSubCategoryCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventseriousEventAssociation typeCode='COMP' constraints.validation.error='seriousEventAssociationTypeCode seriousEventAssociationSeriousEvent seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP seriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode seriousEventAssociationSeriousEventClassCode seriousEventAssociationSeriousEventCodeP seriousEventAssociationSeriousEventCode seriousEventAssociationSeriousEventMoodCode seriousEventAssociationSeriousEventValue' constraints.validation.query='seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP seriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode seriousEventAssociationSeriousEventClassCode seriousEventAssociationSeriousEventCodeP seriousEventAssociationSeriousEventCode seriousEventAssociationSeriousEventMoodCode seriousEventAssociationSeriousEventValue' constraints.validation.dependOn.seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode='seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP' constraints.validation.dependOn.seriousEventAssociationSeriousEventCode='seriousEventAssociationSeriousEventCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventseriousEventAssociationSeriousEvent classCode='OBS' constraints.validation.error='SeriousEventClassCode SeriousEventCode SeriousEventCodeP SeriousEventMoodCode SeriousEventValue' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Serious Event' constraints.validation.dependOn.SeriousEventCode='SeriousEventCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation typeCode='COMP' constraints.validation.error='SeriousEventTypeAssociationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType constraints.validation.error='SeriousEventTypeClassCode SeriousEventTypeCode SeriousEventTypeCodeP SeriousEventTypeMoodCode SeriousEventTypeValue SeriousEventTypeValueP' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.SeriousEventTypeCode='SeriousEventTypeCodeP' moodCode='EVN' value.codeSystem='2.16.840.1.113883.3.26.1.1' value.codeSystemName='NCI Thesaurus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventstudyTreatmentActionTakenAssociation typeCode='COMP' constraints.validation.error='studyTreatmentActionTakenAssociationTypeCode studyTreatmentActionTakenAssociationStudyTreatmentActionTaken studyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue' constraints.validation.query='studyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue' constraints.validation.dependOn.studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode='studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTaken classCode='OBS' constraints.validation.error='studyTreatmentActionTakenClassCode studyTreatmentActionTakenCode studyTreatmentActionTakenCodeP studyTreatmentActionTakenMoodCode studyTreatmentActionTakenValue' code.code='NCI' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.studyTreatmentActionTakenCode='studyTreatmentActionTakenCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventotherTreatmentActionTakenAssociation typeCode='COMP' constraints.validation.error='otherTreatmentActionTakenAssociationTypeCode otherTreatmentActionTakenAssociationOtherTreatmentActionTaken otherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenValue' constraints.validation.query='otherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTaken classCode='OBS' constraints.validation.error='otherTreatmentActionTakenClassCode otherTreatmentActionTakenCode otherTreatmentActionTakenMoodCode otherTreatmentActionTakenValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventstudyTreatmentCausalityAssociation typeCode='COMP' constraints.validation.error='studyTreatmentCausalityAssociationTypeCode studyTreatmentCausalityAssociationStudyTreatmentCausality studyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode studyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP studyTreatmentCausalityAssociationstudyTreatmentCausalityCode studyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode studyTreatmentCausalityAssociationstudyTreatmentCausalityValue' constraints.validation.query='studyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode studyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP studyTreatmentCausalityAssociationstudyTreatmentCausalityCode studyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode studyTreatmentCausalityAssociationstudyTreatmentCausalityValue' constraints.validation.dependOn.studyTreatmentCausalityAssociationstudyTreatmentCausalityCode='studyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausality classCode='OBS' constraints.validation.error='studyTreatmentCausalityClassCode studyTreatmentCausalityCode studyTreatmentCausalityCodeP studyTreatmentCausalityMoodCode studyTreatmentCausalityValue' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.studyTreatmentCausalityCode='studyTreatmentCausalityCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventnonStudyTreatmentCausalityAssociation typeCode='COMP' constraints.validation.error='nonStudyTreatmentCausalityAssociationTypeCode nonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue' constraints.validation.query='nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausality classCode='OBS' constraints.validation.error='nonStudyTreatmentCausalityClassCode nonStudyTreatmentCausalityCode nonStudyTreatmentCausalityMoodCode nonStudyTreatmentCausalityValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventpatternAssociation typeCode='COMP' constraints.validation.error='patternAssociationTypeCode patternAssociationAdverseEventPattern patternAssociationeventPatternClassCode patternAssociationeventPatternCodeP patternAssociationeventPatternCode patternAssociationeventPatternMoodCode patternAssociationeventPatternValue' constraints.validation.query='patternAssociationeventPatternClassCode patternAssociationeventPatternCodeP patternAssociationeventPatternCode patternAssociationeventPatternMoodCode patternAssociationeventPatternValue' constraints.validation.dependOn.patternAssociationeventPatternCode='patternAssociationeventPatternCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventpatternAssociationeventPattern classCode='OBS' constraints.validation.error='eventPatternClassCode eventPatternCode eventPatternCodeP eventPatternMoodCode eventPatternValue' code.code='C83208' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Pattern' constraints.validation.dependOn.eventPatternCode='eventPatternCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventoutcomeAssociation typeCode='COMP' constraints.validation.error='outcomeAssociationTypeCode outcomeAssociationAdverseEventOutcome outcomeAssociationeventOutcomeClassCode outcomeAssociationeventOutcomeCodeP outcomeAssociationeventOutcomeCode outcomeAssociationeventOutcomeMoodCode outcomeAssociationeventOutcomeValue' constraints.validation.query='outcomeAssociationeventOutcomeClassCode outcomeAssociationeventOutcomeCodeP outcomeAssociationeventOutcomeCode outcomeAssociationeventOutcomeMoodCode outcomeAssociationeventOutcomeValue' constraints.validation.dependOn.outcomeAssociationeventOutcomeCode='outcomeAssociationeventOutcomeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventoutcomeAssociationeventOutcome classCode='OBS' constraints.validation.error='eventOutcomeClassCode eventOutcomeCode eventOutcomeCodeP eventOutcomeMoodCode eventOutcomeValue' code.code='C49489' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Outcome' constraints.validation.dependOn.eventOutcomeCode='eventOutcomeCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventconcomitantTreatmentAssociation typeCode='COMP' constraints.validation.error='concomitantTreatmentAssociationTypeCode concomitantTreatmentAssociationConcomitantTreatment concomitantTreatmentAssociationconcomitantTreatmentClassCode concomitantTreatmentAssociationconcomitantTreatmentCodeP concomitantTreatmentAssociationconcomitantTreatmentCode concomitantTreatmentAssociationconcomitantTreatmentMoodCode concomitantTreatmentAssociationconcomitantTreatmentValue' constraints.validation.query='concomitantTreatmentAssociationconcomitantTreatmentClassCode concomitantTreatmentAssociationconcomitantTreatmentCodeP concomitantTreatmentAssociationconcomitantTreatmentCode concomitantTreatmentAssociationconcomitantTreatmentMoodCode concomitantTreatmentAssociationconcomitantTreatmentValue' constraints.validation.dependOn.concomitantTreatmentAssociationconcomitantTreatmentCode='concomitantTreatmentAssociationconcomitantTreatmentCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventconcomitantTreatmentAssociationconcomitantTreatment classCode='OBS' constraints.validation.error='concomitantTreatmentClassCode concomitantTreatmentCode concomitantTreatmentCodeP concomitantTreatmentMoodCode concomitantTreatmentValue' code.code='C83199' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Concommitant Treatment' constraints.validation.dependOn.concomitantTreatmentCode='concomitantTreatmentCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventtoxicityAssociation typeCode='COMP' constraints.validation.error='toxicityAssociationTypeCode toxicityAssociationToxicityGrade toxicityAssociationtoxicityGradeClassCode toxicityAssociationtoxicityGradeCodeP toxicityAssociationtoxicityGradeCode toxicityAssociationtoxicityGradeMoodCode toxicityAssociationtoxicityGradeValue toxicityAssociationtoxicityGradeValueP' constraints.validation.query='toxicityAssociationtoxicityGradeClassCode toxicityAssociationtoxicityGradeCodeP toxicityAssociationtoxicityGradeCode toxicityAssociationtoxicityGradeMoodCode toxicityAssociationtoxicityGradeValue toxicityAssociationtoxicityGradeValueP' constraints.validation.dependOn.toxicityAssociationtoxicityGradeCode='toxicityAssociationtoxicityGradeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventtoxicityAssociationtoxicityGrade classCode='OBS' constraints.validation.error='toxicityGradeClassCode toxicityGradeCode toxicityGradeCodeP toxicityGradeMoodCode toxicityGradeValue toxicityGradeValueP' code.code='C78605' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Toxicity Grade' constraints.validation.dependOn.toxicityGradeCode='toxicityGradeCodeP' moodCode='EVN' value.codeSystem='2.16.840.1.113883.3.26.1.1' value.codeSystemName='NCI Thesaurus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventeventCategoryAssociation typeCode='COMP' constraints.validation.error='eventCategoryAssociationTypeCode eventCategoryAssociationeventCategoryClassCode eventCategoryAssociationeventCategoryCodeP eventCategoryAssociationeventCategoryCode eventCategoryAssociationeventCategoryMoodCode eventCategoryAssociationeventCategoryValue' constraints.validation.query='eventCategoryAssociationeventCategoryClassCode eventCategoryAssociationeventCategoryCodeP eventCategoryAssociationeventCategoryCode eventCategoryAssociationeventCategoryMoodCode eventCategoryAssociationeventCategoryValue' constraints.validation.dependOn.eventCategoryAssociationeventCategoryCode='eventCategoryAssociationeventCategoryCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudySubjectEventeventCategoryAssociationeventCategory constraints.validation.error='eventCategoryClassCode eventCategoryCode eventCategoryCodeP eventCategoryMoodCode eventCategoryValue' code.code='C83198' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Category' constraints.validation.dependOn.eventCategoryCode='eventCategoryCodeP'"
 * @generated
 */
public interface StudySubjectEvent extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.102\')'"
   * @generated
   */
  boolean validateStudySubjectEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateStudySubjectEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'C49562\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\')'"
   * @generated
   */
  boolean validateStudySubjectEventCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
   * @generated
   */
  boolean validateStudySubjectEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
   * @generated
   */
  boolean validateStudySubjectEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))'"
   * @generated
   */
  boolean validateStudySubjectEventValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
   * @generated
   */
  boolean validateStudySubjectEventId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())'"
   * @generated
   */
  boolean validateStudySubjectEventTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventSeriousEventAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventStudyTreatmentActionTakenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventOtherTreatmentActionTakenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventEventSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventStudyTreatmentCausalityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventNonStudyTreatmentCausalityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventPatternAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventOutcomeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventConcommitantMedicationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateStudySubjectEventEventCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateStudySubjectEventStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'classCode\'))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\')))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEventValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventseriousEventAssociationSeriousEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'NCI\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))'"
   * @generated
   */
  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83212\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = \'null\'))'"
   * @generated
   */
  boolean validateStudySubjectEventeventSubCategoryAssociationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventeventSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'TBD\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED)))))'"
   * @generated
   */
  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventpatternAssociationeventPatternClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventpatternAssociationeventPatternCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83208\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventpatternAssociationeventPatternCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventpatternAssociationeventPatternMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateStudySubjectEventpatternAssociationeventPatternValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventpatternAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventpatternAssociationAdverseEventPattern(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C49489\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))'"
   * @generated
   */
  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventoutcomeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C78605\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\')))'"
   * @generated
   */
  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventtoxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateStudySubjectEventtoxicityAssociationToxicityGrade(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'classCode\'))'"
   * @generated
   */
  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83198\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'moodCode\'))'"
   * @generated
   */
  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateStudySubjectEventeventCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)'"
   * @generated
   */
  GroupIdentifier getGroupIdentifier();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->any(true).oclAsType(sdtm::Event Severity)'"
   * @generated
   */
  EventSeverity getEventSeverity();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->any(true).oclAsType(sdtm::Pre-Specified Event)'"
   * @generated
   */
  PreSpecifiedEvent getPreSpecifiedEvent();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)'"
   * @generated
   */
  StudyDayPeriod getStudyDayPeriod();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->any(true).oclAsType(sdtm::Body System or Organ Class)'"
   * @generated
   */
  BodySystemorOrganClass getBodySystemorOrganClass();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudySubjectEvent init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudySubjectEvent init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // StudySubjectEvent
