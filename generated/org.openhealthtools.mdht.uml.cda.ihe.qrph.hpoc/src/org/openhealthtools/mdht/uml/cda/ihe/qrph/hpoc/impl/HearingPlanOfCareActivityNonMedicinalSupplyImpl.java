/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivitySupplyImpl;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityNonMedicinalSupply;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareActivityNonMedicinalSupplyOperations;

import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Activity Non Medicinal Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareActivityNonMedicinalSupplyImpl extends PlanOfCareActivitySupplyImpl implements HearingPlanOfCareActivityNonMedicinalSupply
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareActivityNonMedicinalSupplyImpl()
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
    return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_ACTIVITY_NON_MEDICINAL_SUPPLY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupplyCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityNonMedicinalSupplyOperations.validateHearingPlanOfCareActivityNonMedicinalSupplyCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityNonMedicinalSupplyOperations.validateHearingPlanOfCareActivityNonMedicinalSupplyCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupplyText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityNonMedicinalSupplyOperations.validateHearingPlanOfCareActivityNonMedicinalSupplyText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityNonMedicinalSupplyOperations.validateHearingPlanOfCareActivityNonMedicinalSupplyEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityNonMedicinalSupplyOperations.validateHearingPlanOfCareActivityNonMedicinalSupplyQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityNonMedicinalSupplyOperations.validateHearingPlanOfCareActivityNonMedicinalSupplyParticipant(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validatePlanOfCareActivitySupplyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareActivityNonMedicinalSupplyOperations.validatePlanOfCareActivitySupplyTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareActivityNonMedicinalSupply init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareActivityNonMedicinalSupply init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingPlanOfCareActivityNonMedicinalSupplyImpl
