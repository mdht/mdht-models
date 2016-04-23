/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.SubstanceAdministration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationActivityTemplateId MedicationActivityTextReferenceValue MedicationActivityEffectiveTimeIVLTSorTS MedicationActivityEffectiveTimeIVLTSLow MedicationActivityEffectiveTimeIVLTSHigh MedicationActivityEffectiveTimeTSValue MedicationActivityEffectiveTimeOperator MedicationActivityDrugVehicleTypeCode MedicationActivityInstructionsInversionInd MedicationActivityRateQuantityUnit MedicationActivityClassCode MedicationActivityMoodCode MedicationActivityId MedicationActivityStatusCode MedicationActivityRouteCode MedicationActivityApproachSiteCode MedicationActivityAdministrationUnitCode MedicationActivityConsumable MedicationActivityConsumableMedicationInformation MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration' templateId.root='2.16.840.1.113883.10.20.22.4.16' constraints.validation.warning='MedicationActivityDoseQuantityorrateQuantity MedicationActivityTextReference MedicationActivityReferenceValue MedicationActivityEffectiveTimePIVLTS MedicationActivityDoseQuantityUnit MedicationActivityDoseQuantity MedicationActivityText' classCode='SBADM' constraints.validation.info='MedicationActivityCode MedicationActivityRouteCodeP MedicationActivityApproachSiteCodeP MedicationActivityRateQuantity MedicationActivityMaxDoseQuantity MedicationActivityAdministrationUnitCodeP MedicationActivityRepeatNumber MedicationActivityMedicationSupplyOrder MedicationActivityReactionObservation MedicationActivityPerformer MedicationActivityInstructions MedicationActivityIndication MedicationActivityMedicationDispense MedicationActivityDrugVehicle MedicationActivityPrecondition' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1' routeCode.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.MedicationActivityRouteCode='MedicationActivityRouteCodeP' approachSiteCode.codeSystem='2.16.840.1.113883.6.96' approachSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.MedicationActivityApproachSiteCode='MedicationActivityApproachSiteCodeP' administrationUnitCode.codeSystem='2.16.840.1.113883.3.26.1.1' administrationUnitCode.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.MedicationActivityAdministrationUnitCode='MedicationActivityAdministrationUnitCodeP' constraints.validation.query='MedicationActivityConsumableMedicationInformation MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivityConsumable constraints.validation.error='MedicationActivityConsumableMedicationInformation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationActivityPrecondition typeCode='PRCN' constraints.validation.error='MedicationActivityPreconditionTypeCode MedicationActivityPreconditionPreconditionForSubstanceAdministration'"
 * @generated
 */
public interface MedicationActivity extends SubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.doseQuantity->size() = 1 or self.rateQuantity->size() = 1'"
	 * @generated
	 */
	boolean validateMedicationActivityDoseQuantityorrateQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined() implies self.text->forAll(reference->size() = 1)'"
	 * @generated
	 */
	boolean validateMedicationActivityTextReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.text->forAll(reference->size() = 1) implies self.text->forAll(reference->one(value->size() = 1))'"
	 * @generated
	 */
	boolean validateMedicationActivityReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationActivityTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->size() = 1 xor self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::SXCM_TS))->size() = 1'"
	 * @generated
	 */
	boolean validateMedicationActivityEffectiveTimeIVLTSorTS(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).low->size() = 1)'"
	 * @generated
	 */
	boolean validateMedicationActivityEffectiveTimeIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::IVL_TS))->forAll( eff | eff.oclAsType(datatypes::IVL_TS).high->size() = 1)'"
	 * @generated
	 */
	boolean validateMedicationActivityEffectiveTimeIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes:: SXCM_TS))->forAll( eff | eff.oclAsType(datatypes:: SXCM_TS).value->size() = 1 or eff.oclAsType(datatypes:: SXCM_TS).isNullFlavorDefined())'"
	 * @generated
	 */
	boolean validateMedicationActivityEffectiveTimeTSValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::PIVL_TS) or ef.oclIsTypeOf(datatypes::EIVL_TS))->size() = 1'"
	 * @generated
	 */
	boolean validateMedicationActivityEffectiveTimePIVLTS(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->select(ef | ef.oclIsTypeOf(datatypes::PIVL_TS) or ef.oclIsTypeOf(datatypes::EIVL_TS))->forAll(eff | eff.operator = vocab::SetOperator::A and eff.operator->size() = 1)'"
	 * @generated
	 */
	boolean validateMedicationActivityEffectiveTimeOperator(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.doseQuantity.oclIsUndefined() implies not self.doseQuantity.unit.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMedicationActivityDoseQuantityUnit(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(par : cda::Participant2 | par.participantRole.oclIsKindOf(consol::DrugVehicle))->forAll(p : cda::Participant2 | p.typeCode=vocab::ParticipationType::CSM)'"
	 * @generated
	 */
	boolean validateMedicationActivityDrugVehicleTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.act.oclIsTypeOf(consol::Instructions))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateMedicationActivityInstructionsInversionInd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.rateQuantity.oclIsUndefined() implies self.rateQuantity.oclAsType(datatypes::PQ).unit->size() = 1'"
	 * @generated
	 */
	boolean validateMedicationActivityRateQuantityUnit(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.16\')'"
	 * @generated
	 */
	boolean validateMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and \r\nlet value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in \r\nvalue = vocab::x_DocumentSubstanceMood::EVN or value = vocab::x_DocumentSubstanceMood::INT'"
	 * @generated
	 */
	boolean validateMedicationActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validateMedicationActivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and (value.code = \'C38192\' or value.code = \'C38193\' or value.code = \'C38194\' or value.code = \'C38675\' or value.code = \'C38197\' or value.code = \'C38633\' or value.code = \'C38205\' or value.code = \'C38206\' or value.code = \'C38208\' or value.code = \'C38209\' or value.code = \'C38210\' or value.code = \'C38211\' or value.code = \'C38212\' or value.code = \'C38200\' or value.code = \'C38215\' or value.code = \'C38219\' or value.code = \'C38220\' or value.code = \'C38221\' or value.code = \'C38222\' or value.code = \'C38223\' or value.code = \'C38224\' or value.code = \'C38225\' or value.code = \'C38226\' or value.code = \'C38227\' or value.code = \'C38228\' or value.code = \'C38229\' or value.code = \'C38230\' or value.code = \'C38231\' or value.code = \'C38232\' or value.code = \'C38233\' or value.code = \'C38234\' or value.code = \'C38217\' or value.code = \'C38218\' or value.code = \'C38235\' or value.code = \'C38238\' or value.code = \'C38239\' or value.code = \'C38240\' or value.code = \'C38241\' or value.code = \'C38242\' or value.code = \'C38243\' or value.code = \'C38245\' or value.code = \'C38246\' or value.code = \'C38247\' or value.code = \'C38249\' or value.code = \'C38250\' or value.code = \'C38251\' or value.code = \'C38252\' or value.code = \'C38253\' or value.code = \'C38254\' or value.code = \'C28161\' or value.code = \'C38255\' or value.code = \'C38256\' or value.code = \'C38257\' or value.code = \'C38258\' or value.code = \'C38259\' or value.code = \'C38260\' or value.code = \'C38261\' or value.code = \'C38262\' or value.code = \'C38263\' or value.code = \'C38264\' or value.code = \'C38265\' or value.code = \'C38266\' or value.code = \'C38267\' or value.code = \'C38207\' or value.code = \'C38268\' or value.code = \'C38269\' or value.code = \'C38270\' or value.code = \'C38272\' or value.code = \'C38273\' or value.code = \'C38276\' or value.code = \'C38277\' or value.code = \'C38278\' or value.code = \'C38280\' or value.code = \'C38203\' or value.code = \'C38281\' or value.code = \'C38282\' or value.code = \'C38284\' or value.code = \'C38285\' or value.code = \'C48623\' or value.code = \'C38286\' or value.code = \'C38287\' or value.code = \'C38288\' or value.code = \'C38289\' or value.code = \'C38291\' or value.code = \'C38676\' or value.code = \'C38292\' or value.code = \'C38677\' or value.code = \'C38293\' or value.code = \'C38294\' or value.code = \'C38295\' or value.code = \'C38216\' or value.code = \'C38296\' or value.code = \'C38198\' or value.code = \'C38297\' or value.code = \'C38298\' or value.code = \'C38299\' or value.code = \'C38300\' or value.code = \'C38301\' or value.code = \'C38304\' or value.code = \'C38305\' or value.code = \'C38283\' or value.code = \'C38307\' or value.code = \'C38308\' or value.code = \'C38309\' or value.code = \'C38312\' or value.code = \'C38271\'))'"
	 * @generated
	 */
	boolean validateMedicationActivityRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityRateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityAdministrationUnitCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityAdministrationUnitCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateMedicationActivityMedicationSupplyOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)'"
	 * @generated
	 */
	boolean validateMedicationActivityReactionObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateMedicationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)'"
	 * @generated
	 */
	boolean validateMedicationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationDispense) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateMedicationActivityMedicationDispense(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant2 | not participant.participantRole.oclIsUndefined() and participant.participantRole.oclIsKindOf(consol::DrugVehicle))'"
	 * @generated
	 */
	boolean validateMedicationActivityDrugVehicle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityConsumable(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationActivityPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(consol::MedicationInformation)))'"
	 * @generated
	 */
	boolean validateMedicationActivityConsumableMedicationInformation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.precondition->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipType::PRCN)'"
	 * @generated
	 */
	boolean validateMedicationActivityPreconditionTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.precondition->excluding(null)->reject(criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(consol::PreconditionForSubstanceAdministration)))'"
	 * @generated
	 */
	boolean validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder))->asSequence()->any(true).oclAsType(consol::MedicationSupplyOrder)'"
	 * @generated
	 */
	MedicationSupplyOrder getMedicationSupplyOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation))->asSequence()->any(true).oclAsType(consol::ReactionObservation)'"
	 * @generated
	 */
	ReactionObservation getReactionObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->any(true).oclAsType(consol::Instructions)'"
	 * @generated
	 */
	Instructions getInstructions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)'"
	 * @generated
	 */
	EList<Indication> getIndications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationDispense)).oclAsType(consol::MedicationDispense)'"
	 * @generated
	 */
	EList<MedicationDispense> getMedicationDispenses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(consol::DrugVehicle)).oclAsType(consol::DrugVehicle)'"
	 * @generated
	 */
	EList<DrugVehicle> getDrugVehicles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationActivity
