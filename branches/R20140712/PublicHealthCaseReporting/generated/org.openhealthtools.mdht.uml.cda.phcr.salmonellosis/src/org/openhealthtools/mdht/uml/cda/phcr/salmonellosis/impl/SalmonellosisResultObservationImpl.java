/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.phcr.impl.ResultObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisResultObservationImpl extends ResultObservationImpl implements SalmonellosisResultObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisResultObservationImpl()
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
    return SalmonellosisPackage.Literals.SALMONELLOSIS_RESULT_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisResultObservationOperations.validateSalmonellosisResultObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
  }
} //SalmonellosisResultObservationImpl
