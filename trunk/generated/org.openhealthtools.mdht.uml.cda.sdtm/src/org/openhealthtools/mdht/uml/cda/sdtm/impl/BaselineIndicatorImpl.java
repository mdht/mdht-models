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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.BaselineIndicatorOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Baseline Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BaselineIndicatorImpl extends ObservationImpl implements BaselineIndicator
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaselineIndicatorImpl()
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
    return SdtmPackage.Literals.BASELINE_INDICATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBaselineIndicatorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BaselineIndicatorOperations.validateBaselineIndicatorTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBaselineIndicatorCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BaselineIndicatorOperations.validateBaselineIndicatorCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBaselineIndicatorCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BaselineIndicatorOperations.validateBaselineIndicatorCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBaselineIndicatorValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BaselineIndicatorOperations.validateBaselineIndicatorValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaselineIndicator init() {
    	CDAUtil.init(this);
    	return this;
  }
} //BaselineIndicatorImpl
