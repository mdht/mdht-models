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

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Abnormal Conditionsofthe Newborn</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn#validateAbnormalConditionsoftheNewbornTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn#validateAbnormalConditionsoftheNewbornClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn#validateAbnormalConditionsoftheNewbornCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn#validateAbnormalConditionsoftheNewbornMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn#validateAbnormalConditionsoftheNewbornValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbnormalConditionsoftheNewbornOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbnormalConditionsoftheNewbornOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateAbnormalConditionsoftheNewbornTemplateId(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornTemplateId(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.8')";

  /**
   * The cached OCL invariant for the '{@link #validateAbnormalConditionsoftheNewbornTemplateId(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornTemplateId(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.8')
   * @param abnormalConditionsoftheNewborn The receiving '<em><b>Abnormal Conditionsofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAbnormalConditionsoftheNewbornTemplateId(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONSOFTHE_NEWBORN);
      try
      {
        VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abnormalConditionsoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AbnormalConditionsoftheNewbornTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(abnormalConditionsoftheNewborn, context) }),
             new Object [] { abnormalConditionsoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAbnormalConditionsoftheNewbornClassCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornClassCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateAbnormalConditionsoftheNewbornClassCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornClassCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param abnormalConditionsoftheNewborn The receiving '<em><b>Abnormal Conditionsofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAbnormalConditionsoftheNewbornClassCode(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONSOFTHE_NEWBORN);
      try
      {
        VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abnormalConditionsoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AbnormalConditionsoftheNewbornClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(abnormalConditionsoftheNewborn, context) }),
             new Object [] { abnormalConditionsoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAbnormalConditionsoftheNewbornCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateAbnormalConditionsoftheNewbornCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param abnormalConditionsoftheNewborn The receiving '<em><b>Abnormal Conditionsofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAbnormalConditionsoftheNewbornCode(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONSOFTHE_NEWBORN);
      try
      {
        VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abnormalConditionsoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AbnormalConditionsoftheNewbornCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(abnormalConditionsoftheNewborn, context) }),
             new Object [] { abnormalConditionsoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAbnormalConditionsoftheNewbornMoodCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornMoodCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateAbnormalConditionsoftheNewbornMoodCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornMoodCode(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param abnormalConditionsoftheNewborn The receiving '<em><b>Abnormal Conditionsofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAbnormalConditionsoftheNewbornMoodCode(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONSOFTHE_NEWBORN);
      try
      {
        VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abnormalConditionsoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AbnormalConditionsoftheNewbornMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(abnormalConditionsoftheNewborn, context) }),
             new Object [] { abnormalConditionsoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateAbnormalConditionsoftheNewbornValue(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornValue(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

  /**
   * The cached OCL invariant for the '{@link #validateAbnormalConditionsoftheNewbornValue(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionsofthe Newborn Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateAbnormalConditionsoftheNewbornValue(AbnormalConditionsoftheNewborn, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))
   * @param abnormalConditionsoftheNewborn The receiving '<em><b>Abnormal Conditionsofthe Newborn</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateAbnormalConditionsoftheNewbornValue(AbnormalConditionsoftheNewborn abnormalConditionsoftheNewborn, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.ABNORMAL_CONDITIONSOFTHE_NEWBORN);
      try
      {
        VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ABNORMAL_CONDITIONSOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(abnormalConditionsoftheNewborn))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.ABNORMAL_CONDITIONSOFTHE_NEWBORN__ABNORMAL_CONDITIONSOFTHE_NEWBORN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AbnormalConditionsoftheNewbornValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(abnormalConditionsoftheNewborn, context) }),
             new Object [] { abnormalConditionsoftheNewborn }));
      }
       
      return false;
    }
    return true;
  }

} // AbnormalConditionsoftheNewbornOperations