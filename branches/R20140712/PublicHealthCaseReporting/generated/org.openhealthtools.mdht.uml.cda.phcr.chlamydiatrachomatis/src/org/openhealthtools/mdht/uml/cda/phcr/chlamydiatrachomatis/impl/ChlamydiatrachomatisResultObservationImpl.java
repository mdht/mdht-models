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
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisResultObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.ResultObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisResultObservationImpl extends ResultObservationImpl implements ChlamydiatrachomatisResultObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChlamydiatrachomatisResultObservationImpl()
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
    return ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ChlamydiatrachomatisResultObservationOperations.validateChlamydiatrachomatisResultObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return ChlamydiatrachomatisResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
  }
} //ChlamydiatrachomatisResultObservationImpl
