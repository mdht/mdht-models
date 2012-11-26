/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nonhuman Exposure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getNonhumanExposure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Non-human ExposureTemplateId Non-human ExposureClassCode Non-human ExposureId Non-human ExposureMoodCode Non-human ExposureRouteCode Non-human ExposureConsumable Material Non-human ExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode Non-human ExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP Non-human ExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode Non-human ExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue Non-human ExposuredoseAdjustmentReasonAssociationTypeCode' templateId.root='2.16.840.1.113883.10.20.23.21' classCode='SBADM' constraints.validation.warning='Non-human ExposureDoseQuantity Non-human ExposureTiming Reference' constraints.validation.info='Non-human ExposureEffectiveTime Non-human ExposureMaxDoseQuantity Non-human ExposureText Non-human ExposureApproachSiteCode Non-human ExposureDoseAdjustmentReasonAssociation Non-human ExposureStudy Day Period' moodCode='EVN' constraints.validation.query='Non-human ExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode Non-human ExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP Non-human ExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode Non-human ExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue Non-human ExposuredoseAdjustmentReasonAssociationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanExposuredoseAdjustmentReasonAssociation typeCode='CAUS' constraints.validation.error='doseAdjustmentReasonAssociationTypeCode doseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode doseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP doseAdjustmentReasonAssociationdoseAdjustmentReasonCode doseAdjustmentReasonAssociationdoseAdjustmentReasonValue' constraints.validation.query='doseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode doseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP doseAdjustmentReasonAssociationdoseAdjustmentReasonCode doseAdjustmentReasonAssociationdoseAdjustmentReasonValue' constraints.validation.dependOn.doseAdjustmentReasonAssociationdoseAdjustmentReasonCode='doseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReason classCode='OBS' constraints.validation.error='doseAdjustmentReasonClassCode doseAdjustmentReasonCode doseAdjustmentReasonCodeP doseAdjustmentReasonValue' moodCode='EVN' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.doseAdjustmentReasonCode='doseAdjustmentReasonCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanExposureexposureCategoryAssociation typeCode='COMP' constraints.validation.error='exposureCategoryAssociationTypeCode exposureCategoryAssociationexposureEventCategoryClassCode exposureCategoryAssociationexposureEventCategoryCode exposureCategoryAssociationexposureEventCategoryMoodCode exposureCategoryAssociationexposureEventCategoryValue' constraints.validation.query='exposureCategoryAssociationexposureEventCategoryClassCode exposureCategoryAssociationexposureEventCategoryCode exposureCategoryAssociationexposureEventCategoryMoodCode exposureCategoryAssociationexposureEventCategoryValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanExposureexposureCategoryAssociationexposureEventCategory classCode='OBS' constraints.validation.error='exposureEventCategoryClassCode exposureEventCategoryCode exposureEventCategoryMoodCode exposureEventCategoryValue' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanExposureexposureSubCategoryAssociation typeCode='COMP' constraints.validation.error='exposureSubCategoryAssociationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmNonhumanExposureexposureSubCategoryAssociationexposureEventSubCategory classCode='OBS' constraints.validation.error='exposureEventSubCategoryClassCode exposureEventSubCategoryCode exposureEventSubCategoryMoodCode exposureEventSubCategoryValue' moodCode='EVN'"
 * @generated
 */
public interface NonhumanExposure extends SubstanceAdministration
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.21\')'"
   * @generated
   */
  boolean validateNonhumanExposureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClass::SBADM'"
   * @generated
   */
  boolean validateNonhumanExposureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())'"
   * @generated
   */
  boolean validateNonhumanExposureDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())'"
   * @generated
   */
  boolean validateNonhumanExposureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)'"
   * @generated
   */
  boolean validateNonhumanExposureId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentSubstanceMood::EVN'"
   * @generated
   */
  boolean validateNonhumanExposureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateNonhumanExposureRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())'"
   * @generated
   */
  boolean validateNonhumanExposureMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
   * @generated
   */
  boolean validateNonhumanExposureText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | element.oclIsTypeOf(datatypes::CE)))'"
   * @generated
   */
  boolean validateNonhumanExposureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::Consumable Material))'"
   * @generated
   */
  boolean validateNonhumanExposureConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateNonhumanExposureDoseAdjustmentReasonAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateNonhumanExposureTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateNonhumanExposureStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))'"
   * @generated
   */
  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)'"
   * @generated
   */
  boolean validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Timing Reference)'"
   * @generated
   */
  TimingReference getTimingReference();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)'"
   * @generated
   */
  StudyDayPeriod getStudyDayPeriod();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanExposure init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonhumanExposure init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // NonhumanExposure
