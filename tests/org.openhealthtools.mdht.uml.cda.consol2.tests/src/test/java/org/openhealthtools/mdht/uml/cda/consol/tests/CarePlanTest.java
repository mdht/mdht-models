/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.Authenticator;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.InformationRecipient;
import org.eclipse.mdht.uml.cda.IntendedRecipient;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.vocab.ActClassRoot;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipDocument;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.CarePlan;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.CarePlanOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Plan</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Does Not Have Plan Of Treatment Section V2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReview(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiver(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanHealthConcernsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Health Concerns Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanGoalsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Goals Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanHealthStatusEvaluationsOutcomesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Health Status Evaluations Outcomes Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInterventionsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Interventions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Information Recipient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Standard Industry Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Standard Industry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorSDTCSignatureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator SDTC Signature Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCarePlanReviewAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanParticipantCaregiverAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformer1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentParentDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentParentDocumentSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentParentDocumentVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanRelatedDocumentParentDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#getHealthConcernsSection() <em>Get Health Concerns Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#getGoalsSection() <em>Get Goals Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#getHealthStatusEvaluationsOutcomesSection() <em>Get Health Status Evaluations Outcomes Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#getInterventionsSection2() <em>Get Interventions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CarePlanTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDoesNotHavePlanOfTreatmentSectionV2() {
		OperationsTestCase<CarePlan> validateCarePlanDoesNotHavePlanOfTreatmentSectionV2TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDoesNotHavePlanOfTreatmentSectionV2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				PlanOfTreatmentSection2 pots = ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init();
				target.addSection(pots);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				// since the sections are an unmodifiable list (cannot do target.getSections().clear()),
				// walk the cda to clear everything in the component(s)
				target.getComponent().getStructuredBody().getComponents().clear();
				// add a random section which IS allowed
				Section hcs = ConsolFactory.eINSTANCE.createHealthConcernsSection().init();
				target.addSection(hcs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDoesNotHavePlanOfTreatmentSectionV2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanCodeP((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanCode() {
		OperationsTestCase<CarePlan> validateCarePlanCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("18776-5", LOINC_ID, "LOINC", "Plan of care note"));
			}

			@Override
			protected void setDependency(CarePlan target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CarePlanCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanCode((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanSetId() {
		OperationsTestCase<CarePlan> validateCarePlanSetIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanSetId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.setSetId(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanSetId((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanSetIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanVersionNumber() {
		OperationsTestCase<CarePlan> validateCarePlanVersionNumberTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanVersionNumber",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.setVersionNumber(DatatypesFactory.eINSTANCE.createINT());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanVersionNumber((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanVersionNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipient() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipient(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanAuthenticator() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticator",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.getAuthenticators().add(CDAFactory.eINSTANCE.createAuthenticator());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticator((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReview() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReview", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReview(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiver() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiver",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiver(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOf() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOf((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanRelatedDocument() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocument",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.getRelatedDocuments().add(CDAFactory.eINSTANCE.createRelatedDocument());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocument((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanComponentOf() {
		OperationsTestCase<CarePlan> validateCarePlanComponentOfTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentOf((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanHealthConcernsSection() {
		OperationsTestCase<CarePlan> validateCarePlanHealthConcernsSectionTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanHealthConcernsSection",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_HEALTH_CONCERNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

				/* HealthConcernsSection */
				HealthConcernsSection section =

				ConsolFactory.eINSTANCE.createHealthConcernsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanHealthConcernsSection(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanHealthConcernsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarePlanGoalsSection() {
		OperationsTestCase<CarePlan> validateCarePlanGoalsSectionTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanGoalsSection",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_GOALS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

				/* GoalsSection */
				GoalsSection section =

				ConsolFactory.eINSTANCE.createGoalsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanGoalsSection((CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanGoalsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanHealthStatusEvaluationsOutcomesSection() {
		OperationsTestCase<CarePlan> validateCarePlanHealthStatusEvaluationsOutcomesSectionTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanHealthStatusEvaluationsOutcomesSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

				/* HealthStatusEvaluationsAndOutcomesSection */
				HealthStatusEvaluationsAndOutcomesSection section = ConsolFactory.eINSTANCE.createHealthStatusEvaluationsAndOutcomesSection().init();
				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanHealthStatusEvaluationsOutcomesSection(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanHealthStatusEvaluationsOutcomesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInterventionsSection2() {
		OperationsTestCase<CarePlan> validateCarePlanInterventionsSection2TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInterventionsSection2",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createInterventionsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInterventionsSection2(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInterventionsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientInformationRecipientName() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientInformationRecipientNameTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
				Person ir2 = CDAFactory.eINSTANCE.createPerson();
				ir.getIntendedRecipient().setInformationRecipient(ir2);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				PN name = DatatypesFactory.eINSTANCE.createPN();
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getInformationRecipient().getNames().add(name);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientInformationRecipientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
				Organization recOrg = CDAFactory.eINSTANCE.createOrganization();
				intendedRec.setReceivedOrganization(recOrg);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getReceivedOrganization().getIds().add(
						DatatypesFactory.eINSTANCE.createII());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationNameTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
				Organization recOrg = CDAFactory.eINSTANCE.createOrganization();
				intendedRec.setReceivedOrganization(recOrg);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getReceivedOrganization().getNames().add(
						DatatypesFactory.eINSTANCE.createON());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
				Organization recOrg = CDAFactory.eINSTANCE.createOrganization();
				intendedRec.setReceivedOrganization(recOrg);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getReceivedOrganization().setStandardIndustryClassCode(
						DatatypesFactory.eINSTANCE.createCE());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
				Organization recOrg = CDAFactory.eINSTANCE.createOrganization();
				intendedRec.setReceivedOrganization(recOrg);
				recOrg.setStandardIndustryClassCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getReceivedOrganization().setStandardIndustryClassCode(
						DatatypesFactory.eINSTANCE.createCE("notChecked", "2.16.840.1.113883.6.101"));
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientId() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getIds().add(DatatypesFactory.eINSTANCE.createII());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientAddr() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientAddrTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientAddr(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientTelecom() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientTelecomTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientTelecom(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientInformationRecipient() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientInformationRecipientTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientInformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				Person ir2 = CDAFactory.eINSTANCE.createPerson();
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().setInformationRecipient(ir2);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipientReceivedOrganization() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				Organization recOrg = CDAFactory.eINSTANCE.createOrganization();
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().setReceivedOrganization(recOrg);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanInformationRecipientIntendedRecipient() {
		OperationsTestCase<CarePlan> validateCarePlanInformationRecipientIntendedRecipientTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanInformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getInformationRecipients().get(0).setIntendedRecipient(
					CDAFactory.eINSTANCE.createIntendedRecipient());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanInformationRecipientIntendedRecipient(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanInformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanAuthenticatorAssignedEntityId() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorAssignedEntityId", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getAuthenticators().add(CDAFactory.eINSTANCE.createAuthenticator());
				target.getAuthenticators().get(0).setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getAuthenticators().get(0).getAssignedEntity().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanAuthenticatorAssignedEntityCode() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorAssignedEntityCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getAuthenticators().add(CDAFactory.eINSTANCE.createAuthenticator());
				target.getAuthenticators().get(0).setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getAuthenticators().get(0).getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE(
						CDAValidationTest.BAD_CODE_VALUE, CDAValidationTest.BAD_CODESYSTEM_ID));
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getAuthenticators().get(0).getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("ONESELF", "2.16.840.1.113883.5.111"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanAuthenticatorAssignedEntityCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorAssignedEntityCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getAuthenticators().add(CDAFactory.eINSTANCE.createAuthenticator());
				target.getAuthenticators().get(0).setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getAuthenticators().get(0).getAssignedEntity().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntityCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanAuthenticatorTime() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorTimeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_CARE_PLAN_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getAuthenticators().add(CDAFactory.eINSTANCE.createAuthenticator());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getAuthenticators().get(0).setTime(DatatypesFactory.eINSTANCE.createTS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorTime(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanAuthenticatorSignatureCode() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorSignatureCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorSignatureCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getAuthenticators().add(CDAFactory.eINSTANCE.createAuthenticator());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getAuthenticators().get(0).setSignatureCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorSignatureCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorSignatureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanAuthenticatorSDTCSignatureText() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorSDTCSignatureTextTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorSDTCSignatureText",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				ED sdtcSigText = DatatypesFactory.eINSTANCE.createED();
				for (Authenticator a : target.getAuthenticators()) {
					a.setSDTCSignatureText(sdtcSigText);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorSDTCSignatureText(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorSDTCSignatureTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanAuthenticatorAssignedEntity() {
		OperationsTestCase<CarePlan> validateCarePlanAuthenticatorAssignedEntityTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanAuthenticatorAssignedEntity", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getAuthenticators().add(CDAFactory.eINSTANCE.createAuthenticator());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getAuthenticators().get(0).setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanAuthenticatorAssignedEntity(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanAuthenticatorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.ASSIGNED);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntityId() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).getAssociatedEntity().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).getAssociatedEntity().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntityCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getParticipants().get(0).getAssociatedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE(
						CDAValidationTest.BAD_CODE_VALUE, CDAValidationTest.BAD_CODESYSTEM_ID));
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).getAssociatedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("CodeNotCurrentlyChecked", "2.16.840.1.113883.5.111"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewTypeCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewTypeCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific Participation type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(CarePlan target) {
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewTypeCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewFunctionCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewFunctionCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewFunctionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).setFunctionCode(
					DatatypesFactory.eINSTANCE.createCE("425268008", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewFunctionCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewFunctionCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewFunctionCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewFunctionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).setFunctionCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewFunctionCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewFunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewTime() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewTimeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewTime(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCarePlanReviewAssociatedEntity() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCarePlanReviewAssociatedEntityTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCarePlanReviewAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.VRF);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCarePlanReviewAssociatedEntity(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCarePlanReviewAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntityClassCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityClassCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				// classCode's value is not checked in this test, only that the attribute exists
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.ACCESS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntityClassCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityClassCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.PRS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityClassCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverTypeCode() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverTypeCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific Participation type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(CarePlan target) {
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverTypeCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanParticipantCaregiverAssociatedEntity() {
		OperationsTestCase<CarePlan> validateCarePlanParticipantCaregiverAssociatedEntityTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanParticipantCaregiverAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanParticipantCaregiverAssociatedEntity(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanParticipantCaregiverAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventIVLTSLow() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventIVLTSLowTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventIVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().setEffectiveTime(
					DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().setLow(
					DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventIVLTSLow(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventIVLTSHigh() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventIVLTSHighTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventIVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().setEffectiveTime(
					DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().setHigh(
					DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventIVLTSHigh(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonNameTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(
					0).getAssignedEntity().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(
					0).getAssignedEntity().getAssignedPerson().getNames().add(DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				target.getDocumentationOfs().get(0).setServiceEvent(se);
				se.getPerformers().add(CDAFactory.eINSTANCE.createPerformer1());
				se.getPerformers().get(0).setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(
					0).getAssignedEntity().getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				target.getDocumentationOfs().get(0).setServiceEvent(se);
				se.getPerformers().add(CDAFactory.eINSTANCE.createPerformer1());
				se.getPerformers().get(0).setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(
					0).getAssignedEntity().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(
					0).getAssignedEntity().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventClassCode() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().setClassCode(ActClassRoot.PCPR);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventClassCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().setEffectiveTime(
					DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventEffectiveTime(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEventPerformer1() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventPerformer1TestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEventPerformer1",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEventPerformer1(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventPerformer1TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanDocumentationOfServiceEvent() {
		OperationsTestCase<CarePlan> validateCarePlanDocumentationOfServiceEventTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanDocumentationOfServiceEvent", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanDocumentationOfServiceEvent(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentParentDocumentId() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentParentDocumentIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentParentDocumentId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getRelatedDocuments().add(CDAFactory.eINSTANCE.createRelatedDocument());
				target.getRelatedDocuments().get(0).setParentDocument(CDAFactory.eINSTANCE.createParentDocument());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getRelatedDocuments().get(0).getParentDocument().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentParentDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentParentDocumentSetId() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentParentDocumentSetIdTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentParentDocumentSetId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getRelatedDocuments().add(CDAFactory.eINSTANCE.createRelatedDocument());
				target.getRelatedDocuments().get(0).setParentDocument(CDAFactory.eINSTANCE.createParentDocument());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getRelatedDocuments().get(0).getParentDocument().setSetId(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentSetId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentParentDocumentSetIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentParentDocumentVersionNumber() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentParentDocumentVersionNumberTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentParentDocumentVersionNumber",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getRelatedDocuments().add(CDAFactory.eINSTANCE.createRelatedDocument());
				target.getRelatedDocuments().get(0).setParentDocument(CDAFactory.eINSTANCE.createParentDocument());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getRelatedDocuments().get(0).getParentDocument().setVersionNumber(
					DatatypesFactory.eINSTANCE.createINT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentParentDocumentVersionNumber(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentParentDocumentVersionNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentTypeCodeP() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentTypeCodePTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentTypeCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getRelatedDocuments().add(CDAFactory.eINSTANCE.createRelatedDocument());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getRelatedDocuments().get(0).setTypeCode(x_ActRelationshipDocument.XFRM);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentTypeCodeP(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentTypeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentTypeCode() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentTypeCodeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail because the code must be set with an enum and that enum only contains valid codes.
				skipFailsTest();
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();
				target.getRelatedDocuments().add(CDAFactory.eINSTANCE.createRelatedDocument());
				target.getRelatedDocuments().get(0).setTypeCode(x_ActRelationshipDocument.APND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentTypeCode(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanRelatedDocumentParentDocument() {
		OperationsTestCase<CarePlan> validateCarePlanRelatedDocumentParentDocumentTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanRelatedDocumentParentDocument", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.getRelatedDocuments().add(CDAFactory.eINSTANCE.createRelatedDocument());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getRelatedDocuments().get(0).setParentDocument(CDAFactory.eINSTANCE.createParentDocument());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanRelatedDocumentParentDocument(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanRelatedDocumentParentDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<CarePlan> validateCarePlanComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());
				target.getComponentOf().setEncompassingEncounter(CDAFactory.eINSTANCE.createEncompassingEncounter());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(
					DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounterEffectiveTime(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCarePlanComponentOfEncompassingEncounter() {
		OperationsTestCase<CarePlan> validateCarePlanComponentOfEncompassingEncounterTestCase = new OperationsTestCase<CarePlan>(
			"validateCarePlanComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {
				target.init();
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());
			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.getComponentOf().setEncompassingEncounter(CDAFactory.eINSTANCE.createEncompassingEncounter());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateCarePlanComponentOfEncompassingEncounter(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateCarePlanComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthConcernsSection() {

		CarePlan target = objectFactory.create();
		target.getHealthConcernsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGoalsSection() {

		CarePlan target = objectFactory.create();
		target.getGoalsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthStatusEvaluationsOutcomesSection() {

		CarePlan target = objectFactory.create();
		target.getHealthStatusEvaluationsOutcomesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInterventionsSection2() {

		CarePlan target = objectFactory.create();
		target.getInterventionsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<CarePlan> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<CarePlan>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarePlan target) {

			}

			@Override
			protected void updateToPass(CarePlan target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarePlanOperations.validateGeneralHeaderConstraintsTemplateId(
					(CarePlan) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CarePlanOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<CarePlan> {
		@Override
		public CarePlan create() {
			return ConsolFactory.eINSTANCE.createCarePlan();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends CarePlanOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // CarePlanOperations
