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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatch;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispatchOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Dispatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSDispatchImpl extends DerivedCDASectionImpl implements EMSDispatch
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSDispatchImpl()
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
    return EmspcrPackage.Literals.EMS_DISPATCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatchTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSDispatchOperations.validateEMSDispatchTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatchCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSDispatchOperations.validateEMSDispatchCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatchText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSDispatchOperations.validateEMSDispatchText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatchTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSDispatchOperations.validateEMSDispatchTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatchEntry1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSDispatchOperations.validateEMSDispatchEntry1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatchEntry2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSDispatchOperations.validateEMSDispatchEntry2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSDispatch init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSDispatchImpl
