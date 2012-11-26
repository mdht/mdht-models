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

import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MaternalMorbiditiesOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maternal Morbidities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MaternalMorbiditiesImpl extends ObservationImpl implements MaternalMorbidities
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MaternalMorbiditiesImpl()
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
    return VsbrPackage.Literals.MATERNAL_MORBIDITIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbiditiesTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalMorbiditiesOperations.validateMaternalMorbiditiesTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbiditiesClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalMorbiditiesOperations.validateMaternalMorbiditiesClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbiditiesCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalMorbiditiesOperations.validateMaternalMorbiditiesCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbiditiesMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalMorbiditiesOperations.validateMaternalMorbiditiesMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMaternalMorbiditiesValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MaternalMorbiditiesOperations.validateMaternalMorbiditiesValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaternalMorbidities init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MaternalMorbiditiesImpl
