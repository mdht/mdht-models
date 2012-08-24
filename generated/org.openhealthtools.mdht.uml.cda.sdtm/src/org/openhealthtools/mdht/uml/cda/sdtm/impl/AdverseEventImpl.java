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

import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.AdverseEventOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adverse Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdverseEventImpl extends ObservationImpl implements AdverseEvent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdverseEventImpl()
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
    return SdtmPackage.Literals.ADVERSE_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventBodySystemorOrganClass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventEventSeverity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventSeriousEventAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventSeriousEventAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventStudyTreatmentActionTakenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventStudyTreatmentActionTakenAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventOtherTreatmentActionTakenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventOtherTreatmentActionTakenAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventAdverseEventSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventAdverseEventSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventStudyTreatmentCausalityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventStudyTreatmentCausalityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventNonStudyTreatmentCausalityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventNonStudyTreatmentCausalityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventPatternAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventPatternAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventOutcomeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventOutcomeAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventConcomitantTreatmentAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventConcomitantTreatmentAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventToxicityAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventToxicityAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventAdverseEventCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventAdverseEventCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventPreSpecifiedEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventTypeValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociationSeriousEventType(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEventSeriousEventTypeAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventseriousEventAssociationSeriousEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventseriousEventAssociationSeriousEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationstudyTreatmentActionTakenValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentActionTakenAssociationStudyTreatmentActionTaken(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationotherTreatmentActionTakenValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventotherTreatmentActionTakenAssociationOtherTreatmentActionTaken(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationadverseEventSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventSubCategoryAssociationAdverseEventSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationstudyTreatmentCausalityValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventstudyTreatmentCausalityAssociationStudyTreatmentCausality(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationnonStudyTreatmentCausalityValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventnonStudyTreatmentCausalityAssociationNonStudyTreatmentCausality(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventpatternAssociationadverseEventPatternClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventpatternAssociationadverseEventPatternCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventpatternAssociationadverseEventPatternCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventpatternAssociationadverseEventPatternMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventpatternAssociationadverseEventPatternValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventpatternAssociationadverseEventPatternValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventpatternAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventpatternAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventpatternAssociationAdverseEventPattern(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventpatternAssociationAdverseEventPattern(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventoutcomeAssociationadverseEventOutcomeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventoutcomeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventoutcomeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventoutcomeAssociationAdverseEventOutcome(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventoutcomeAssociationAdverseEventOutcome(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationconcomitantTreatmentValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventconcomitantTreatmentAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventconcomitantTreatmentAssociationConcomitantTreatment(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventaeToxicityAssociationaeToxicityGradeValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventaeToxicityAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventaeToxicityAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventaeToxicityAssociationToxicityGrade(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventaeToxicityAssociationToxicityGrade(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationadverseEventCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AdverseEventOperations.validateAdverseEventadverseEventCategoryAssociationAdverseEventCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return AdverseEventOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass getBodySystemorOrganClass()
  {
    return AdverseEventOperations.getBodySystemorOrganClass(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeverity getEventSeverity()
  {
    return AdverseEventOperations.getEventSeverity(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent getPreSpecifiedEvent()
  {
    return AdverseEventOperations.getPreSpecifiedEvent(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return AdverseEventOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdverseEvent init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdverseEvent init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AdverseEventImpl
