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
 * A representation of the model object '<em><b>Provenance Assembler Participation V2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProvenanceAssemblerParticipationV2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProvenanceAssemblerParticipationV2TemplateId ProvenanceAssemblerParticipationV2FunctionCode ProvenanceAssemblerParticipationV2FunctionCodeP ProvenanceAssemblerParticipationV2Time ProvenanceAssemblerParticipationV2TypeCode ProvenanceAssemblerParticipationV2AssociatedEntity ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName ProvenanceAssemblerParticipationV2AssociatedEntityClassCode ProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization' templateId.root='2.16.840.1.113883.10.20.22.5 .7' templateId.extension='2020-05-19' functionCode.code='assembler' functionCode.codeSystem='2.16.840.1.113883.4.642.4.1131' functionCode.codeSystemName='ProvenanceParticipantType' functionCode.displayName='Assembler' typeCode='DEV' constraints.validation.query='ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr ProvenanceAssemblerParticipationV2AssociatedEntityClassCode ProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization' constraints.validation.warning='ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProvenanceAssemblerParticipationV2AssociatedEntity classCode='OWN' constraints.validation.error='ProvenanceAssemblerParticipationV2AssociatedEntityClassCode ProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine AssociatedEntityProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId AssociatedEntityProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName' constraints.validation.query='AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine AssociatedEntityProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId AssociatedEntityProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName AssociatedEntityProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom AssociatedEntityProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr' constraints.validation.warning='AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode AssociatedEntityProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom AssociatedEntityProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProvenanceAssemblerParticipationV2AssociatedEntityOrganization constraints.validation.error='ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName OrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet OrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement OrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement OrganizationGeneralHeaderConstraintsUSRealmAddressUse OrganizationGeneralHeaderConstraintsUSRealmAddressCity OrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom ProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr OrganizationGeneralHeaderConstraintsUSRealmAddressUseP OrganizationGeneralHeaderConstraintsUSRealmAddressCountry OrganizationGeneralHeaderConstraintsUSRealmAddressState OrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.query='OrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet OrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement OrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement OrganizationGeneralHeaderConstraintsUSRealmAddressUse OrganizationGeneralHeaderConstraintsUSRealmAddressUseP OrganizationGeneralHeaderConstraintsUSRealmAddressCountry OrganizationGeneralHeaderConstraintsUSRealmAddressState OrganizationGeneralHeaderConstraintsUSRealmAddressCity OrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode OrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine'"
 * @generated
 */
public interface ProvenanceAssemblerParticipationV2 extends Participant1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.5 .7\' and id.extension = \'2020-05-19\')'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.functionCode.oclIsUndefined() or self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined() and self.functionCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.functionCode.oclAsType(datatypes::CE) in \nvalue.code = \'assembler\' and value.codeSystem = \'2.16.840.1.113883.4.642.4.1131\')'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2FunctionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.functionCode.oclIsUndefined() or self.functionCode.isNullFlavorUndefined()) implies (not self.functionCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2FunctionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2Time(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProvenanceAssemblerParticipationV2TypeCode(DiagnosticChain diagnostics,
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
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies ( streetAddressLine-&gt;size() &gt;=1 and streetAddressLine-&gt;size() &lt;=4))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies state-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() and country-&gt;exists(c : datatypes::ADXP | c.getText() = \'US\') implies postalCode-&gt;size() &gt;= 1)'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (use-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (( not use-&gt;isEmpty())  )))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((country-&gt;isEmpty() or country-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not country-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((state-&gt;isEmpty() or state-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not state-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((city-&gt;isEmpty() or city-&gt;exists(element | element.isNullFlavorUndefined())) implies (city-&gt;size() =  1) )))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((postalCode-&gt;isEmpty() or postalCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not postalCode-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null).addr-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((streetAddressLine-&gt;isEmpty() or streetAddressLine-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine-&gt;isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null)-&gt;reject((telecom-&gt;isEmpty() or telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (not telecom-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null).scopingOrganization-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (not addr-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(DiagnosticChain diagnostics,
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
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;excluding(null)-&gt;reject(scopingOrganization-&gt;one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAssemblerParticipationV2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAssemblerParticipationV2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProvenanceAssemblerParticipationV2
