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

import org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.RiskFactorsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Factors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RiskFactorsImpl extends ObservationImpl implements RiskFactors
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RiskFactorsImpl()
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
    return VsbrPackage.Literals.RISK_FACTORS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactorsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskFactorsOperations.validateRiskFactorsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactorsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskFactorsOperations.validateRiskFactorsClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactorsCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskFactorsOperations.validateRiskFactorsCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactorsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskFactorsOperations.validateRiskFactorsMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactorsValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskFactorsOperations.validateRiskFactorsValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRiskFactorsEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return RiskFactorsOperations.validateRiskFactorsEntryRelationship(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskFactors init() {
    	CDAUtil.init(this);
    	return this;
  }
} //RiskFactorsImpl
