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

import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coroner Referral</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoronerReferralOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoronerReferralOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerReferralTemplateId(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralTemplateId(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_REFERRAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.5')";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerReferralTemplateId(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralTemplateId(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_REFERRAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerReferral The receiving '<em><b>Coroner Referral</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerReferralTemplateId(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_REFERRAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_REFERRAL);
      try
      {
        VALIDATE_CORONER_REFERRAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_REFERRAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_REFERRAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerReferral))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_REFERRAL__CORONER_REFERRAL_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerReferralTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerReferral, context) }),
             new Object [] { coronerReferral }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerReferralClassCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralClassCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_REFERRAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerReferralClassCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralClassCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_REFERRAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerReferral The receiving '<em><b>Coroner Referral</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerReferralClassCode(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_REFERRAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_REFERRAL);
      try
      {
        VALIDATE_CORONER_REFERRAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_REFERRAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_REFERRAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerReferral))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_REFERRAL__CORONER_REFERRAL_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerReferralClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerReferral, context) }),
             new Object [] { coronerReferral }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerReferral The receiving '<em><b>Coroner Referral</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerReferralCodeP(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_REFERRAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_REFERRAL);
      try
      {
        VALIDATE_CORONER_REFERRAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_REFERRAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_REFERRAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerReferral))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_REFERRAL__CORONER_REFERRAL_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerReferralCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerReferral, context) }),
             new Object [] { coronerReferral }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerReferral The receiving '<em><b>Coroner Referral</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerReferralCode(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_REFERRAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_REFERRAL);
      try
      {
        VALIDATE_CORONER_REFERRAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_REFERRAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_REFERRAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerReferral))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_REFERRAL__CORONER_REFERRAL_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerReferralCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerReferral, context) }),
             new Object [] { coronerReferral }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerReferralMoodCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralMoodCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_REFERRAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerReferralMoodCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralMoodCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_REFERRAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateCoronerReferralCodeP(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralCodeP(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_REFERRAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerReferralCodeP(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralCodeP(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_REFERRAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateCoronerReferralCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_REFERRAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69438-0' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerReferralCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralCode(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_REFERRAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerReferral The receiving '<em><b>Coroner Referral</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerReferralMoodCode(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_REFERRAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_REFERRAL);
      try
      {
        VALIDATE_CORONER_REFERRAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_REFERRAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_REFERRAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerReferral))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_REFERRAL__CORONER_REFERRAL_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerReferralMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerReferral, context) }),
             new Object [] { coronerReferral }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateCoronerReferralValue(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralValue(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CORONER_REFERRAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::ED)))";

  /**
   * The cached OCL invariant for the '{@link #validateCoronerReferralValue(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateCoronerReferralValue(CoronerReferral, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CORONER_REFERRAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param coronerReferral The receiving '<em><b>Coroner Referral</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateCoronerReferralValue(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_CORONER_REFERRAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.CORONER_REFERRAL);
      try
      {
        VALIDATE_CORONER_REFERRAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CORONER_REFERRAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CORONER_REFERRAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coronerReferral))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.CORONER_REFERRAL__CORONER_REFERRAL_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CoronerReferralValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coronerReferral, context) }),
             new Object [] { coronerReferral }));
      }
       
      return false;
    }
    return true;
  }

} // CoronerReferralOperations