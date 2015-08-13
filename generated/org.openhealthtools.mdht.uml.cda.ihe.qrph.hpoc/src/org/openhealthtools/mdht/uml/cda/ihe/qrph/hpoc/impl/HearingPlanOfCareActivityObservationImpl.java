/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityObservationImpl;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityObservation;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareActivityObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Activity Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareActivityObservationImpl extends PlanOfCareActivityObservationImpl implements HearingPlanOfCareActivityObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareActivityObservationImpl()
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
    return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityObservationEffectiveTimeLowHigh(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityObservationOperations.validateHearingPlanOfCareActivityObservationEffectiveTimeLowHigh(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityObservationOperations.validateHearingPlanOfCareActivityObservationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityObservationOperations.validateHearingPlanOfCareActivityObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityObservationOperations.validateHearingPlanOfCareActivityObservationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityObservationOperations.validateHearingPlanOfCareActivityObservationStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityObservationText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityObservationOperations.validateHearingPlanOfCareActivityObservationText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validatePlanOfCareActivityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityObservationOperations.validatePlanOfCareActivityObservationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareActivityObservation init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareActivityObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingPlanOfCareActivityObservationImpl
