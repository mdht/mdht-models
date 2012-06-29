/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrative;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPatientCareNarrativeOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Patient Care Narrative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPatientCareNarrativeImpl extends SectionImpl implements EMSPatientCareNarrative
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPatientCareNarrativeImpl()
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
    return EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeOperations.validateEMSPatientCareNarrativeTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeOperations.validateEMSPatientCareNarrativeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeOperations.validateEMSPatientCareNarrativeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeOperations.validateEMSPatientCareNarrativeText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeOperations.validateEMSPatientCareNarrativeTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSPatientCareNarrative init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSPatientCareNarrativeImpl
