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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NumberofBirthsStillLivingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numberof Births Still Living</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberofBirthsStillLivingImpl extends ObservationImpl implements NumberofBirthsStillLiving
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberofBirthsStillLivingImpl()
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
    return VsbrPackage.Literals.NUMBEROF_BIRTHS_STILL_LIVING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLivingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NumberofBirthsStillLivingOperations.validateNumberofBirthsStillLivingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLivingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NumberofBirthsStillLivingOperations.validateNumberofBirthsStillLivingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLivingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NumberofBirthsStillLivingOperations.validateNumberofBirthsStillLivingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLivingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NumberofBirthsStillLivingOperations.validateNumberofBirthsStillLivingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNumberofBirthsStillLivingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NumberofBirthsStillLivingOperations.validateNumberofBirthsStillLivingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofBirthsStillLiving init() {
    	CDAUtil.init(this);
    	return this;
  }
} //NumberofBirthsStillLivingImpl
