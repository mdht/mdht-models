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

import org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pre Natal Care</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreNatalCareOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreNatalCareOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePreNatalCareTemplateId(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareTemplateId(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRE_NATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.32')";

  /**
   * The cached OCL invariant for the '{@link #validatePreNatalCareTemplateId(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareTemplateId(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRE_NATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.32')
   * @param preNatalCare The receiving '<em><b>Pre Natal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePreNatalCareTemplateId(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRE_NATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRE_NATAL_CARE);
      try
      {
        VALIDATE_PRE_NATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_NATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRE_NATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preNatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRE_NATAL_CARE__PRE_NATAL_CARE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreNatalCareTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preNatalCare, context) }),
             new Object [] { preNatalCare }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePreNatalCareClassCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareClassCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRE_NATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
   * The cached OCL invariant for the '{@link #validatePreNatalCareClassCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareClassCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRE_NATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
   * @param preNatalCare The receiving '<em><b>Pre Natal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePreNatalCareClassCode(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRE_NATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRE_NATAL_CARE);
      try
      {
        VALIDATE_PRE_NATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_NATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRE_NATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preNatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRE_NATAL_CARE__PRE_NATAL_CARE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreNatalCareClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preNatalCare, context) }),
             new Object [] { preNatalCare }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePreNatalCareCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRE_NATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePreNatalCareCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRE_NATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param preNatalCare The receiving '<em><b>Pre Natal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePreNatalCareCode(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRE_NATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRE_NATAL_CARE);
      try
      {
        VALIDATE_PRE_NATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_NATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRE_NATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preNatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRE_NATAL_CARE__PRE_NATAL_CARE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreNatalCareCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preNatalCare, context) }),
             new Object [] { preNatalCare }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePreNatalCareEffectiveTime(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareEffectiveTime(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRE_NATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePreNatalCareEffectiveTime(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareEffectiveTime(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRE_NATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param preNatalCare The receiving '<em><b>Pre Natal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePreNatalCareEffectiveTime(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRE_NATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRE_NATAL_CARE);
      try
      {
        VALIDATE_PRE_NATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_NATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRE_NATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preNatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRE_NATAL_CARE__PRE_NATAL_CARE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreNatalCareEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preNatalCare, context) }),
             new Object [] { preNatalCare }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePreNatalCareMoodCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareMoodCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRE_NATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::DEF";

  /**
   * The cached OCL invariant for the '{@link #validatePreNatalCareMoodCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareMoodCode(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRE_NATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_DocumentActMood::DEF
   * @param preNatalCare The receiving '<em><b>Pre Natal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePreNatalCareMoodCode(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRE_NATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRE_NATAL_CARE);
      try
      {
        VALIDATE_PRE_NATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_NATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRE_NATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preNatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRE_NATAL_CARE__PRE_NATAL_CARE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreNatalCareMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preNatalCare, context) }),
             new Object [] { preNatalCare }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePreNatalCareNegationInd(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Negation Ind</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareNegationInd(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRE_NATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validatePreNatalCareNegationInd(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Negation Ind</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareNegationInd(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRE_NATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.negationInd.oclIsUndefined()
   * @param preNatalCare The receiving '<em><b>Pre Natal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePreNatalCareNegationInd(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRE_NATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRE_NATAL_CARE);
      try
      {
        VALIDATE_PRE_NATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_NATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRE_NATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preNatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRE_NATAL_CARE__PRE_NATAL_CARE_NEGATION_IND,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreNatalCareNegationInd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preNatalCare, context) }),
             new Object [] { preNatalCare }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePreNatalCareEntryRelationship(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareEntryRelationship(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRE_NATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validatePreNatalCareEntryRelationship(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePreNatalCareEntryRelationship(PreNatalCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRE_NATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param preNatalCare The receiving '<em><b>Pre Natal Care</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePreNatalCareEntryRelationship(PreNatalCare preNatalCare, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRE_NATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.PRE_NATAL_CARE);
      try
      {
        VALIDATE_PRE_NATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRE_NATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRE_NATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(preNatalCare))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.PRE_NATAL_CARE__PRE_NATAL_CARE_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PreNatalCareEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(preNatalCare, context) }),
             new Object [] { preNatalCare }));
      }
       
      return false;
    }
    return true;
  }

} // PreNatalCareOperations