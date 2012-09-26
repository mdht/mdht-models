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

import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisPHCRRelevantDxTestsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHCR Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SalmonellosisPHCRRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements SalmonellosisPHCRRelevantDxTestsSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisPHCRRelevantDxTestsSectionImpl()
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
    return SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SalmonellosisResultOrganizer> getSalmonellosisResultOrganizers()
  {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.getSalmonellosisResultOrganizers(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SalmonellosisResultObservation> getSalmonellosisResultObservations()
  {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.getSalmonellosisResultObservations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
  }
} //SalmonellosisPHCRRelevantDxTestsSectionImpl
