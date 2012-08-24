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

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.HIVStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HIV Status Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HIVStatusObservationImpl extends ObservationImpl implements HIVStatusObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HIVStatusObservationImpl()
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
    return SalmonellosisPackage.Literals.HIV_STATUS_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HIVStatusObservationOperations.validateHIVStatusObservationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HIVStatusObservationOperations.validateHIVStatusObservationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HIVStatusObservationOperations.validateHIVStatusObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HIVStatusObservationOperations.validateHIVStatusObservationStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HIVStatusObservationOperations.validateHIVStatusObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HIVStatusObservationOperations.validateHIVStatusObservationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HIVStatusObservationOperations.validateHIVStatusObservationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HIVStatusObservation init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HIVStatusObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HIVStatusObservationImpl
