/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Organizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injury</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getInjury()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='InjuryTemplateId InjuryClassCode InjuryMoodCode InjuryCode InjuryCodeP InjuryStatusCode InjuryComponentInjuryInformation InjuryComponentWorkAssociation InjuryComponentTransportationAssociation InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentInjuryInformationTypeCode InjuryComponentInjuryInformationInjuryInformation InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationValue InjuryComponentWorkAssociationTypeCode InjuryComponentWorkAssociationWorkAssociation InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationValue InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationAssociationTransportationAssociation InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTransportationRelationshipValueP InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship' templateId.root='2.16.840.1.113883.10.20.26.1.9' classCode='CLUSTER' moodCode='EVN' code.code='71481-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Did the death of this person involve injury of any kind?' constraints.validation.info='InjuryComponentTransportationRelationship' constraints.validation.query='InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentInjuryInformationTypeCode InjuryComponentInjuryInformationInjuryInformation InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationValue InjuryComponentWorkAssociationTypeCode InjuryComponentWorkAssociationWorkAssociation InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationValue InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationAssociationTransportationAssociation InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTransportationRelationshipValueP InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship' constraints.validation.dependOn.InjuryComponentInjuryInformationInjuryInformationCode='InjuryComponentInjuryInformationInjuryInformationCodeP' constraints.validation.dependOn.InjuryComponentWorkAssociationWorkAssociationCode='InjuryComponentWorkAssociationWorkAssociationCodeP' constraints.validation.dependOn.InjuryComponentTransportationAssociationTransportationAssociationCode='InjuryComponentTransportationAssociationTransportationAssociationCodeP' constraints.validation.dependOn.InjuryComponentTransportationRelationshipTransportationRelationshipCode='InjuryComponentTransportationRelationshipTransportationRelationshipCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformation typeCode='COMP' constraints.validation.error='InjuryComponentInjuryInformationTypeCode InjuryComponentInjuryInformationInjuryInformation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformation classCode='OBS' constraints.validation.error='InjuryComponentInjuryInformationInjuryInformationClassCode InjuryComponentInjuryInformationInjuryInformationMoodCode InjuryComponentInjuryInformationInjuryInformationCode InjuryComponentInjuryInformationInjuryInformationCodeP InjuryComponentInjuryInformationInjuryInformationText InjuryComponentInjuryInformationInjuryInformationEffectiveTime InjuryComponentInjuryInformationInjuryInformationValue InjuryComponentInjuryInformationInjuryInformationLocationParticipation InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole' moodCode='EVN' code.code='11374-6' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury incident description' constraints.validation.dependOn.InjuryComponentInjuryInformationInjuryInformationCode='InjuryComponentInjuryInformationInjuryInformationCodeP' constraints.validation.query='InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipation typeCode='LOC' constraints.validation.error='InjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury' constraints.validation.query='InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole constraints.validation.error='InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc' classCode='ISDLOC' constraints.validation.query='InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury classCode='PLC' constraints.validation.error='InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode InjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc' determinerCode='INSTANCE'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociation typeCode='COMP' constraints.validation.error='InjuryComponentWorkAssociationTypeCode InjuryComponentWorkAssociationWorkAssociation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentWorkAssociationWorkAssociation classCode='OBS' constraints.validation.error='InjuryComponentWorkAssociationWorkAssociationClassCode InjuryComponentWorkAssociationWorkAssociationMoodCode InjuryComponentWorkAssociationWorkAssociationCode InjuryComponentWorkAssociationWorkAssociationCodeP InjuryComponentWorkAssociationWorkAssociationValue' moodCode='EVN' code.code='69444-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Did death result from injury at work' constraints.validation.dependOn.InjuryComponentWorkAssociationWorkAssociationCode='InjuryComponentWorkAssociationWorkAssociationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociation typeCode='COMP' constraints.validation.error='InjuryComponentTransportationAssociationTypeCode InjuryComponentTransportationAssociationTransportationAssociation InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationValue' constraints.validation.query='InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationValue' constraints.validation.dependOn.InjuryComponentTransportationAssociationTransportationAssociationCode='InjuryComponentTransportationAssociationTransportationAssociationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationAssociationTransportationAssociation classCode='OBS' constraints.validation.error='InjuryComponentTransportationAssociationTransportationAssociationClassCode InjuryComponentTransportationAssociationTransportationAssociationMoodCode InjuryComponentTransportationAssociationTransportationAssociationCode InjuryComponentTransportationAssociationTransportationAssociationCodeP InjuryComponentTransportationAssociationTransportationAssociationValue' moodCode='EVN' code.code='69448-9' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Injury leading to death associated with transportation event' constraints.validation.dependOn.InjuryComponentTransportationAssociationTransportationAssociationCode='InjuryComponentTransportationAssociationTransportationAssociationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationship typeCode='COMP' constraints.validation.error='InjuryComponentTransportationRelationshipTypeCode InjuryComponentTransportationRelationshipTransportationRelationship'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrInjuryComponentTransportationRelationshipTransportationRelationship classCode='OBS' constraints.validation.error='InjuryComponentTransportationRelationshipTransportationRelationshipClassCode InjuryComponentTransportationRelationshipTransportationRelationshipMoodCode InjuryComponentTransportationRelationshipTransportationRelationshipCode InjuryComponentTransportationRelationshipTransportationRelationshipCodeP InjuryComponentTransportationRelationshipTransportationRelationshipValue InjuryComponentTransportationRelationshipTransportationRelationshipValueP' moodCode='EVN' code.code='69451-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Transportation role of decedent' constraints.validation.dependOn.InjuryComponentTransportationRelationshipTransportationRelationshipCode='InjuryComponentTransportationRelationshipTransportationRelationshipCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT'"
 * @generated
 */
public interface Injury extends Organizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1.9\')'"
	 * @generated
	 */
	boolean validateInjuryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER'"
	 * @generated
	 */
	boolean validateInjuryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateInjuryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'71481-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
	 * @generated
	 */
	boolean validateInjuryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateInjuryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateInjuryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateInjuryComponentWorkAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassRoot::PLC)'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject(isDefined(\'determinerCode\'))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null).scopingEntity->excluding(null)->reject((desc.oclIsUndefined() or desc.isNullFlavorUndefined()) implies (not desc.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassRoot::ISDLOC)'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null).participantRole->excluding(null)->reject(scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity)))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null)->reject(typeCode=vocab::ParticipationType::LOC)'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null).participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'11374-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2)))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateInjuryComponentInjuryInformationInjuryInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateInjuryComponentWorkAssociationWorkAssociationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateInjuryComponentWorkAssociationWorkAssociationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateInjuryComponentWorkAssociationWorkAssociationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'69444-8\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateInjuryComponentWorkAssociationWorkAssociationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))'"
	 * @generated
	 */
	boolean validateInjuryComponentWorkAssociationWorkAssociationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
	 * @generated
	 */
	boolean validateInjuryComponentWorkAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateInjuryComponentWorkAssociationWorkAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'69448-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationAssociationTransportationAssociationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::BL))))'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationAssociationTransportationAssociationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationAssociationTransportationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject(not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'69451-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'303980003\' or value.code = \'257500003\' or value.code = \'257518000\'))))'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ActRelationshipHasComponent::COMP)'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validateInjuryComponentTransportationRelationshipTransportationRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Injury init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Injury init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // Injury
