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

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathCausalInformationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death Causal Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeathCausalInformationImpl extends OrganizerImpl implements DeathCausalInformation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathCausalInformationImpl()
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
    return VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCause(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCause(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantCondition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantCondition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseInterval(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseInterval(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCauseDeathCauseClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCauseDeathCauseCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCauseDeathCauseCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCauseDeathCauseValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCauseSequenceNumber(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseSequenceNumber(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCauseTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentCauseDeathCause(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCause(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseIntervalValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseIntervalSequenceNumber(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseIntervalSequenceNumber(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseIntervalTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseIntervalTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCausalInformationOperations.validateDeathCausalInformationComponentDeathCauseIntervalDeathCauseInterval(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathCausalInformation init() {
    	CDAUtil.init(this);
    	return this;
  }
} //DeathCausalInformationImpl
