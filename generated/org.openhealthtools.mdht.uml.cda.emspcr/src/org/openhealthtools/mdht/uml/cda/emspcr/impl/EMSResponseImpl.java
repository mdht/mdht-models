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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponse;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSResponseOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSResponseImpl extends DerivedCDASectionImpl implements EMSResponse
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSResponseImpl()
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
    return EmspcrPackage.Literals.EMS_RESPONSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseEntry1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseEntry1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseEntry2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseEntry2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseEntry3(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseEntry3(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseEntry4(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseOperations.validateEMSResponseEntry4(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSResponse init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSResponseImpl
