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

import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Adverse Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventSeriousEventAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Serious Event Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventStudyTreatmentActionTakenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Action Taken Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventOtherTreatmentActionTakenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Other Treatment Action Taken Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventAdverseEventSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Adverse Event Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventStudyTreatmentCausalityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Causality Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventNonStudyTreatmentCausalityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Non Study Treatment Causality Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventPatternAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pattern Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventOutcomeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Outcome Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventConcomitantTreatmentAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Concomitant Treatment Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventAdverseEventCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Adverse Event Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventseriousEventAssociationSeriousEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Association Study Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Association Other Treatment Action Taken</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Association Adverse Event Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Association Study Treatment Causality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code PAdverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code P1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Association Non Study Treatment Causality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventpatternAssociationadverseEventPatternClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventpatternAssociationadverseEventPatternCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventpatternAssociationadverseEventPatternCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventpatternAssociationadverseEventPatternMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventpatternAssociationadverseEventPatternValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventpatternAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventpatternAssociationAdverseEventPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Association Adverse Event Pattern</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventoutcomeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventoutcomeAssociationAdverseEventOutcome(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Association Adverse Event Outcome</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Association Concomitant Treatment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationToxicityGrade(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Association Toxicity Grade</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCodeAdverseEventaeToxicityAssociationaeToxicityGradeClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Class Code Adverse Eventae Toxicity Associationae Toxicity Grade Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeCodePAdverseEventaeToxicityAssociationaeToxicityGradeCodeP1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code PAdverse Eventae Toxicity Associationae Toxicity Grade Code P1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeAdverseEventaeToxicityAssociationaeToxicityGradeCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code Adverse Eventae Toxicity Associationae Toxicity Grade Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeValueAdverseEventaeToxicityAssociationaeToxicityGradeValue1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value Adverse Eventae Toxicity Associationae Toxicity Grade Value1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeValuePAdverseEventaeToxicityAssociationaeToxicityGradeValueP1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value PAdverse Eventae Toxicity Associationae Toxicity Grade Value P1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Association Adverse Event Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Class Code Adverse Eventadverse Event Category Associationadverse Event Category Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code PAdverse Eventadverse Event Category Associationadverse Event Category Code P1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code Adverse Eventadverse Event Category Associationadverse Event Category Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Mood Code Adverse Eventadverse Event Category Associationadverse Event Category Mood Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValueAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Value Adverse Eventadverse Event Category Associationadverse Event Category Value1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdverseEventOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdverseEventOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventTemplateId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventTemplateId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.23')";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventTemplateId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventTemplateId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.23')
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventTemplateId(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventEffectiveTime(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventEffectiveTime(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventEffectiveTime(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventEffectiveTime(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventEffectiveTime(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventId(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventId(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventTargetSiteCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventTargetSiteCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventTargetSiteCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventTargetSiteCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventTargetSiteCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventGroupIdentifier(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventGroupIdentifier(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventGroupIdentifier(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventGroupIdentifier(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventGroupIdentifier(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventBodySystemorOrganClass(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventBodySystemorOrganClass(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventBodySystemorOrganClass(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Body Systemor Organ Class</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventBodySystemorOrganClass(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventBodySystemorOrganClass(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventEventSeverity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventEventSeverity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventEventSeverity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Event Severity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventEventSeverity(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Severity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventEventSeverity(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_EVENT_SEVERITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventEventSeverity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventSeriousEventAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Serious Event Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventSeriousEventAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventSeriousEventAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Serious Event Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventSeriousEventAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventSeriousEventAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_SERIOUS_EVENT_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventSeriousEventAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventStudyTreatmentActionTakenAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Action Taken Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventStudyTreatmentActionTakenAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventStudyTreatmentActionTakenAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Action Taken Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventStudyTreatmentActionTakenAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventStudyTreatmentActionTakenAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventStudyTreatmentActionTakenAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventOtherTreatmentActionTakenAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Other Treatment Action Taken Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventOtherTreatmentActionTakenAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventOtherTreatmentActionTakenAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Other Treatment Action Taken Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventOtherTreatmentActionTakenAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventOtherTreatmentActionTakenAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventOtherTreatmentActionTakenAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventAdverseEventSubCategoryAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Adverse Event Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventAdverseEventSubCategoryAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventAdverseEventSubCategoryAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Adverse Event Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventAdverseEventSubCategoryAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventAdverseEventSubCategoryAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_ADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventAdverseEventSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventStudyTreatmentCausalityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Causality Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventStudyTreatmentCausalityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventStudyTreatmentCausalityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Treatment Causality Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventStudyTreatmentCausalityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventStudyTreatmentCausalityAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventStudyTreatmentCausalityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventNonStudyTreatmentCausalityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Non Study Treatment Causality Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventNonStudyTreatmentCausalityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventNonStudyTreatmentCausalityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Non Study Treatment Causality Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventNonStudyTreatmentCausalityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventNonStudyTreatmentCausalityAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventNonStudyTreatmentCausalityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventPatternAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pattern Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventPatternAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventPatternAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pattern Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventPatternAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventPatternAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_PATTERN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventPatternAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventOutcomeAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Outcome Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventOutcomeAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventOutcomeAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Outcome Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventOutcomeAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventOutcomeAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_OUTCOME_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventOutcomeAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventConcomitantTreatmentAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Concomitant Treatment Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventConcomitantTreatmentAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventConcomitantTreatmentAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Concomitant Treatment Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventConcomitantTreatmentAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventConcomitantTreatmentAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_CONCOMITANT_TREATMENT_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventConcomitantTreatmentAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventToxicityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Toxicity Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventToxicityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventToxicityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Toxicity Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventToxicityAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventToxicityAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_TOXICITY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventToxicityAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventAdverseEventCategoryAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Adverse Event Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventAdverseEventCategoryAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventAdverseEventCategoryAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Adverse Event Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventAdverseEventCategoryAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventAdverseEventCategoryAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_ADVERSE_EVENT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventAdverseEventCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventPreSpecifiedEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventPreSpecifiedEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventPreSpecifiedEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Pre Specified Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventPreSpecifiedEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventPreSpecifiedEvent(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_PRE_SPECIFIED_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventStudyDayPeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventStudyDayPeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventStudyDayPeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventStudyDayPeriod(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventStudyDayPeriod(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENT_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1')))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association Serious Event Type</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event Serious Event Type Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventseriousEventAssociationSeriousEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventseriousEventAssociationSeriousEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventserious Event Association Serious Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventseriousEventAssociationSeriousEvent(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventseriousEventAssociationSeriousEvent(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventseriousEventAssociationSeriousEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'NCI' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'NCI' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Associationstudy Treatment Action Taken Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentActionTakenAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Association Study Treatment Action Taken</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Action Taken Association Study Treatment Action Taken</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Associationother Treatment Action Taken Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventotherTreatmentActionTakenAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Association Other Treatment Action Taken</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventother Treatment Action Taken Association Other Treatment Action Taken</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Associationadverse Event Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventSubCategoryAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Association Adverse Event Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Sub Category Association Adverse Event Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Association Study Treatment Causality</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Association Study Treatment Causality</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Class Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code PAdverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code P1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_PADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code PAdverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code P1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_PADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_PADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_PADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_PADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_PADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_PADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Mood Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE)))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value Adverse Eventstudy Treatment Causality Associationstudy Treatment Causality Value1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE)))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Association Non Study Treatment Causality</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Association Non Study Treatment Causality</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED)))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED)))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventpatternAssociationadverseEventPatternClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventpatternAssociationadverseEventPatternClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventpatternAssociationadverseEventPatternCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventpatternAssociationadverseEventPatternCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventpatternAssociationadverseEventPatternCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventpatternAssociationadverseEventPatternCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventpatternAssociationadverseEventPatternMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventpatternAssociationadverseEventPatternMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventpatternAssociationadverseEventPatternValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Associationadverse Event Pattern Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationadverseEventPatternValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::CE))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventpatternAssociationadverseEventPatternValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventpatternAssociationadverseEventPatternValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventpatternAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventpatternAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventpatternAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTPATTERN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventpatternAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventpatternAssociationAdverseEventPattern(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Association Adverse Event Pattern</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationAdverseEventPattern(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventpatternAssociationAdverseEventPattern(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventpattern Association Adverse Event Pattern</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventpatternAssociationAdverseEventPattern(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventpatternAssociationAdverseEventPattern(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventpatternAssociationAdverseEventPattern", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventoutcomeAssociationadverseEventOutcomeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventoutcomeAssociationadverseEventOutcomeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventoutcomeAssociationadverseEventOutcomeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventoutcomeAssociationadverseEventOutcomeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Associationadverse Event Outcome Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventoutcomeAssociationadverseEventOutcomeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventoutcomeAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventoutcomeAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventoutcomeAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOUTCOME_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventoutcomeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventoutcomeAssociationAdverseEventOutcome(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Association Adverse Event Outcome</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationAdverseEventOutcome(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventoutcomeAssociationAdverseEventOutcome(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventoutcome Association Adverse Event Outcome</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventoutcomeAssociationAdverseEventOutcome(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventoutcomeAssociationAdverseEventOutcome(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventoutcomeAssociationAdverseEventOutcome", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Association Concomitant Treatment</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Association Concomitant Treatment</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_CONCOMITANT_TREATMENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationConcomitantTreatment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Class Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL)))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL)))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1')))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationToxicityGrade(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Association Toxicity Grade</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationToxicityGrade(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationToxicityGrade(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Association Toxicity Grade</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationToxicityGrade(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationToxicityGrade(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TOXICITY_GRADE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationToxicityGrade", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCodeAdverseEventaeToxicityAssociationaeToxicityGradeClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Class Code Adverse Eventae Toxicity Associationae Toxicity Grade Class Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCodeAdverseEventaeToxicityAssociationaeToxicityGradeClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCodeAdverseEventaeToxicityAssociationaeToxicityGradeClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Class Code Adverse Eventae Toxicity Associationae Toxicity Grade Class Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCodeAdverseEventaeToxicityAssociationaeToxicityGradeClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCodeAdverseEventaeToxicityAssociationaeToxicityGradeClassCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeClassCodeAdverseEventaeToxicityAssociationaeToxicityGradeClassCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodePAdverseEventaeToxicityAssociationaeToxicityGradeCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code PAdverse Eventae Toxicity Associationae Toxicity Grade Code P1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodePAdverseEventaeToxicityAssociationaeToxicityGradeCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodePAdverseEventaeToxicityAssociationaeToxicityGradeCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code PAdverse Eventae Toxicity Associationae Toxicity Grade Code P1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodePAdverseEventaeToxicityAssociationaeToxicityGradeCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeCodePAdverseEventaeToxicityAssociationaeToxicityGradeCodeP1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeCodePAdverseEventaeToxicityAssociationaeToxicityGradeCodeP1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeAdverseEventaeToxicityAssociationaeToxicityGradeCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code Adverse Eventae Toxicity Associationae Toxicity Grade Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeAdverseEventaeToxicityAssociationaeToxicityGradeCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeAdverseEventaeToxicityAssociationaeToxicityGradeCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code Adverse Eventae Toxicity Associationae Toxicity Grade Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeAdverseEventaeToxicityAssociationaeToxicityGradeCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeAdverseEventaeToxicityAssociationaeToxicityGradeCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeCodeAdverseEventaeToxicityAssociationaeToxicityGradeCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeValueAdverseEventaeToxicityAssociationaeToxicityGradeValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value Adverse Eventae Toxicity Associationae Toxicity Grade Value1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeValueAdverseEventaeToxicityAssociationaeToxicityGradeValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeValueAdverseEventaeToxicityAssociationaeToxicityGradeValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value Adverse Eventae Toxicity Associationae Toxicity Grade Value1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeValueAdverseEventaeToxicityAssociationaeToxicityGradeValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.113883.3.26.1.1'))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeValueAdverseEventaeToxicityAssociationaeToxicityGradeValue1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeValueAdverseEventaeToxicityAssociationaeToxicityGradeValue1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeValuePAdverseEventaeToxicityAssociationaeToxicityGradeValueP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value PAdverse Eventae Toxicity Associationae Toxicity Grade Value P1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeValuePAdverseEventaeToxicityAssociationaeToxicityGradeValueP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE)))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventaeToxicityAssociationaeToxicityGradeValuePAdverseEventaeToxicityAssociationaeToxicityGradeValueP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value PAdverse Eventae Toxicity Associationae Toxicity Grade Value P1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventaeToxicityAssociationaeToxicityGradeValuePAdverseEventaeToxicityAssociationaeToxicityGradeValueP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE)))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeValuePAdverseEventaeToxicityAssociationaeToxicityGradeValueP1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_PADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventaeToxicityAssociationaeToxicityGradeValuePAdverseEventaeToxicityAssociationaeToxicityGradeValueP1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationTypeCode(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationTypeCode(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Association Adverse Event Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Association Adverse Event Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_ADVERSE_EVENT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationAdverseEventCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Class Code Adverse Eventadverse Event Category Associationadverse Event Category Class Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(isDefined('classCode')))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Class Code Adverse Eventadverse Event Category Associationadverse Event Category Class Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(isDefined('classCode')))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code PAdverse Eventadverse Event Category Associationadverse Event Category Code P1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_PADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code PAdverse Eventadverse Event Category Associationadverse Event Category Code P1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_PADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_PADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_PADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_PADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_PADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_PADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code Adverse Eventadverse Event Category Associationadverse Event Category Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code Adverse Eventadverse Event Category Associationadverse Event Category Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Mood Code Adverse Eventadverse Event Category Associationadverse Event Category Mood Code1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(isDefined('moodCode')))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Mood Code Adverse Eventadverse Event Category Associationadverse Event Category Mood Code1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject(isDefined('moodCode')))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValueAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Value Adverse Eventadverse Event Category Associationadverse Event Category Value1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValueAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE)))))";

  /**
   * The cached OCL invariant for the '{@link #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValueAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Value Adverse Eventadverse Event Category Associationadverse Event Category Value1</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValueAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue1(AdverseEvent, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE)))))
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValueAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue1(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.ADVERSE_EVENT);
      try
      {
        VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(adverseEvent))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.ADVERSE_EVENT__ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE1,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AdverseEventadverseEventCategoryAssociationadverseEventCategoryValueAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue1", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(adverseEvent, context) }),
             new Object [] { adverseEvent }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(AdverseEvent) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(AdverseEvent) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(AdverseEvent adverseEvent)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(181));
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
    return (GroupIdentifier) query.evaluate(adverseEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(AdverseEvent) <em>Get Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->first().oclAsType(sdtm::Body System or Organ Class)";

  /**
   * The cached OCL query for the '{@link #getBodySystemorOrganClass(AdverseEvent) <em>Get Body Systemor Organ Class</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->first().oclAsType(sdtm::Body System or Organ Class)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  BodySystemorOrganClass getBodySystemorOrganClass(AdverseEvent adverseEvent)
  {
    if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(182));
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
    return (BodySystemorOrganClass) query.evaluate(adverseEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getEventSeverity(AdverseEvent) <em>Get Event Severity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_SEVERITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->first().oclAsType(sdtm::Event Severity)";

  /**
   * The cached OCL query for the '{@link #getEventSeverity(AdverseEvent) <em>Get Event Severity</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventSeverity(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_SEVERITY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Severity))->asSequence()->first().oclAsType(sdtm::Event Severity)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EventSeverity getEventSeverity(AdverseEvent adverseEvent)
  {
    if (GET_EVENT_SEVERITY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(183));
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
    return (EventSeverity) query.evaluate(adverseEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(AdverseEvent) <em>Get Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->first().oclAsType(sdtm::Pre-Specified Event)";

  /**
   * The cached OCL query for the '{@link #getPreSpecifiedEvent(AdverseEvent) <em>Get Pre Specified Event</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->first().oclAsType(sdtm::Pre-Specified Event)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  PreSpecifiedEvent getPreSpecifiedEvent(AdverseEvent adverseEvent)
  {
    if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(184));
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
    return (PreSpecifiedEvent) query.evaluate(adverseEvent);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(AdverseEvent) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->first().oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(AdverseEvent) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(AdverseEvent)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->first().oclAsType(sdtm::Study Day Period)
   * @param adverseEvent The receiving '<em><b>Adverse Event</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(AdverseEvent adverseEvent)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.ADVERSE_EVENT, SdtmPackage.Literals.ADVERSE_EVENT.getEAllOperations().get(185));
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
    return (StudyDayPeriod) query.evaluate(adverseEvent);
  }

} // AdverseEventOperations