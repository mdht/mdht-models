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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPatientCareNarrativeSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Patient Care Narrative Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPatientCareNarrativeSectionImpl extends SectionImpl implements EMSPatientCareNarrativeSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPatientCareNarrativeSectionImpl()
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
    return EmspcrPackage.Literals.EMS_PATIENT_CARE_NARRATIVE_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrativeSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPatientCareNarrativeSectionOperations.validateEMSPatientCareNarrativeSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSPatientCareNarrativeSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSPatientCareNarrativeSectionImpl
