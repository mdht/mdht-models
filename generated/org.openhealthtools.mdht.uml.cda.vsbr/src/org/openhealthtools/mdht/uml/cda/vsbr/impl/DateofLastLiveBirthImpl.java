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

import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.DateofLastLiveBirthOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dateof Last Live Birth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DateofLastLiveBirthImpl extends ObservationImpl implements DateofLastLiveBirth
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateofLastLiveBirthImpl()
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
    return VsbrPackage.Literals.DATEOF_LAST_LIVE_BIRTH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirthTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DateofLastLiveBirthOperations.validateDateofLastLiveBirthTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirthCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DateofLastLiveBirthOperations.validateDateofLastLiveBirthCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirthMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DateofLastLiveBirthOperations.validateDateofLastLiveBirthMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateofLastLiveBirthValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DateofLastLiveBirthOperations.validateDateofLastLiveBirthValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateofLastLiveBirth init() {
    	CDAUtil.init(this);
    	return this;
  }
} //DateofLastLiveBirthImpl
