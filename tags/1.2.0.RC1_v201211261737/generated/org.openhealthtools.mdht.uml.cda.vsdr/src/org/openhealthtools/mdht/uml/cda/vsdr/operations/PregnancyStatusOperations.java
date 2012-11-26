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

import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PregnancyStatusOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PregnancyStatusOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePregnancyStatusTemplateId(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusTemplateId(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREGNANCY_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.12')";

  /**
   * The cached OCL invariant for the '{@link #validatePregnancyStatusTemplateId(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusTemplateId(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREGNANCY_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.12')
   * @param pregnancyStatus The receiving '<em><b>Pregnancy Status</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePregnancyStatusTemplateId(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREGNANCY_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PREGNANCY_STATUS);
      try
      {
        VALIDATE_PREGNANCY_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pregnancyStatus))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PREGNANCY_STATUS__PREGNANCY_STATUS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PregnancyStatusTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pregnancyStatus, context) }),
             new Object [] { pregnancyStatus }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePregnancyStatusClassCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusClassCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREGNANCY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validatePregnancyStatusClassCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusClassCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREGNANCY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param pregnancyStatus The receiving '<em><b>Pregnancy Status</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePregnancyStatusClassCode(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREGNANCY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PREGNANCY_STATUS);
      try
      {
        VALIDATE_PREGNANCY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pregnancyStatus))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PREGNANCY_STATUS__PREGNANCY_STATUS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PregnancyStatusClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pregnancyStatus, context) }),
             new Object [] { pregnancyStatus }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePregnancyStatusCodeP(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusCodeP(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREGNANCY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validatePregnancyStatusCodeP(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusCodeP(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREGNANCY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined()
   * @param pregnancyStatus The receiving '<em><b>Pregnancy Status</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePregnancyStatusCodeP(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREGNANCY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PREGNANCY_STATUS);
      try
      {
        VALIDATE_PREGNANCY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pregnancyStatus))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PREGNANCY_STATUS__PREGNANCY_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PregnancyStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pregnancyStatus, context) }),
             new Object [] { pregnancyStatus }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePregnancyStatusCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREGNANCY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69442-2' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validatePregnancyStatusCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREGNANCY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '69442-2' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param pregnancyStatus The receiving '<em><b>Pregnancy Status</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePregnancyStatusCode(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREGNANCY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PREGNANCY_STATUS);
      try
      {
        VALIDATE_PREGNANCY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pregnancyStatus))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PREGNANCY_STATUS__PREGNANCY_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PregnancyStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pregnancyStatus, context) }),
             new Object [] { pregnancyStatus }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePregnancyStatusMoodCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusMoodCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREGNANCY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validatePregnancyStatusMoodCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusMoodCode(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREGNANCY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param pregnancyStatus The receiving '<em><b>Pregnancy Status</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePregnancyStatusMoodCode(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREGNANCY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PREGNANCY_STATUS);
      try
      {
        VALIDATE_PREGNANCY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pregnancyStatus))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PREGNANCY_STATUS__PREGNANCY_STATUS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PregnancyStatusMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pregnancyStatus, context) }),
             new Object [] { pregnancyStatus }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePregnancyStatusValue(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusValue(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREGNANCY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.114222.4.11.6003')";

  /**
   * The cached OCL invariant for the '{@link #validatePregnancyStatusValue(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusValue(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREGNANCY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.114222.4.11.6003')
   * @param pregnancyStatus The receiving '<em><b>Pregnancy Status</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePregnancyStatusValue(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREGNANCY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PREGNANCY_STATUS);
      try
      {
        VALIDATE_PREGNANCY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pregnancyStatus))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PREGNANCY_STATUS__PREGNANCY_STATUS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PregnancyStatusValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pregnancyStatus, context) }),
             new Object [] { pregnancyStatus }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePregnancyStatusValueP(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusValueP(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PREGNANCY_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE))";

  /**
   * The cached OCL invariant for the '{@link #validatePregnancyStatusValueP(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePregnancyStatusValueP(PregnancyStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PREGNANCY_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE))
   * @param pregnancyStatus The receiving '<em><b>Pregnancy Status</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePregnancyStatusValueP(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PREGNANCY_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PREGNANCY_STATUS);
      try
      {
        VALIDATE_PREGNANCY_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PREGNANCY_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PREGNANCY_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pregnancyStatus))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PREGNANCY_STATUS__PREGNANCY_STATUS_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PregnancyStatusValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pregnancyStatus, context) }),
             new Object [] { pregnancyStatus }));
      }
       
      return false;
    }
    return true;
  }

} // PregnancyStatusOperations