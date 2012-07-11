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

import org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.RouteandMethodofDeliveryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routeand Methodof Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RouteandMethodofDeliveryImpl extends ObservationImpl implements RouteandMethodofDelivery
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RouteandMethodofDeliveryImpl()
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
    return VsbrPackage.Literals.ROUTEAND_METHODOF_DELIVERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDeliveryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RouteandMethodofDeliveryOperations.validateRouteandMethodofDeliveryTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDeliveryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RouteandMethodofDeliveryOperations.validateRouteandMethodofDeliveryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDeliveryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RouteandMethodofDeliveryOperations.validateRouteandMethodofDeliveryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDeliveryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RouteandMethodofDeliveryOperations.validateRouteandMethodofDeliveryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDeliveryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RouteandMethodofDeliveryOperations.validateRouteandMethodofDeliveryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRouteandMethodofDeliveryEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RouteandMethodofDeliveryOperations.validateRouteandMethodofDeliveryEntryRelationship(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteandMethodofDelivery init() {
    	CDAUtil.init(this);
    	return this;
  }
} //RouteandMethodofDeliveryImpl
