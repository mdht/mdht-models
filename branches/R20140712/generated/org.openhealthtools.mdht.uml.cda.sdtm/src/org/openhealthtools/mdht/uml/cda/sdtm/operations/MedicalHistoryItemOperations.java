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

import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical History Item</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemMedicalHistoryCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Medical History Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Medical History Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemActivityEndTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Association Medical History Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Association Medical History Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getActivityEndTimingReference() <em>Get Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalHistoryItemOperations extends ClinicalStatementOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicalHistoryItemOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemTemplateId(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemTemplateId(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.26')";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemTemplateId(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemTemplateId(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemTemplateId(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemClassCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemEffectiveTime(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemEffectiveTime(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemEffectiveTime(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemEffectiveTime(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemEffectiveTime(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemId(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemId(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemId(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemId(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemId(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemMoodCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemStatusCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemStatusCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemStatusCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemStatusCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemStatusCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemValue(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemGroupIdentifier(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemGroupIdentifier(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemGroupIdentifier(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemGroupIdentifier(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemGroupIdentifier(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemMedicalHistoryCategoryAssociation(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Medical History Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemMedicalHistoryCategoryAssociation(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemMedicalHistoryCategoryAssociation(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Medical History Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemMedicalHistoryCategoryAssociation(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemMedicalHistoryCategoryAssociation(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemMedicalHistoryCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Medical History Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Medical History Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemMedicalHistorySubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemPreSpecifiedEvent(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemPreSpecifiedEvent(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemPreSpecifiedEvent(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Pre Specified Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemPreSpecifiedEvent(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemPreSpecifiedEvent(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_PRE_SPECIFIED_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemNonPerformanceReason(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemNonPerformanceReason(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemNonPerformanceReason(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemNonPerformanceReason(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemNonPerformanceReason(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemBodySystemorOrganClass(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemBodySystemorOrganClass(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Body System or Organ Class) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemBodySystemorOrganClass(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Body Systemor Organ Class</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemBodySystemorOrganClass(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemBodySystemorOrganClass(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_BODY_SYSTEMOR_ORGAN_CLASS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemActivityEndTimingReference(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Activity End Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemActivityEndTimingReference(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity End Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemActivityEndTimingReference(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Activity End Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemActivityEndTimingReference(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemActivityEndTimingReference(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_ACTIVITY_END_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemActivityEndTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemDataCollection(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemDataCollection(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEM_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemDataCollection(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemDataCollection(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEM_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemDataCollection(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEM_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEM_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEM_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEM_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEM_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Association Medical History Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Association Medical History Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Association Medical History Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Association Medical History Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(MedicalHistoryItem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalHistoryItem The receiving '<em><b>Medical History Item</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(MedicalHistoryItem medicalHistoryItem, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM);
      try
      {
        VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalHistoryItem))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.MEDICAL_HISTORY_ITEM__MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalHistoryItem, context) }),
             new Object [] { medicalHistoryItem }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(MedicalHistoryItem) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(MedicalHistoryItem) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(MedicalHistoryItem medicalHistoryItem)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM, SdtmPackage.Literals.MEDICAL_HISTORY_ITEM.getEAllOperations().get(79));
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
    return (GroupIdentifier) query.evaluate(medicalHistoryItem);
  }

  /**
   * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(MedicalHistoryItem) <em>Get Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->any(true).oclAsType(sdtm::Pre-Specified Event)";

  /**
   * The cached OCL query for the '{@link #getPreSpecifiedEvent(MedicalHistoryItem) <em>Get Pre Specified Event</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PreSpecifiedEvent getPreSpecifiedEvent(MedicalHistoryItem medicalHistoryItem)
  {
    if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM, SdtmPackage.Literals.MEDICAL_HISTORY_ITEM.getEAllOperations().get(80));
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
    return (PreSpecifiedEvent) query.evaluate(medicalHistoryItem);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(MedicalHistoryItem) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(MedicalHistoryItem) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(MedicalHistoryItem medicalHistoryItem)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM, SdtmPackage.Literals.MEDICAL_HISTORY_ITEM.getEAllOperations().get(81));
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
    return (NonPerformanceReason) query.evaluate(medicalHistoryItem);
  }

  /**
   * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(MedicalHistoryItem) <em>Get Body Systemor Organ Class</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Body System or Organ Class))->asSequence()->any(true).oclAsType(sdtm::Body System or Organ Class)";

  /**
   * The cached OCL query for the '{@link #getBodySystemorOrganClass(MedicalHistoryItem) <em>Get Body Systemor Organ Class</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodySystemorOrganClass(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  BodySystemorOrganClass getBodySystemorOrganClass(MedicalHistoryItem medicalHistoryItem)
  {
    if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM, SdtmPackage.Literals.MEDICAL_HISTORY_ITEM.getEAllOperations().get(82));
      try
      {
        GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
    return (BodySystemorOrganClass) query.evaluate(medicalHistoryItem);
  }

  /**
   * The cached OCL expression body for the '{@link #getActivityEndTimingReference(MedicalHistoryItem) <em>Get Activity End Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityEndTimingReference(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static final String GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity End Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Activity End Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getActivityEndTimingReference(MedicalHistoryItem) <em>Get Activity End Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityEndTimingReference(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  ActivityEndTimingReference getActivityEndTimingReference(MedicalHistoryItem medicalHistoryItem)
  {
    if (GET_ACTIVITY_END_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM, SdtmPackage.Literals.MEDICAL_HISTORY_ITEM.getEAllOperations().get(83));
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
    return (ActivityEndTimingReference) query.evaluate(medicalHistoryItem);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(MedicalHistoryItem) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(MedicalHistoryItem) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(MedicalHistoryItem)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(MedicalHistoryItem medicalHistoryItem)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.MEDICAL_HISTORY_ITEM, SdtmPackage.Literals.MEDICAL_HISTORY_ITEM.getEAllOperations().get(84));
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
    return (DataCollection) query.evaluate(medicalHistoryItem);
  }

} // MedicalHistoryItemOperations