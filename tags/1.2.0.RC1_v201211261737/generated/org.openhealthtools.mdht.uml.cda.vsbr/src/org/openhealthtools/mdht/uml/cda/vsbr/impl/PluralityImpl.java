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

import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PluralityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plurality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PluralityImpl extends ObservationImpl implements Plurality
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluralityImpl()
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
    return VsbrPackage.Literals.PLURALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePluralityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PluralityOperations.validatePluralityTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePluralityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PluralityOperations.validatePluralityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePluralityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PluralityOperations.validatePluralityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePluralityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PluralityOperations.validatePluralityMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePluralityValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PluralityOperations.validatePluralityValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plurality init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PluralityImpl
