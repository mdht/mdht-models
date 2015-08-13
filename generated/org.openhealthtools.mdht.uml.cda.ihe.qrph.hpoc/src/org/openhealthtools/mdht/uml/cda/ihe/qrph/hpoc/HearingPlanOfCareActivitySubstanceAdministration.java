/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hearing Plan Of Care Activity Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage#getHearingPlanOfCareActivitySubstanceAdministration()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PlanOfCareActivitySubstanceAdministrationTemplateId HearingPlanOfCareActivitySubstanceAdministrationCode HearingPlanOfCareActivitySubstanceAdministrationText HearingPlanOfCareActivitySubstanceAdministrationStatusCode HearingPlanOfCareActivitySubstanceAdministrationRouteCode HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode HearingPlanOfCareActivitySubstanceAdministrationConsumable' templateId.root='1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.6' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.info='HearingPlanOfCareActivitySubstanceAdministrationRepeatNumber HearingPlanOfCareActivitySubstanceAdministrationRouteCodeP HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP HearingPlanOfCareActivitySubstanceAdministrationRateQuantity HearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity HearingPlanOfCareActivitySubstanceAdministrationPerformer HearingPlanOfCareActivitySubstanceAdministrationParticipant HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction HearingPlanOfCareActivitySubstanceAdministrationPrecondition' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1' routeCode.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.HearingPlanOfCareActivitySubstanceAdministrationRouteCode='HearingPlanOfCareActivitySubstanceAdministrationRouteCodeP' administrationUnitCode.codeSystem='2.16.840.1.113883.3.26.1.1' administrationUnitCode.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode='HearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP' constraints.validation.warning='HearingPlanOfCareActivitySubstanceAdministrationEffectiveTime HearingPlanOfCareActivitySubstanceAdministrationDoseQuantity' approachSiteCode.codeSystem='2.16.840.1.113883.6.96' approachSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode='HearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationConsumable constraints.validation.error='HearingPlanOfCareActivitySubstanceAdministrationConsumableManufacturedProduct'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationParticipant2 typeCode='CSM' constraints.validation.error='HearingPlanOfCareActivitySubstanceAdministrationParticipant2TypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication typeCode='RSON' constraints.validation.error='HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndicationTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions inversionInd='true' typeCode='SUBJ' constraints.validation.error='HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructionsTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply typeCode='REFR' constraints.validation.error='HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupplyTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense typeCode='REFR' constraints.validation.error='HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispenseTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction typeCode='CAUS' constraints.validation.error='HearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReactionTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/hpocHearingPlanOfCareActivitySubstanceAdministrationPrecondition typeCode='PRCN'"
 * @generated
 */
public interface HearingPlanOfCareActivitySubstanceAdministration extends PlanOfCareActivitySubstanceAdministration
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'IHE-TSC-7.3.1.1.2.5.8.001\' or value.code = \'IHE-TSC-7.3.1.1.2.5.8.002\' or value.code = \'IHE-TSC-7.3.1.1.2.5.8.003\' or value.code = \'IHE-TSC-7.3.1.1.2.5.8.004\'))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and not value.code.oclIsUndefined())'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and (value.code = \'C42887\' or value.code = \'C42888\' or value.code = \'C42960\' or value.code = \'C42971\' or value.code = \'C42889\' or value.code = \'C42892\' or value.code = \'C42890\' or value.code = \'C43451\' or value.code = \'C42891\' or value.code = \'C25158\' or value.code = \'C42895\' or value.code = \'C42896\' or value.code = \'C42917\' or value.code = \'C42902\' or value.code = \'C42904\' or value.code = \'C42916\' or value.code = \'C42928\' or value.code = \'C42936\' or value.code = \'C42954\' or value.code = \'C45414\' or value.code = \'C42678\' or value.code = \'C60884\' or value.code = \'C60891\' or value.code = \'C42900\' or value.code = \'C42919\' or value.code = \'C28944\' or value.code = \'C60897\' or value.code = \'C42901\' or value.code = \'C45415\' or value.code = \'C47890\' or value.code = \'C43525\' or value.code = \'C42679\' or value.code = \'C42763\' or value.code = \'C17423\' or value.code = \'C42912\' or value.code = \'C42913\' or value.code = \'C42915\' or value.code = \'C42929\' or value.code = \'C60926\' or value.code = \'C42932\' or value.code = \'C42920\' or value.code = \'C42984\' or value.code = \'C60927\' or value.code = \'C60928\' or value.code = \'C60929\' or value.code = \'C42933\' or value.code = \'C42934\' or value.code = \'C42906\' or value.code = \'C60930\' or value.code = \'C48193\' or value.code = \'C42937\' or value.code = \'C45416\' or value.code = \'C42938\' or value.code = \'C42903\' or value.code = \'C42909\' or value.code = \'C42939\' or value.code = \'C42940\' or value.code = \'C42921\' or value.code = \'C42941\' or value.code = \'C42894\' or value.code = \'C42978\' or value.code = \'C42942\' or value.code = \'C42944\' or value.code = \'C60931\' or value.code = \'C42946\' or value.code = \'C42914\' or value.code = \'C42950\' or value.code = \'C42974\' or value.code = \'C42976\' or value.code = \'C42977\' or value.code = \'C42959\' or value.code = \'C42957\' or value.code = \'C42958\' or value.code = \'C42956\' or value.code = \'C42945\' or value.code = \'C42899\' or value.code = \'C42995\' or value.code = \'C42926\' or value.code = \'C42951\' or value.code = \'C42988\' or value.code = \'C60933\' or value.code = \'C42922\' or value.code = \'C47915\' or value.code = \'C42947\' or value.code = \'C42948\' or value.code = \'C47916\' or value.code = \'C45413\' or value.code = \'C42949\' or value.code = \'C42952\' or value.code = \'C42953\' or value.code = \'C60934\' or value.code = \'C29167\' or value.code = \'C60957\' or value.code = \'C60958\' or value.code = \'C42955\' or value.code = \'C29269\' or value.code = \'C42965\' or value.code = \'C42966\' or value.code = \'C60984\' or value.code = \'C47887\' or value.code = \'C42967\' or value.code = \'C42907\' or value.code = \'C60985\' or value.code = \'C42968\' or value.code = \'C42923\' or value.code = \'C42911\' or value.code = \'C42969\' or value.code = \'C42943\' or value.code = \'C42918\' or value.code = \'C25394\' or value.code = \'C42970\' or value.code = \'C47913\' or value.code = \'C42972\' or value.code = \'C42908\' or value.code = \'C42973\' or value.code = \'C42975\' or value.code = \'C42961\' or value.code = \'C60988\' or value.code = \'C42979\' or value.code = \'C42980\' or value.code = \'C42981\' or value.code = \'C42982\' or value.code = \'C42983\' or value.code = \'C42986\' or value.code = \'C42898\' or value.code = \'C42987\' or value.code = \'C60994\' or value.code = \'C42935\' or value.code = \'C60992\' or value.code = \'C47912\' or value.code = \'C42989\' or value.code = \'C42962\' or value.code = \'C42990\' or value.code = \'C42991\' or value.code = \'C47914\' or value.code = \'C42993\' or value.code = \'C42924\' or value.code = \'C42994\' or value.code = \'C42925\' or value.code = \'C60995\' or value.code = \'C47889\' or value.code = \'C47898\' or value.code = \'C42996\' or value.code = \'C42998\' or value.code = \'C42893\' or value.code = \'C42897\' or value.code = \'C60997\' or value.code = \'C42905\' or value.code = \'C42997\' or value.code = \'C42910\' or value.code = \'C42927\' or value.code = \'C42931\' or value.code = \'C42930\' or value.code = \'C61004\' or value.code = \'C61005\' or value.code = \'C42964\' or value.code = \'C42963\' or value.code = \'C42999\' or value.code = \'C61006\' or value.code = \'C42985\' or value.code = \'C42992\' or value.code = \'C47892\' or value.code = \'C47897\' or value.code = \'C43000\' or value.code = \'C43001\' or value.code = \'C43002\' or value.code = \'C43003\'))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationAdministrationUnitCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->forAll(element | element.oclIsTypeOf(datatypes::PIVL_TS)))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationConsumable(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipIndication(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipInstructions(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationSupply(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipMedicationDispense(DiagnosticChain diagnostics, Map<Object, Object> context);

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
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationEntryRelationshipReaction(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(cda::Precondition))'"
   * @generated
   */
  boolean validateHearingPlanOfCareActivitySubstanceAdministrationPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HearingPlanOfCareActivitySubstanceAdministration init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingPlanOfCareActivitySubstanceAdministration init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HearingPlanOfCareActivitySubstanceAdministration
