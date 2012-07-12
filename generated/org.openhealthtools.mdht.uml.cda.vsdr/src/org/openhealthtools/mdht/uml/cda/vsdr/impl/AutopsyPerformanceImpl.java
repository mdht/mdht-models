/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.AutopsyPerformanceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autopsy Performance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AutopsyPerformanceImpl extends ObservationImpl implements AutopsyPerformance
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutopsyPerformanceImpl()
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
    return VsdrPackage.Literals.AUTOPSY_PERFORMANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceAutopsyPerformer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformer(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceAutopsyPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutopsyPerformance init() {
    	CDAUtil.init(this);
    	return this;
  }
} //AutopsyPerformanceImpl
