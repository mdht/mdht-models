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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSocialHistoryOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Social History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSSocialHistoryImpl extends DerivedCDASectionImpl implements EMSSocialHistory
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSSocialHistoryImpl()
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
    return EmspcrPackage.Literals.EMS_SOCIAL_HISTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSocialHistoryOperations.validateEMSSocialHistoryTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSocialHistoryOperations.validateEMSSocialHistoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSocialHistoryOperations.validateEMSSocialHistoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistoryTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSocialHistoryOperations.validateEMSSocialHistoryTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistoryEntry1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSocialHistoryOperations.validateEMSSocialHistoryEntry1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistoryEntry2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSocialHistoryOperations.validateEMSSocialHistoryEntry2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSSocialHistory init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSSocialHistoryImpl
