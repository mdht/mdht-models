/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Participant1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Person Relationshipand Name Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getRelatedPersonRelationshipandNameParticipant()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='RelatedPersonRelationshipandNameParticipantTemplateId RelatedPersonRelationshipandNameParticipantTypeCode RelatedPersonRelationshipandNameParticipantAssociatedEntity RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine RelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent RelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName RelatedPersonRelationshipandNameParticipantAssociatedEntityCode RelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode RelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson' templateId.root='2.16.840.1.113883.10.20.22.5.8' templateId.extension='2023-05-01' constraints.validation.query='RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine RelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent RelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName RelatedPersonRelationshipandNameParticipantAssociatedEntityCode RelatedPersonRelationshipandNameParticipantAssociatedEntityAddr RelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom RelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode RelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson' constraints.validation.warning='RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState RelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode RelatedPersonRelationshipandNameParticipantAssociatedEntityAddr RelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRelatedPersonRelationshipandNameParticipantAssociatedEntity constraints.validation.error='RelatedPersonRelationshipandNameParticipantAssociatedEntityCode RelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode RelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement AssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse AssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity AssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine AssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent AssociatedEntityRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName' constraints.validation.warning='RelatedPersonRelationshipandNameParticipantAssociatedEntityAddr RelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP AssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry AssociatedEntityGeneralHeaderConstraintsUSRealmAddressState AssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.query='AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement AssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP AssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry AssociatedEntityGeneralHeaderConstraintsUSRealmAddressState AssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity AssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode AssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine AssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent AssociatedEntityRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRelatedPersonRelationshipandNameParticipantAssociatedEntityPerson constraints.validation.error='RelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName PersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent' constraints.validation.query='PersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent'"
 * @generated
 */
public interface RelatedPersonRelationshipandNameParticipant extends Participant1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.5.8\' and id.extension = \'2023-05-01\')'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'typeCode\')'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ( streetAddressLine-&gt;size() &gt;=1 and streetAddressLine-&gt;size() &lt;=4))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies state-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (use-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (( not use-&gt;isEmpty())  )))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((country-&gt;isEmpty() or country-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not country-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((state-&gt;isEmpty() or state-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not state-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((city-&gt;isEmpty() or city-&gt;exists(element | element.isNullFlavorUndefined())) implies (city-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((postalCode-&gt;isEmpty() or postalCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not postalCode-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((streetAddressLine-&gt;isEmpty() or streetAddressLine-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).associatedPerson-&gt;excluding(null).name-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject((getText(true)&lt;&gt;\'\' and ( family-&gt;isEmpty() and given-&gt;isEmpty() and suffix-&gt;isEmpty() and prefix-&gt;isEmpty()   )   ) xor (getText(true)=\'\' and (not family-&gt;isEmpty() and not given-&gt;isEmpty()  )))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).associatedPerson-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (not addr-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null)-&gt;reject((telecom-&gt;isEmpty() or telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (not telecom-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null)-&gt;reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null)-&gt;reject(associatedPerson-&gt;one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPersonRelationshipandNameParticipant init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPersonRelationshipandNameParticipant init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // RelatedPersonRelationshipandNameParticipant
