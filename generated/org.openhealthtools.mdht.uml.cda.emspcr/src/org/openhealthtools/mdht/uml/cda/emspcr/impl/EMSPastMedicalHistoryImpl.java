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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPastMedicalHistoryOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Past Medical History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSPastMedicalHistoryImpl extends DerivedCDASectionImpl implements EMSPastMedicalHistory
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSPastMedicalHistoryImpl()
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
    return EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPastMedicalHistoryOperations.validateEMSPastMedicalHistoryTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPastMedicalHistoryOperations.validateEMSPastMedicalHistoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPastMedicalHistoryOperations.validateEMSPastMedicalHistoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistoryTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPastMedicalHistoryOperations.validateEMSPastMedicalHistoryTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistoryEntry1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPastMedicalHistoryOperations.validateEMSPastMedicalHistoryEntry1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistoryEntry2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSPastMedicalHistoryOperations.validateEMSPastMedicalHistoryEntry2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSPastMedicalHistory init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSPastMedicalHistoryImpl
