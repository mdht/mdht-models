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

import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.OtherPregnancyOutcomesOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Pregnancy Outcomes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OtherPregnancyOutcomesImpl extends ObservationImpl implements OtherPregnancyOutcomes
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OtherPregnancyOutcomesImpl()
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
    return VsbrPackage.Literals.OTHER_PREGNANCY_OUTCOMES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomesCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomesValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherPregnancyOutcomesEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherPregnancyOutcomes init() {
    	CDAUtil.init(this);
    	return this;
  }
} //OtherPregnancyOutcomesImpl
