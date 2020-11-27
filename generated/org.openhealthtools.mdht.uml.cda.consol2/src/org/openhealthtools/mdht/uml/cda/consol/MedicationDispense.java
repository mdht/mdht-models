/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Supply;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMedicationDispense()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MedicationDispenseTemplateId MedicationDispenseContainsMedicationOrImmunization MedicationDispenseClassCode MedicationDispenseId MedicationDispenseMoodCode MedicationDispenseStatusCode MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine MedicationDispensePerformerMedicationDispenseAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.18' classCode='SPLY' constraints.validation.warning='MedicationDispenseEffectiveTime MedicationDispenseRepeatNumber MedicationDispenseQuantity MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode MedicationDispensePerformerMedicationDispenseAssignedEntityAddr' moodCode='EVN' constraints.validation.info='MedicationDispenseMedicationSupplyOrder MedicationDispensePerformer' constraints.validation.query='MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode MedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine MedicationDispensePerformerMedicationDispenseAssignedEntityAddr MedicationDispensePerformerMedicationDispenseAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationDispensePerformer constraints.validation.error='MedicationDispensePerformerMedicationDispenseAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMedicationDispensePerformerMedicationDispenseAssignedEntity constraints.validation.warning='MedicationDispensePerformerMedicationDispenseAssignedEntityAddr MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.error='MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.query='MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode MedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.product.manufacturedProduct.oclIsTypeOf(consol::MedicationInformation) xor self.product.manufacturedProduct.oclIsTypeOf(consol::ImmunizationMedicationInformation)'"
	 * @generated
	 */
	boolean validateMedicationDispenseContainsMedicationOrImmunization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.18\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime-&gt;isEmpty() or self.effectiveTime-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.effectiveTime-&gt;isEmpty()) )'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.id-&gt;isEmpty()) )'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'aborted\' or value.code = \'completed\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.supply.oclIsUndefined() and entryRelationship.supply.oclIsKindOf(consol::MedicationSupplyOrder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateMedicationDispenseMedicationSupplyOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ( streetAddressLine-&gt;size() &gt;=1 and streetAddressLine-&gt;size() &lt;=4))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies state-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (use-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (( not use-&gt;isEmpty())  )))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((country-&gt;isEmpty() or country-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not country-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((state-&gt;isEmpty() or state-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not state-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((city-&gt;isEmpty() or city-&gt;exists(element | element.isNullFlavorUndefined())) implies (city-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((postalCode-&gt;isEmpty() or postalCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not postalCode-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((streetAddressLine-&gt;isEmpty() or streetAddressLine-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not addr-&gt;isEmpty()) ))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer-&gt;excluding(null)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateMedicationDispensePerformerMedicationDispenseAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()-&gt;select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationSupplyOrder))-&gt;asSequence()-&gt;any(true).oclAsType(consol::MedicationSupplyOrder)'"
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
