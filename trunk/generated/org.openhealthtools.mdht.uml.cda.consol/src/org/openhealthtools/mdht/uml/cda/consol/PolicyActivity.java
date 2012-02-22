/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation statusCode.code='completed' code.codeSystem='2.16.840.1.113883.6.1' templateId.root='2.16.840.1.113883.10.20.22.4.61' constraints.validation.error='PolicyActivityTemplateId PolicyActivityClassCode PolicyActivityId PolicyActivityMoodCode PolicyActivityStatusCode PolicyActivityAuthorizationActivity PolicyActivityPayer PolicyActivityGuarantor PolicyActivityPayerPayerAssignedEntityId PolicyActivityPayerPayerAssignedEntityCode PolicyActivityPayerTemplateId PolicyActivityPayerTypeCode PolicyActivityPayerPayerAssignedEntity PolicyActivityGuarantorTime PolicyActivityGuarantorGuarantorAssignedEntity' code.codeSystemName='LOINC' constraints.validation.warning='PolicyActivityCode PolicyActivityPayerPayerAssignedEntityPayerOrganizationName PolicyActivityPayerPayerAssignedEntityPayerOrganization PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityAddr PolicyActivityGuarantorGuarantorAssignedEntityTelecom' classCode='ACT' constraints.validation.info='PolicyActivityPayerPayerAssignedEntityAddr PolicyActivityPayerPayerAssignedEntityTelecom' moodCode='EVN'"
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
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (\r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined()))'"
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
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (\r\nvalue.code = \'completed\'))'"
	 * @generated
	 */
	boolean validatePolicyActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::AuthorizationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::AuthorizationActivity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validatePolicyActivityAuthorizationActivity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	 * @generated
	 */
	boolean validatePolicyActivityPayer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) and self.performer.assignedEntity.representedOrganization->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR').assignedEntity.representedOrganization->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) and self.performer.assignedEntity.representedOrganization->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\').assignedEntity.representedOrganization->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR').assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\').assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR').assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.110' and not value.code.oclIsUndefined()))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\').assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in (\r\nvalue.codeSystem = \'2.16.840.1.113883.5.110\' and not value.code.oclIsUndefined()))) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR').assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\').assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR').assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\').assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR').assignedEntity->forAll(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\').assignedEntity->forAll(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization))) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR')->forAll(templateId->exists(id : datatypes::II | id.root = 'null')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\')->forAll(templateId->exists(id : datatypes::II | id.root = \'null\')) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR')->forAll(isDefined('typeCode') and typeCode=vocab::ParticipationPhysicalPerformer::PRF) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\')->forAll(isDefined(\'typeCode\') and typeCode=vocab::ParticipationPhysicalPerformer::PRF) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> 'GUAR')->forAll(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code <> \'GUAR\')->forAll(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityPayerPayerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = 'GUAR').assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in (
	 * value.code = 'GUAR' and value.codeSystem = '2.16.840.1.113883.5.111'))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = \'GUAR\').assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in (\r\nvalue.code = \'GUAR\' and value.codeSystem = \'2.16.840.1.113883.5.111\'))) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = 'GUAR').assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = \'GUAR\').assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = 'GUAR').assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) and self.performer.assignedEntity->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = \'GUAR\').assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = 'GUAR')->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = \'GUAR\')->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = 'GUAR')->forAll(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.performer->exists(not oclIsUndefined()) then self.performer->select(assignedEntity.code = \'GUAR\')->forAll(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))) else true endif'"
	 * @generated
	 */
	boolean validatePolicyActivityGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AuthorizationActivity))->asSequence()->first().oclAsType(consol::AuthorizationActivity)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AuthorizationActivity))->asSequence()->first().oclAsType(consol::AuthorizationActivity)'"
	 * @generated
	 */
	AuthorizationActivity getAuthorizationActivity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init();
} // PolicyActivity
