/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coroner Case Transfer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer#validateCoronerCaseTransferTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer#validateCoronerCaseTransferClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer#validateCoronerCaseTransferMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer#validateCoronerCaseTransferCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer#validateCoronerCaseTransferCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer#validateCoronerCaseTransferValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer#validateCoronerCaseTransferCoronerCase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Coroner Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoronerCaseTransferOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoronerCaseTransferOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerCaseTransferTemplateId(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferTemplateId(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_CASE_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.4')";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerCaseTransferTemplateId(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferTemplateId(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_CASE_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerCaseTransfer The receiving '<em><b>Coroner Case Transfer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerCaseTransferTemplateId(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_CASE_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_CASE_TRANSFER);
      try
      {
        VALIDATE_CORONER_CASE_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_CASE_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_CASE_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerCaseTransfer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerCaseTransferTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerCaseTransfer, context) }),
             new Object [] { coronerCaseTransfer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerCaseTransferClassCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferClassCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_CASE_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerCaseTransferClassCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferClassCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_CASE_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerCaseTransfer The receiving '<em><b>Coroner Case Transfer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerCaseTransferClassCode(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_CASE_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_CASE_TRANSFER);
      try
      {
        VALIDATE_CORONER_CASE_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_CASE_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_CASE_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerCaseTransfer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerCaseTransferClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerCaseTransfer, context) }),
             new Object [] { coronerCaseTransfer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerCaseTransfer The receiving '<em><b>Coroner Case Transfer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerCaseTransferCodeP(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_CASE_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_CASE_TRANSFER);
      try
      {
        VALIDATE_CORONER_CASE_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_CASE_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_CASE_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerCaseTransfer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerCaseTransferCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerCaseTransfer, context) }),
             new Object [] { coronerCaseTransfer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerCaseTransfer The receiving '<em><b>Coroner Case Transfer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerCaseTransferCode(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_CASE_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_CASE_TRANSFER);
      try
      {
        VALIDATE_CORONER_CASE_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_CASE_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_CASE_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerCaseTransfer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerCaseTransferCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerCaseTransfer, context) }),
             new Object [] { coronerCaseTransfer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerCaseTransferMoodCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferMoodCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_CASE_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerCaseTransferMoodCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferMoodCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_CASE_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateCoronerCaseTransferCodeP(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferCodeP(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_CASE_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerCaseTransferCodeP(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferCodeP(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_CASE_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateCoronerCaseTransferCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_CASE_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'LOINC TBD' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerCaseTransferCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferCode(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_CASE_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerCaseTransfer The receiving '<em><b>Coroner Case Transfer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerCaseTransferMoodCode(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_CASE_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_CASE_TRANSFER);
      try
      {
        VALIDATE_CORONER_CASE_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_CASE_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_CASE_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerCaseTransfer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerCaseTransferMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerCaseTransfer, context) }),
             new Object [] { coronerCaseTransfer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerCaseTransferValue(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferValue(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_CASE_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerCaseTransferValue(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferValue(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_CASE_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerCaseTransfer The receiving '<em><b>Coroner Case Transfer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerCaseTransferValue(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_CASE_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_CASE_TRANSFER);
      try
      {
        VALIDATE_CORONER_CASE_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_CASE_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_CASE_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerCaseTransfer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerCaseTransferValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerCaseTransfer, context) }),
             new Object [] { coronerCaseTransfer }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerCaseTransferCoronerCase(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Coroner Case</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferCoronerCase(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_CASE_TRANSFER_CORONER_CASE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(cda::Observation))";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerCaseTransferCoronerCase(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Case Transfer Coroner Case</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerCaseTransferCoronerCase(CoronerCaseTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_CASE_TRANSFER_CORONER_CASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerCaseTransfer The receiving '<em><b>Coroner Case Transfer</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerCaseTransferCoronerCase(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_CASE_TRANSFER_CORONER_CASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_CASE_TRANSFER);
      try
      {
        VALIDATE_CORONER_CASE_TRANSFER_CORONER_CASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_CASE_TRANSFER_CORONER_CASE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_CASE_TRANSFER_CORONER_CASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerCaseTransfer))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CORONER_CASE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerCaseTransferCoronerCase", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerCaseTransfer, context) }),
             new Object [] { coronerCaseTransfer }));
      }
       
      return false;
    }
    return true;
  }

} // CoronerCaseTransferOperations