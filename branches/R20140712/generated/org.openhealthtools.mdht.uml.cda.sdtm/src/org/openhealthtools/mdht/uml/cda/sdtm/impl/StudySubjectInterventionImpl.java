/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectInterventionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Subject Intervention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudySubjectInterventionImpl extends SubstanceAdministrationImpl implements StudySubjectIntervention
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudySubjectInterventionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SdtmPackage.Literals.STUDY_SUBJECT_INTERVENTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionRouteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionMaxDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionApproachSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionConsumable(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionConsumable(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionInterventionCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionInterventionCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionInterventionSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionInterventionSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionDoseAdjustmentReasonAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionDoseAdjustmentReasonAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionStudyEpoch(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionElementOrderAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionElementOrderAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionInterventionRegimenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionInterventionRegimenAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionPreSpecifiedEvent(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionInterventionIndicationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionInterventionIndicationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationinterventionCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionCategoryAssociationInterventionCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationinterventionSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionSubCategoryAssociationInterventionSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventiondoseAdjustmentReasonAssociationDoseAdjustmentReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionelementOrderAssociationelementOrderValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationelementOrderValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionelementOrderAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventionelementOrderAssociationElementOrder(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventionelementOrderAssociationElementOrder(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationinterventionIntendedRegimenValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionRegimenAssociationExposureIntendedRegimen(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationinterventionIndicationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudySubjectInterventionOperations.validateStudySubjectInterventioninterventionIndicationAssociationInterventionIndication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return StudySubjectInterventionOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyEpoch getStudyEpoch()
  {
    return StudySubjectInterventionOperations.getStudyEpoch(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return StudySubjectInterventionOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return StudySubjectInterventionOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent getPreSpecifiedEvent()
  {
    return StudySubjectInterventionOperations.getPreSpecifiedEvent(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return StudySubjectInterventionOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return StudySubjectInterventionOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudySubjectIntervention init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudySubjectIntervention init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudySubjectInterventionImpl
