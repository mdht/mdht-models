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

import org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalPresentationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetal Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FetalPresentationImpl extends ObservationImpl implements FetalPresentation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetalPresentationImpl()
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
    return VsbrPackage.Literals.FETAL_PRESENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalPresentationOperations.validateFetalPresentationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalPresentationOperations.validateFetalPresentationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalPresentationOperations.validateFetalPresentationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalPresentationOperations.validateFetalPresentationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalPresentationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalPresentationOperations.validateFetalPresentationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetalPresentation init() {
    	CDAUtil.init(this);
    	return this;
  }
} //FetalPresentationImpl
