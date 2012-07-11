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

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AbnormalConditionsoftheNewbornOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abnormal Conditionsofthe Newborn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AbnormalConditionsoftheNewbornImpl extends ObservationImpl implements AbnormalConditionsoftheNewborn
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbnormalConditionsoftheNewbornImpl()
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
    return VsbrPackage.Literals.ABNORMAL_CONDITIONSOFTHE_NEWBORN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewbornTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AbnormalConditionsoftheNewbornOperations.validateAbnormalConditionsoftheNewbornTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewbornClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AbnormalConditionsoftheNewbornOperations.validateAbnormalConditionsoftheNewbornClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewbornCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AbnormalConditionsoftheNewbornOperations.validateAbnormalConditionsoftheNewbornCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewbornMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AbnormalConditionsoftheNewbornOperations.validateAbnormalConditionsoftheNewbornMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbnormalConditionsoftheNewbornValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AbnormalConditionsoftheNewbornOperations.validateAbnormalConditionsoftheNewbornValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbnormalConditionsoftheNewborn init() {
    	CDAUtil.init(this);
    	return this;
  }
} //AbnormalConditionsoftheNewbornImpl
