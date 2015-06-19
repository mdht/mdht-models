/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_CARE_PLAN_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
 *     								 - commented out above modification/definition as requirement was removed in NOV_V2 draft
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.CarePlan;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsAndOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

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
public class CarePlanOperations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Does Not Have Plan Of Treatment Section V2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.getAllSections()->exists(s : cda::Section | s.oclIsTypeOf(consol::PlanOfTreatmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Does Not Have Plan Of Treatment Section V2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_DOES_NOT_HAVE_PLAN_OF_TREATMENT_SECTION_V2,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDoesNotHavePlanOfTreatmentSectionV2"),
					new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanCodeP(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.CARE_PLAN__CARE_PLAN_CODE_P,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanCodeP"), new Object[] { carePlan }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.CarePlanCodeP", passToken);
				}
				passToken.add(carePlan);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '52521-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanCode(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(carePlan)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CARE_PLAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.CARE_PLAN__CARE_PLAN_CODE,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanCode"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanSetId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanSetId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanSetId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanSetId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanSetId(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.CARE_PLAN__CARE_PLAN_SET_ID,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanSetId"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanVersionNumber(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanVersionNumber(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanVersionNumber(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanVersionNumber(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanVersionNumber(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_VERSION_NUMBER,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanVersionNumber"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanInformationRecipient(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipient"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanAuthenticator(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticator(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->one(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanAuthenticator(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticator(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanAuthenticator(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_AUTHENTICATOR,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanAuthenticator"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReview(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReview(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReview(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReview(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanParticipantCarePlanReview(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReview"),
					new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCaregiver(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiver(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCaregiver(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiver(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanParticipantCaregiver(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCaregiver"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOf(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOf(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOf(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOf(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanDocumentationOf(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOf"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanRelatedDocument(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocument(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->exists(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanRelatedDocument(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocument(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanRelatedDocument(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_RELATED_DOCUMENT,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanRelatedDocument"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanComponentOf(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanComponentOf(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanComponentOf(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanComponentOf(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanComponentOf(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanComponentOf"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanHealthConcernsSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Health Concerns Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanHealthConcernsSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_HEALTH_CONCERNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthConcernsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanHealthConcernsSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Health Concerns Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanHealthConcernsSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_HEALTH_CONCERNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanHealthConcernsSection(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_HEALTH_CONCERNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_HEALTH_CONCERNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_HEALTH_CONCERNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_HEALTH_CONCERNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_HEALTH_CONCERNS_SECTION,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanHealthConcernsSection"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanGoalsSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Goals Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanGoalsSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_GOALS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GoalsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanGoalsSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Goals Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanGoalsSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_GOALS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanGoalsSection(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_GOALS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_GOALS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_GOALS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_GOALS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_GOALS_SECTION,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanGoalsSection"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanHealthStatusEvaluationsOutcomesSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Health Status Evaluations Outcomes Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanHealthStatusEvaluationsOutcomesSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthStatusEvaluationsAndOutcomesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanHealthStatusEvaluationsOutcomesSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Health Status Evaluations Outcomes Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanHealthStatusEvaluationsOutcomesSection(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanHealthStatusEvaluationsOutcomesSection(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanHealthStatusEvaluationsOutcomesSection"),
					new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInterventionsSection2(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Interventions Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInterventionsSection2(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInterventionsSection2(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Interventions Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInterventionsSection2(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCarePlanInterventionsSection2(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__CARE_PLAN_INTERVENTIONS_SECTION2,
					ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInterventionsSection2"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanIIRoot(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan II Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanIIRoot(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	// protected static final String VALIDATE_CARE_PLAN_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP =
	// "self.id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))";

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Information Recipient Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Information Recipient Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(
			CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT_NAME,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientInformationRecipientName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(
			CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_ID,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(
			CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_NAME,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Standard Industry Class Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((standardIndustryClassCode.oclIsUndefined() or standardIndustryClassCode.isNullFlavorUndefined()) implies (not standardIndustryClassCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Standard Industry Class Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(
			CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE_P,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Standard Industry Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((standardIndustryClassCode.oclIsUndefined() or standardIndustryClassCode.isNullFlavorUndefined()) implies (not standardIndustryClassCode.oclIsUndefined() and standardIndustryClassCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = standardIndustryClassCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization Standard Industry Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(
			CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION_STANDARD_INDUSTRY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientId(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientAddr(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientAddr(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientAddr(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientAddr(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientAddr(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientTelecom(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientTelecom(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientTelecom(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientTelecom(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientTelecom(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientInformationRecipient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient Received Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECEIVED_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipientReceivedOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanInformationRecipientIntendedRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanInformationRecipientIntendedRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanInformationRecipientIntendedRecipient(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanInformationRecipientIntendedRecipient(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanInformationRecipientIntendedRecipient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanAuthenticatorAssignedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorAssignedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanAuthenticatorAssignedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorAssignedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanAuthenticatorAssignedEntityId(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanAuthenticatorAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanAuthenticatorAssignedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorAssignedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.code = 'ONESELF' and value.codeSystem = '2.16.840.1.113883.5.111'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanAuthenticatorAssignedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorAssignedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanAuthenticatorAssignedEntityCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanAuthenticatorAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanAuthenticatorAssignedEntityCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorAssignedEntityCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanAuthenticatorAssignedEntityCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorAssignedEntityCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanAuthenticatorAssignedEntityCodeP(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanAuthenticatorAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanAuthenticatorTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanAuthenticatorTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanAuthenticatorTime(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_AUTHENTICATOR_TIME,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanAuthenticatorTime"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanAuthenticatorSignatureCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Signature Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorSignatureCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanAuthenticatorSignatureCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Signature Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorSignatureCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanAuthenticatorSignatureCode(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_AUTHENTICATOR_SIGNATURE_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanAuthenticatorSignatureCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanAuthenticatorSDTCSignatureText(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator SDTC Signature Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorSDTCSignatureText(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((sDTCSignatureText.oclIsUndefined() or sDTCSignatureText.isNullFlavorUndefined()) implies (not sDTCSignatureText.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanAuthenticatorSDTCSignatureText(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator SDTC Signature Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorSDTCSignatureText(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanAuthenticatorSDTCSignatureText(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_AUTHENTICATOR_SDTC_SIGNATURE_TEXT,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanAuthenticatorSDTCSignatureText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanAuthenticatorAssignedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorAssignedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanAuthenticatorAssignedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanAuthenticatorAssignedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanAuthenticatorAssignedEntity(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_AUTHENTICATOR_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanAuthenticatorAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewAssociatedEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityId(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewAssociatedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewAssociatedEntityCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanParticipantCarePlanReviewAssociatedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.CarePlanParticipantCarePlanReviewAssociatedEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanParticipantCarePlanReviewAssociatedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewAssociatedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::VRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewTypeCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewFunctionCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewFunctionCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in "
			+ "value.code = '425268008' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewFunctionCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewFunctionCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewFunctionCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewFunctionCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewFunctionCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewFunctionCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewFunctionCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewFunctionCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewFunctionCodeP(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_FUNCTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewFunctionCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewTime(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TIME,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCarePlanReviewAssociatedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Care Plan Review Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCarePlanReviewAssociatedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCarePlanReviewAssociatedEntity(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCarePlanReviewAssociatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Class Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Class Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCaregiverAssociatedEntityClassCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanParticipantCaregiverAssociatedEntityClassCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.CarePlanParticipantCaregiverAssociatedEntityClassCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntityClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntityClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and "
			+ "let value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in "
			+ "value = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntityClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntityClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCaregiverAssociatedEntityClassCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanParticipantCaregiverAssociatedEntityClassCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCaregiverAssociatedEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCaregiverTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IND)";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCaregiverTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCaregiverTypeCode(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCaregiverTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanParticipantCaregiverAssociatedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Participant Caregiver Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanParticipantCaregiverAssociatedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanParticipantCaregiverAssociatedEntity(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanParticipantCaregiverAssociatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventIVLTSLow(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventIVLTSLow(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventIVLTSLow(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventIVLTSLow(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventIVLTSLow(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventIVLTSLow"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventIVLTSHigh(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventIVLTSHigh(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventIVLTSHigh(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventIVLTSHigh(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventIVLTSHigh(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventIVLTSHigh"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Assigned Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Assigned Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(
			CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventPerformerAssignedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
			CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventPerformerAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventClassCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventClassCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventEffectiveTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventEffectiveTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventEffectiveTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventEffectiveTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventEffectiveTime(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventPerformer1(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformer1(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventPerformer1(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformer1(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEventPerformer1(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEventPerformer1"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEvent(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEvent(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEvent(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEvent(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanDocumentationOfServiceEvent(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanDocumentationOfServiceEvent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanRelatedDocumentParentDocumentSetId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentParentDocumentSetId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->excluding(null).parentDocument->excluding(null)->reject((setId.oclIsUndefined() or setId.isNullFlavorUndefined()) implies (not setId.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanRelatedDocumentParentDocumentSetId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentParentDocumentSetId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanRelatedDocumentParentDocumentSetId(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_SET_ID,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanRelatedDocumentParentDocumentSetId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanRelatedDocumentParentDocumentVersionNumber(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentParentDocumentVersionNumber(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->excluding(null).parentDocument->excluding(null)->reject((versionNumber.oclIsUndefined() or versionNumber.isNullFlavorUndefined()) implies (not versionNumber.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanRelatedDocumentParentDocumentVersionNumber(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentParentDocumentVersionNumber(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanRelatedDocumentParentDocumentVersionNumber(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT_VERSION_NUMBER,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanRelatedDocumentParentDocumentVersionNumber"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanRelatedDocumentTypeCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Type Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentTypeCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanRelatedDocumentTypeCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Type Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentTypeCodeP(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanRelatedDocumentTypeCodeP(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE_P,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanRelatedDocumentTypeCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanRelatedDocumentTypeCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.CarePlanRelatedDocumentTypeCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanRelatedDocumentTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::x_ActRelationshipDocument) and "
			+ "let value : vocab::x_ActRelationshipDocument = typeCode.oclAsType(vocab::x_ActRelationshipDocument) in "
			+ "value = vocab::x_ActRelationshipDocument::APND or value = vocab::x_ActRelationshipDocument::RPLC)";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanRelatedDocumentTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanRelatedDocumentTypeCode(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.CarePlanRelatedDocumentTypeCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_RELATED_DOCUMENT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanRelatedDocumentTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanRelatedDocumentParentDocument(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentParentDocument(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->excluding(null)->reject(parentDocument->one(parentDocument : cda::ParentDocument | not parentDocument.oclIsUndefined() and parentDocument.oclIsKindOf(cda::ParentDocument)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanRelatedDocumentParentDocument(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Related Document Parent Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanRelatedDocumentParentDocument(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanRelatedDocumentParentDocument(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_RELATED_DOCUMENT_PARENT_DOCUMENT,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanRelatedDocumentParentDocument"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanComponentOfEncompassingEncounterEffectiveTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanComponentOfEncompassingEncounterEffectiveTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanComponentOfEncompassingEncounterEffectiveTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanComponentOfEncompassingEncounterEffectiveTime(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanComponentOfEncompassingEncounterEffectiveTime(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanComponentOfEncompassingEncounterEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanComponentOfEncompassingEncounter(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanComponentOfEncompassingEncounter(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanComponentOfEncompassingEncounter(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanComponentOfEncompassingEncounter(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateCarePlanComponentOfEncompassingEncounter(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("CarePlanCarePlanComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthConcernsSection(CarePlan) <em>Get Health Concerns Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthConcernsSection(CarePlan)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_CONCERNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthConcernsSection))->asSequence()->any(true).oclAsType(consol::HealthConcernsSection)";

	/**
	 * The cached OCL query for the '{@link #getHealthConcernsSection(CarePlan) <em>Get Health Concerns Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthConcernsSection(CarePlan)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_CONCERNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HealthConcernsSection getHealthConcernsSection(CarePlan carePlan) {
		if (GET_HEALTH_CONCERNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_PLAN, ConsolPackage.Literals.CARE_PLAN.getEAllOperations().get(307));
			try {
				GET_HEALTH_CONCERNS_SECTION__EOCL_QRY = helper.createQuery(GET_HEALTH_CONCERNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_CONCERNS_SECTION__EOCL_QRY);
		return (HealthConcernsSection) query.evaluate(carePlan);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGoalsSection(CarePlan) <em>Get Goals Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsSection(CarePlan)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GOALS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GoalsSection))->asSequence()->any(true).oclAsType(consol::GoalsSection)";

	/**
	 * The cached OCL query for the '{@link #getGoalsSection(CarePlan) <em>Get Goals Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsSection(CarePlan)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GOALS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static GoalsSection getGoalsSection(CarePlan carePlan) {
		if (GET_GOALS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_PLAN, ConsolPackage.Literals.CARE_PLAN.getEAllOperations().get(308));
			try {
				GET_GOALS_SECTION__EOCL_QRY = helper.createQuery(GET_GOALS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GOALS_SECTION__EOCL_QRY);
		return (GoalsSection) query.evaluate(carePlan);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthStatusEvaluationsOutcomesSection(CarePlan) <em>Get Health Status Evaluations Outcomes Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusEvaluationsOutcomesSection(CarePlan)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthStatusEvaluationsAndOutcomesSection))->asSequence()->any(true).oclAsType(consol::HealthStatusEvaluationsAndOutcomesSection)";

	/**
	 * The cached OCL query for the '{@link #getHealthStatusEvaluationsOutcomesSection(CarePlan) <em>Get Health Status Evaluations Outcomes Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusEvaluationsOutcomesSection(CarePlan)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HealthStatusEvaluationsAndOutcomesSection getHealthStatusEvaluationsOutcomesSection(CarePlan carePlan) {
		if (GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_PLAN, ConsolPackage.Literals.CARE_PLAN.getEAllOperations().get(309));
			try {
				GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_QRY = helper.createQuery(GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_QRY);
		return (HealthStatusEvaluationsAndOutcomesSection) query.evaluate(carePlan);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInterventionsSection2(CarePlan) <em>Get Interventions Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionsSection2(CarePlan)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTERVENTIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection2))->asSequence()->any(true).oclAsType(consol::InterventionsSection2)";

	/**
	 * The cached OCL query for the '{@link #getInterventionsSection2(CarePlan) <em>Get Interventions Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionsSection2(CarePlan)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTERVENTIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InterventionsSection2 getInterventionsSection2(CarePlan carePlan) {
		if (GET_INTERVENTIONS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_PLAN, ConsolPackage.Literals.CARE_PLAN.getEAllOperations().get(310));
			try {
				GET_INTERVENTIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_INTERVENTIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTERVENTIONS_SECTION2__EOCL_QRY);
		return (InterventionsSection2) query.evaluate(carePlan);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param carePlan The receiving '<em><b>Care Plan</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CARE_PLAN__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CarePlanGeneralHeaderConstraintsTemplateId"),
					new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

} // CarePlanOperations
