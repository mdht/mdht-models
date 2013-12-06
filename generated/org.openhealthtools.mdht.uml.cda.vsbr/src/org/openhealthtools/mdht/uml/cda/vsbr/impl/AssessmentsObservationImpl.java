/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AssessmentsObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessments Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssessmentsObservationImpl extends ObservationImpl implements AssessmentsObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssessmentsObservationImpl()
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
    return VsbrPackage.Literals.ASSESSMENTS_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAssessmentsObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AssessmentsObservationOperations.validateAssessmentsObservationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAssessmentsObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AssessmentsObservationOperations.validateAssessmentsObservationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAssessmentsObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AssessmentsObservationOperations.validateAssessmentsObservationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAssessmentsObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AssessmentsObservationOperations.validateAssessmentsObservationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAssessmentsObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AssessmentsObservationOperations.validateAssessmentsObservationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAssessmentsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return AssessmentsObservationOperations.validateAssessmentsObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssessmentsObservation init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssessmentsObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AssessmentsObservationImpl
