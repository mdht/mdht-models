/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Supply;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationDispense()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationDispenseTemplateId MedicationDispenseClassCode MedicationDispenseId MedicationDispenseMoodCode MedicationDispenseStatusCode MedicationDispenseProduct MedicationDispenseProductContainsMedicationOrImmunization MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreet MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCity MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreetAddressLine MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUse MedicationDispensePerformerMedicationDispenseAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.18' classCode='SPLY' constraints.validation.warning='MedicationDispenseEffectiveTime MedicationDispenseRepeatNumber MedicationDispenseQuantity MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCountry MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressPostalCode MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressState MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUseP MedicationDispensePerformerMedicationDispenseAssignedEntityAddr' moodCode='EVN' constraints.validation.info='MedicationDispenseMedicationSupplyOrder MedicationDispensePerformer' constraints.validation.query='MedicationDispenseProductContainsMedicationOrImmunization MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreet MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCity MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCountry MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressPostalCode MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressState MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreetAddressLine MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUseP MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUse MedicationDispensePerformerMedicationDispenseAssignedEntityAddr MedicationDispensePerformerMedicationDispenseAssignedEntity' constraints.validation.dependOn.MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUse='MedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationDispenseProduct constraints.validation.error='ProductContainsMedicationOrImmunization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationDispensePerformer constraints.validation.error='PerformerMedicationDispenseAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationDispensePerformerMedicationDispenseAssignedEntity constraints.validation.warning='MedicationDispenseAssignedEntityAddr MedicationDispenseAssignedEntityUSRealmAddressCountry MedicationDispenseAssignedEntityUSRealmAddressPostalCode MedicationDispenseAssignedEntityUSRealmAddressState MedicationDispenseAssignedEntityUSRealmAddressUseP' constraints.validation.error='MedicationDispenseAssignedEntityUSRealmAddressStreet MedicationDispenseAssignedEntityUSRealmAddressCity MedicationDispenseAssignedEntityUSRealmAddressStreetAddressLine MedicationDispenseAssignedEntityUSRealmAddressUse' constraints.validation.query='MedicationDispenseAssignedEntityUSRealmAddressStreet MedicationDispenseAssignedEntityUSRealmAddressCity MedicationDispenseAssignedEntityUSRealmAddressCountry MedicationDispenseAssignedEntityUSRealmAddressPostalCode MedicationDispenseAssignedEntityUSRealmAddressState MedicationDispenseAssignedEntityUSRealmAddressStreetAddressLine MedicationDispenseAssignedEntityUSRealmAddressUseP MedicationDispenseAssignedEntityUSRealmAddressUse' constraints.validation.dependOn.MedicationDispenseAssignedEntityUSRealmAddressUse='MedicationDispenseAssignedEntityUSRealmAddressUseP'"
 * @generated
 */
public interface MedicationDispense extends Supply {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.18\')'"
	 * @generated
	 */
	boolean validateMedicationDispenseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassSupply::SPLY'"
	 * @generated
	 */
	boolean validateMedicationDispenseClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationDispenseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationDispenseId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationDispenseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateMedicationDispenseRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'aborted\' or value.code = \'completed\')'"
	 * @generated
	 */
	boolean validateMedicationDispenseStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.quantity.oclIsUndefined() or self.quantity.isNullFlavorUndefined()) implies (not self.quantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMedicationDispenseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.product->one(product : cda::Product | not product.oclIsUndefined() and product.oclIsKindOf(cda::Product))'"
	 * @generated
	 */
	boolean validateMedicationDispenseProduct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.product->excluding(null)->reject(manufacturedProduct.oclIsTypeOf(consol::MedicationInformation) xor manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation))'"
	 * @generated
	 */
	boolean validateMedicationDispenseProductContainsMedicationOrImmunization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->reject(streetAddressLine->size() >=1 and streetAddressLine->size() <=4)'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->reject((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->reject((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->reject((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->reject((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->reject((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->reject(not use->isEmpty())'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->reject(use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateMedicationDispenseMedicationSupplyOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @generated
	 */
	public MedicationDispense init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MedicationDispense
