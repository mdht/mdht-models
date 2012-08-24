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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSTimesSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Times Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSTimesSectionImpl extends SectionImpl implements EMSTimesSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EMSTimesSectionImpl()
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
    return EmspcrPackage.Literals.EMS_TIMES_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry2(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry3(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry4(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry5(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry6(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry7(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry8(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry8(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSectionEntry9(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return EMSTimesSectionOperations.validateEMSTimesSectionEntry9(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMSTimesSection init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMSTimesSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //EMSTimesSectionImpl
