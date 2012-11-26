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

import org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.BodyWeightatDeliveryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Weightat Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BodyWeightatDeliveryImpl extends ObservationImpl implements BodyWeightatDelivery
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyWeightatDeliveryImpl()
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
    return VsbrPackage.Literals.BODY_WEIGHTAT_DELIVERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDeliveryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightatDeliveryOperations.validateBodyWeightatDeliveryTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDeliveryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightatDeliveryOperations.validateBodyWeightatDeliveryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightatDeliveryOperations.validateBodyWeightatDeliveryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightatDeliveryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightatDeliveryOperations.validateBodyWeightatDeliveryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyWeightatDelivery init() {
    	CDAUtil.init(this);
    	return this;
  }
} //BodyWeightatDeliveryImpl
