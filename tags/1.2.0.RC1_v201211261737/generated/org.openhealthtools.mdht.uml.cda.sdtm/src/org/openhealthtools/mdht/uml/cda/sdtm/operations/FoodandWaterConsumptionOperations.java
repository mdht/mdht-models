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

import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Foodand Water Consumption</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FoodandWaterConsumptionOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FoodandWaterConsumptionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.47')";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionId(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionValue(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Exclusion Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Exclusion Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionExclusionReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
      try
      {
        VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
             new Object [] { foodandWaterConsumption }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(FoodandWaterConsumption) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(FoodandWaterConsumption)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(FoodandWaterConsumption) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(FoodandWaterConsumption)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(FoodandWaterConsumption foodandWaterConsumption)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(64));
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
    return (NonPerformanceReason) query.evaluate(foodandWaterConsumption);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(FoodandWaterConsumption) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(FoodandWaterConsumption)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(FoodandWaterConsumption) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(FoodandWaterConsumption)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(FoodandWaterConsumption foodandWaterConsumption)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(65));
      try
      {
        GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
    return (StudyDayPeriod) query.evaluate(foodandWaterConsumption);
  }

  /**
   * The cached OCL expression body for the '{@link #getExclusionReason(FoodandWaterConsumption) <em>Get Exclusion Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(FoodandWaterConsumption)
   * @generated
   * @ordered
   */
  protected static final String GET_EXCLUSION_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Exclusion Reason))->asSequence()->any(true).oclAsType(sdtm::Exclusion Reason)";

  /**
   * The cached OCL query for the '{@link #getExclusionReason(FoodandWaterConsumption) <em>Get Exclusion Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusionReason(FoodandWaterConsumption)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EXCLUSION_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ExclusionReason getExclusionReason(FoodandWaterConsumption foodandWaterConsumption)
  {
    if (GET_EXCLUSION_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(66));
      try
      {
        GET_EXCLUSION_REASON__EOCL_QRY = helper.createQuery(GET_EXCLUSION_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_REASON__EOCL_QRY);
    return (ExclusionReason) query.evaluate(foodandWaterConsumption);
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(FoodandWaterConsumption) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(FoodandWaterConsumption)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(FoodandWaterConsumption) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(FoodandWaterConsumption)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(FoodandWaterConsumption foodandWaterConsumption)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(67));
      try
      {
        GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
    return (GroupIdentifier) query.evaluate(foodandWaterConsumption);
  }

} // FoodandWaterConsumptionOperations