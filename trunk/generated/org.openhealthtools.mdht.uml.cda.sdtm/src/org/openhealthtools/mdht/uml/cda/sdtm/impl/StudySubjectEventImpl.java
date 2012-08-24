/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectEventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Subject Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudySubjectEventImpl extends ObservationImpl implements StudySubjectEvent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudySubjectEventImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SdtmPackage.Literals.STUDY_SUBJECT_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventEventSeverity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventSeriousEventAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventSeriousEventAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventStudyTreatmentActionTakenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventStudyTreatmentActionTakenAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventOtherTreatmentActionTakenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventOtherTreatmentActionTakenAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventEventSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventEventSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventStudyTreatmentCausalityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventStudyTreatmentCausalityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventNonStudyTreatmentCausalityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventNonStudyTreatmentCausalityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventPatternAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventPatternAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventOutcomeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventOutcomeAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventConcommitantMedicationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventConcommitantMedicationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventToxicityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventEventCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventEventCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventPreSpecifiedEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventBodySystemorOrganClass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEventValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEventValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventseriousEventAssociationSeriousEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventseriousEventAssociationSeriousEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationeventSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventSubCategoryAssociationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventSubCategoryAssociationAdverseEventSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCodeStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValueStudySubjectEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventpatternAssociationeventPatternClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventpatternAssociationeventPatternCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventpatternAssociationeventPatternCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventpatternAssociationeventPatternMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventpatternAssociationeventPatternValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationeventPatternValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventpatternAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventpatternAssociationAdverseEventPattern(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventpatternAssociationAdverseEventPattern(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventoutcomeAssociationeventOutcomeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventoutcomeAssociationeventOutcomeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationeventOutcomeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventoutcomeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventoutcomeAssociationAdverseEventOutcome(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationtoxicityGradeValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventtoxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventtoxicityAssociationToxicityGrade(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventtoxicityAssociationToxicityGrade(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventCategoryAssociationeventCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventCategoryAssociationeventCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationeventCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectEventeventCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectEventOperations.validateStudySubjectEventeventCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return StudySubjectEventOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeverity getEventSeverity()
  {
    return StudySubjectEventOperations.getEventSeverity(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent getPreSpecifiedEvent()
  {
    return StudySubjectEventOperations.getPreSpecifiedEvent(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return StudySubjectEventOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass getBodySystemorOrganClass()
  {
    return StudySubjectEventOperations.getBodySystemorOrganClass(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudySubjectEvent init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudySubjectEvent init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudySubjectEventImpl
