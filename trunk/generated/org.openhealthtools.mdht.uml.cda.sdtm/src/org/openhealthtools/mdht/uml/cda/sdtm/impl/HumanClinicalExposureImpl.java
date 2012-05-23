/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.Observation;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalExposureOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Exposure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HumanClinicalExposureImpl extends SubstanceAdministrationImpl implements HumanClinicalExposure
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalExposureImpl()
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
    return SdtmPackage.Literals.HUMAN_CLINICAL_EXPOSURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureRouteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureMaxDoseQuantity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureApproachSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureConsumableMaterial(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureExposureCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureExposureCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureExposureSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureExposureSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureExposureIndication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureExposureIndication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureDoseAdjustmentReasonAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureDoseAdjustmentReasonAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureStudyEpoch(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureElementOrderAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureElementOrderAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureexposureCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureexposureIntendedRegimenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureIntendedRegimenClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureexposureIntendedRegimenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureIntendedRegimenMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureexposureIntendedRegimenCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureIntendedRegimenCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureexposureIntendedRegimenValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureIntendedRegimenValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureelementOrderAssociationelementOrderValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureelementOrderAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalExposureelementOrderAssociationElementOrder(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationElementOrder(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return HumanClinicalExposureOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getExposureIndication()
  {
    return HumanClinicalExposureOperations.getExposureIndication(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyEpoch getStudyEpoch()
  {
    return HumanClinicalExposureOperations.getStudyEpoch(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return HumanClinicalExposureOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return HumanClinicalExposureOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalExposure init() {
    	CDAUtil.init(this);
    	return this;
  }
} //HumanClinicalExposureImpl
