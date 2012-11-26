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

import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.BodyWeightGainOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Weight Gain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BodyWeightGainImpl extends ObservationImpl implements BodyWeightGain
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyWeightGainImpl()
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
    return SdtmPackage.Literals.BODY_WEIGHT_GAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightGainExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightGainOperations.validateBodyWeightGainExclusionReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return BodyWeightGainOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return BodyWeightGainOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return BodyWeightGainOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusionReason getExclusionReason()
  {
    return BodyWeightGainOperations.getExclusionReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyWeightGain init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BodyWeightGain init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //BodyWeightGainImpl
