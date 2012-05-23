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

import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.VitalSignOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Sign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignImpl extends ObservationImpl implements VitalSign
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VitalSignImpl()
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
    return SdtmPackage.Literals.VITAL_SIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignInterpretationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignAssociatedPosition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignAssociatedPosition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignEventStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionpositionValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionpositionValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVitalSignassociatedPositionPosition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return VitalSignOperations.validateVitalSignassociatedPositionPosition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventStudyDay getEventStudyDay()
  {
    return VitalSignOperations.getEventStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay getPlannedStudyDay()
  {
    return VitalSignOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return VitalSignOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return VitalSignOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VitalSign init() {
    	CDAUtil.init(this);
    	return this;
  }
} //VitalSignImpl
