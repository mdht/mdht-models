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

import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.CongenitalAnomaliesoftheNewbornOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Congenital Anomaliesofthe Newborn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CongenitalAnomaliesoftheNewbornImpl extends ObservationImpl implements CongenitalAnomaliesoftheNewborn
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CongenitalAnomaliesoftheNewbornImpl()
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
    return VsbrPackage.Literals.CONGENITAL_ANOMALIESOFTHE_NEWBORN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewbornTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CongenitalAnomaliesoftheNewbornOperations.validateCongenitalAnomaliesoftheNewbornTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewbornClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CongenitalAnomaliesoftheNewbornOperations.validateCongenitalAnomaliesoftheNewbornClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewbornCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CongenitalAnomaliesoftheNewbornOperations.validateCongenitalAnomaliesoftheNewbornCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewbornMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CongenitalAnomaliesoftheNewbornOperations.validateCongenitalAnomaliesoftheNewbornMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCongenitalAnomaliesoftheNewbornValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CongenitalAnomaliesoftheNewbornOperations.validateCongenitalAnomaliesoftheNewbornValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CongenitalAnomaliesoftheNewborn init() {
    	CDAUtil.init(this);
    	return this;
  }
} //CongenitalAnomaliesoftheNewbornImpl
