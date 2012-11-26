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

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Subject Intervention</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionInterventionCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionInterventionSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionDoseAdjustmentReasonAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Dose Adjustment Reason Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionElementOrderAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Element Order Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionInterventionRegimenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Regimen Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionInterventionIndicationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Indication Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Association Intervention Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Association Intervention Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Association Dose Adjustment Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventionelementOrderAssociationElementOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Association Element Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Association Exposure Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Association Intervention Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StudySubjectInterventionOperations extends SubstanceAdministrationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudySubjectInterventionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionTemplateId(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionTemplateId(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.101')";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionTemplateId(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionTemplateId(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionTemplateId(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionClassCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionDoseQuantity(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionDoseQuantity(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionDoseQuantity(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionDoseQuantity(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionDoseQuantity(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionEffectiveTime(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionEffectiveTime(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionEffectiveTime(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionEffectiveTime(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionEffectiveTime(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_EFFECTIVE_TIME,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionId(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionId(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionId(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionId(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionId(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionMoodCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionRouteCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Route Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionRouteCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionRouteCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Route Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionRouteCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionRouteCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_ROUTE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionRouteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionMaxDoseQuantity(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Max Dose Quantity</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionMaxDoseQuantity(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionMaxDoseQuantity(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Max Dose Quantity</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionMaxDoseQuantity(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionMaxDoseQuantity(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_MAX_DOSE_QUANTITY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionMaxDoseQuantity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionText(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionText(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionText(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionText(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionText(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionApproachSiteCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Approach Site Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionApproachSiteCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionApproachSiteCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Approach Site Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionApproachSiteCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionApproachSiteCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_APPROACH_SITE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionApproachSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionStatusCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Status Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionStatusCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionStatusCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Status Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionStatusCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionStatusCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_STATUS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionGroupIdentifier(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionGroupIdentifier(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionGroupIdentifier(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Group Identifier</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionGroupIdentifier(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionGroupIdentifier(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_GROUP_IDENTIFIER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionConsumable(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Consumable</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionConsumable(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(rim::Participation))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionConsumable(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Consumable</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionConsumable(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionConsumable(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_CONSUMABLE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionConsumable", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionInterventionCategoryAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionInterventionCategoryAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionInterventionCategoryAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionInterventionCategoryAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionInterventionCategoryAssociation(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_INTERVENTION_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionInterventionCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionInterventionSubCategoryAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Sub Category Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionInterventionSubCategoryAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionInterventionSubCategoryAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Sub Category Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionInterventionSubCategoryAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionInterventionSubCategoryAssociation(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_INTERVENTION_SUB_CATEGORY_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionInterventionSubCategoryAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionDoseAdjustmentReasonAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Dose Adjustment Reason Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionDoseAdjustmentReasonAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionDoseAdjustmentReasonAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Dose Adjustment Reason Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionDoseAdjustmentReasonAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionDoseAdjustmentReasonAssociation(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_DOSE_ADJUSTMENT_REASON_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionDoseAdjustmentReasonAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionStudyEpoch(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionStudyEpoch(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Study Epoch))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionStudyEpoch(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Study Epoch</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionStudyEpoch(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionStudyEpoch(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_STUDY_EPOCH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionStudyEpoch", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionElementOrderAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Element Order Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionElementOrderAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionElementOrderAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Element Order Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionElementOrderAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionElementOrderAssociation(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_ELEMENT_ORDER_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionElementOrderAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionTimingReference(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionTimingReference(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionTimingReference(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Timing Reference</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionTimingReference(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionTimingReference(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_TIMING_REFERENCE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionStudyDayPeriod(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionStudyDayPeriod(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionStudyDayPeriod(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Study Day Period</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionStudyDayPeriod(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionStudyDayPeriod(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_STUDY_DAY_PERIOD,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionInterventionRegimenAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Regimen Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionInterventionRegimenAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionInterventionRegimenAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Regimen Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionInterventionRegimenAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionInterventionRegimenAssociation(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_INTERVENTION_REGIMEN_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionInterventionRegimenAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionPreSpecifiedEvent(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionPreSpecifiedEvent(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionPreSpecifiedEvent(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Pre Specified Event</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionPreSpecifiedEvent(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionPreSpecifiedEvent(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_PRE_SPECIFIED_EVENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionPreSpecifiedEvent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionDataCollection(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionDataCollection(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionDataCollection(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionDataCollection(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionDataCollection(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionNonPerformanceReason(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionNonPerformanceReason(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionNonPerformanceReason(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Non Performance Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionNonPerformanceReason(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionNonPerformanceReason(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_NON_PERFORMANCE_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionInterventionIndicationAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Indication Association</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionInterventionIndicationAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_INDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionInterventionIndicationAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Intervention Intervention Indication Association</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionInterventionIndicationAssociation(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_INDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionInterventionIndicationAssociation(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_INDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_INDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_INDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTION_INTERVENTION_INDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTION_INTERVENTION_INDICATION_ASSOCIATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionInterventionIndicationAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Associationintervention Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATIONINTERVENTION_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Association Intervention Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_INTERVENTION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Category Association Intervention Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_INTERVENTION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_INTERVENTION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_INTERVENTION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_INTERVENTION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_INTERVENTION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_CATEGORY_ASSOCIATION_INTERVENTION_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionCategoryAssociationInterventionCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Associationintervention Sub Category Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATIONINTERVENTION_SUB_CATEGORY_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionSubCategoryAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Association Intervention Sub Category</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_INTERVENTION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Sub Category Association Intervention Sub Category</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_INTERVENTION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_INTERVENTION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_INTERVENTION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_INTERVENTION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_INTERVENTION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_SUB_CATEGORY_ASSOCIATION_INTERVENTION_SUB_CATEGORY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Associationdose Adjustment Reason Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Association Dose Adjustment Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventiondose Adjustment Reason Association Dose Adjustment Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionelementOrderAssociationelementOrderClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionelementOrderAssociationelementOrderCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionelementOrderAssociationelementOrderCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionelementOrderAssociationelementOrderCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionelementOrderAssociationelementOrderMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | element.oclIsTypeOf(datatypes::INT))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionelementOrderAssociationelementOrderValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Associationelement Order Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationelementOrderValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionelementOrderAssociationelementOrderValue(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionelementOrderAssociationelementOrderValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionelementOrderAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionelementOrderAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionelementOrderAssociationTypeCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionelementOrderAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventionelementOrderAssociationElementOrder(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Association Element Order</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationElementOrder(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventionelementOrderAssociationElementOrder(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionelement Order Association Element Order</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventionelementOrderAssociationElementOrder(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventionelementOrderAssociationElementOrder(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventionelementOrderAssociationElementOrder", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Associationintervention Intended Regimen Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATIONINTERVENTION_INTENDED_REGIMEN_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionRegimenAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Association Exposure Intended Regimen</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Regimen Association Exposure Intended Regimen</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'C83085' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Associationintervention Indication Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATIONINTERVENTION_INDICATION_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionIndicationAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Association Intervention Indication</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_INTERVENTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

  /**
   * The cached OCL invariant for the '{@link #validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Interventionintervention Indication Association Intervention Indication</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(StudySubjectIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_INTERVENTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param studySubjectIntervention The receiving '<em><b>Study Subject Intervention</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(StudySubjectIntervention studySubjectIntervention, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_INTERVENTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION);
      try
      {
        VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_INTERVENTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_INTERVENTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_INTERVENTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(studySubjectIntervention))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.STUDY_SUBJECT_INTERVENTION__STUDY_SUBJECT_INTERVENTIONINTERVENTION_INDICATION_ASSOCIATION_INTERVENTION_INDICATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "StudySubjectInterventioninterventionIndicationAssociationInterventionIndication", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(studySubjectIntervention, context) }),
             new Object [] { studySubjectIntervention }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getGroupIdentifier(StudySubjectIntervention) <em>Get Group Identifier</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)";

  /**
   * The cached OCL query for the '{@link #getGroupIdentifier(StudySubjectIntervention) <em>Get Group Identifier</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupIdentifier(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  GroupIdentifier getGroupIdentifier(StudySubjectIntervention studySubjectIntervention)
  {
    if (GET_GROUP_IDENTIFIER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION, SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION.getEAllOperations().get(115));
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
    return (GroupIdentifier) query.evaluate(studySubjectIntervention);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyEpoch(StudySubjectIntervention) <em>Get Study Epoch</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_EPOCH__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Epoch))->asSequence()->any(true).oclAsType(sdtm::Study Epoch)";

  /**
   * The cached OCL query for the '{@link #getStudyEpoch(StudySubjectIntervention) <em>Get Study Epoch</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyEpoch(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_EPOCH__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyEpoch getStudyEpoch(StudySubjectIntervention studySubjectIntervention)
  {
    if (GET_STUDY_EPOCH__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION, SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION.getEAllOperations().get(116));
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
    return (StudyEpoch) query.evaluate(studySubjectIntervention);
  }

  /**
   * The cached OCL expression body for the '{@link #getTimingReference(StudySubjectIntervention) <em>Get Timing Reference</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)";

  /**
   * The cached OCL query for the '{@link #getTimingReference(StudySubjectIntervention) <em>Get Timing Reference</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingReference(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  TimingReference getTimingReference(StudySubjectIntervention studySubjectIntervention)
  {
    if (GET_TIMING_REFERENCE__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION, SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION.getEAllOperations().get(117));
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
    return (TimingReference) query.evaluate(studySubjectIntervention);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyDayPeriod(StudySubjectIntervention) <em>Get Study Day Period</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)";

  /**
   * The cached OCL query for the '{@link #getStudyDayPeriod(StudySubjectIntervention) <em>Get Study Day Period</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyDayPeriod(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  StudyDayPeriod getStudyDayPeriod(StudySubjectIntervention studySubjectIntervention)
  {
    if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION, SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION.getEAllOperations().get(118));
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
    return (StudyDayPeriod) query.evaluate(studySubjectIntervention);
  }

  /**
   * The cached OCL expression body for the '{@link #getPreSpecifiedEvent(StudySubjectIntervention) <em>Get Pre Specified Event</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static final String GET_PRE_SPECIFIED_EVENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->any(true).oclAsType(sdtm::Pre-Specified Event)";

  /**
   * The cached OCL query for the '{@link #getPreSpecifiedEvent(StudySubjectIntervention) <em>Get Pre Specified Event</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreSpecifiedEvent(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_PRE_SPECIFIED_EVENT__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  PreSpecifiedEvent getPreSpecifiedEvent(StudySubjectIntervention studySubjectIntervention)
  {
    if (GET_PRE_SPECIFIED_EVENT__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION, SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION.getEAllOperations().get(119));
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
    return (PreSpecifiedEvent) query.evaluate(studySubjectIntervention);
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(StudySubjectIntervention) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(StudySubjectIntervention) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(StudySubjectIntervention studySubjectIntervention)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION, SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION.getEAllOperations().get(120));
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
    return (DataCollection) query.evaluate(studySubjectIntervention);
  }

  /**
   * The cached OCL expression body for the '{@link #getNonPerformanceReason(StudySubjectIntervention) <em>Get Non Performance Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)";

  /**
   * The cached OCL query for the '{@link #getNonPerformanceReason(StudySubjectIntervention) <em>Get Non Performance Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonPerformanceReason(StudySubjectIntervention)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  NonPerformanceReason getNonPerformanceReason(StudySubjectIntervention studySubjectIntervention)
  {
    if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION, SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION.getEAllOperations().get(121));
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
    return (NonPerformanceReason) query.evaluate(studySubjectIntervention);
  }

} // StudySubjectInterventionOperations