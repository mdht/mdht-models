/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util.SalmonellosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Exposure Location And Type Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct#validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct#validateSalmonellosisPossibleExposureLocationAndTypeActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct#validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPossibleExposureLocationAndTypeAct#validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalmonellosisPossibleExposureLocationAndTypeActOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SalmonellosisPossibleExposureLocationAndTypeActOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.115')";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.115')
   * @param salmonellosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
      try
      {
        VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPossibleExposureLocationAndTypeAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPossibleExposureLocationAndTypeAct, context) }),
             new Object [] { salmonellosisPossibleExposureLocationAndTypeAct }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')
   * @param salmonellosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPossibleExposureLocationAndTypeActCode(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
      try
      {
        VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPossibleExposureLocationAndTypeAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSalmonellosisPossibleExposureLocationAndTypeActCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPossibleExposureLocationAndTypeAct, context) }),
             new Object [] { salmonellosisPossibleExposureLocationAndTypeAct }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
   * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
   * value.code = 'completed')
   * @param salmonellosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
      try
      {
        VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPossibleExposureLocationAndTypeAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPossibleExposureLocationAndTypeAct, context) }),
             new Object [] { salmonellosisPossibleExposureLocationAndTypeAct }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param salmonellosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
      try
      {
        VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPossibleExposureLocationAndTypeAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPossibleExposureLocationAndTypeAct, context) }),
             new Object [] { salmonellosisPossibleExposureLocationAndTypeAct }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Possible Exposure Location And Type Act Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(SalmonellosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode')
   * @param salmonellosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SalmonellosisPackage.Literals.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
      try
      {
        VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(salmonellosisPossibleExposureLocationAndTypeAct))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SalmonellosisValidator.DIAGNOSTIC_SOURCE,
             SalmonellosisValidator.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSalmonellosisPossibleExposureLocationAndTypeActClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(salmonellosisPossibleExposureLocationAndTypeAct, context) }),
             new Object [] { salmonellosisPossibleExposureLocationAndTypeAct }));
      }
      return false;
    }
    return true;
  }

} // SalmonellosisPossibleExposureLocationAndTypeActOperations