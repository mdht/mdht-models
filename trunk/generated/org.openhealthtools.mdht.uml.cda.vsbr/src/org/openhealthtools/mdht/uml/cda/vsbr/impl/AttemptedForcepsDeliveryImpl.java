/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AttemptedForcepsDeliveryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attempted Forceps Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AttemptedForcepsDeliveryImpl extends ObservationImpl implements AttemptedForcepsDelivery
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttemptedForcepsDeliveryImpl()
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
    return VsbrPackage.Literals.ATTEMPTED_FORCEPS_DELIVERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDeliveryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedForcepsDeliveryOperations.validateAttemptedForcepsDeliveryTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDeliveryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedForcepsDeliveryOperations.validateAttemptedForcepsDeliveryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedForcepsDeliveryOperations.validateAttemptedForcepsDeliveryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDeliveryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedForcepsDeliveryOperations.validateAttemptedForcepsDeliveryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAttemptedForcepsDeliveryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AttemptedForcepsDeliveryOperations.validateAttemptedForcepsDeliveryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttemptedForcepsDelivery init() {
    	CDAUtil.init(this);
    	return this;
  }
} //AttemptedForcepsDeliveryImpl
