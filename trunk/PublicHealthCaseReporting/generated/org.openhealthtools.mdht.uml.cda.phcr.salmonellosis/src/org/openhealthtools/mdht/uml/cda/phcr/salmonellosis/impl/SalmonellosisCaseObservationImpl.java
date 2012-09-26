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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisCaseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisCaseObservationImpl extends CaseObservationImpl implements SalmonellosisCaseObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisCaseObservationImpl()
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
    return SalmonellosisPackage.Literals.SALMONELLOSIS_CASE_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseObservationOperations.validateSalmonellosisCaseObservationTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseObservationOperations.validateSalmonellosisCaseObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseObservationOperations.validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SalmonellosisSignsAndSymptomsObservation> getSalmonellosisSignsAndSymptomsObservations()
  {
    return SalmonellosisCaseObservationOperations.getSalmonellosisSignsAndSymptomsObservations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
  }
} //SalmonellosisCaseObservationImpl
