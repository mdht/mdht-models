/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;


import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareSectionImpl extends SectionImpl implements HearingPlanOfCareSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareSectionImpl()
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
    return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionEntryAct(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionEntryAct(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionEntryEncounter(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionEntryEncounter(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionEntryObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionEntryObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionEntryProcedure(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionEntryProcedure(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionEntrySubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionEntrySubstanceAdministration(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionEntrySupply(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionEntrySupply(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareSectionEntryInstructions(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareSectionOperations.validateHearingPlanOfCareSectionEntryInstructions(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareSection init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingPlanOfCareSectionImpl
