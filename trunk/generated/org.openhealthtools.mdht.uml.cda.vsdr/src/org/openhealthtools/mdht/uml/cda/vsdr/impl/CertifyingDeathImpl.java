/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.CertifyingDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certifying Death</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CertifyingDeathImpl extends ObservationImpl implements CertifyingDeath
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CertifyingDeathImpl()
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
    return VsdrPackage.Literals.CERTIFYING_DEATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CertifyingDeathOperations.validateCertifyingDeathTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CertifyingDeathOperations.validateCertifyingDeathClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CertifyingDeathOperations.validateCertifyingDeathMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CertifyingDeathOperations.validateCertifyingDeathCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeathEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CertifyingDeathOperations.validateCertifyingDeathEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeathCertificationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return CertifyingDeathOperations.validateCertifyingDeathCertificationPerformer(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CertifyingDeath init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CertifyingDeath init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //CertifyingDeathImpl
