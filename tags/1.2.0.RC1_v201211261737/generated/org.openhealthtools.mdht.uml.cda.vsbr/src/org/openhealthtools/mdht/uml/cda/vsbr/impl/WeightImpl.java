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

import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;
import org.openhealthtools.mdht.uml.cda.vsbr.Weight;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.WeightOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class WeightImpl extends ObservationImpl implements Weight
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeightImpl()
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
    return VsbrPackage.Literals.WEIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeightTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return WeightOperations.validateWeightTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeightClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return WeightOperations.validateWeightClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeightCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return WeightOperations.validateWeightCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeightMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return WeightOperations.validateWeightMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWeightValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return WeightOperations.validateWeightValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weight init() {
    	CDAUtil.init(this);
    	return this;
  }
} //WeightImpl
