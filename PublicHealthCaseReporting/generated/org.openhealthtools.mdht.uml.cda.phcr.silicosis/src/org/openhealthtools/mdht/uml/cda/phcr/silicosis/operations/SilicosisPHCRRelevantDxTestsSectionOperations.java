/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection#validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Relevant Dx Tests Section Silicosis Imaging Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection#getSilicosisImagingObservations() <em>Get Silicosis Imaging Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilicosisPHCRRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SilicosisPHCRRelevantDxTestsSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(SilicosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Relevant Dx Tests Section Silicosis Imaging Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(SilicosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(silicosis::SilicosisImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(SilicosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Relevant Dx Tests Section Silicosis Imaging Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(SilicosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(silicosis::SilicosisImagingObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param silicosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(SilicosisPHCRRelevantDxTestsSection silicosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPHCRRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisPHCRRelevantDxTestsSection, context) }),
             new Object [] { silicosisPHCRRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getSilicosisImagingObservations(SilicosisPHCRRelevantDxTestsSection) <em>Get Silicosis Imaging Observations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSilicosisImagingObservations(SilicosisPHCRRelevantDxTestsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_SILICOSIS_IMAGING_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(silicosis::SilicosisImagingObservation)).oclAsType(silicosis::SilicosisImagingObservation)";

  /**
   * The cached OCL query for the '{@link #getSilicosisImagingObservations(SilicosisPHCRRelevantDxTestsSection) <em>Get Silicosis Imaging Observations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSilicosisImagingObservations(SilicosisPHCRRelevantDxTestsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SILICOSIS_IMAGING_OBSERVATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(silicosis::SilicosisImagingObservation)).oclAsType(silicosis::SilicosisImagingObservation)
   * @param silicosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<SilicosisImagingObservation> getSilicosisImagingObservations(SilicosisPHCRRelevantDxTestsSection silicosisPHCRRelevantDxTestsSection)
  {
    if (GET_SILICOSIS_IMAGING_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SilicosisPackage.Literals.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION, SilicosisPackage.Literals.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(72));
      try
      {
        GET_SILICOSIS_IMAGING_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SILICOSIS_IMAGING_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SILICOSIS_IMAGING_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SilicosisImagingObservation> result = (Collection<SilicosisImagingObservation>) query.evaluate(silicosisPHCRRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<SilicosisImagingObservation>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(SilicosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(SilicosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.35')";

  /**
   * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(SilicosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(SilicosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.35')
   * @param silicosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateResultsSectionTemplateId(SilicosisPHCRRelevantDxTestsSection silicosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SilicosisPackage.Literals.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPHCRRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SilicosisValidator.DIAGNOSTIC_SOURCE,
             SilicosisValidator.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisPHCRRelevantDxTestsSection, context) }),
             new Object [] { silicosisPHCRRelevantDxTestsSection }));
      }
      return false;
    }
    return true;
  }

} // SilicosisPHCRRelevantDxTestsSectionOperations