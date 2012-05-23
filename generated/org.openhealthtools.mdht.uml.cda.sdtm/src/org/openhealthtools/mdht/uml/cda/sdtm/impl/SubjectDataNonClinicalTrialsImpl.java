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

import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectDataNonClinicalTrialsOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Data Non Clinical Trials</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubjectDataNonClinicalTrialsImpl extends ClinicalDocumentImpl implements SubjectDataNonClinicalTrials
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubjectDataNonClinicalTrialsImpl()
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
    return SdtmPackage.Literals.SUBJECT_DATA_NON_CLINICAL_TRIALS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsConfidentialityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsConfidentialityCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsConfidentialityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsLanguageCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsRealmCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsSetId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsSetId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectDataNonClinicalTrialsVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsVersionNumber(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectDataNonClinicalTrials init() {
    	CDAUtil.init(this);
    	return this;
  }
} //SubjectDataNonClinicalTrialsImpl
