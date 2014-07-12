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

import org.openhealthtools.mdht.uml.cda.phcr.impl.SignsAndSymptomsObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisSignsAndSymptomsObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signs And Symptoms Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisSignsAndSymptomsObservationImpl extends SignsAndSymptomsObservationImpl implements SalmonellosisSignsAndSymptomsObservation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisSignsAndSymptomsObservationImpl()
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
    return SalmonellosisPackage.Literals.SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisSignsAndSymptomsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisSignsAndSymptomsObservationOperations.validateSalmonellosisSignsAndSymptomsObservationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateSignsAndSymptomsObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisSignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(this, diagnostics, context);
  }
} //SalmonellosisSignsAndSymptomsObservationImpl
