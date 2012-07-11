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

import org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborOnsetsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labor Onsets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LaborOnsetsImpl extends ObservationImpl implements LaborOnsets
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LaborOnsetsImpl()
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
    return VsbrPackage.Literals.LABOR_ONSETS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsetsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborOnsetsOperations.validateLaborOnsetsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsetsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborOnsetsOperations.validateLaborOnsetsClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsetsCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborOnsetsOperations.validateLaborOnsetsCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsetsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborOnsetsOperations.validateLaborOnsetsMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLaborOnsetsValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return LaborOnsetsOperations.validateLaborOnsetsValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborOnsets init() {
    	CDAUtil.init(this);
    	return this;
  }
} //LaborOnsetsImpl
