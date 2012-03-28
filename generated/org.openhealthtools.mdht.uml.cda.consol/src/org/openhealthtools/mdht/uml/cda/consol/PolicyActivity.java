/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation statusCode.code='completed' code.codeSystem='2.16.840.1.113883.6.1' templateId.root='2.16.840.1.113883.10.20.22.4.61' constraints.validation.error='PolicyActivityTemplateId PolicyActivityClassCode PolicyActivityId PolicyActivityMoodCode PolicyActivityStatusCode PolicyActivityAuthorizationActivity PolicyActivityPayer PolicyActivityGuarantor PolicyActivityCoverage PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageTypeCode PolicyActivityCoverageCoverageRole PolicyActivityHolderHolderRoleId PolicyActivityHolderTypeCode PolicyActivityHolderHolderRole' code.codeSystemName='LOINC' constraints.validation.warning='PolicyActivityCode PolicyActivityHolder PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageTime PolicyActivityHolderHolderRoleAddr' classCode='ACT' constraints.validation.query='PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageTypeCode PolicyActivityCoverageTime PolicyActivityCoverageCoverageRole PolicyActivityHolderHolderRoleId PolicyActivityHolderHolderRoleAddr PolicyActivityHolderTypeCode PolicyActivityHolderTime PolicyActivityHolderHolderRole' moodCode='EVN' constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityHolderTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayer constraints.validation.error='PayerTypeCode PayerPayerAssignedEntity PayerPayerAssignedEntityId PayerPayerAssignedEntityCode' constraints.validation.warning='PayerPayerAssignedEntityPayerOrganizationName PayerPayerAssignedEntityPayerOrganization' typeCode='PRF' constraints.validation.query='PayerPayerAssignedEntityPayerOrganizationName PayerPayerAssignedEntityId PayerPayerAssignedEntityCode PayerPayerAssignedEntityAddr PayerPayerAssignedEntityTelecom PayerPayerAssignedEntityPayerOrganization' constraints.validation.info='PayerPayerAssignedEntityAddr PayerPayerAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayerPayerAssignedEntity code.codeSystem='2.16.840.1.113883.5.110' constraints.validation.error='PayerAssignedEntityId PayerAssignedEntityCode' code.codeSystemName='HL7RoleClass' constraints.validation.warning='PayerAssignedEntityPayerOrganization PayerAssignedEntityPayerOrganizationName' constraints.validation.query='PayerAssignedEntityPayerOrganizationName' constraints.validation.info='PayerAssignedEntityAddr PayerAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayerPayerAssignedEntityPayerOrganization constraints.validation.warning='PayerOrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityGuarantor constraints.validation.error='GuarantorGuarantorAssignedEntity' constraints.validation.warning='GuarantorTime GuarantorTypeCode GuarantorGuarantorAssignedEntityPersonNameAndOrOrgName GuarantorGuarantorAssignedEntityCode GuarantorGuarantorAssignedEntityAddr GuarantorGuarantorAssignedEntityTelecom' typeCode='PRF' constraints.validation.query='GuarantorGuarantorAssignedEntityPersonNameAndOrOrgName GuarantorGuarantorAssignedEntityCode GuarantorGuarantorAssignedEntityAddr GuarantorGuarantorAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityGuarantorGuarantorAssignedEntity code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='GuarantorAssignedEntityPersonNameAndOrOrgName GuarantorAssignedEntityCode GuarantorAssignedEntityAddr GuarantorAssignedEntityTelecom' code.code='GUAR'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverage constraints.validation.error='CoverageTypeCode CoverageCoverageRole CoverageCoverageRoleCoveragePlayingEntityName CoverageCoverageRoleId CoverageCoverageRoleCode' constraints.validation.warning='CoverageTime CoverageCoverageRoleAddr CoverageCoverageRoleCoveragePlayingEntity' typeCode='COV' constraints.validation.query='CoverageCoverageRoleCoveragePlayingEntityName CoverageCoverageRoleId CoverageCoverageRoleCode CoverageCoverageRoleAddr CoverageCoverageRoleCoveragePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverageCoverageRole code.codeSystem='2.16.840.1.113883.5.111' constraints.validation.error='CoverageRoleId CoverageRoleCode CoverageRoleCoveragePlayingEntityName' code.codeSystemName='RoleCode' constraints.validation.warning='CoverageRoleAddr CoverageRoleCoveragePlayingEntity' constraints.validation.query='CoverageRoleCoveragePlayingEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverageCoverageRoleCoveragePlayingEntity constraints.validation.error='CoveragePlayingEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityHolder constraints.validation.error='HolderTypeCode HolderHolderRole HolderHolderRoleId' constraints.validation.warning='HolderHolderRoleAddr' typeCode='HLD' constraints.validation.query='HolderHolderRoleId HolderHolderRoleAddr' constraints.validation.info='HolderTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityHolderHolderRole constraints.validation.error='HolderRoleId' constraints.validation.warning='HolderRoleAddr'"
 * @generated
 */
public interface PolicyActivity extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.61')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.61\')'"
	 * @generated
	 */
	boolean validatePolicyActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validatePolicyActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePolicyActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validatePolicyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::EVN'"
	 * @generated
	 */
	boolean validatePolicyActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'completed\')'"
	 * @generated
	 */
	boolean validatePolicyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::AuthorizationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::AuthorizationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validatePolicyActivityAuthorizationActivity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity.code.code <> 'GUAR')->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity.code.code <> \'GUAR\')->size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityPayer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity.code.code = 'GUAR')->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity.code.code = \'GUAR\')->size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::COV)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::COV)->size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverage(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::HLD)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::HLD)->size() = 1'"
	 * @generated
	 */
	boolean validatePolicyActivityHolder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code <> 'GUAR').assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code <> \'GUAR\').assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code <> 'GUAR').assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code <> \'GUAR\').assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code <> 'GUAR').assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.5.110' and not value.code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code <> \'GUAR\').assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.110\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code <> 'GUAR').assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code <> \'GUAR\').assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code <> 'GUAR').assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code <> \'GUAR\').assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code <> 'GUAR').assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code <> \'GUAR\').assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code <> 'GUAR')->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code <> \'GUAR\')->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code <> 'GUAR')->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code <> \'GUAR\')->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code = 'GUAR').assignedEntity->excluding(null)->reject((performer.assignedEntity.assignedPerson->exists(not oclIsUndefined()) and performer.assignedEntity.assignedPerson.name->size() >0) or (performer.assignedEntity.representedOrganization->exists(not oclIsUndefined()) and performer.assignedEntity.representedOrganization.name->size() >0 ))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code = \'GUAR\').assignedEntity->excluding(null)->reject((performer.assignedEntity.assignedPerson->exists(not oclIsUndefined()) and performer.assignedEntity.assignedPerson.name->size() >0) or (performer.assignedEntity.representedOrganization->exists(not oclIsUndefined()) and performer.assignedEntity.representedOrganization.name->size() >0 ))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code = 'GUAR').assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.code = 'GUAR' and value.codeSystem = '2.16.840.1.113883.5.111'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code = \'GUAR\').assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.code = \'GUAR\' and value.codeSystem = \'2.16.840.1.113883.5.111\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code = 'GUAR').assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code = \'GUAR\').assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code = 'GUAR').assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code = \'GUAR\').assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code = 'GUAR')->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code = \'GUAR\')->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code = 'GUAR')->reject(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code = \'GUAR\')->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->excluding(null)->select(assignedEntity.code.code = 'GUAR')->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity.code.code = \'GUAR\')->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or value.code = 'FSTUD' or value.code = 'HANDIC' or value.code = 'INJ' or value.code = 'PSTUD' or value.code = 'SELF' or value.code = 'SPON' or value.code = 'STUD')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and (value.code = \'FAMDEP\' or value.code = \'FSTUD\' or value.code = \'HANDIC\' or value.code = \'INJ\' or value.code = \'PSTUD\' or value.code = \'SELF\' or value.code = \'SPON\' or value.code = \'STUD\')))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(typeCode=vocab::ParticipationType::COV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(typeCode=vocab::ParticipationType::COV)'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validatePolicyActivityCoverageCoverageRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(typeCode=vocab::ParticipationType::HLD)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(typeCode=vocab::ParticipationType::HLD)'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validatePolicyActivityHolderHolderRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AuthorizationActivity)).oclAsType(consol::AuthorizationActivity)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AuthorizationActivity)).oclAsType(consol::AuthorizationActivity)'"
	 * @generated
	 */
	EList<AuthorizationActivity> getAuthorizationActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init();
} // PolicyActivity
