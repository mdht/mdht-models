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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyEpochOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Epoch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudyEpochImpl extends ActImpl implements StudyEpoch
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudyEpochImpl()
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
    return SdtmPackage.Literals.STUDY_EPOCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyEpochTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyEpochOperations.validateStudyEpochTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyEpochClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyEpochOperations.validateStudyEpochClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyEpochClassCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyEpochOperations.validateStudyEpochClassCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyEpochCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyEpochOperations.validateStudyEpochCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyEpochCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyEpochOperations.validateStudyEpochCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyEpochText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyEpochOperations.validateStudyEpochText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyEpochMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyEpochOperations.validateStudyEpochMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyEpoch init() {
    	CDAUtil.init(this);
    	return this;
  }
} //StudyEpochImpl
