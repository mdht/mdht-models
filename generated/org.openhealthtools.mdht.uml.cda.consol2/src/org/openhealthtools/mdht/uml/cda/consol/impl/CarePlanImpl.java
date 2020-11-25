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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.CarePlan;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.CarePlanOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan</b></em>'.
 * <!-- end-user-doc -->
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
	public boolean validateCarePlanCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanSetId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanSetId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReview(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReview(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCaregiver(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiver(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocument(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanHealthConcernsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanHealthConcernsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanGoalsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanGoalsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(this, diagnostics, context);
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
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanAuthenticatorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanAuthenticatorSignatureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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
	public boolean validateCarePlanAuthenticatorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewFunctionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewFunctionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewFunctionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewFunctionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCarePlanReviewAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCaregiverAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCaregiverTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanParticipantCaregiverAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEventPerformer1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformer1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanDocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelatedDocumentParentDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelatedDocumentParentDocumentSetId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentSetId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelatedDocumentParentDocumentVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentVersionNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelatedDocumentTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentTypeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelatedDocumentTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanRelatedDocumentParentDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanRelatedDocumentParentDocument(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounterEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthConcernsSection getHealthConcernsSection() {
		return CarePlanOperations.getHealthConcernsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalsSection getGoalsSection() {
		return CarePlanOperations.getGoalsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusEvaluationsAndOutcomesSection getHealthStatusEvaluationsOutcomesSection() {
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
	public boolean validateUSRealmHeader2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CarePlanOperations.validateUSRealmHeader2TemplateId(this, diagnostics, context);
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
