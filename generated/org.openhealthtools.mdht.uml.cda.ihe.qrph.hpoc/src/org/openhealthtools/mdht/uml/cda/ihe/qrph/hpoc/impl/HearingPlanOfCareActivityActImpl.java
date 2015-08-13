/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityActImpl;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityAct;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareActivityActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.impl.EntryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Activity Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareActivityActImpl extends PlanOfCareActivityActImpl implements HearingPlanOfCareActivityAct
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareActivityActImpl()
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
    return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_ACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityActEffectiveTimeLowHigh(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityActOperations.validateHearingPlanOfCareActivityActEffectiveTimeLowHigh(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityActOperations.validateHearingPlanOfCareActivityActCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityActCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityActOperations.validateHearingPlanOfCareActivityActCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityActText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityActOperations.validateHearingPlanOfCareActivityActText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityActOperations.validateHearingPlanOfCareActivityActStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityActOperations.validateHearingPlanOfCareActivityActEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validatePlanOfCareActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityActOperations.validatePlanOfCareActivityActTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareActivityAct init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareActivityAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingPlanOfCareActivityActImpl
