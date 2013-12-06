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

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Causal Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCause(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCause(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeathCausalInformationOperations extends OrganizerOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathCausalInformationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationTemplateId(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationTemplateId(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.6')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationTemplateId(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationTemplateId(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationTemplateId(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationStatusCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_STATUS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationStatusCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69453-9' and value.codeSystem = '2.16.840.1.113883.6.1'";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationStatusCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Status Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationStatusCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationStatusCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Status Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationStatusCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationStatusCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationStatusCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'Active')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationStatusCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationStatusCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationStatusCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCause(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCause(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "1..4->includes(self.component->select(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))->size())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCause(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCause(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCause(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCause", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentOtherSignificantCondition(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantCondition(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentOtherSignificantCondition(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantCondition(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentOtherSignificantCondition(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentOtherSignificantCondition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(not code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = '69440-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)..observation->excluding(null)->reject(value->forAll(element | element.oclIsTypeOf(datatypes::ED)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Sequence Number</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).->reject(not sequenceNumber.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Sequence Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipHasComponent::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null).->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = '21984-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCauseValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCauseValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCauseValue(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCauseValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseSequenceNumber(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Sequence Number</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseSequenceNumber(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(not sequenceNumber.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseSequenceNumber(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Sequence Number</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseSequenceNumber(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseSequenceNumber(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseSequenceNumber", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipHasComponent::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseTypeCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentCauseDeathCause(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCause(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentCauseDeathCause(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentCauseDeathCause(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentCauseDeathCause(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentCauseDeathCause", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = '69441-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipHasComponent::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentOtherSignificantConditionTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DeathCausalInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathCausalInformation The receiving '<em><b>Death Causal Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsdrPackage.Literals.DEATH_CAUSAL_INFORMATION);
      try
      {
        VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathCausalInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsdrValidator.DIAGNOSTIC_SOURCE,
             VsdrValidator.DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathCausalInformation, context) }),
             new Object [] { deathCausalInformation }));
      }
       
      return false;
    }
    return true;
  }

} // DeathCausalInformationOperations