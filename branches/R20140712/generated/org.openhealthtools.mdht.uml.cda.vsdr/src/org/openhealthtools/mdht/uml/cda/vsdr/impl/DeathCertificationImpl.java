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

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathCertificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death Certification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeathCertificationImpl extends ObservationImpl implements DeathCertification
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathCertificationImpl()
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
    return VsdrPackage.Literals.DEATH_CERTIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformer(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleAddr(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCertificationCertificationPerformerCertifierRole(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRole(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathCertification init() {
    	CDAUtil.init(this);
    	return this;
  }
} //DeathCertificationImpl
