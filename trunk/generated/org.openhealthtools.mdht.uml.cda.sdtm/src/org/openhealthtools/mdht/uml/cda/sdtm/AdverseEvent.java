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
 * A representation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getAdverseEvent()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Adverse EventTemplateId Adverse EventCode Adverse EventCodeP Adverse EventMoodCode Adverse EventValue Adverse EventId Adverse EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode Adverse EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP Adverse EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode Adverse EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode Adverse EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue Adverse EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP Adverse EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode Adverse EventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType Adverse EventseriousEventAssociationSeriousEventClassCode Adverse EventseriousEventAssociationSeriousEventCodeP Adverse EventseriousEventAssociationSeriousEventCode Adverse EventseriousEventAssociationSeriousEventMoodCode Adverse EventseriousEventAssociationSeriousEventValue Adverse EventseriousEventAssociationTypeCode Adverse EventseriousEventAssociationSeriousEvent Adverse EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode Adverse EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP Adverse EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode Adverse EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode Adverse EventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue Adverse EventstudyTreatmentActionTakenAssociationTypeCode Adverse EventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken Adverse EventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode Adverse EventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode Adverse EventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode Adverse EventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue Adverse EventotherTreatmentActionTakenAssociationTypeCode Adverse EventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken Adverse EventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode Adverse EventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP Adverse EventadverseEventSubCategoryAssociationadverseEventSubCategoryCode Adverse EventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode Adverse EventadverseEventSubCategoryAssociationadverseEventSubCategoryValue Adverse EventadverseEventSubCategoryAssociationTypeCode Adverse EventadverseEventSubCategoryAssociationAdverseEventSubCategory Adverse EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode Adverse EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP Adverse EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode Adverse EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode Adverse EventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue Adverse EventstudyTreatmentCausalityAssociationTypeCode Adverse EventstudyTreatmentCausalityAssociationStudyTreatmentCausality Adverse EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode Adverse EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode Adverse EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode Adverse EventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue Adverse EventnonStudyTreatmentCausalityAssociationTypeCode Adverse EventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality Adverse EventpatternAssociationadverseEventPatternClassCode Adverse EventpatternAssociationadverseEventPatternCodeP Adverse EventpatternAssociationadverseEventPatternCode Adverse EventpatternAssociationadverseEventPatternMoodCode Adverse EventpatternAssociationadverseEventPatternValue Adverse EventpatternAssociationTypeCode Adverse EventpatternAssociationAdverseEventPattern Adverse EventoutcomeAssociationadverseEventOutcomeClassCode Adverse EventoutcomeAssociationadverseEventOutcomeCodeP Adverse EventoutcomeAssociationadverseEventOutcomeCode Adverse EventoutcomeAssociationadverseEventOutcomeMoodCode Adverse EventoutcomeAssociationadverseEventOutcomeValue Adverse EventoutcomeAssociationTypeCode Adverse EventoutcomeAssociationAdverseEventOutcome Adverse EventconcomitantTreatmentAssociationconcomitantTreatmentClassCode Adverse EventconcomitantTreatmentAssociationconcomitantTreatmentCodeP Adverse EventconcomitantTreatmentAssociationconcomitantTreatmentCode Adverse EventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode Adverse EventconcomitantTreatmentAssociationconcomitantTreatmentValue Adverse EventconcomitantTreatmentAssociationTypeCode Adverse EventconcomitantTreatmentAssociationConcomitantTreatment Adverse EventaeToxicityAssociationaeToxicityGradeClassCode Adverse EventaeToxicityAssociationaeToxicityGradeCodeP Adverse EventaeToxicityAssociationaeToxicityGradeCode Adverse EventaeToxicityAssociationaeToxicityGradeMoodCode Adverse EventaeToxicityAssociationaeToxicityGradeValue Adverse EventaeToxicityAssociationaeToxicityGradeValueP Adverse EventaeToxicityAssociationTypeCode Adverse EventaeToxicityAssociationToxicityGrade Adverse EventadverseEventCategoryAssociationadverseEventCategoryClassCode Adverse EventadverseEventCategoryAssociationadverseEventCategoryCodeP Adverse EventadverseEventCategoryAssociationadverseEventCategoryCode Adverse EventadverseEventCategoryAssociationadverseEventCategoryMoodCode Adverse EventadverseEventCategoryAssociationadverseEventCategoryValue Adverse EventadverseEventCategoryAssociationTypeCode Adverse EventadverseEventCategoryAssociationAdverseEventCategory' templateId.root='2.16.840.1.113883.10.20.23.23' classCode='OBS' code.code='C49562' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event - Reported'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventadverseEventSubCategoryAssociation typeCode='COMP' constraints.validation.error='adverseEventSubCategoryAssociationTypeCode adverseEventSubCategoryAssociationAdverseEventSubCategory adverseEventSubCategoryAssociationadverseEventSubCategoryClassCode adverseEventSubCategoryAssociationadverseEventSubCategoryCodeP adverseEventSubCategoryAssociationadverseEventSubCategoryCode adverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode adverseEventSubCategoryAssociationadverseEventSubCategoryValue' constraints.validation.query='adverseEventSubCategoryAssociationadverseEventSubCategoryClassCode adverseEventSubCategoryAssociationadverseEventSubCategoryCodeP adverseEventSubCategoryAssociationadverseEventSubCategoryCode adverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode adverseEventSubCategoryAssociationadverseEventSubCategoryValue' constraints.validation.dependOn.adverseEventSubCategoryAssociationadverseEventSubCategoryCode='adverseEventSubCategoryAssociationadverseEventSubCategoryCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategory classCode='OBS' constraints.validation.error='adverseEventSubCategoryClassCode adverseEventSubCategoryCode adverseEventSubCategoryCodeP adverseEventSubCategoryMoodCode adverseEventSubCategoryValue' code.code='C83212' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Sub-category' constraints.validation.dependOn.adverseEventSubCategoryCode='adverseEventSubCategoryCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventseriousEventAssociation typeCode='COMP' constraints.validation.error='seriousEventAssociationTypeCode seriousEventAssociationSeriousEvent seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP seriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType seriousEventAssociationSeriousEventClassCode seriousEventAssociationSeriousEventCodeP seriousEventAssociationSeriousEventCode seriousEventAssociationSeriousEventMoodCode seriousEventAssociationSeriousEventValue' constraints.validation.query='seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP seriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType seriousEventAssociationSeriousEventClassCode seriousEventAssociationSeriousEventCodeP seriousEventAssociationSeriousEventCode seriousEventAssociationSeriousEventMoodCode seriousEventAssociationSeriousEventValue seriousEventAssociationSeriousEventSeriousEventTypeAssociation' constraints.validation.dependOn.seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode='seriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP' constraints.validation.dependOn.seriousEventAssociationSeriousEventCode='seriousEventAssociationSeriousEventCodeP' constraints.validation.info='seriousEventAssociationSeriousEventSeriousEventTypeAssociation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventseriousEventAssociationSeriousEvent classCode='OBS' constraints.validation.error='SeriousEventClassCode SeriousEventCode SeriousEventCodeP SeriousEventMoodCode SeriousEventValue SeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode SeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP SeriousEventSeriousEventTypeAssociationSeriousEventTypeCode SeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode SeriousEventSeriousEventTypeAssociationSeriousEventTypeValue SeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP SeriousEventSeriousEventTypeAssociationTypeCode SeriousEventSeriousEventTypeAssociationSeriousEventType' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Serious Event' constraints.validation.dependOn.SeriousEventCode='SeriousEventCodeP' moodCode='EVN' constraints.validation.info='SeriousEventSeriousEventTypeAssociation' constraints.validation.query='SeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode SeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP SeriousEventSeriousEventTypeAssociationSeriousEventTypeCode SeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode SeriousEventSeriousEventTypeAssociationSeriousEventTypeValue SeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP SeriousEventSeriousEventTypeAssociationTypeCode SeriousEventSeriousEventTypeAssociationSeriousEventType' constraints.validation.dependOn.SeriousEventSeriousEventTypeAssociationSeriousEventTypeCode='SeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation typeCode='COMP' constraints.validation.error='SeriousEventTypeAssociationTypeCode SeriousEventTypeAssociationSeriousEventType SeriousEventTypeAssociationSeriousEventTypeClassCode SeriousEventTypeAssociationSeriousEventTypeCodeP SeriousEventTypeAssociationSeriousEventTypeCode SeriousEventTypeAssociationSeriousEventTypeMoodCode SeriousEventTypeAssociationSeriousEventTypeValue SeriousEventTypeAssociationSeriousEventTypeValueP' constraints.validation.query='SeriousEventTypeAssociationSeriousEventTypeClassCode SeriousEventTypeAssociationSeriousEventTypeCodeP SeriousEventTypeAssociationSeriousEventTypeCode SeriousEventTypeAssociationSeriousEventTypeMoodCode SeriousEventTypeAssociationSeriousEventTypeValue SeriousEventTypeAssociationSeriousEventTypeValueP' constraints.validation.dependOn.SeriousEventTypeAssociationSeriousEventTypeCode='SeriousEventTypeAssociationSeriousEventTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType constraints.validation.error='SeriousEventTypeClassCode SeriousEventTypeCode SeriousEventTypeCodeP SeriousEventTypeMoodCode SeriousEventTypeValue SeriousEventTypeValueP' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.SeriousEventTypeCode='SeriousEventTypeCodeP' moodCode='EVN' value.codeSystem='2.16.840.1.113883.3.26.1.1' value.codeSystemName='NCI Thesaurus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventstudyTreatmentActionTakenAssociation typeCode='COMP' constraints.validation.error='studyTreatmentActionTakenAssociationTypeCode studyTreatmentActionTakenAssociationStudyTreatmentActionTaken studyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue' constraints.validation.query='studyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode studyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue' constraints.validation.dependOn.studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode='studyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTaken classCode='OBS' constraints.validation.error='studyTreatmentActionTakenClassCode studyTreatmentActionTakenCode studyTreatmentActionTakenCodeP studyTreatmentActionTakenMoodCode studyTreatmentActionTakenValue' code.code='NCI' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.studyTreatmentActionTakenCode='studyTreatmentActionTakenCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventotherTreatmentActionTakenAssociation typeCode='COMP' constraints.validation.error='otherTreatmentActionTakenAssociationTypeCode otherTreatmentActionTakenAssociationOtherTreatmentActionTaken otherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenValue' constraints.validation.query='otherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode otherTreatmentActionTakenAssociationotherTreatmentActionTakenValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTaken classCode='OBS' constraints.validation.error='otherTreatmentActionTakenClassCode otherTreatmentActionTakenCode otherTreatmentActionTakenMoodCode otherTreatmentActionTakenValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventstudyTreatmentCausalityAssociation typeCode='COMP' constraints.validation.error='studyTreatmentCausalityAssociationTypeCode studyTreatmentCausalityAssociationStudyTreatmentCausality studyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode studyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP studyTreatmentCausalityAssociationstudyTreatmentCausalityCode studyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode studyTreatmentCausalityAssociationstudyTreatmentCausalityValue' constraints.validation.query='studyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode studyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP studyTreatmentCausalityAssociationstudyTreatmentCausalityCode studyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode studyTreatmentCausalityAssociationstudyTreatmentCausalityValue' constraints.validation.dependOn.studyTreatmentCausalityAssociationstudyTreatmentCausalityCode='studyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausality classCode='OBS' constraints.validation.error='studyTreatmentCausalityClassCode studyTreatmentCausalityCode studyTreatmentCausalityCodeP studyTreatmentCausalityMoodCode studyTreatmentCausalityValue' code.code='TBD' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.studyTreatmentCausalityCode='studyTreatmentCausalityCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventnonStudyTreatmentCausalityAssociation typeCode='COMP' constraints.validation.error='nonStudyTreatmentCausalityAssociationTypeCode nonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue' constraints.validation.query='nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode nonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausality classCode='OBS' constraints.validation.error='nonStudyTreatmentCausalityClassCode nonStudyTreatmentCausalityCode nonStudyTreatmentCausalityMoodCode nonStudyTreatmentCausalityValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventpatternAssociation typeCode='COMP' constraints.validation.error='patternAssociationTypeCode patternAssociationAdverseEventPattern patternAssociationadverseEventPatternClassCode patternAssociationadverseEventPatternCodeP patternAssociationadverseEventPatternCode patternAssociationadverseEventPatternMoodCode patternAssociationadverseEventPatternValue' constraints.validation.query='patternAssociationadverseEventPatternClassCode patternAssociationadverseEventPatternCodeP patternAssociationadverseEventPatternCode patternAssociationadverseEventPatternMoodCode patternAssociationadverseEventPatternValue' constraints.validation.dependOn.patternAssociationadverseEventPatternCode='patternAssociationadverseEventPatternCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventpatternAssociationadverseEventPattern classCode='OBS' constraints.validation.error='adverseEventPatternClassCode adverseEventPatternCode adverseEventPatternCodeP adverseEventPatternMoodCode adverseEventPatternValue' code.code='C83208' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Pattern' constraints.validation.dependOn.adverseEventPatternCode='adverseEventPatternCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventoutcomeAssociation typeCode='COMP' constraints.validation.error='outcomeAssociationTypeCode outcomeAssociationAdverseEventOutcome outcomeAssociationadverseEventOutcomeClassCode outcomeAssociationadverseEventOutcomeCodeP outcomeAssociationadverseEventOutcomeCode outcomeAssociationadverseEventOutcomeMoodCode outcomeAssociationadverseEventOutcomeValue' constraints.validation.query='outcomeAssociationadverseEventOutcomeClassCode outcomeAssociationadverseEventOutcomeCodeP outcomeAssociationadverseEventOutcomeCode outcomeAssociationadverseEventOutcomeMoodCode outcomeAssociationadverseEventOutcomeValue' constraints.validation.dependOn.outcomeAssociationadverseEventOutcomeCode='outcomeAssociationadverseEventOutcomeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventoutcomeAssociationadverseEventOutcome classCode='OBS' constraints.validation.error='adverseEventOutcomeClassCode adverseEventOutcomeCode adverseEventOutcomeCodeP adverseEventOutcomeMoodCode adverseEventOutcomeValue' code.code='C49489' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Outcome' constraints.validation.dependOn.adverseEventOutcomeCode='adverseEventOutcomeCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventconcomitantTreatmentAssociation typeCode='COMP' constraints.validation.error='concomitantTreatmentAssociationTypeCode concomitantTreatmentAssociationConcomitantTreatment concomitantTreatmentAssociationconcomitantTreatmentClassCode concomitantTreatmentAssociationconcomitantTreatmentCodeP concomitantTreatmentAssociationconcomitantTreatmentCode concomitantTreatmentAssociationconcomitantTreatmentMoodCode concomitantTreatmentAssociationconcomitantTreatmentValue' constraints.validation.query='concomitantTreatmentAssociationconcomitantTreatmentClassCode concomitantTreatmentAssociationconcomitantTreatmentCodeP concomitantTreatmentAssociationconcomitantTreatmentCode concomitantTreatmentAssociationconcomitantTreatmentMoodCode concomitantTreatmentAssociationconcomitantTreatmentValue' constraints.validation.dependOn.concomitantTreatmentAssociationconcomitantTreatmentCode='concomitantTreatmentAssociationconcomitantTreatmentCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventconcomitantTreatmentAssociationconcomitantTreatment classCode='OBS' constraints.validation.error='concomitantTreatmentClassCode concomitantTreatmentCode concomitantTreatmentCodeP concomitantTreatmentMoodCode concomitantTreatmentValue' code.code='C83199' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Concommitant Treatment' constraints.validation.dependOn.concomitantTreatmentCode='concomitantTreatmentCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventaeToxicityAssociation typeCode='COMP' constraints.validation.error='aeToxicityAssociationTypeCode aeToxicityAssociationToxicityGrade aeToxicityAssociationaeToxicityGradeClassCode aeToxicityAssociationaeToxicityGradeCodeP aeToxicityAssociationaeToxicityGradeCode aeToxicityAssociationaeToxicityGradeMoodCode aeToxicityAssociationaeToxicityGradeValue aeToxicityAssociationaeToxicityGradeValueP' constraints.validation.query='aeToxicityAssociationaeToxicityGradeClassCode aeToxicityAssociationaeToxicityGradeCodeP aeToxicityAssociationaeToxicityGradeCode aeToxicityAssociationaeToxicityGradeMoodCode aeToxicityAssociationaeToxicityGradeValue aeToxicityAssociationaeToxicityGradeValueP' constraints.validation.dependOn.aeToxicityAssociationaeToxicityGradeCode='aeToxicityAssociationaeToxicityGradeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventaeToxicityAssociationaeToxicityGrade classCode='OBS' constraints.validation.error='aeToxicityGradeClassCode aeToxicityGradeCode aeToxicityGradeCodeP aeToxicityGradeMoodCode aeToxicityGradeValue aeToxicityGradeValueP' code.code='C78605' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Toxicity Grade' constraints.validation.dependOn.aeToxicityGradeCode='aeToxicityGradeCodeP' moodCode='EVN' value.codeSystem='2.16.840.1.113883.3.26.1.1' value.codeSystemName='NCI Thesaurus'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventadverseEventCategoryAssociation typeCode='COMP' constraints.validation.error='adverseEventCategoryAssociationTypeCode adverseEventCategoryAssociationAdverseEventCategory adverseEventCategoryAssociationadverseEventCategoryClassCode adverseEventCategoryAssociationadverseEventCategoryCodeP adverseEventCategoryAssociationadverseEventCategoryCode adverseEventCategoryAssociationadverseEventCategoryMoodCode adverseEventCategoryAssociationadverseEventCategoryValue' constraints.validation.query='adverseEventCategoryAssociationadverseEventCategoryClassCode adverseEventCategoryAssociationadverseEventCategoryCodeP adverseEventCategoryAssociationadverseEventCategoryCode adverseEventCategoryAssociationadverseEventCategoryMoodCode adverseEventCategoryAssociationadverseEventCategoryValue' constraints.validation.dependOn.adverseEventCategoryAssociationadverseEventCategoryCode='adverseEventCategoryAssociationadverseEventCategoryCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmAdverseEventadverseEventCategoryAssociationadverseEventCategory constraints.validation.error='adverseEventCategoryClassCode adverseEventCategoryCode adverseEventCategoryCodeP adverseEventCategoryMoodCode adverseEventCategoryValue' code.code='C83198' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Adverse Event Category' constraints.validation.dependOn.adverseEventCategoryCode='adverseEventCategoryCodeP'"
 * @generated
 */
public interface AdverseEvent extends Observation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.23\')'"
   * @generated
   */
  boolean validateAdverseEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventSeriousEventAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventStudyTreatmentActionTakenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateAdverseEventOtherTreatmentActionTakenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventAdverseEventSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventStudyTreatmentCausalityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventNonStudyTreatmentCausalityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventPatternAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventOutcomeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventConcomitantTreatmentAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventAdverseEventCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\')))'"
   * @generated
   */
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEventValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship)))'"
   * @generated
   */
  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventseriousEventAssociationSeriousEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventpatternAssociationadverseEventPatternClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventpatternAssociationadverseEventPatternCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventpatternAssociationadverseEventPatternCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventpatternAssociationadverseEventPatternMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventpatternAssociationadverseEventPatternValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventpatternAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventpatternAssociationAdverseEventPattern(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventoutcomeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventoutcomeAssociationAdverseEventOutcome(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83199\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventconcomitantTreatmentAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\')))'"
   * @generated
   */
  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
   * @generated
   */
  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventaeToxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventaeToxicityAssociationToxicityGrade(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

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
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->any(true).oclAsType(sdtm::Body System or Organ Class)'"
   * @generated
   */
  BodySystemorOrganClass getBodySystemorOrganClass();

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
   * @generated
   */
  public AdverseEvent init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdverseEvent init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdverseEvent
