/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSResponseSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Response Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSResponseSectionImpl extends SectionImpl implements EMSResponseSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSResponseSectionImpl()
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
    return EmspcrPackage.Literals.EMS_RESPONSE_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionEntry1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionEntry2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionEntry3(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponseSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSResponseSectionOperations.validateEMSResponseSectionEntry4(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSResponseSection init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMSResponseSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //EMSResponseSectionImpl
