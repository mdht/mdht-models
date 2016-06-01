/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Medication Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPlannedMedicationActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PlanOfCareActivitySubstanceAdministrationTemplateId PlanOfCareActivitySubstanceAdministrationMoodCode PlannedMedicationActivity2StatusCode PlannedMedicationActivity2StatusCodeP PlannedMedicationActivity2EffectiveTime PlannedMedicationActivity2RouteCode PlannedMedicationActivity2ApproachSiteCode PlannedMedicationActivity2AdministrationUnitCode PlannedMedicationActivity2Consumable PlannedMedicationActivity2ConsumableMedicationInformation2 PlannedMedicationActivity2PreconditionTypeCode PlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2' templateId.root='2.16.840.1.113883.10.20.22.4.42' templateId.extension='2014-06-09' statusCode.code='active' constraints.validation.info='PlannedMedicationActivity2RepeatNumber PlannedMedicationActivity2RouteCodeP PlannedMedicationActivity2ApproachSiteCodeP PlannedMedicationActivity2DoseQuantity PlannedMedicationActivity2RateQuantity PlannedMedicationActivity2MaxDoseQuantity PlannedMedicationActivity2AdministrationUnitCodeP PlannedMedicationActivity2Performer PlannedMedicationActivity2PriorityPreference PlannedMedicationActivity2Indication2 PlannedMedicationActivity2Instruction2 PlannedMedicationActivity2Precondition' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1' routeCode.codeSystemName='NCI Thesaurus' constraints.validation.dependOn.PlannedMedicationActivity2RouteCode='PlannedMedicationActivity2RouteCodeP' approachSiteCode.codeSystem='2.16.840.1.113883.6.96' approachSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.PlannedMedicationActivity2ApproachSiteCode='PlannedMedicationActivity2ApproachSiteCodeP' administrationUnitCode.codeSystem='2.16.840.1.113883.5.85' administrationUnitCode.codeSystemName='orderableDrugForm' constraints.validation.dependOn.PlannedMedicationActivity2AdministrationUnitCode='PlannedMedicationActivity2AdministrationUnitCodeP' constraints.validation.warning='PlannedMedicationActivity2AuthorParticipation PlannedMedicationActivity2IVLPQdoseQuantityUnit PlannedMedicationActivity2IVLPQrateQuantityUnit' constraints.validation.query='PlannedMedicationActivity2IVLPQdoseQuantityUnit PlannedMedicationActivity2IVLPQrateQuantityUnit PlannedMedicationActivity2ConsumableMedicationInformation2 PlannedMedicationActivity2PreconditionTypeCode PlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedMedicationActivity2IVLPQdoseQuantity unit='1' constraints.validation.warning='PlannedMedicationActivity2IVLPQdoseQuantityUnit'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedMedicationActivity2IVLPQrateQuantity unit='1' constraints.validation.warning='PlannedMedicationActivity2IVLPQrateQuantityUnit'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedMedicationActivity2Consumable constraints.validation.error='PlannedMedicationActivity2ConsumableMedicationInformation2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPlannedMedicationActivity2Precondition typeCode='PRCN' constraints.validation.error='PlannedMedicationActivity2PreconditionTypeCode PlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2'"
 * @generated
 */
public interface PlannedMedicationActivity2 extends PlanOfCareActivitySubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'active\')'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() =  1)'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2RepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2RouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and (value.code = \'C38192\' or value.code = \'C38193\' or value.code = \'C38194\' or value.code = \'C38675\' or value.code = \'C38197\' or value.code = \'C38633\' or value.code = \'C38205\' or value.code = \'C38206\' or value.code = \'C38208\' or value.code = \'C38209\' or value.code = \'C38210\' or value.code = \'C38211\' or value.code = \'C38212\' or value.code = \'C38200\' or value.code = \'C38215\' or value.code = \'C38219\' or value.code = \'C38220\' or value.code = \'C38221\' or value.code = \'C38222\' or value.code = \'C38223\' or value.code = \'C38224\' or value.code = \'C38225\' or value.code = \'C38226\' or value.code = \'C38227\' or value.code = \'C38228\' or value.code = \'C38229\' or value.code = \'C38230\' or value.code = \'C38231\' or value.code = \'C38232\' or value.code = \'C38233\' or value.code = \'C38234\' or value.code = \'C38217\' or value.code = \'C38218\' or value.code = \'C38235\' or value.code = \'C38238\' or value.code = \'C38239\' or value.code = \'C38240\' or value.code = \'C38241\' or value.code = \'C38242\' or value.code = \'C38243\' or value.code = \'C38245\' or value.code = \'C38246\' or value.code = \'C38247\' or value.code = \'C38249\' or value.code = \'C38250\' or value.code = \'C38251\' or value.code = \'C38252\' or value.code = \'C38253\' or value.code = \'C38254\' or value.code = \'C28161\' or value.code = \'C38255\' or value.code = \'C38256\' or value.code = \'C38257\' or value.code = \'C38258\' or value.code = \'C38259\' or value.code = \'C38260\' or value.code = \'C38261\' or value.code = \'C38262\' or value.code = \'C38263\' or value.code = \'C38264\' or value.code = \'C38265\' or value.code = \'C38266\' or value.code = \'C38267\' or value.code = \'C38207\' or value.code = \'C38268\' or value.code = \'C38269\' or value.code = \'C38270\' or value.code = \'C38272\' or value.code = \'C38273\' or value.code = \'C38276\' or value.code = \'C38277\' or value.code = \'C38278\' or value.code = \'C38280\' or value.code = \'C38203\' or value.code = \'C38281\' or value.code = \'C38282\' or value.code = \'C38284\' or value.code = \'C38285\' or value.code = \'C48623\' or value.code = \'C38286\' or value.code = \'C38287\' or value.code = \'C38288\' or value.code = \'C38289\' or value.code = \'C38291\' or value.code = \'C38676\' or value.code = \'C38292\' or value.code = \'C38677\' or value.code = \'C38293\' or value.code = \'C38294\' or value.code = \'C38295\' or value.code = \'C38216\' or value.code = \'C38296\' or value.code = \'C38198\' or value.code = \'C38297\' or value.code = \'C38298\' or value.code = \'C38299\' or value.code = \'C38300\' or value.code = \'C38301\' or value.code = \'C38304\' or value.code = \'C38305\' or value.code = \'C38283\' or value.code = \'C38307\' or value.code = \'C38308\' or value.code = \'C38309\' or value.code = \'C38312\' or value.code = \'C38271\'))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2RouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2ApproachSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2ApproachSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2DoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2RateQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2MaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2AdministrationUnitCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.85\' and (value.code = \'APPFUL\' or value.code = \'DROP\' or value.code = \'NDROP\' or value.code = \'OPDROP\' or value.code = \'ORDROP\' or value.code = \'OTDROP\' or value.code = \'PUFF\' or value.code = \'SCOOP\' or value.code = \'SPRY\'))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2AdministrationUnitCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2Performer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2PriorityPreference(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2Indication2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2Instruction2(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2Consumable(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePlannedMedicationActivity2Precondition(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.doseQuantity->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not unit.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.doseQuantity->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not unit.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2IVLPQrateQuantityUnit(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(consol::MedicationInformation2)))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2ConsumableMedicationInformation2(DiagnosticChain diagnostics,
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
	boolean validatePlannedMedicationActivity2PreconditionTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.precondition->excluding(null)->reject(criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(consol::PreconditionForSubstanceAdministration2)))'"
	 * @generated
	 */
	boolean validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)'"
	 * @generated
	 */
	EList<PriorityPreference> getPriorityPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)'"
	 * @generated
	 */
	EList<Indication2> getIndication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)'"
	 * @generated
	 */
	EList<Instruction2> getInstruction2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedMedicationActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedMedicationActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlannedMedicationActivity2
