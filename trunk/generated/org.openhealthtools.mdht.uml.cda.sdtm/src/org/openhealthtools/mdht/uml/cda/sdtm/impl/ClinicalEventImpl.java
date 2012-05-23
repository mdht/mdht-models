/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ClinicalEventOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClinicalEventImpl extends ObservationImpl implements ClinicalEvent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClinicalEventImpl()
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
    return SdtmPackage.Literals.CLINICAL_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventClinicalEventCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventClinicalEventCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventClinicalEventSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventClinicalEventSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventPreSpecifiedEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventBodySystemorOrganClass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventEventSeverity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventActivityStartTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventActivityStartTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventActivityEndTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventActivityEndTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventclinicalEventCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventclinicalEventCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ClinicalEventOperations.validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent getPreSpecifiedEvent()
  {
    return ClinicalEventOperations.getPreSpecifiedEvent(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return ClinicalEventOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass getBodySystemorOrganClass()
  {
    return ClinicalEventOperations.getBodySystemorOrganClass(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return ClinicalEventOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeverity getEventSeverity()
  {
    return ClinicalEventOperations.getEventSeverity(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityStartTimingReference getActivityStartTimingReference()
  {
    return ClinicalEventOperations.getActivityStartTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityEndTimingReference getActivityEndTimingReference()
  {
    return ClinicalEventOperations.getActivityEndTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClinicalEvent init() {
    	CDAUtil.init(this);
    	return this;
  }
} //ClinicalEventImpl
