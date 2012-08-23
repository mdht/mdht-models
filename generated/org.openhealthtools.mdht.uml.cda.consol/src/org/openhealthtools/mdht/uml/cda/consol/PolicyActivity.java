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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PolicyActivityTemplateId PolicyActivityClassCode PolicyActivityId PolicyActivityMoodCode PolicyActivityStatusCode PolicyActivityPayer PolicyActivityCoverage PolicyActivityEntryRelationship PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerPayerAssignedEntityCodeP PolicyActivityPayerTemplateId PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorTemplateId PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageCoverageRoleCodeP PolicyActivityCoverageTemplateId PolicyActivityCoverageTypeCode PolicyActivityCoverageCoverageRole PolicyActivityHolderHolderRoleId PolicyActivityHolderTemplateId PolicyActivityHolderTypeCode PolicyActivityHolderHolderRole PolicyActivityEntryRelationshipTargetActActivity PolicyActivityEntryRelationshipDescriptionCoveragePlan PolicyActivityEntryRelationshipTypeCode' templateId.root='2.16.840.1.113883.10.20.22.4.61' classCode='ACT' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.warning='PolicyActivityCode PolicyActivityCodeP PolicyActivityGuarantor PolicyActivityHolder PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageLowTime PolicyActivityCoverageHighTime PolicyActivityCoverageTime PolicyActivityHolderHolderRoleAddr' moodCode='EVN' statusCode.code='completed' constraints.validation.query='PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerPayerAssignedEntityCodeP PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityPayerTemplateId PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivityGuarantorTemplateId PolicyActivityGuarantorTime PolicyActivityGuarantorTypeCode PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivityCoverageCoverageRoleCoveragePlayingEntityName PolicyActivityCoverageCoverageRoleId PolicyActivityCoverageCoverageRoleCode PolicyActivityCoverageCoverageRoleCodeP PolicyActivityCoverageCoverageRoleAddr PolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivityCoverageLowTime PolicyActivityCoverageHighTime PolicyActivityCoverageTemplateId PolicyActivityCoverageTypeCode PolicyActivityCoverageTime PolicyActivityCoverageCoverageRole PolicyActivityHolderHolderRoleId PolicyActivityHolderHolderRoleAddr PolicyActivityHolderTemplateId PolicyActivityHolderTypeCode PolicyActivityHolderTime PolicyActivityHolderHolderRole PolicyActivityEntryRelationshipTargetActActivity PolicyActivityEntryRelationshipDescriptionCoveragePlan PolicyActivityEntryRelationshipTypeCode' constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom PolicyActivityHolderTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayer constraints.validation.error='PayerTemplateId PayerTypeCode PayerPayerAssignedEntity PayerPayerAssignedEntityId PayerPayerAssignedEntityCode PayerPayerAssignedEntityCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.87' typeCode='PRF' constraints.validation.warning='PayerPayerAssignedEntityPayerOrganizationName PayerPayerAssignedEntityPayerOrganization' constraints.validation.query='PayerPayerAssignedEntityPayerOrganizationName PayerPayerAssignedEntityId PayerPayerAssignedEntityCode PayerPayerAssignedEntityCodeP PayerPayerAssignedEntityAddr PayerPayerAssignedEntityTelecom PayerPayerAssignedEntityPayerOrganization' constraints.validation.info='PayerPayerAssignedEntityAddr PayerPayerAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayerPayerAssignedEntity constraints.validation.error='PayerAssignedEntityId PayerAssignedEntityCode PayerAssignedEntityCodeP' code.codeSystem='2.16.840.1.113883.5.110' code.codeSystemName='HL7RoleClass' constraints.validation.info='PayerAssignedEntityAddr PayerAssignedEntityTelecom' constraints.validation.warning='PayerAssignedEntityPayerOrganization PayerAssignedEntityPayerOrganizationName' constraints.validation.query='PayerAssignedEntityPayerOrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityPayerPayerAssignedEntityPayerOrganization constraints.validation.warning='PayerOrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityGuarantor constraints.validation.error='GuarantorTemplateId GuarantorGuarantorAssignedEntity GuarantorGuarantorAssignedEntityCode GuarantorGuarantorAssignedEntityCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.88' constraints.validation.warning='GuarantorTime GuarantorTypeCode GuarantorGuarantorAssignedEntityPersonNameAndOrOrgName GuarantorGuarantorAssignedEntityAddr GuarantorGuarantorAssignedEntityTelecom' typeCode='PRF' constraints.validation.query='GuarantorGuarantorAssignedEntityPersonNameAndOrOrgName GuarantorGuarantorAssignedEntityCode GuarantorGuarantorAssignedEntityCodeP GuarantorGuarantorAssignedEntityAddr GuarantorGuarantorAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityGuarantorGuarantorAssignedEntity constraints.validation.warning='GuarantorAssignedEntityPersonNameAndOrOrgName GuarantorAssignedEntityAddr GuarantorAssignedEntityTelecom' code.code='GUAR' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.error='GuarantorAssignedEntityCode GuarantorAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverage constraints.validation.error='CoverageTemplateId CoverageTypeCode CoverageCoverageRole CoverageCoverageRoleCoveragePlayingEntityName CoverageCoverageRoleId CoverageCoverageRoleCode CoverageCoverageRoleCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.89' constraints.validation.warning='CoverageLowTime CoverageHighTime CoverageTime CoverageCoverageRoleAddr CoverageCoverageRoleCoveragePlayingEntity' typeCode='COV' constraints.validation.query='CoverageCoverageRoleCoveragePlayingEntityName CoverageCoverageRoleId CoverageCoverageRoleCode CoverageCoverageRoleCodeP CoverageCoverageRoleAddr CoverageCoverageRoleCoveragePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverageCoverageRole constraints.validation.error='CoverageRoleId CoverageRoleCode CoverageRoleCodeP CoverageRoleCoveragePlayingEntityName' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='CoverageRoleAddr CoverageRoleCoveragePlayingEntity' constraints.validation.query='CoverageRoleCoveragePlayingEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityCoverageCoverageRoleCoveragePlayingEntity constraints.validation.error='CoveragePlayingEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityHolder constraints.validation.error='HolderTemplateId HolderTypeCode HolderHolderRole HolderHolderRoleId' templateId.root='2.16.840.1.113883.10.20.22.4.90' typeCode='HLD' constraints.validation.info='HolderTime' constraints.validation.query='HolderHolderRoleId HolderHolderRoleAddr' constraints.validation.warning='HolderHolderRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityHolderHolderRole constraints.validation.error='HolderRoleId' constraints.validation.warning='HolderRoleAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivityEntryRelationship constraints.validation.error='EntryRelationshipTargetActActivity EntryRelationshipDescriptionCoveragePlan EntryRelationshipTypeCode' typeCode='REFR'"
 * @generated
 */
public interface PolicyActivity extends Act {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined())'"
	* @generated
	*/
	boolean validatePolicyActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsTypeOf(datatypes::CE))'"
	* @generated
	*/
	boolean validatePolicyActivityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePolicyActivityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'completed\')'"
	* @generated
	*/
	boolean validatePolicyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\'))->size() = 1'"
	* @generated
	*/
	boolean validatePolicyActivityPayer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->select(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->size() = 1'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->notEmpty()'"
	* @generated
	*/
	boolean validatePolicyActivityEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerPayerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.110\' and not value.code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerPayerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerPayerAssignedEntityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerPayerAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerPayerAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\')).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\'))->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\'))->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	* @generated
	*/
	boolean validatePolicyActivityPayerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->excluding(null).code->excluding(null).code->excludes(\'GUAR\'))->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	* @generated
	*/
	boolean validatePolicyActivityPayerPayerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((performer.assignedEntity.assignedPerson->exists(not oclIsUndefined()) and performer.assignedEntity.assignedPerson.name->size() >0) or (performer.assignedEntity.representedOrganization->exists(not oclIsUndefined()) and performer.assignedEntity.representedOrganization.name->size() >0 ))'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.code = \'GUAR\' and value.codeSystem = \'2.16.840.1.113883.5.111\'))'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'}).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF)'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(assignedEntity->asSequence()->excluding(null).code->excluding(null).code = Sequence{\'GUAR\'})->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	* @generated
	*/
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and (value.code = \'FAMDEP\' or value.code = \'FSTUD\' or value.code = \'HANDIC\' or value.code = \'INJ\' or value.code = \'PSTUD\' or value.code = \'SELF\' or value.code = \'SPON\' or value.code = \'STUD\')))'"
	* @generated
	*/
	boolean validatePolicyActivityCoverageCoverageRoleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validatePolicyActivityCoverageCoverageRoleCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(not time.oclIsUndefined() implies not time.low.oclIsUndefined())'"
	* @generated
	*/
	boolean validatePolicyActivityCoverageLowTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(not time.oclIsUndefined() implies not time.high.oclIsUndefined())'"
	* @generated
	*/
	boolean validatePolicyActivityCoverageHighTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.89\'))'"
	* @generated
	*/
	boolean validatePolicyActivityCoverageTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::HLD)->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.90\'))'"
	* @generated
	*/
	boolean validatePolicyActivityHolderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
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
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(act->one(a : cda::Act | a.oclIsTypeOf(consol::AuthorizationActivity) or (a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and a.moodCode=vocab::x_DocumentActMood::DEF)))'"
	* @generated
	*/
	boolean validatePolicyActivityEntryRelationshipTargetActActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(act->select(a : cda::Act | a.classCode=vocab::x_ActClassDocumentEntryAct::ACT and (a.moodCode=vocab::x_DocumentActMood::DEF))->forAll(id->size() > 0 and text->size() = 1))'"
	* @generated
	*/
	boolean validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->select(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)'"
	* @generated
	*/
	boolean validatePolicyActivityEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PolicyActivity init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PolicyActivity
