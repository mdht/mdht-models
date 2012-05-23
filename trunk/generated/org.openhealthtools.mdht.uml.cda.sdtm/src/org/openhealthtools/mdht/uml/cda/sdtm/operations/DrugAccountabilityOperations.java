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

import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Accountability</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityDrugAccountabilityCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Drug Accountability Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Drug Accountability Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrugAccountabilityOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DrugAccountabilityOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityTemplateId(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityTemplateId(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.37')";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityTemplateId(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityTemplateId(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.37')
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityTemplateId(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityClassCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityClassCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityClassCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityClassCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClassObservation::OBS
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityClassCode(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityCode(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityId(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityId(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityId(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityId(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityId(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityMoodCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityMoodCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityMoodCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityMoodCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityMoodCode(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityValue(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityValue(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityValue(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityValue(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityValue(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityStatusCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityStatusCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityStatusCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityStatusCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityStatusCode(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityEffectiveTime(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityEffectiveTime(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityEffectiveTime(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityEffectiveTime(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityEffectiveTime(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityGroupIdentifier(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityGroupIdentifier(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityGroupIdentifier(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityGroupIdentifier(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityGroupIdentifier(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityDrugAccountabilityCategoryAssociation(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Drug Accountability Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityDrugAccountabilityCategoryAssociation(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityDrugAccountabilityCategoryAssociation(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Drug Accountability Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityDrugAccountabilityCategoryAssociation(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityDrugAccountabilityCategoryAssociation(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityDrugAccountabilityCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Drug Accountability Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Drug Accountability Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityDrugAccountabilitySubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityNonPerformanceReason(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityNonPerformanceReason(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityNonPerformanceReason(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityNonPerformanceReason(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityNonPerformanceReason(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilityEventStudyDay(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Event Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityEventStudyDay(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day))";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilityEventStudyDay(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Event Study Day</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilityEventStudyDay(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Event Study Day))
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilityEventStudyDay(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITY_EVENT_STUDY_DAY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilityEventStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationTypeCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationTypeCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationTypeCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationTypeCode(DrugAccountability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationTypeCode(DrugAccountability drugAccountability, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY);
      try
      {
        VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(drugAccountability))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.DRUG_ACCOUNTABILITY__DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DrugAccountabilitydrugAccountabilitySubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(drugAccountability, context) }),
             new Object [] { drugAccountability }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(DrugAccountability) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(DrugAccountability)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(DrugAccountability) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(DrugAccountability)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->first().oclAsType(sdtm::Group Identifier)
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(DrugAccountability drugAccountability)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY, SdtmPackage.Literals.DRUG_ACCOUNTABILITY.getEAllOperations().get(64));
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
    return (GroupIdentifier) query.evaluate(drugAccountability);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(DrugAccountability) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(DrugAccountability)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(DrugAccountability) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(DrugAccountability)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->first().oclAsType(sdtm::Non Performance Reason)
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(DrugAccountability drugAccountability)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY, SdtmPackage.Literals.DRUG_ACCOUNTABILITY.getEAllOperations().get(65));
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
    return (NonPerformanceReason) query.evaluate(drugAccountability);
  }

  /**
   * The cached OCL expression body for the '{@link #getEventStudyDay(DrugAccountability) <em>Get Event Study Day</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventStudyDay(DrugAccountability)
   * @generated
   * @ordered
   */
  protected static final String GET_EVENT_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->first().oclAsType(sdtm::Event Study Day)";

  /**
   * The cached OCL query for the '{@link #getEventStudyDay(DrugAccountability) <em>Get Event Study Day</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventStudyDay(DrugAccountability)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_EVENT_STUDY_DAY__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Event Study Day))->asSequence()->first().oclAsType(sdtm::Event Study Day)
   * @param drugAccountability The receiving '<em><b>Drug Accountability</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EventStudyDay getEventStudyDay(DrugAccountability drugAccountability)
  {
    if (GET_EVENT_STUDY_DAY__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.DRUG_ACCOUNTABILITY, SdtmPackage.Literals.DRUG_ACCOUNTABILITY.getEAllOperations().get(66));
      try
      {
        GET_EVENT_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_EVENT_STUDY_DAY__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_EVENT_STUDY_DAY__EOCL_QRY);
    return (EventStudyDay) query.evaluate(drugAccountability);
  }

} // DrugAccountabilityOperations