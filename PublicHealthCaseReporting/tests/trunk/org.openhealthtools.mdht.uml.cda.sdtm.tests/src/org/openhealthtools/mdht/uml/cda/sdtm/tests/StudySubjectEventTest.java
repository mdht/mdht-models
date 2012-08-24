
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectEventOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Subject Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventSeriousEventAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Serious Event Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventStudyTreatmentActionTakenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Action Taken Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventOtherTreatmentActionTakenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Other Treatment Action Taken Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEventSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventStudyTreatmentCausalityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Causality Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventNonStudyTreatmentCausalityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Study Treatment Causality Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventPatternAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pattern Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventOutcomeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Outcome Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventConcommitantMedicationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Concommitant Medication Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventEventCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventseriousEventAssociationSeriousEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Association Study Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Association Other Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventSubCategoryAssociationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Adverse Event Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Association Study Treatment Causality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Association Non Study Treatment Causality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventpatternAssociationeventPatternClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventpatternAssociationeventPatternCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventpatternAssociationeventPatternCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventpatternAssociationeventPatternMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventpatternAssociationeventPatternValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventpatternAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventpatternAssociationAdverseEventPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Association Adverse Event Pattern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventoutcomeAssociationeventOutcomeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventoutcomeAssociationeventOutcomeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventoutcomeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Association Adverse Event Outcome</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventtoxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventtoxicityAssociationToxicityGrade(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Association Toxicity Grade</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventCategoryAssociationeventCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventCategoryAssociationeventCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#validateStudySubjectEventeventCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StudySubjectEventTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventTemplateId() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventTemplateIdTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventTemplateId(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventEffectiveTime() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventEffectiveTimeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventEffectiveTime(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventId() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventIdTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventId(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventTargetSiteCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventTargetSiteCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventTargetSiteCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventGroupIdentifier() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventGroupIdentifierTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventGroupIdentifier(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventEventSeverity() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventEventSeverityTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventEventSeverity",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventEventSeverity(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventEventSeverityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventSeriousEventAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventSeriousEventAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventSeriousEventAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventSeriousEventAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventSeriousEventAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventStudyTreatmentActionTakenAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventStudyTreatmentActionTakenAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventStudyTreatmentActionTakenAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventStudyTreatmentActionTakenAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventStudyTreatmentActionTakenAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventOtherTreatmentActionTakenAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventOtherTreatmentActionTakenAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventOtherTreatmentActionTakenAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventOtherTreatmentActionTakenAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventOtherTreatmentActionTakenAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventEventSubCategoryAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventEventSubCategoryAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventEventSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventEventSubCategoryAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventEventSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventStudyTreatmentCausalityAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventStudyTreatmentCausalityAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventStudyTreatmentCausalityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventStudyTreatmentCausalityAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventStudyTreatmentCausalityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventNonStudyTreatmentCausalityAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventNonStudyTreatmentCausalityAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventNonStudyTreatmentCausalityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventNonStudyTreatmentCausalityAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventNonStudyTreatmentCausalityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventPatternAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventPatternAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventPatternAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventPatternAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventPatternAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventOutcomeAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventOutcomeAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventOutcomeAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventOutcomeAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventOutcomeAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventConcommitantMedicationAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventConcommitantMedicationAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventConcommitantMedicationAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventConcommitantMedicationAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventConcommitantMedicationAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventToxicityAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventToxicityAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventToxicityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventToxicityAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventToxicityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventEventCategoryAssociation() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventEventCategoryAssociationTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventEventCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventEventCategoryAssociation(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventEventCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventPreSpecifiedEvent() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventPreSpecifiedEventTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventPreSpecifiedEvent",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventPreSpecifiedEvent(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventPreSpecifiedEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventStudyDayPeriod() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventStudyDayPeriodTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventStudyDayPeriod(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventBodySystemorOrganClass() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventBodySystemorOrganClassTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventBodySystemorOrganClass",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventBodySystemorOrganClass(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventBodySystemorOrganClassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValuePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEventValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEventValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventseriousEventAssociationSeriousEvent() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventseriousEventAssociationSeriousEventTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventseriousEventAssociationSeriousEvent",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEvent(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventseriousEventAssociationSeriousEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTakenTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTakenTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTakenTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTakenTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventSubCategoryAssociationTemplateId() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventSubCategoryAssociationTemplateIdTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventSubCategoryAssociationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationTemplateId(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventSubCategoryAssociationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventSubCategoryAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategoryTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausalityTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausalityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausalityTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausalityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1TestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1TestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1TestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1TestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventpatternAssociationeventPatternClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventpatternAssociationeventPatternClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventpatternAssociationeventPatternClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventpatternAssociationeventPatternClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventpatternAssociationeventPatternCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventpatternAssociationeventPatternCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventpatternAssociationeventPatternCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventpatternAssociationeventPatternCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventpatternAssociationeventPatternCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventpatternAssociationeventPatternCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventpatternAssociationeventPatternCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventpatternAssociationeventPatternCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventpatternAssociationeventPatternMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventpatternAssociationeventPatternMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventpatternAssociationeventPatternMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventpatternAssociationeventPatternMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventpatternAssociationeventPatternValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventpatternAssociationeventPatternValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventpatternAssociationeventPatternValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventpatternAssociationeventPatternValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventpatternAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventpatternAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventpatternAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventpatternAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventpatternAssociationAdverseEventPattern() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventpatternAssociationAdverseEventPatternTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventpatternAssociationAdverseEventPattern",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationAdverseEventPattern(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventpatternAssociationAdverseEventPatternTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventoutcomeAssociationeventOutcomeClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventoutcomeAssociationeventOutcomeClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventoutcomeAssociationeventOutcomeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventoutcomeAssociationeventOutcomeCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventoutcomeAssociationeventOutcomeCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventoutcomeAssociationeventOutcomeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventoutcomeAssociationeventOutcomeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventoutcomeAssociationeventOutcomeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventoutcomeAssociationeventOutcomeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventoutcomeAssociationeventOutcomeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventoutcomeAssociationeventOutcomeValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventoutcomeAssociationeventOutcomeValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventoutcomeAssociationeventOutcomeValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventoutcomeAssociationeventOutcomeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventoutcomeAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventoutcomeAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventoutcomeAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventoutcomeAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventoutcomeAssociationAdverseEventOutcome() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventoutcomeAssociationAdverseEventOutcomeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventoutcomeAssociationAdverseEventOutcome",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventoutcomeAssociationAdverseEventOutcomeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventtoxicityAssociationtoxicityGradeCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventtoxicityAssociationtoxicityGradeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventtoxicityAssociationtoxicityGradeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventtoxicityAssociationtoxicityGradeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventtoxicityAssociationtoxicityGradeValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventtoxicityAssociationtoxicityGradeValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventtoxicityAssociationtoxicityGradeValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventtoxicityAssociationtoxicityGradeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventtoxicityAssociationtoxicityGradeValueP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventtoxicityAssociationtoxicityGradeValuePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventtoxicityAssociationtoxicityGradeValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventtoxicityAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventtoxicityAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventtoxicityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventtoxicityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventtoxicityAssociationToxicityGrade() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventtoxicityAssociationToxicityGradeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventtoxicityAssociationToxicityGrade",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationToxicityGrade(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventtoxicityAssociationToxicityGradeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventCategoryAssociationeventCategoryClassCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventCategoryAssociationeventCategoryClassCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventCategoryAssociationeventCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventCategoryAssociationeventCategoryCodeP() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventCategoryAssociationeventCategoryCodePTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventCategoryAssociationeventCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventCategoryAssociationeventCategoryCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventCategoryAssociationeventCategoryCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventCategoryAssociationeventCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventCategoryAssociationeventCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventCategoryAssociationeventCategoryValue() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventCategoryAssociationeventCategoryValueTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventCategoryAssociationeventCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryValue(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventCategoryAssociationeventCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectEventeventCategoryAssociationTypeCode() {
      OperationsTestCase<StudySubjectEvent> validateStudySubjectEventeventCategoryAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectEvent>(
      "validateStudySubjectEventeventCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectEvent target) {

      }

      @Override
      protected void updateToPass(StudySubjectEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationTypeCode(
          (StudySubjectEvent) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectEventeventCategoryAssociationTypeCodeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


StudySubjectEvent target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetEventSeverity() {


StudySubjectEvent target = objectFactory.create();
target.getEventSeverity();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPreSpecifiedEvent() {


StudySubjectEvent target = objectFactory.create();
target.getPreSpecifiedEvent();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


StudySubjectEvent target = objectFactory.create();
target.getStudyDayPeriod();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodySystemorOrganClass() {


StudySubjectEvent target = objectFactory.create();
target.getBodySystemorOrganClass();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends StudySubjectEventOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}
	
/**
*
* @generated
*/
	private static class ObjectFactory implements TestObjectFactory<StudySubjectEvent> {
		public StudySubjectEvent create() {		
			return SdtmFactory.eINSTANCE.createStudySubjectEvent();
		}
	}


/**
*
* @generated
*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

/**
*
* @generated
*/
	private static ObjectFactory objectFactory = new ObjectFactory();


		/**
* Tests Operations Constructor for 100% coverage
* @generated
*/	
	private static class ConstructorTestClass extends StudySubjectEventOperations {};
	
		/**
* Tests Operations Constructor for 100% coverage
* @generated
*/	
		@Test
	public void testConstructor() {
          @SuppressWarnings("unused")
      ConstructorTestClass constructorTestClass = new ConstructorTestClass();		
  } // testConstructor
	
	
	
	/**
*
* @generated
*/
	@Override
	protected EObject getObjectToTest() {		
    return null;
  }
	
	

	
	
} // StudySubjectEventOperations