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

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PreNatalCareOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Natal Care</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PreNatalCareImpl extends ActImpl implements PreNatalCare
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreNatalCareImpl()
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
    return VsbrPackage.Literals.PRE_NATAL_CARE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCareTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreNatalCareOperations.validatePreNatalCareTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCareClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreNatalCareOperations.validatePreNatalCareClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCareCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreNatalCareOperations.validatePreNatalCareCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCareEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreNatalCareOperations.validatePreNatalCareEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCareMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreNatalCareOperations.validatePreNatalCareMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCareNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreNatalCareOperations.validatePreNatalCareNegationInd(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePreNatalCareEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PreNatalCareOperations.validatePreNatalCareEntryRelationship(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreNatalCare init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PreNatalCareImpl
