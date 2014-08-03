/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referral Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getReferralNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId ReferralNoteCode ReferralNoteCodeP ReferralNoteTitle ReferralNoteInformationRecipient ReferralNoteChiefComplaintAndReasonForVisitSection ReferralNoteInformationRecipientIntendedRecipientPersonPNFamily ReferralNoteInformationRecipientIntendedRecipientPersonPNGiven ReferralNoteInformationRecipientIntendedRecipientPersonName ReferralNoteInformationRecipientIntendedRecipientInformationRecipient ReferralNoteInformationRecipientIntendedRecipient ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson ReferralNoteParticipantCaregiverNullFlavor ReferralNoteParticipantCaregiverAssociatedEntity ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity' templateId.root='2.16.840.1.113883.10.20.22.1.14' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.ReferralNoteCode='ReferralNoteCodeP' constraints.validation.warning='ReferralNoteParticipantCaregiver ReferralNoteParticipantCallbackContact ReferralNoteInformationRecipientIntendedRecipientAddr ReferralNoteParticipantCallbackContactAssociatedEntityAddr' constraints.validation.info='ReferralNoteChiefComplaintSection ReferralNoteInformationRecipientIntendedRecipientTelecom ReferralNoteInformationRecipientIntendedRecipientReceivedOrganization ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization' constraints.validation.query='ReferralNoteInformationRecipientIntendedRecipientPersonPNFamily ReferralNoteInformationRecipientIntendedRecipientPersonPNGiven ReferralNoteInformationRecipientIntendedRecipientPersonName ReferralNoteInformationRecipientIntendedRecipientAddr ReferralNoteInformationRecipientIntendedRecipientTelecom ReferralNoteInformationRecipientIntendedRecipientReceivedOrganization ReferralNoteInformationRecipientIntendedRecipientInformationRecipient ReferralNoteInformationRecipientIntendedRecipient ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson ReferralNoteParticipantCaregiverNullFlavor ReferralNoteParticipantCaregiverAssociatedEntity ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityAddr ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity' constraints.validation.dependOn.ReferralNoteParticipantCaregiverAssociatedEntityClassCode='ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipient constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipientIntendedRecipient constraints.validation.warning='ReferralNoteInformationRecipientIntendedRecipientAddr' constraints.validation.info='ReferralNoteInformationRecipientIntendedRecipientTelecom ReferralNoteInformationRecipientIntendedRecipientReceivedOrganization' constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipientInformationRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipientIntendedRecipientPerson constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipientPersonName ReferralNoteInformationRecipientIntendedRecipientPersonPNFamily ReferralNoteInformationRecipientIntendedRecipientPersonPNGiven' constraints.validation.query='ReferralNoteInformationRecipientIntendedRecipientPersonPNFamily ReferralNoteInformationRecipientIntendedRecipientPersonPNGiven'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteInformationRecipientIntendedRecipientPersonPN constraints.validation.error='ReferralNoteInformationRecipientIntendedRecipientPersonPNFamily ReferralNoteInformationRecipientIntendedRecipientPersonPNGiven'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiver constraints.validation.error='ReferralNoteParticipantCaregiverNullFlavor ReferralNoteParticipantCaregiverAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiverAssociatedEntity constraints.validation.error='ReferralNoteParticipantCaregiverAssociatedEntityClassCode ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson' constraints.validation.dependOn.ReferralNoteParticipantCaregiverAssociatedEntityClassCode='ReferralNoteParticipantCaregiverAssociatedEntityClassCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson constraints.validation.error='ReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContact typeCode='CALLBCK' constraints.validation.error='ReferralNoteParticipantCallbackContactTypeCode ReferralNoteParticipantCallbackContactAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContactAssociatedEntity constraints.validation.error='ReferralNoteParticipantCallbackContactAssociatedEntityId ReferralNoteParticipantCallbackContactAssociatedEntityTelecom ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson' constraints.validation.warning='ReferralNoteParticipantCallbackContactAssociatedEntityAddr' constraints.validation.info='ReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson constraints.validation.info='ReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName'"
 * @generated
 */
public interface ReferralNote extends USRealmHeader2 {
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
	boolean validateReferralNoteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReferralNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReferralNoteTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->one(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiver(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContact(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))'"
	 * @generated
	 */
	boolean validateReferralNoteChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))'"
	 * @generated
	 */
	boolean validateReferralNoteChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((family->isEmpty() or family->exists(element | element.isNullFlavorUndefined())) implies (family->size() = 1) )))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientPersonPNFamily(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((given->isEmpty() or given->exists(element | element.isNullFlavorUndefined())) implies (given->size() = 1) )))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientPersonPNGiven(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientReceivedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))'"
	 * @generated
	 */
	boolean validateReferralNoteInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and \nlet value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in \nvalue = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(isDefined(\'nullFlavor\'))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCaregiverAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(scopingOrganization->one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::CALLBCK)'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateReferralNoteParticipantCallbackContactAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)).oclAsType(consol::ChiefComplaintSection)'"
	 * @generated
	 */
	EList<ChiefComplaintSection> getChiefComplaintSections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)'"
	 * @generated
	 */
	ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralNote init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralNote init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ReferralNote
