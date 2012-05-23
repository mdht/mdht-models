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

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyArmOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Arm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudyArmImpl extends ActImpl implements StudyArm
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudyArmImpl()
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
    return SdtmPackage.Literals.STUDY_ARM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyArmTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyArmOperations.validateStudyArmTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyArmClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyArmOperations.validateStudyArmClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyArmCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyArmOperations.validateStudyArmCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyArmCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyArmOperations.validateStudyArmCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyArmText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyArmOperations.validateStudyArmText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyArmMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyArmOperations.validateStudyArmMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyArmEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyArmOperations.validateStudyArmEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyArm init() {
    	CDAUtil.init(this);
    	return this;
  }
} //StudyArmImpl
