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

import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseSubstanceUseCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Substance Use Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseSubstanceUseSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Substance Use Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsePreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseActivityStartTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseActivityEndTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Association Substance Use Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Association Substance Use Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getActivityStartTimingReference() <em>Get Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getActivityEndTimingReference() <em>Get Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstanceUseOperations extends SubstanceAdministrationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubstanceUseOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseTemplateId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseTemplateId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.22')";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseTemplateId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseTemplateId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseTemplateId(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseClassCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseDoseQuantity(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseEffectiveTime(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseEffectiveTime(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseEffectiveTime(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseEffectiveTime(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseEffectiveTime(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseId(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseId(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseMaxDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Max Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseMaxDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseMaxDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Max Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseMaxDoseQuantity(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseMaxDoseQuantity(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_MAX_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseMaxDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseMoodCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseRouteCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseRouteCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseRouteCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseRouteCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseRouteCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_ROUTE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseRouteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseStatusCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseStatusCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseStatusCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseStatusCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseStatusCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseText(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseText(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseText(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseText(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseText(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseConsumableMaterial(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Consumable Material</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseConsumableMaterial(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::Consumable Material))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseConsumableMaterial(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Consumable Material</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseConsumableMaterial(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseConsumableMaterial(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_CONSUMABLE_MATERIAL,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseConsumableMaterial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseSubstanceUseCategoryAssociation(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Substance Use Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseSubstanceUseCategoryAssociation(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseSubstanceUseCategoryAssociation(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Substance Use Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseSubstanceUseCategoryAssociation(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseSubstanceUseCategoryAssociation(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_SUBSTANCE_USE_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseSubstanceUseSubCategoryAssociation(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Substance Use Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseSubstanceUseSubCategoryAssociation(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseSubstanceUseSubCategoryAssociation(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Substance Use Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseSubstanceUseSubCategoryAssociation(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseSubstanceUseSubCategoryAssociation(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_SUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseSubstanceUseSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsePreSpecifiedEvent(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsePreSpecifiedEvent(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsePreSpecifiedEvent(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Pre Specified Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsePreSpecifiedEvent(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsePreSpecifiedEvent(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_PRE_SPECIFIED_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsePreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseNonPerformanceReason(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseNonPerformanceReason(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseNonPerformanceReason(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseNonPerformanceReason(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseNonPerformanceReason(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseActivityStartTimingReference(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Activity Start Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseActivityStartTimingReference(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity Start Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseActivityStartTimingReference(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Activity Start Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseActivityStartTimingReference(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseActivityStartTimingReference(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_ACTIVITY_START_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseActivityStartTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseActivityEndTimingReference(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Activity End Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseActivityEndTimingReference(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity End Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseActivityEndTimingReference(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Activity End Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseActivityEndTimingReference(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseActivityEndTimingReference(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_ACTIVITY_END_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseActivityEndTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseDataCollection(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseDataCollection(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseDataCollection(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseDataCollection(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseDataCollection(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUseStudyDayPeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseStudyDayPeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUseStudyDayPeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUseStudyDayPeriod(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUseStudyDayPeriod(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USE_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUseStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1')))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Value P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Association Substance Use Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Association Substance Use Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_SUBSTANCE_USE_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Association Substance Use Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Association Substance Use Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory(SubstanceUse, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param substanceUse The receiving '<em><b>Substance Use</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory(SubstanceUse substanceUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.SUBSTANCE_USE);
      try
      {
        VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(substanceUse))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.SUBSTANCE_USE__SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_SUBSTANCE_USE_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(substanceUse, context) }),
             new Object [] { substanceUse }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(SubstanceUse) <em>Get Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->any(true).oclAsType(sdtm::Pre-Specified Event)";

  /**
   * The cached OCL query for the '{@link #getPreSpecifiedEvent(SubstanceUse) <em>Get Pre Specified Event</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PreSpecifiedEvent getPreSpecifiedEvent(SubstanceUse substanceUse)
  {
    if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(84));
      try
      {
        GET_PRE_SPECIFIED_EVENT__EOCL_QRY = helper.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PRE_SPECIFIED_EVENT__EOCL_QRY);
    return (PreSpecifiedEvent) query.evaluate(substanceUse);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(SubstanceUse) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(SubstanceUse) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(SubstanceUse substanceUse)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(85));
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
    return (NonPerformanceReason) query.evaluate(substanceUse);
  }

  /**
   * The cached OCL expression body for the '{@link #getActivityStartTimingReference(SubstanceUse) <em>Get Activity Start Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityStartTimingReference(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static final String GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity Start Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Activity Start Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getActivityStartTimingReference(SubstanceUse) <em>Get Activity Start Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityStartTimingReference(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ActivityStartTimingReference getActivityStartTimingReference(SubstanceUse substanceUse)
  {
    if (GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(86));
      try
      {
        GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVITY_START_TIMING_REFERENCE__EOCL_QRY);
    return (ActivityStartTimingReference) query.evaluate(substanceUse);
  }

  /**
   * The cached OCL expression body for the '{@link #getActivityEndTimingReference(SubstanceUse) <em>Get Activity End Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityEndTimingReference(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static final String GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity End Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Activity End Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getActivityEndTimingReference(SubstanceUse) <em>Get Activity End Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityEndTimingReference(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ActivityEndTimingReference getActivityEndTimingReference(SubstanceUse substanceUse)
  {
    if (GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(87));
      try
      {
        GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY);
    return (ActivityEndTimingReference) query.evaluate(substanceUse);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(SubstanceUse) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(SubstanceUse) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(SubstanceUse substanceUse)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(88));
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
    return (DataCollection) query.evaluate(substanceUse);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(SubstanceUse) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(SubstanceUse) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(SubstanceUse)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(SubstanceUse substanceUse)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.SUBSTANCE_USE, SdtmPackage.Literals.SUBSTANCE_USE.getEAllOperations().get(89));
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
    return (StudyDayPeriod) query.evaluate(substanceUse);
  }

} // SubstanceUseOperations