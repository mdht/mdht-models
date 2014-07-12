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

import org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Certification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeathCertificationOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathCertificationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationTemplateId(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationTemplateId(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.7')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationTemplateId(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationTemplateId(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.7')
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationTemplateId(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('classCode')
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationClassCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69437-2' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = '69437-2' and value.codeSystem = '2.16.840.1.113883.6.1'
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationEffectiveTime(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationEffectiveTime(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationEffectiveTime(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationEffectiveTime(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationEffectiveTime(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationMoodCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationMoodCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationMoodCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationMoodCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * isDefined('moodCode')
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationMoodCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformer(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformer(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformer(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformer(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformer(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('classCode'))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Determiner Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('determinerCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Determiner Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject(isDefined('determinerCode'))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleAddr(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Addr</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleAddr(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleAddr(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Addr</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleAddr(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleAddr(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleAddr", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleClassCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassAssignedEntity::ASSIGNED)
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleClassCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.114222.4.11.6001'))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
   * value.codeSystem = '2.16.840.1.114222.4.11.6001'))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCodeP(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCodeP(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCodeP(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCodeP(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleCodeP(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleId(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleId(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleId(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleId(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleId(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRoleCertifyingParty", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerTypeCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerTypeCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerTypeCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerTypeCode(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerTypeCode(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCertificationCertificationPerformerCertifierRole(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRole(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCertificationCertificationPerformerCertifierRole(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCertificationCertificationPerformerCertifierRole(DeathCertification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
   * @param deathCertification The receiving '<em><b>Death Certification</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCertificationCertificationPerformerCertifierRole(DeathCertification deathCertification, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CERTIFICATION);
      try
      {
        VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCertification))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CERTIFICATION__DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCertificationCertificationPerformerCertifierRole", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCertification, context) }),
             new Object [] { deathCertification }));
      }
       
      return false;
    }
    return true;
  }

} // DeathCertificationOperations