/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

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
public class StudySubjectEventOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudySubjectEventOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.102')";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventTemplateId(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C49562' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventEffectiveTime(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventEffectiveTime(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventEffectiveTime(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventEffectiveTime(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventEffectiveTime(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventId(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventTargetSiteCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventTargetSiteCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventTargetSiteCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventTargetSiteCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventTargetSiteCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventGroupIdentifier(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventGroupIdentifier(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventGroupIdentifier(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventGroupIdentifier(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventGroupIdentifier(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventEventSeverity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventEventSeverity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventEventSeverity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Severity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventEventSeverity(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventEventSeverity(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EVENT_SEVERITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventSeriousEventAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Serious Event Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventSeriousEventAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventSeriousEventAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Serious Event Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventSeriousEventAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventSeriousEventAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_SERIOUS_EVENT_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventSeriousEventAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventStudyTreatmentActionTakenAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Action Taken Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventStudyTreatmentActionTakenAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventStudyTreatmentActionTakenAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Action Taken Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventStudyTreatmentActionTakenAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventStudyTreatmentActionTakenAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventStudyTreatmentActionTakenAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventOtherTreatmentActionTakenAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Other Treatment Action Taken Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventOtherTreatmentActionTakenAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventOtherTreatmentActionTakenAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Other Treatment Action Taken Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventOtherTreatmentActionTakenAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventOtherTreatmentActionTakenAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventOtherTreatmentActionTakenAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventEventSubCategoryAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventEventSubCategoryAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventEventSubCategoryAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventEventSubCategoryAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventEventSubCategoryAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EVENT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEventSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventStudyTreatmentCausalityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Causality Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventStudyTreatmentCausalityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventStudyTreatmentCausalityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Treatment Causality Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventStudyTreatmentCausalityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventStudyTreatmentCausalityAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventStudyTreatmentCausalityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventNonStudyTreatmentCausalityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Study Treatment Causality Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventNonStudyTreatmentCausalityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventNonStudyTreatmentCausalityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Non Study Treatment Causality Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventNonStudyTreatmentCausalityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventNonStudyTreatmentCausalityAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventNonStudyTreatmentCausalityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventPatternAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pattern Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventPatternAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventPatternAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pattern Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventPatternAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventPatternAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_PATTERN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventPatternAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventOutcomeAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Outcome Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventOutcomeAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventOutcomeAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Outcome Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventOutcomeAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventOutcomeAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_OUTCOME_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventOutcomeAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventConcommitantMedicationAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Concommitant Medication Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventConcommitantMedicationAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventConcommitantMedicationAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Concommitant Medication Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventConcommitantMedicationAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventConcommitantMedicationAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_CONCOMMITANT_MEDICATION_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventConcommitantMedicationAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventToxicityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Toxicity Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventToxicityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventToxicityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Toxicity Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventToxicityAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventToxicityAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_TOXICITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventToxicityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventEventCategoryAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventEventCategoryAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventEventCategoryAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Event Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventEventCategoryAssociation(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventEventCategoryAssociation(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_EVENT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventEventCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Pre Specified Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventPreSpecifiedEvent(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_PRE_SPECIFIED_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventStudyDayPeriod(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventStudyDayPeriod(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventStudyDayPeriod(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventStudyDayPeriod(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventStudyDayPeriod(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Event Body Systemor Organ Class</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventBodySystemorOrganClass(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENT_BODY_SYSTEMOR_ORGAN_CLASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Serious Event Type Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEventValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEventValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventseriousEventAssociationSeriousEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventserious Event Association Serious Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventseriousEventAssociationSeriousEvent(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventseriousEventAssociationSeriousEvent(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventseriousEventAssociationSeriousEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'NCI' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentActionTakenAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Association Study Treatment Action Taken</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Action Taken Association Study Treatment Action Taken</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Associationother Treatment Action Taken Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventotherTreatmentActionTakenAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Association Other Treatment Action Taken</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventother Treatment Action Taken Association Other Treatment Action Taken</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83212' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventSubCategoryAssociationeventSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Associationevent Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATIONEVENT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventSubCategoryAssociationeventSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventSubCategoryAssociationTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = 'null'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventSubCategoryAssociationTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationTemplateId(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventSubCategoryAssociationTemplateId(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventSubCategoryAssociationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventSubCategoryAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventSubCategoryAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventSubCategoryAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Adverse Event Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Sub Category Association Adverse Event Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Associationstudy Treatment Causality Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentCausalityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Association Study Treatment Causality</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventstudy Treatment Causality Association Study Treatment Causality</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Association Non Study Treatment Causality</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Association Non Study Treatment Causality</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED)))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value Study Subject Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_STUDY_SUBJECT_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventpatternAssociationeventPatternClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventpatternAssociationeventPatternClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventpatternAssociationeventPatternClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventpatternAssociationeventPatternClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventpatternAssociationeventPatternCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventpatternAssociationeventPatternCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventpatternAssociationeventPatternCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventpatternAssociationeventPatternCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventpatternAssociationeventPatternCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83208' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventpatternAssociationeventPatternCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventpatternAssociationeventPatternCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventpatternAssociationeventPatternCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventpatternAssociationeventPatternMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventpatternAssociationeventPatternMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventpatternAssociationeventPatternMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventpatternAssociationeventPatternMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventpatternAssociationeventPatternValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventpatternAssociationeventPatternValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Associationevent Pattern Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationeventPatternValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventpatternAssociationeventPatternValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTPATTERN_ASSOCIATIONEVENT_PATTERN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventpatternAssociationeventPatternValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventpatternAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventpatternAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventpatternAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventpatternAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventpatternAssociationAdverseEventPattern(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Association Adverse Event Pattern</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationAdverseEventPattern(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventpatternAssociationAdverseEventPattern(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventpattern Association Adverse Event Pattern</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventpatternAssociationAdverseEventPattern(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventpatternAssociationAdverseEventPattern(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventpatternAssociationAdverseEventPattern", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventoutcomeAssociationeventOutcomeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventoutcomeAssociationeventOutcomeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C49489' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventoutcomeAssociationeventOutcomeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventoutcomeAssociationeventOutcomeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventoutcomeAssociationeventOutcomeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Associationevent Outcome Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationeventOutcomeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventoutcomeAssociationeventOutcomeValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATIONEVENT_OUTCOME_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventoutcomeAssociationeventOutcomeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventoutcomeAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventoutcomeAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventoutcomeAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventoutcomeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Association Adverse Event Outcome</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventoutcome Association Adverse Event Outcome</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventoutcomeAssociationAdverseEventOutcome", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventtoxicityAssociationtoxicityGradeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventtoxicityAssociationtoxicityGradeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C78605' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventtoxicityAssociationtoxicityGradeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventtoxicityAssociationtoxicityGradeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventtoxicityAssociationtoxicityGradeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Associationtoxicity Grade Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventtoxicityAssociationtoxicityGradeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventtoxicityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventtoxicityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventtoxicityAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventtoxicityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventtoxicityAssociationToxicityGrade(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Association Toxicity Grade</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationToxicityGrade(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventtoxicityAssociationToxicityGrade(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventtoxicity Association Toxicity Grade</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventtoxicityAssociationToxicityGrade(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventtoxicityAssociationToxicityGrade(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTTOXICITY_ASSOCIATION_TOXICITY_GRADE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventtoxicityAssociationToxicityGrade", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventCategoryAssociationeventCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventCategoryAssociationeventCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83198' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventCategoryAssociationeventCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventCategoryAssociationeventCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventCategoryAssociationeventCategoryValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Associationevent Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationeventCategoryValue(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventCategoryAssociationeventCategoryValue(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATIONEVENT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventCategoryAssociationeventCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectEventeventCategoryAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectEventeventCategoryAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Eventevent Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectEventeventCategoryAssociationTypeCode(StudySubjectEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectEvent The receiving '<em><b>Study Subject Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectEventeventCategoryAssociationTypeCode(StudySubjectEvent studySubjectEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT);
      try
      {
        VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_EVENT__STUDY_SUBJECT_EVENTEVENT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectEventeventCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectEvent, context) }),
             new Object [] { studySubjectEvent }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(StudySubjectEvent) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(StudySubjectEvent) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(StudySubjectEvent studySubjectEvent)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(155));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(studySubjectEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getEventSeverity(StudySubjectEvent) <em>Get Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->any(true).oclAsType(sdtm::Event Severity)";

  /**
   * The cached OCL query for the '{@link #getEventSeverity(StudySubjectEvent) <em>Get Event Severity</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EventSeverity getEventSeverity(StudySubjectEvent studySubjectEvent)
  {
    if (GET_EVENT_SEVERITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(156));
      try
      {
        GET_EVENT_SEVERITY__EOCL_QRY = helper.createQuery(GET_EVENT_SEVERITY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_SEVERITY__EOCL_QRY);
    return (EventSeverity) query.evaluate(studySubjectEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(StudySubjectEvent) <em>Get Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->any(true).oclAsType(sdtm::Pre-Specified Event)";

  /**
   * The cached OCL query for the '{@link #getPreSpecifiedEvent(StudySubjectEvent) <em>Get Pre Specified Event</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PreSpecifiedEvent getPreSpecifiedEvent(StudySubjectEvent studySubjectEvent)
  {
    if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(157));
      try
      {
        GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
    return (PreSpecifiedEvent) query.evaluate(studySubjectEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(StudySubjectEvent) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(StudySubjectEvent) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(StudySubjectEvent studySubjectEvent)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(158));
      try
      {
        GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
    return (StudyDayPeriod) query.evaluate(studySubjectEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(StudySubjectEvent) <em>Get Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->any(true).oclAsType(sdtm::Body System or Organ Class)";

  /**
   * The cached OCL query for the '{@link #getBodySystemorOrganClass(StudySubjectEvent) <em>Get Body Systemor Organ Class</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(StudySubjectEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  BodySystemorOrganClass getBodySystemorOrganClass(StudySubjectEvent studySubjectEvent)
  {
    if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_EVENT, SdtmPackage.Literals.STUDY_SUBJECT_EVENT.getEAllOperations().get(159));
      try
      {
        GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
    return (BodySystemorOrganClass) query.evaluate(studySubjectEvent);
  }

} // StudySubjectEventOperations