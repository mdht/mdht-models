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

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.BodySystemorOrganClassOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Systemor Organ Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BodySystemorOrganClassImpl extends ObservationImpl implements BodySystemorOrganClass
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodySystemorOrganClassImpl()
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
    return SdtmPackage.Literals.BODY_SYSTEMOR_ORGAN_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodySystemorOrganClassTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodySystemorOrganClassOperations.validateBodySystemorOrganClassTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodySystemorOrganClassClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodySystemorOrganClassOperations.validateBodySystemorOrganClassClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodySystemorOrganClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodySystemorOrganClassOperations.validateBodySystemorOrganClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodySystemorOrganClassMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodySystemorOrganClassOperations.validateBodySystemorOrganClassMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodySystemorOrganClassValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodySystemorOrganClassOperations.validateBodySystemorOrganClassValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass init() {
    	CDAUtil.init(this);
    	return this;
  }
} //BodySystemorOrganClassImpl
