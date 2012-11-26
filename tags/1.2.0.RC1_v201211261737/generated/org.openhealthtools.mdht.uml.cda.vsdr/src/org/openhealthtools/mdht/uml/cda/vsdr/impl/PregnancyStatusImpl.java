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

import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.PregnancyStatusOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregnancy Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PregnancyStatusImpl extends ObservationImpl implements PregnancyStatus
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PregnancyStatusImpl()
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
    return VsdrPackage.Literals.PREGNANCY_STATUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatusTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PregnancyStatusOperations.validatePregnancyStatusTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PregnancyStatusOperations.validatePregnancyStatusClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PregnancyStatusOperations.validatePregnancyStatusCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PregnancyStatusOperations.validatePregnancyStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PregnancyStatusOperations.validatePregnancyStatusMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PregnancyStatusOperations.validatePregnancyStatusValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatusValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PregnancyStatusOperations.validatePregnancyStatusValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PregnancyStatus init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PregnancyStatusImpl
