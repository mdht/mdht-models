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

import org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PrepregnancyBodyWeightOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prepregnancy Body Weight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrepregnancyBodyWeightImpl extends ObservationImpl implements PrepregnancyBodyWeight
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrepregnancyBodyWeightImpl()
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
    return VsbrPackage.Literals.PREPREGNANCY_BODY_WEIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeightTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeightClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeightCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeightMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePrepregnancyBodyWeightValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrepregnancyBodyWeight init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PrepregnancyBodyWeightImpl
