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

import org.openhealthtools.mdht.uml.cda.vsbr.Height;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.HeightOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Height</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HeightImpl extends ObservationImpl implements Height
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeightImpl()
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
    return VsbrPackage.Literals.HEIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeightTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HeightOperations.validateHeightTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeightClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HeightOperations.validateHeightClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeightCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HeightOperations.validateHeightCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeightMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HeightOperations.validateHeightMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHeightValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HeightOperations.validateHeightValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Height init() {
    	CDAUtil.init(this);
    	return this;
  }
} //HeightImpl
