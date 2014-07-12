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

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Exposure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureExposureCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureExposureSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureDoseAdjustmentReasonAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Adjustment Reason Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureElementOrderAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Element Order Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureExposureRegimenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Regimen Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Association Exposure Event Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Association Exposure Event Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Association Dose Adjustment Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationElementOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Element Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Association Exposure Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanClinicalExposureOperations extends SubstanceAdministrationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalExposureOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureTemplateId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureTemplateId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.20')";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureTemplateId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureTemplateId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureTemplateId(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureClassCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureDoseQuantity(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureEffectiveTime(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureId(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureId(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureMoodCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureRouteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureRouteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureRouteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureRouteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureRouteCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureRouteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Max Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Max Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureMaxDoseQuantity(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureMaxDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureText(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureText(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureText(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureText(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureText(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureApproachSiteCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureApproachSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureGroupIdentifier(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Consumable Material</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::Consumable Material))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Consumable Material</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureConsumableMaterial(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureConsumableMaterial", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureExposureCategoryAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureExposureCategoryAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureExposureCategoryAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureExposureCategoryAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureExposureCategoryAssociation(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_EXPOSURE_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureExposureCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureExposureSubCategoryAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureExposureSubCategoryAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureExposureSubCategoryAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureExposureSubCategoryAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureExposureSubCategoryAssociation(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_EXPOSURE_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureExposureSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureDoseAdjustmentReasonAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Adjustment Reason Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureDoseAdjustmentReasonAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureDoseAdjustmentReasonAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Adjustment Reason Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureDoseAdjustmentReasonAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureDoseAdjustmentReasonAssociation(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureDoseAdjustmentReasonAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Study Epoch) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Epoch</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureStudyEpoch(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureStudyEpoch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Element Order Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Element Order Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureElementOrderAssociation(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureElementOrderAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureTimingReference(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureTimingReference(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureTimingReference(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureTimingReference(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureTimingReference(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureStudyDayPeriod(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureExposureRegimenAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Regimen Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureExposureRegimenAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureExposureRegimenAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Regimen Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureExposureRegimenAssociation(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureExposureRegimenAssociation(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSURE_EXPOSURE_REGIMEN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureExposureRegimenAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureCategoryAssociationTypeCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Association Exposure Event Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Association Exposure Event Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureCategoryAssociationExposureEventCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Association Exposure Event Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Association Exposure Event Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Association Dose Adjustment Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Association Dose Adjustment Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::INT))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureelementOrderAssociationelementOrderValue(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationelementOrderValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureelementOrderAssociationTypeCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Element Order</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Element Order</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureelementOrderAssociationElementOrder(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureelementOrderAssociationElementOrder", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationTypeCode(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureRegimenAssociationTypeCode(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureRegimenAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Association Exposure Intended Regimen</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Association Exposure Intended Regimen</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen(HumanClinicalExposure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param humanClinicalExposure The receiving '<em><b>Human Clinical Exposure</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen(HumanClinicalExposure humanClinicalExposure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE);
      try
      {
        VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalExposure))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_EXPOSURE__HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalExposure, context) }),
             new Object [] { humanClinicalExposure }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(HumanClinicalExposure) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(HumanClinicalExposure)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(HumanClinicalExposure) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(HumanClinicalExposure)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(HumanClinicalExposure humanClinicalExposure)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(103));
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
    return (GroupIdentifier) query.evaluate(humanClinicalExposure);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyEpoch(HumanClinicalExposure) <em>Get Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(HumanClinicalExposure)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_EPOCH__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Epoch))->asSequence()->any(true).oclAsType(sdtm::Study Epoch)";

  /**
   * The cached OCL query for the '{@link #getStudyEpoch(HumanClinicalExposure) <em>Get Study Epoch</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(HumanClinicalExposure)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_EPOCH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyEpoch getStudyEpoch(HumanClinicalExposure humanClinicalExposure)
  {
    if (GET_STUDY_EPOCH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(104));
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
    return (StudyEpoch) query.evaluate(humanClinicalExposure);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(HumanClinicalExposure) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(HumanClinicalExposure)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(HumanClinicalExposure) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(HumanClinicalExposure)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(HumanClinicalExposure humanClinicalExposure)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(105));
      try
      {
        GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
    return (TimingReference) query.evaluate(humanClinicalExposure);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(HumanClinicalExposure) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(HumanClinicalExposure)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(HumanClinicalExposure) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(HumanClinicalExposure)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(HumanClinicalExposure humanClinicalExposure)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE, SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE.getEAllOperations().get(106));
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
    return (StudyDayPeriod) query.evaluate(humanClinicalExposure);
  }

} // HumanClinicalExposureOperations