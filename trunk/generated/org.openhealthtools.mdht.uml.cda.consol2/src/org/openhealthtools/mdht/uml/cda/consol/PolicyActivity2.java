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

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PolicyActivityTemplateId PolicyActivityPayer PolicyActivityCoverage PolicyActivity2PolicyActivityPayerPayerAssignedEntity PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime PolicyActivity2PolicyActivityCoverageCoverageRole' templateId.root='2.16.840.1.113883.10.20.22.4.61.2' constraints.validation.warning='PolicyActivityGuarantor PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity' constraints.validation.info='PolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom' constraints.validation.query='PolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom PolicyActivity2PolicyActivityPayerPayerAssignedEntity PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity PolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime PolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity PolicyActivity2PolicyActivityCoverageCoverageRole' constraints.validation.dependOn.PolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode='PolicyActivityGuarantorGuarantorAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Payer constraints.validation.error='PolicyActivityPayerPayerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2PayerPayerAssignedEntity constraints.validation.info='PolicyActivityPayerPayerAssignedEntityTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Guarantor constraints.validation.error='PolicyActivityGuarantorGuarantorAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2GuarantorGuarantorAssignedEntity constraints.validation.warning='PolicyActivityGuarantorGuarantorAssignedEntityTelecom' code.code='GUAR' code.codeSystem='2.16.840.1.113883.5.110' code.codeSystemName='HL7RoleClass' code.displayName='Guarantor' constraints.validation.error='PolicyActivityGuarantorGuarantorAssignedEntityCode PolicyActivityGuarantorGuarantorAssignedEntityCodeP' constraints.validation.dependOn.PolicyActivityGuarantorGuarantorAssignedEntityCode='PolicyActivityGuarantorGuarantorAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2Coverage constraints.validation.error='PolicyActivityCoverageCoverageRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2CoverageCoverageRole constraints.validation.warning='PolicyActivityCoverageCoverageRoleCoveragePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPolicyActivity2CoverageCoverageRoleCoveragePlayingEntity constraints.validation.error='PolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime'"
 * @generated
 */
public interface PolicyActivity2 extends PolicyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\')).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PayerPolicyActivityPayerPayerAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.87\'))->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PolicyActivityPayerPayerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\')).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.code = \'GUAR\' and value.codeSystem = \'2.16.840.1.113883.5.110\'))'"
	 * @generated
	 */
	boolean validatePolicyActivity2GuarantorPolicyActivityGuarantorGuarantorAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->excluding(null)->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))->select(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.88\'))->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PolicyActivityGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntityDateOfBirthInSDTCbirthTime(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV).participantRole->excluding(null).playingEntity->excluding(null)->reject((sDTCBirthTime.oclIsUndefined() or sDTCBirthTime.isNullFlavorUndefined()) implies (not sDTCBirthTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePolicyActivity2CoverageCoverageRoleCoveragePlayingEntitySDTCBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validatePolicyActivity2CoveragePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::COV)->select(typeCode=vocab::ParticipationType::COV)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validatePolicyActivity2PolicyActivityCoverageCoverageRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PolicyActivity2
