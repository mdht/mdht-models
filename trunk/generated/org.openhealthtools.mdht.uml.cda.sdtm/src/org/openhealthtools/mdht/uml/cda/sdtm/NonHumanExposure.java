/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Human Exposure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getNonHumanExposure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.23.21' constraints.validation.error='Non-Human ExposureTemplateId Non-Human ExposureClassCode Non-Human ExposureId Non-Human ExposureMoodCode' constraints.validation.warning='Non-Human ExposureDoseQuantity' classCode='SBADM' moodCode='EVN' constraints.validation.info='Non-Human ExposureEffectiveTime Non-Human ExposureRouteCode Non-Human ExposureMaxDoseQuantity Non-Human ExposureText Non-Human ExposureApproachSiteCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposureexposureCategoryAssociation constraints.validation.error='exposureCategoryAssociationTypeCode' typeCode='COMP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposureexposureCategoryAssociationexposureEventCategory constraints.validation.error='exposureEventCategoryClassCode exposureEventCategoryCode exposureEventCategoryMoodCode exposureEventCategoryValue' classCode='OBS' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposureexposureSubCategoryAssociation constraints.validation.error='exposureSubCategoryAssociationTypeCode' typeCode='COMP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposureexposureSubCategoryAssociationexposureEventSubCategory constraints.validation.error='exposureEventSubCategoryClassCode exposureEventSubCategoryCode exposureEventSubCategoryMoodCode exposureEventSubCategoryValue' classCode='OBS' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposureexposureIntendedRegimen constraints.validation.error='exposureIntendedRegimenTypeCode' typeCode='CAUS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposureexposureIntendedRegimenexposureIntendedRegimen constraints.validation.error='exposureIntendedRegimenClassCode exposureIntendedRegimenMoodCode exposureIntendedRegimenCode exposureIntendedRegimenValue' classCode='OBS' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposuredoseAdjustmentReasonAssociation constraints.validation.error='doseAdjustmentReasonAssociationTypeCode' typeCode='CAUS'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReason constraints.validation.dependOn.doseAdjustmentReasonCode='doseAdjustmentReasonCodeP' code.codeSystem='2.16.840.1.113883.3.26.1.1' constraints.validation.error='doseAdjustmentReasonClassCode doseAdjustmentReasonCode doseAdjustmentReasonCodeP doseAdjustmentReasonValue' code.codeSystemName='NCI Thesaurus' classCode='OBS' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposureelementOrderAssociation constraints.validation.error='elementOrderAssociationTypeCode' typeCode='COMP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonHumanExposureelementOrderAssociationelementOrder constraints.validation.dependOn.elementOrderCode='elementOrderCodeP' code.codeSystem='2.16.840.1.113883.3.26.1.1' constraints.validation.error='elementOrderClassCode elementOrderCode elementOrderCodeP elementOrderMoodCode elementOrderValue' code.codeSystemName='NCI Thesaurus' classCode='OBS' moodCode='EVN'"
 * @generated
 */
public interface NonHumanExposure extends SubstanceAdministration
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.21')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.21\')'"
   * @generated
   */
  boolean validateNonHumanExposureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::ActClass::SBADM
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClass::SBADM'"
   * @generated
   */
  boolean validateNonHumanExposureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())'"
   * @generated
   */
  boolean validateNonHumanExposureDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())'"
   * @generated
   */
  boolean validateNonHumanExposureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
   * @generated
   */
  boolean validateNonHumanExposureId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::x_DocumentSubstanceMood::EVN
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentSubstanceMood::EVN'"
   * @generated
   */
  boolean validateNonHumanExposureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateNonHumanExposureRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())'"
   * @generated
   */
  boolean validateNonHumanExposureMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
   * @generated
   */
  boolean validateNonHumanExposureText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | element.oclIsTypeOf(datatypes::CE)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | element.oclIsTypeOf(datatypes::CE)))'"
   * @generated
   */
  boolean validateNonHumanExposureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonHumanExposure init();
} // NonHumanExposure
