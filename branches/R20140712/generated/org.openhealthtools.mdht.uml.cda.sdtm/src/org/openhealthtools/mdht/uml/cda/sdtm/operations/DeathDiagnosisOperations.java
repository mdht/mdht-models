/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Death Diagnosis Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Association Death Diagnosis Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeathDiagnosisOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeathDiagnosisOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisTemplateId(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisTemplateId(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.46')";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisTemplateId(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisTemplateId(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisTemplateId(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSIS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisClassCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisClassCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisClassCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisClassCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisClassCode(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSIS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisCode(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSIS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisId(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisId(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSIS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisId(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisId(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSIS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisId(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSIS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSIS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSIS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSIS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSIS_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisMoodCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisMoodCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisMoodCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisMoodCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisMoodCode(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSIS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisValue(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisValue(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSIS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisValue(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisValue(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSIS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisValue(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSIS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSIS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSIS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSIS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSIS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisDataCollection(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisDataCollection(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSIS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisDataCollection(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisDataCollection(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSIS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisDataCollection(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSIS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSIS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSIS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSIS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSIS_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Death Diagnosis Result Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSIS_DEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Death Diagnosis Result Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSIS_DEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSIS_DEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSIS_DEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSIS_DEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSIS_DEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSIS_DEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisDeathDiagnosisResultCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83218' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Association Death Diagnosis Result Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_DEATH_DIAGNOSIS_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Association Death Diagnosis Result Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(DeathDiagnosis, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_DEATH_DIAGNOSIS_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param deathDiagnosis The receiving '<em><b>Death Diagnosis</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(DeathDiagnosis deathDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_DEATH_DIAGNOSIS_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DEATH_DIAGNOSIS);
      try
      {
        VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_DEATH_DIAGNOSIS_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_DEATH_DIAGNOSIS_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_DEATH_DIAGNOSIS_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(deathDiagnosis))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DEATH_DIAGNOSIS__DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_DEATH_DIAGNOSIS_RESULT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deathDiagnosis, context) }),
             new Object [] { deathDiagnosis }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(DeathDiagnosis) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(DeathDiagnosis)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(DeathDiagnosis) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(DeathDiagnosis)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(DeathDiagnosis deathDiagnosis)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.DEATH_DIAGNOSIS, SdtmPackage.Literals.DEATH_DIAGNOSIS.getEAllOperations().get(66));
      try
      {
        GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
    return (DataCollection) query.evaluate(deathDiagnosis);
  }

} // DeathDiagnosisOperations