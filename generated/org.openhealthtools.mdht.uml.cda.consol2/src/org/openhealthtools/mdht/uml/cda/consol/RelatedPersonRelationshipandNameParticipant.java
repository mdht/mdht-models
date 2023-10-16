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
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RelatedPersonRelationshipandNameParticipant '"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='RelatedPersonRelationshipandNameParticipant TemplateId RelatedPersonRelationshipandNameParticipant TypeCode RelatedPersonRelationshipandNameParticipant AssociatedEntity' templateId.root='2.16.840.1.113883.10.20.22.5.8' templateId.extension='2023-05-01'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRelatedPersonRelationshipandNameParticipantAssociatedEntity constraints.validation.error='RelatedPersonRelationshipandNameParticipant AssociatedEntityCode RelatedPersonRelationshipandNameParticipant AssociatedEntityClassCode RelatedPersonRelationshipandNameParticipant AssociatedEntityAssociatedPerson AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement AssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse AssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity AssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='RelatedPersonRelationshipandNameParticipant AssociatedEntityAddr RelatedPersonRelationshipandNameParticipant AssociatedEntityTelecom AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP AssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry AssociatedEntityGeneralHeaderConstraintsUSRealmAddressState AssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.query='AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement AssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse AssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP AssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry AssociatedEntityGeneralHeaderConstraintsUSRealmAddressState AssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity AssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode AssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolRelatedPersonRelationshipandNameParticipantAssociatedEntityPerson constraints.validation.error='RelatedPersonRelationshipandNameParticipant AssociatedEntityPersonName PersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent' constraints.validation.query='PersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RelatedPersonRelationshipandNameParticipant TemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.5.8\' and id.extension = \'2023-05-01\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RelatedPersonRelationshipandNameParticipant TypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'typeCode\')'"
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RelatedPersonRelationshipandNameParticipant AssociatedEntity'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.associatedEntity-&gt;one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity))'"
	 * @generated
	 */
	boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
