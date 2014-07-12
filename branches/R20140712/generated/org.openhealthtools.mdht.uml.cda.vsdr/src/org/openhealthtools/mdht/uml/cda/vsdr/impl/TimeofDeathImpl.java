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

import org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.TimeofDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timeof Death</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TimeofDeathImpl extends ObservationImpl implements TimeofDeath
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeofDeathImpl()
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
    return VsdrPackage.Literals.TIMEOF_DEATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimeofDeathOperations.validateTimeofDeathTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimeofDeathOperations.validateTimeofDeathClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeathCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimeofDeathOperations.validateTimeofDeathCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimeofDeathOperations.validateTimeofDeathCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeathEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimeofDeathOperations.validateTimeofDeathEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimeofDeathOperations.validateTimeofDeathMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeofDeathText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TimeofDeathOperations.validateTimeofDeathText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeofDeath init() {
    	CDAUtil.init(this);
    	return this;
  }
} //TimeofDeathImpl
