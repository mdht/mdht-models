/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonPerformanceReasonOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Performance Reason</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonPerformanceReasonImpl extends ObservationImpl implements NonPerformanceReason
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonPerformanceReasonImpl()
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
    return SdtmPackage.Literals.NON_PERFORMANCE_REASON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonPerformanceReasonTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonPerformanceReasonOperations.validateNonPerformanceReasonTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonPerformanceReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonPerformanceReasonOperations.validateNonPerformanceReasonClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonPerformanceReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonPerformanceReasonOperations.validateNonPerformanceReasonCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonPerformanceReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonPerformanceReasonOperations.validateNonPerformanceReasonCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonPerformanceReasonMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonPerformanceReasonOperations.validateNonPerformanceReasonMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonPerformanceReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonPerformanceReasonOperations.validateNonPerformanceReasonValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason init() {
    	CDAUtil.init(this);
    	return this;
  }
} //NonPerformanceReasonImpl
