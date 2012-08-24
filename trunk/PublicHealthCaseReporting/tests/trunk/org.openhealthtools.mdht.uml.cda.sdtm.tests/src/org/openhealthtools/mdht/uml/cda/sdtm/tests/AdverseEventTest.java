
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
import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.AdverseEventOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Associationnon Study Treatment Causality Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventnon Study Treatment Causality Association Non Study Treatment Causality</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Associationconcomitant Treatment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventconcomitant Treatment Association Concomitant Treatment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Associationae Toxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventaeToxicityAssociationToxicityGrade(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventae Toxicity Association Toxicity Grade</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Associationadverse Event Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent#validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Eventadverse Event Category Association Adverse Event Category</em>}</li>
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
 
public class AdverseEventTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventTemplateId() {
      OperationsTestCase<AdverseEvent> validateAdverseEventTemplateIdTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventTemplateId(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventEffectiveTime() {
      OperationsTestCase<AdverseEvent> validateAdverseEventEffectiveTimeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventEffectiveTime(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventId() {
      OperationsTestCase<AdverseEvent> validateAdverseEventIdTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventId",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventId(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventTargetSiteCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventTargetSiteCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventTargetSiteCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventGroupIdentifier() {
      OperationsTestCase<AdverseEvent> validateAdverseEventGroupIdentifierTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventGroupIdentifier(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventBodySystemorOrganClass() {
      OperationsTestCase<AdverseEvent> validateAdverseEventBodySystemorOrganClassTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventBodySystemorOrganClass",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventBodySystemorOrganClass(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventBodySystemorOrganClassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventEventSeverity() {
      OperationsTestCase<AdverseEvent> validateAdverseEventEventSeverityTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventEventSeverity",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventEventSeverity(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventEventSeverityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventSeriousEventAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventSeriousEventAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventSeriousEventAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_SERIOUS_EVENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventSeriousEventAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventSeriousEventAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventStudyTreatmentActionTakenAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventStudyTreatmentActionTakenAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventStudyTreatmentActionTakenAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventStudyTreatmentActionTakenAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventStudyTreatmentActionTakenAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventOtherTreatmentActionTakenAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventOtherTreatmentActionTakenAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventOtherTreatmentActionTakenAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_OTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventOtherTreatmentActionTakenAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventOtherTreatmentActionTakenAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventAdverseEventSubCategoryAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventAdverseEventSubCategoryAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventAdverseEventSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventAdverseEventSubCategoryAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventAdverseEventSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventStudyTreatmentCausalityAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventStudyTreatmentCausalityAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventStudyTreatmentCausalityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventStudyTreatmentCausalityAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventStudyTreatmentCausalityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventNonStudyTreatmentCausalityAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventNonStudyTreatmentCausalityAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventNonStudyTreatmentCausalityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_NON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventNonStudyTreatmentCausalityAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventNonStudyTreatmentCausalityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventPatternAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventPatternAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventPatternAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_PATTERN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventPatternAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventPatternAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventOutcomeAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventOutcomeAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventOutcomeAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_OUTCOME_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventOutcomeAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventOutcomeAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventConcomitantTreatmentAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventConcomitantTreatmentAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventConcomitantTreatmentAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_CONCOMITANT_TREATMENT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventConcomitantTreatmentAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventConcomitantTreatmentAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventToxicityAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventToxicityAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventToxicityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventToxicityAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventToxicityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventAdverseEventCategoryAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventAdverseEventCategoryAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventAdverseEventCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_ADVERSE_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventAdverseEventCategoryAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventAdverseEventCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventPreSpecifiedEvent() {
      OperationsTestCase<AdverseEvent> validateAdverseEventPreSpecifiedEventTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventPreSpecifiedEvent",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventPreSpecifiedEvent(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventPreSpecifiedEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventStudyDayPeriod() {
      OperationsTestCase<AdverseEvent> validateAdverseEventStudyDayPeriodTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventStudyDayPeriod(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValuePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION_SERIOUS_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT_SERIOUS_EVENT_TYPE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventseriousEventAssociationSeriousEvent() {
      OperationsTestCase<AdverseEvent> validateAdverseEventseriousEventAssociationSeriousEventTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventseriousEventAssociationSeriousEvent",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSERIOUS_EVENT_ASSOCIATION_SERIOUS_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEvent(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventseriousEventAssociationSeriousEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATIONSTUDY_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentActionTakenAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentActionTakenAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentActionTakenAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTakenTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_ACTION_TAKEN_ASSOCIATION_STUDY_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTakenTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATIONOTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventotherTreatmentActionTakenAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventotherTreatmentActionTakenAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventotherTreatmentActionTakenAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventotherTreatmentActionTakenAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken() {
      OperationsTestCase<AdverseEvent> validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTakenTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOTHER_TREATMENT_ACTION_TAKEN_ASSOCIATION_OTHER_TREATMENT_ACTION_TAKEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTakenTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATIONADVERSE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventSubCategoryAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategoryTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_SUB_CATEGORY_ASSOCIATION_ADVERSE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATIONSTUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentCausalityAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentCausalityAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentCausalityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentCausalityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality() {
      OperationsTestCase<AdverseEvent> validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausalityTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTSTUDY_TREATMENT_CAUSALITY_ASSOCIATION_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausalityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATIONNON_STUDY_TREATMENT_CAUSALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality() {
      OperationsTestCase<AdverseEvent> validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausalityTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTNON_STUDY_TREATMENT_CAUSALITY_ASSOCIATION_NON_STUDY_TREATMENT_CAUSALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausalityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventpatternAssociationadverseEventPatternClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventpatternAssociationadverseEventPatternClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventpatternAssociationadverseEventPatternClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventpatternAssociationadverseEventPatternClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventpatternAssociationadverseEventPatternCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventpatternAssociationadverseEventPatternCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventpatternAssociationadverseEventPatternCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventpatternAssociationadverseEventPatternCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventpatternAssociationadverseEventPatternCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventpatternAssociationadverseEventPatternCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventpatternAssociationadverseEventPatternCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventpatternAssociationadverseEventPatternCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventpatternAssociationadverseEventPatternMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventpatternAssociationadverseEventPatternMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventpatternAssociationadverseEventPatternMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventpatternAssociationadverseEventPatternMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventpatternAssociationadverseEventPatternValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventpatternAssociationadverseEventPatternValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventpatternAssociationadverseEventPatternValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATIONADVERSE_EVENT_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventpatternAssociationadverseEventPatternValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventpatternAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventpatternAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventpatternAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventpatternAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventpatternAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventpatternAssociationAdverseEventPattern() {
      OperationsTestCase<AdverseEvent> validateAdverseEventpatternAssociationAdverseEventPatternTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventpatternAssociationAdverseEventPattern",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTPATTERN_ASSOCIATION_ADVERSE_EVENT_PATTERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventpatternAssociationAdverseEventPattern(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventpatternAssociationAdverseEventPatternTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventoutcomeAssociationadverseEventOutcomeCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventoutcomeAssociationadverseEventOutcomeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventoutcomeAssociationadverseEventOutcomeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventoutcomeAssociationadverseEventOutcomeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventoutcomeAssociationadverseEventOutcomeValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventoutcomeAssociationadverseEventOutcomeValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventoutcomeAssociationadverseEventOutcomeValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATIONADVERSE_EVENT_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventoutcomeAssociationadverseEventOutcomeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventoutcomeAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventoutcomeAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventoutcomeAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventoutcomeAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventoutcomeAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventoutcomeAssociationAdverseEventOutcome() {
      OperationsTestCase<AdverseEvent> validateAdverseEventoutcomeAssociationAdverseEventOutcomeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventoutcomeAssociationAdverseEventOutcome",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTOUTCOME_ASSOCIATION_ADVERSE_EVENT_OUTCOME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventoutcomeAssociationAdverseEventOutcome(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventoutcomeAssociationAdverseEventOutcomeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATIONCONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventconcomitantTreatmentAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventconcomitantTreatmentAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventconcomitantTreatmentAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventconcomitantTreatmentAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment() {
      OperationsTestCase<AdverseEvent> validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatmentTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTCONCOMITANT_TREATMENT_ASSOCIATION_CONCOMITANT_TREATMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatmentTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventaeToxicityAssociationaeToxicityGradeCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventaeToxicityAssociationaeToxicityGradeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventaeToxicityAssociationaeToxicityGradeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventaeToxicityAssociationaeToxicityGradeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventaeToxicityAssociationaeToxicityGradeValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventaeToxicityAssociationaeToxicityGradeValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventaeToxicityAssociationaeToxicityGradeValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventaeToxicityAssociationaeToxicityGradeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventaeToxicityAssociationaeToxicityGradeValueP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventaeToxicityAssociationaeToxicityGradeValuePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATIONAE_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventaeToxicityAssociationaeToxicityGradeValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventaeToxicityAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventaeToxicityAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventaeToxicityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventaeToxicityAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventaeToxicityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventaeToxicityAssociationToxicityGrade() {
      OperationsTestCase<AdverseEvent> validateAdverseEventaeToxicityAssociationToxicityGradeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventaeToxicityAssociationToxicityGrade",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTAE_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventaeToxicityAssociationToxicityGrade(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventaeToxicityAssociationToxicityGradeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValueTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATIONADVERSE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventCategoryAssociationTypeCode() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventCategoryAssociationTypeCodeTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationTypeCode(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAdverseEventadverseEventCategoryAssociationAdverseEventCategory() {
      OperationsTestCase<AdverseEvent> validateAdverseEventadverseEventCategoryAssociationAdverseEventCategoryTestCase = new OperationsTestCase<AdverseEvent>(
      "validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory",
      operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENTADVERSE_EVENT_CATEGORY_ASSOCIATION_ADVERSE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AdverseEvent target) {

      }

      @Override
      protected void updateToPass(AdverseEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(
          (AdverseEvent) objectToTest, diagnostician, map);
      }

    };

    validateAdverseEventadverseEventCategoryAssociationAdverseEventCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


AdverseEvent target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodySystemorOrganClass() {


AdverseEvent target = objectFactory.create();
target.getBodySystemorOrganClass();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetEventSeverity() {


AdverseEvent target = objectFactory.create();
target.getEventSeverity();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPreSpecifiedEvent() {


AdverseEvent target = objectFactory.create();
target.getPreSpecifiedEvent();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


AdverseEvent target = objectFactory.create();
target.getStudyDayPeriod();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends AdverseEventOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdverseEvent> {
		public AdverseEvent create() {		
			return SdtmFactory.eINSTANCE.createAdverseEvent();
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
	private static class ConstructorTestClass extends AdverseEventOperations {};
	
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
	
	

	
	
} // AdverseEventOperations