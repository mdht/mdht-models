/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.NonHumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonHumanDispositionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Human Disposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonHumanDispositionImpl extends ActImpl implements NonHumanDisposition
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonHumanDispositionImpl()
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
    return SdtmPackage.Literals.NON_HUMAN_DISPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanDispositionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanDispositionOperations.validateNonHumanDispositionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanDispositionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanDispositionOperations.validateNonHumanDispositionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanDispositionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanDispositionOperations.validateNonHumanDispositionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanDispositionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanDispositionOperations.validateNonHumanDispositionEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanDispositionId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanDispositionOperations.validateNonHumanDispositionId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonHumanDispositionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonHumanDispositionOperations.validateNonHumanDispositionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonHumanDisposition init() {
    	CDAUtil.init(this);
    	return this;
  }
} //NonHumanDispositionImpl
