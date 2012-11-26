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

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.AutopsyResultsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autopsy Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AutopsyResultsImpl extends ObservationImpl implements AutopsyResults
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutopsyResultsImpl()
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
    return VsdrPackage.Literals.AUTOPSY_RESULTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResultsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyResultsOperations.validateAutopsyResultsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResultsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyResultsOperations.validateAutopsyResultsClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResultsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyResultsOperations.validateAutopsyResultsCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResultsCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyResultsOperations.validateAutopsyResultsCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResultsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyResultsOperations.validateAutopsyResultsMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResultsValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AutopsyResultsOperations.validateAutopsyResultsValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutopsyResults init() {
    	CDAUtil.init(this);
    	return this;
  }
} //AutopsyResultsImpl
