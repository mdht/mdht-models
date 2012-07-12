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

import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.MannerofDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mannerof Death</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MannerofDeathImpl extends ObservationImpl implements MannerofDeath
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MannerofDeathImpl()
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
    return VsdrPackage.Literals.MANNEROF_DEATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MannerofDeathOperations.validateMannerofDeathTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MannerofDeathOperations.validateMannerofDeathClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeathCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MannerofDeathOperations.validateMannerofDeathCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MannerofDeathOperations.validateMannerofDeathCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MannerofDeathOperations.validateMannerofDeathMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeathValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MannerofDeathOperations.validateMannerofDeathValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeathValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MannerofDeathOperations.validateMannerofDeathValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MannerofDeath init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MannerofDeathImpl
