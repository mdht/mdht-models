/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.chlamydiatrachomatisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.chlamydiatrachomatisResultOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.ResultOrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>chlamydiatrachomatis Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class chlamydiatrachomatisResultOrganizerImpl extends ResultOrganizerImpl implements chlamydiatrachomatisResultOrganizer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected chlamydiatrachomatisResultOrganizerImpl()
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
    return ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisResultOrganizerOperations.validateChlamydiatrachomatisResultOrganizerCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
  }
} //chlamydiatrachomatisResultOrganizerImpl
