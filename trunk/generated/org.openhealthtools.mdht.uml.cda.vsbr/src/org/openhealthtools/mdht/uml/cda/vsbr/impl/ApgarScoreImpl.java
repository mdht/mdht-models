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

import org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.ApgarScoreOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apgar Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ApgarScoreImpl extends ObservationImpl implements ApgarScore
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApgarScoreImpl()
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
    return VsbrPackage.Literals.APGAR_SCORE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScoreTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ApgarScoreOperations.validateApgarScoreTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScoreClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ApgarScoreOperations.validateApgarScoreClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScoreCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ApgarScoreOperations.validateApgarScoreCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScoreMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ApgarScoreOperations.validateApgarScoreMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateApgarScoreValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ApgarScoreOperations.validateApgarScoreValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApgarScore init() {
    	CDAUtil.init(this);
    	return this;
  }
} //ApgarScoreImpl
