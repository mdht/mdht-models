/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util.ChlamydiatrachomatisValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.CaseObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation#validateChlamydiatrachomatisCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisCaseObservationOperations extends CaseObservationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChlamydiatrachomatisCaseObservationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisCaseObservationValueP(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Case Observation Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisCaseObservationValueP(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisCaseObservationValueP(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Case Observation Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisCaseObservationValueP(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param chlamydiatrachomatisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateChlamydiatrachomatisCaseObservationValueP(ChlamydiatrachomatisCaseObservation chlamydiatrachomatisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION);
      try
      {
        VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisCaseObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateChlamydiatrachomatisCaseObservationValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisCaseObservation, context) }),
             new Object [] { chlamydiatrachomatisCaseObservation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisCaseObservationValue(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Case Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisCaseObservationValue(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.code = '105629000' and value.codeSystem = '2.16.840.1.113883.6.96'))";

  /**
   * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisCaseObservationValue(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Case Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisCaseObservationValue(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
   * value.code = '105629000' and value.codeSystem = '2.16.840.1.113883.6.96'))
   * @param chlamydiatrachomatisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateChlamydiatrachomatisCaseObservationValue(ChlamydiatrachomatisCaseObservation chlamydiatrachomatisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION);
      try
      {
        VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisCaseObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateChlamydiatrachomatisCaseObservationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisCaseObservation, context) }),
             new Object [] { chlamydiatrachomatisCaseObservation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemObservationTemplateId(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.113')";

  /**
   * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateProblemObservationTemplateId(ChlamydiatrachomatisCaseObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.113')
   * @param chlamydiatrachomatisCaseObservation The receiving '<em><b>Case Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateProblemObservationTemplateId(ChlamydiatrachomatisCaseObservation chlamydiatrachomatisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION);
      try
      {
        VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisCaseObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisCaseObservation, context) }),
             new Object [] { chlamydiatrachomatisCaseObservation }));
      }
      return false;
    }
    return true;
  }

} // ChlamydiatrachomatisCaseObservationOperations