/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util.SalmonellosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#getSalmonellosisResultOrganizers() <em>Get Salmonellosis Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#getSalmonellosisResultObservations() <em>Get Salmonellosis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalmonellosisPHCRRelevantDxTestsSectionOperations extends PhcrRelevantDxTestsSectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisPHCRRelevantDxTestsSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Organizer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(salmonellosis::SalmonellosisResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Organizer</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPHCRRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer"),
             new Object [] { salmonellosisPHCRRelevantDxTestsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(salmonellosis::SalmonellosisResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPHCRRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation"),
             new Object [] { salmonellosisPHCRRelevantDxTestsSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getSalmonellosisResultOrganizers(SalmonellosisPHCRRelevantDxTestsSection) <em>Get Salmonellosis Result Organizers</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisResultOrganizers(SalmonellosisPHCRRelevantDxTestsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_SALMONELLOSIS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(salmonellosis::SalmonellosisResultOrganizer)).oclAsType(salmonellosis::SalmonellosisResultOrganizer)";

  /**
   * The cached OCL query for the '{@link #getSalmonellosisResultOrganizers(SalmonellosisPHCRRelevantDxTestsSection) <em>Get Salmonellosis Result Organizers</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisResultOrganizers(SalmonellosisPHCRRelevantDxTestsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SALMONELLOSIS_RESULT_ORGANIZERS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<SalmonellosisResultOrganizer> getSalmonellosisResultOrganizers(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection)
  {
    if (GET_SALMONELLOSIS_RESULT_ORGANIZERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION, SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(73));
      try
      {
        GET_SALMONELLOSIS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_SALMONELLOSIS_RESULT_ORGANIZERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SALMONELLOSIS_RESULT_ORGANIZERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SalmonellosisResultOrganizer> result = (Collection<SalmonellosisResultOrganizer>) query.evaluate(salmonellosisPHCRRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<SalmonellosisResultOrganizer>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getSalmonellosisResultObservations(SalmonellosisPHCRRelevantDxTestsSection) <em>Get Salmonellosis Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisResultObservations(SalmonellosisPHCRRelevantDxTestsSection)
   * @generated
   * @ordered
   */
  protected static final String GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(salmonellosis::SalmonellosisResultObservation)).oclAsType(salmonellosis::SalmonellosisResultObservation)";

  /**
   * The cached OCL query for the '{@link #getSalmonellosisResultObservations(SalmonellosisPHCRRelevantDxTestsSection) <em>Get Salmonellosis Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisResultObservations(SalmonellosisPHCRRelevantDxTestsSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<SalmonellosisResultObservation> getSalmonellosisResultObservations(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection)
  {
    if (GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION, SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(74));
      try
      {
        GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SalmonellosisResultObservation> result = (Collection<SalmonellosisResultObservation>) query.evaluate(salmonellosisPHCRRelevantDxTestsSection);
    return new BasicEList.UnmodifiableEList<SalmonellosisResultObservation>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.38')";

  /**
   * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultsSectionTemplateId(SalmonellosisPHCRRelevantDxTestsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisPHCRRelevantDxTestsSection The receiving '<em><b>PHCR Relevant Dx Tests Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateResultsSectionTemplateId(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION);
      try
      {
        VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPHCRRelevantDxTestsSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPHCRRelevantDxTestsSection, context) }),
             new Object [] { salmonellosisPHCRRelevantDxTestsSection }));
      }
       
      return false;
    }
    return true;
  }

} // SalmonellosisPHCRRelevantDxTestsSectionOperations