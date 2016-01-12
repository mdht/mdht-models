/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ReasonNotScreened;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.ReasonNotScreenedOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason Not Screened</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReasonNotScreenedImpl extends ActImpl implements ReasonNotScreened
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReasonNotScreenedImpl()
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
    return HPOCPackage.Literals.REASON_NOT_SCREENED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReasonNotScreenedTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ReasonNotScreenedOperations.validateReasonNotScreenedTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReasonNotScreenedClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ReasonNotScreenedOperations.validateReasonNotScreenedClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReasonNotScreenedMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ReasonNotScreenedOperations.validateReasonNotScreenedMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReasonNotScreenedCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ReasonNotScreenedOperations.validateReasonNotScreenedCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReasonNotScreenedCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ReasonNotScreenedOperations.validateReasonNotScreenedCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReasonNotScreenedText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ReasonNotScreenedOperations.validateReasonNotScreenedText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReasonNotScreened init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReasonNotScreened init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ReasonNotScreenedImpl
