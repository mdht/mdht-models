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

import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pronouncing Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PronouncingDeathOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PronouncingDeathOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathTemplateId(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathTemplateId(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.15')";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathTemplateId(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathTemplateId(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathTemplateId(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathClassCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathMoodCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathMoodCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathMoodCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathMoodCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathMoodCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'LOINC TBD' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathEffectiveTime(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathEffectiveTime(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathEffectiveTime(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathEffectiveTime(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathEffectiveTime(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncer(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncer(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncer(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncer(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncer(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Determiner Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('determinerCode'))";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Determiner Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerPronouncerRolePronouncingPartyName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerPronouncerRoleAddr(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Addr</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRoleAddr(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerPronouncerRoleAddr(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Addr</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRoleAddr(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerPronouncerRoleAddr(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ADDR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerPronouncerRoleAddr", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerPronouncerRoleClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRoleClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerPronouncerRoleClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRoleClassCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerPronouncerRoleClassCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerPronouncerRoleClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerPronouncerRoleId(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRoleId(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerPronouncerRoleId(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRoleId(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerPronouncerRoleId(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerPronouncerRoleId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerPronouncerRolePronouncingParty", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerTypeCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerTypeCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerTypeCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerTypeCode(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerTypeCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePronouncingDeathPronouncerPronouncerRole(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRole(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

  /**
   * The cached OCL invariant for the '{@link #validatePronouncingDeathPronouncerPronouncerRole(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePronouncingDeathPronouncerPronouncerRole(PronouncingDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pronouncingDeath The receiving '<em><b>Pronouncing Death</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePronouncingDeathPronouncerPronouncerRole(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.PRONOUNCING_DEATH);
      try
      {
        VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pronouncingDeath))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PronouncingDeathPronouncerPronouncerRole", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pronouncingDeath, context) }),
             new Object [] { pronouncingDeath }));
      }
       
      return false;
    }
    return true;
  }

} // PronouncingDeathOperations