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

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisCaseObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisCaseObservationImpl extends CaseObservationImpl implements ChlamydiatrachomatisCaseObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChlamydiatrachomatisCaseObservationImpl()
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
    return ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisCaseObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ChlamydiatrachomatisCaseObservationOperations.validateChlamydiatrachomatisCaseObservationValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ChlamydiatrachomatisCaseObservationOperations.validateChlamydiatrachomatisCaseObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ChlamydiatrachomatisCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
  }
} //ChlamydiatrachomatisCaseObservationImpl
