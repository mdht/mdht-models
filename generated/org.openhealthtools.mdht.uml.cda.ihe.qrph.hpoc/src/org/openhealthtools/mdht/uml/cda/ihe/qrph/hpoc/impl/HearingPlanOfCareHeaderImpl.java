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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareHeader;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareHeaderOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareHeaderImpl extends ClinicalDocumentImpl implements HearingPlanOfCareHeader
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareHeaderImpl()
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
    return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareHeaderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareHeaderOperations.validateHearingPlanOfCareHeaderTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareHeaderRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareHeaderOperations.validateHearingPlanOfCareHeaderRecordTarget(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareHeaderCustodian(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareHeaderOperations.validateHearingPlanOfCareHeaderCustodian(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareHeaderComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareHeaderOperations.validateHearingPlanOfCareHeaderComponentOf(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareHeaderDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareHeaderOperations.validateHearingPlanOfCareHeaderDocumentationOf(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareHeaderAuthor(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareHeaderOperations.validateHearingPlanOfCareHeaderAuthor(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareHeader init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareHeader init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingPlanOfCareHeaderImpl
