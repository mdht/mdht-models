/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Congenital Anomaliesofthe Newborn</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn#validateCongenitalAnomaliesoftheNewbornTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn#validateCongenitalAnomaliesoftheNewbornClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn#validateCongenitalAnomaliesoftheNewbornCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn#validateCongenitalAnomaliesoftheNewbornMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn#validateCongenitalAnomaliesoftheNewbornValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CongenitalAnomaliesoftheNewbornOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CongenitalAnomaliesoftheNewbornOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomaliesoftheNewbornTemplateId(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornTemplateId(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.16')";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomaliesoftheNewbornTemplateId(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornTemplateId(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.16')
   * @param congenitalAnomaliesoftheNewborn The receiving '<em><b>Congenital Anomaliesofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomaliesoftheNewbornTemplateId(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALIESOFTHE_NEWBORN);
      try
      {
        VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaliesoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomaliesoftheNewbornTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaliesoftheNewborn, context) }),
             new Object [] { congenitalAnomaliesoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomaliesoftheNewbornClassCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornClassCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomaliesoftheNewbornClassCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornClassCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param congenitalAnomaliesoftheNewborn The receiving '<em><b>Congenital Anomaliesofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomaliesoftheNewbornClassCode(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALIESOFTHE_NEWBORN);
      try
      {
        VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaliesoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomaliesoftheNewbornClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaliesoftheNewborn, context) }),
             new Object [] { congenitalAnomaliesoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomaliesoftheNewbornCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomaliesoftheNewbornCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param congenitalAnomaliesoftheNewborn The receiving '<em><b>Congenital Anomaliesofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomaliesoftheNewbornCode(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALIESOFTHE_NEWBORN);
      try
      {
        VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaliesoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomaliesoftheNewbornCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaliesoftheNewborn, context) }),
             new Object [] { congenitalAnomaliesoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomaliesoftheNewbornMoodCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornMoodCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomaliesoftheNewbornMoodCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornMoodCode(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param congenitalAnomaliesoftheNewborn The receiving '<em><b>Congenital Anomaliesofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomaliesoftheNewbornMoodCode(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALIESOFTHE_NEWBORN);
      try
      {
        VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaliesoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomaliesoftheNewbornMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaliesoftheNewborn, context) }),
             new Object [] { congenitalAnomaliesoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCongenitalAnomaliesoftheNewbornValue(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornValue(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateCongenitalAnomaliesoftheNewbornValue(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Congenital Anomaliesofthe Newborn Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCongenitalAnomaliesoftheNewbornValue(CongenitalAnomaliesoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param congenitalAnomaliesoftheNewborn The receiving '<em><b>Congenital Anomaliesofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCongenitalAnomaliesoftheNewbornValue(CongenitalAnomaliesoftheNewborn congenitalAnomaliesoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.CONGENITAL_ANOMALIESOFTHE_NEWBORN);
      try
      {
        VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CONGENITAL_ANOMALIESOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(congenitalAnomaliesoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.CONGENITAL_ANOMALIESOFTHE_NEWBORN__CONGENITAL_ANOMALIESOFTHE_NEWBORN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CongenitalAnomaliesoftheNewbornValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(congenitalAnomaliesoftheNewborn, context) }),
             new Object [] { congenitalAnomaliesoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

} // CongenitalAnomaliesoftheNewbornOperations