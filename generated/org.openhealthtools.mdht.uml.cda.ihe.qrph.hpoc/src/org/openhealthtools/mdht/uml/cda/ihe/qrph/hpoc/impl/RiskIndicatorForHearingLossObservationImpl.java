/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorForHearingLossObservation;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.RiskIndicatorForHearingLossObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Indicator For Hearing Loss Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RiskIndicatorForHearingLossObservationImpl extends ObservationImpl implements RiskIndicatorForHearingLossObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RiskIndicatorForHearingLossObservationImpl()
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
    return HPOCPackage.Literals.RISK_INDICATOR_FOR_HEARING_LOSS_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskIndicatorForHearingLossObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskIndicatorForHearingLossObservationOperations.validateRiskIndicatorForHearingLossObservationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskIndicatorForHearingLossObservation init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskIndicatorForHearingLossObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //RiskIndicatorForHearingLossObservationImpl
