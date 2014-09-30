/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.CarePlan;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection;

import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.CarePlanOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CarePlanImpl extends USRealmHeader2Impl implements CarePlan {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReview(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReview(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCaregiver(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiver(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanRelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocument(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanHealthConcernsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanHealthConcernsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanGoalsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanGoalsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanHealthStatusEvaluationsOutcomesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanHealthStatusEvaluationsOutcomesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInterventionsSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInterventionsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanIIRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanIIRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanAuthenticatorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanAuthenticatorSignatureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorSignatureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanAuthenticatorSDTCSignatureText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorSDTCSignatureText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanAuthenticatorAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewFunctionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewFunctionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewFunctionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewFunctionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCaregiverAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCaregiverTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanParticipantCaregiverAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOfServiceEventPerformer1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformer1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanDocumentationOfServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanRelatedDocumentParentDocumentSetId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentSetId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanRelatedDocumentParentDocumentVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanRelatedDocumentTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentTypeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanRelatedDocumentTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanRelatedDocumentParentDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentParentDocument(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanComponentOfEncompassingEncounterCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounterCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounterEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCarePlanComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthConcernsSection getHealthConcernsSection() {
		return CarePlanOperations.getHealthConcernsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalsSection getGoalsSection() {
		return CarePlanOperations.getGoalsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusEvaluationsOutcomesSection getHealthStatusEvaluationsOutcomesSection() {
		return CarePlanOperations.getHealthStatusEvaluationsOutcomesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsSection2 getInterventionsSection2() {
		return CarePlanOperations.getInterventionsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlan init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlan init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CarePlanImpl
