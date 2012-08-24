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
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionDispositionCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Disposition Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionDispositionSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Disposition Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Association Disposition Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Association Disposition Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanClinicalDispositionOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalDispositionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionTemplateId(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionTemplateId(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.24')";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionTemplateId(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionTemplateId(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionTemplateId(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionClassCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionEffectiveTime(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionEffectiveTime(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionEffectiveTime(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionEffectiveTime(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionEffectiveTime(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionId(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionId(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionId(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionId(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionId(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionMoodCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionDispositionCategoryAssociation(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Disposition Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionDispositionCategoryAssociation(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionDispositionCategoryAssociation(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Disposition Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionDispositionCategoryAssociation(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionDispositionCategoryAssociation(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_DISPOSITION_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionDispositionCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionDispositionSubCategoryAssociation(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Disposition Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionDispositionSubCategoryAssociation(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionDispositionSubCategoryAssociation(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Disposition Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionDispositionSubCategoryAssociation(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionDispositionSubCategoryAssociation(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_DISPOSITION_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionDispositionSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionStudyEpoch(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionStudyEpoch(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Study Epoch) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionStudyEpoch(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Study Epoch</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionStudyEpoch(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionStudyEpoch(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_STUDY_EPOCH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionStudyEpoch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionDataCollection(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionDataCollection(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionDataCollection(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionDataCollection(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionDataCollection(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionGroupIdentifier(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionGroupIdentifier(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionGroupIdentifier(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionGroupIdentifier(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionGroupIdentifier(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositionStudyDayPeriod(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionStudyDayPeriod(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositionStudyDayPeriod(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositionStudyDayPeriod(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositionStudyDayPeriod(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITION_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositionStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Association Disposition Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_DISPOSITION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Association Disposition Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_DISPOSITION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_DISPOSITION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_DISPOSITION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_DISPOSITION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_DISPOSITION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_DISPOSITION_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionCategoryAssociationDispositionCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Association Disposition Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_DISPOSITION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Association Disposition Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory(HumanClinicalDisposition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_DISPOSITION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalDisposition The receiving '<em><b>Human Clinical Disposition</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory(HumanClinicalDisposition humanClinicalDisposition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_DISPOSITION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION);
      try
      {
        VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_DISPOSITION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_DISPOSITION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_DISPOSITION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalDisposition))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_DISPOSITION__HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_DISPOSITION_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalDisposition, context) }),
             new Object [] { humanClinicalDisposition }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyEpoch(HumanClinicalDisposition) <em>Get Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(HumanClinicalDisposition)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_EPOCH__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Epoch))->asSequence()->any(true).oclAsType(sdtm::Study Epoch)";

  /**
   * The cached OCL query for the '{@link #getStudyEpoch(HumanClinicalDisposition) <em>Get Study Epoch</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(HumanClinicalDisposition)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_EPOCH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyEpoch getStudyEpoch(HumanClinicalDisposition humanClinicalDisposition)
  {
    if (GET_STUDY_EPOCH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION, SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION.getEAllOperations().get(75));
      try
      {
        GET_STUDY_EPOCH__EOCL_QRY = helper.createQuery(GET_STUDY_EPOCH__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_EPOCH__EOCL_QRY);
    return (StudyEpoch) query.evaluate(humanClinicalDisposition);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(HumanClinicalDisposition) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(HumanClinicalDisposition)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(HumanClinicalDisposition) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(HumanClinicalDisposition)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(HumanClinicalDisposition humanClinicalDisposition)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION, SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION.getEAllOperations().get(76));
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
    return (DataCollection) query.evaluate(humanClinicalDisposition);
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(HumanClinicalDisposition) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(HumanClinicalDisposition)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(HumanClinicalDisposition) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(HumanClinicalDisposition)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(HumanClinicalDisposition humanClinicalDisposition)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION, SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION.getEAllOperations().get(77));
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
    return (GroupIdentifier) query.evaluate(humanClinicalDisposition);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(HumanClinicalDisposition) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(HumanClinicalDisposition)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(HumanClinicalDisposition) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(HumanClinicalDisposition)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(HumanClinicalDisposition humanClinicalDisposition)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION, SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION.getEAllOperations().get(78));
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
    return (StudyDayPeriod) query.evaluate(humanClinicalDisposition);
  }

} // HumanClinicalDispositionOperations