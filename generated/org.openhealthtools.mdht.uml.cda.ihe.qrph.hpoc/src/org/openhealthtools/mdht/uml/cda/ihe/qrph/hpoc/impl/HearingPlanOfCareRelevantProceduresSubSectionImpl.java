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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingPlanOfCareRelevantProceduresSubSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareRelevantProceduresSubSectionImpl extends SectionImpl implements HearingPlanOfCareRelevantProceduresSubSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingPlanOfCareRelevantProceduresSubSectionImpl()
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
    return HPOCPackage.Literals.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareRelevantProceduresSubSectionOperations.validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareRelevantProceduresSubSectionOperations.validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareRelevantProceduresSubSectionOperations.validateHearingPlanOfCareRelevantProceduresSubSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareRelevantProceduresSubSectionOperations.validateHearingPlanOfCareRelevantProceduresSubSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareRelevantProceduresSubSectionOperations.validateHearingPlanOfCareRelevantProceduresSubSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareRelevantProceduresSubSectionOperations.validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingPlanOfCareRelevantProceduresSubSectionOperations.validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareRelevantProceduresSubSection init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareRelevantProceduresSubSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingPlanOfCareRelevantProceduresSubSectionImpl
