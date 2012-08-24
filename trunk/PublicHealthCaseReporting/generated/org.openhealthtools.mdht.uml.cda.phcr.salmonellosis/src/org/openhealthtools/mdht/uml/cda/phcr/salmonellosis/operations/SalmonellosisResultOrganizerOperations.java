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

import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util.SalmonellosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer#validateSalmonellosisResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer#validateSalmonellosisResultOrganizerSalmonellosisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Result Organizer Salmonellosis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer#getSalmonellosisResultObservations() <em>Get Salmonellosis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalmonellosisResultOrganizerOperations extends ResultOrganizerOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisResultOrganizerOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisResultOrganizerCode(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Result Organizer Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisResultOrganizerCode(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisResultOrganizerCode(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Result Organizer Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisResultOrganizerCode(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisResultOrganizerCode(SalmonellosisResultOrganizer salmonellosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_RESULT_ORGANIZER);
      try
      {
        VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_RESULT_ORGANIZER__SALMONELLOSIS_RESULT_ORGANIZER_CODE,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisResultOrganizerCode"),
             new Object [] { salmonellosisResultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisResultOrganizerSalmonellosisResultObservation(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Result Organizer Salmonellosis Result Observation</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisResultOrganizerSalmonellosisResultObservation(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(salmonellosis::SalmonellosisResultObservation))";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisResultOrganizerSalmonellosisResultObservation(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Result Organizer Salmonellosis Result Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisResultOrganizerSalmonellosisResultObservation(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisResultOrganizerSalmonellosisResultObservation(SalmonellosisResultOrganizer salmonellosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_RESULT_ORGANIZER);
      try
      {
        VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_RESULT_ORGANIZER_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_RESULT_ORGANIZER__SALMONELLOSIS_RESULT_ORGANIZER_SALMONELLOSIS_RESULT_OBSERVATION,
             SalmonellosisPlugin.INSTANCE.getString("SalmonellosisResultOrganizerSalmonellosisResultObservation"),
             new Object [] { salmonellosisResultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getSalmonellosisResultObservations(SalmonellosisResultOrganizer) <em>Get Salmonellosis Result Observations</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisResultObservations(SalmonellosisResultOrganizer)
   * @generated
   * @ordered
   */
  protected static final String GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(salmonellosis::SalmonellosisResultObservation)).oclAsType(salmonellosis::SalmonellosisResultObservation)";

  /**
   * The cached OCL query for the '{@link #getSalmonellosisResultObservations(SalmonellosisResultOrganizer) <em>Get Salmonellosis Result Observations</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSalmonellosisResultObservations(SalmonellosisResultOrganizer)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<SalmonellosisResultObservation> getSalmonellosisResultObservations(SalmonellosisResultOrganizer salmonellosisResultOrganizer)
  {
    if (GET_SALMONELLOSIS_RESULT_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SalmonellosisPackage.Literals.SALMONELLOSIS_RESULT_ORGANIZER, SalmonellosisPackage.Literals.SALMONELLOSIS_RESULT_ORGANIZER.getEAllOperations().get(76));
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
    Collection<SalmonellosisResultObservation> result = (Collection<SalmonellosisResultObservation>) query.evaluate(salmonellosisResultOrganizer);
    return new BasicEList.UnmodifiableEList<SalmonellosisResultObservation>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.118')";

  /**
   * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultOrganizerTemplateId(SalmonellosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param salmonellosisResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateResultOrganizerTemplateId(SalmonellosisResultOrganizer salmonellosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_RESULT_ORGANIZER);
      try
      {
        VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisResultOrganizer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultOrganizerTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisResultOrganizer, context) }),
             new Object [] { salmonellosisResultOrganizer }));
      }
       
      return false;
    }
    return true;
  }

} // SalmonellosisResultOrganizerOperations