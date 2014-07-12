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
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Palpable Mass</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PalpableMassOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PalpableMassOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassTemplateId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassTemplateId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.51')";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassTemplateId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassTemplateId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassTemplateId(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassClassCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassClassCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassClassCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassClassCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassClassCode(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassCode(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassId(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassId(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassMoodCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassMoodCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassMoodCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassMoodCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassMoodCode(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassValue(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassValue(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassValue(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassValue(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassValue(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassStatusCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassStatusCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassStatusCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassStatusCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassStatusCode(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassTargetSiteCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Target Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassTargetSiteCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassTargetSiteCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Target Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassTargetSiteCode(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassTargetSiteCode(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_TARGET_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassNonPerformanceReason(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassNonPerformanceReason(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassNonPerformanceReason(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassNonPerformanceReason(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassNonPerformanceReason(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassPlannedStudyDay(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassPlannedStudyDay(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Planned Study Day) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassPlannedStudyDay(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Planned Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassPlannedStudyDay(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassPlannedStudyDay(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_PLANNED_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassDataCollection(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassDataCollection(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassDataCollection(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassDataCollection(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassDataCollection(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validatePalpableMassMassIdentification(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Mass Identification</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassMassIdentification(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PALPABLE_MASS_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::Mass Identification))";

  /**
   * The cached OCL invariant for the '{@link #validatePalpableMassMassIdentification(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Mass Identification</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePalpableMassMassIdentification(PalpableMass, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PALPABLE_MASS_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param palpableMass The receiving '<em><b>Palpable Mass</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePalpableMassMassIdentification(PalpableMass palpableMass, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PALPABLE_MASS_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.PALPABLE_MASS);
      try
      {
        VALIDATE_PALPABLE_MASS_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PALPABLE_MASS_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PALPABLE_MASS_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(palpableMass))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.PALPABLE_MASS__PALPABLE_MASS_MASS_IDENTIFICATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PalpableMassMassIdentification", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(palpableMass, context) }),
             new Object [] { palpableMass }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(PalpableMass) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(PalpableMass)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(PalpableMass) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(PalpableMass)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(PalpableMass palpableMass)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PALPABLE_MASS, SdtmPackage.Literals.PALPABLE_MASS.getEAllOperations().get(63));
      try
      {
        GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
    return (NonPerformanceReason) query.evaluate(palpableMass);
  }

  /**
   * The cached OCL expression body for the '{@link #getPlannedStudyDay(PalpableMass) <em>Get Planned Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(PalpableMass)
   * @generated
   * @ordered
   */
  protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Planned Study Day))->asSequence()->any(true).oclAsType(sdtm::Planned Study Day)";

  /**
   * The cached OCL query for the '{@link #getPlannedStudyDay(PalpableMass) <em>Get Planned Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlannedStudyDay(PalpableMass)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PlannedStudyDay getPlannedStudyDay(PalpableMass palpableMass)
  {
    if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PALPABLE_MASS, SdtmPackage.Literals.PALPABLE_MASS.getEAllOperations().get(64));
      try
      {
        GET_PLANNED_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_PLANNED_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_STUDY_DAY__EOCL_QRY);
    return (PlannedStudyDay) query.evaluate(palpableMass);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(PalpableMass) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(PalpableMass)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(PalpableMass) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(PalpableMass)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(PalpableMass palpableMass)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.PALPABLE_MASS, SdtmPackage.Literals.PALPABLE_MASS.getEAllOperations().get(65));
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
    return (DataCollection) query.evaluate(palpableMass);
  }

} // PalpableMassOperations