/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSceneSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Scene Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSSceneSectionImpl extends SectionImpl implements EMSSceneSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSSceneSectionImpl()
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
    return EmspcrPackage.Literals.EMS_SCENE_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSceneSectionOperations.validateEMSSceneSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSceneSectionOperations.validateEMSSceneSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSceneSectionOperations.validateEMSSceneSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSceneSectionOperations.validateEMSSceneSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSceneSectionOperations.validateEMSSceneSectionEntry1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSceneSectionOperations.validateEMSSceneSectionEntry2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSceneSectionOperations.validateEMSSceneSectionEntry3(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSSceneSectionOperations.validateEMSSceneSectionEntry4(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSSceneSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //EMSSceneSectionImpl