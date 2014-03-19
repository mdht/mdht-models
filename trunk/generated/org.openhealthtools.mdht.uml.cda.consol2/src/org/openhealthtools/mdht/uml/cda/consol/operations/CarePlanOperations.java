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
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Plan</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Title</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanIIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Authenticator Signature Code</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanDocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Type Code</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOfEncompassingEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#validateCarePlanComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#getHealthConcernsSection() <em>Get Health Concerns Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#getGoalsSection() <em>Get Goals Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan#getHealthStatusEvaluationsOutcomesSection() <em>Get Health Status Evaluations Outcomes Section</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateCarePlanId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanId(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateCarePlanId(CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.CARE_PLAN__CARE_PLAN_ID,
					ConsolPlugin.INSTANCE.getString("CarePlanId"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanCodeP"), new Object[] { carePlan }));
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
			+ "value.code = 'CarePlan-X' and value.codeSystem = '2.16.840.1.113883.6.1')";

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
					ConsolPlugin.INSTANCE.getString("CarePlanCode"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanTitle(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanTitle(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanTitle(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanTitle(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CARE_PLAN_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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

	public static boolean validateCarePlanTitle(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				VALIDATE_CARE_PLAN_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_PLAN_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_PLAN_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(carePlan)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.CARE_PLAN__CARE_PLAN_TITLE,
					ConsolPlugin.INSTANCE.getString("CarePlanTitle"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanInformationRecipient"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanAuthenticator"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReview"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanParticipantCaregiver"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOf"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanRelatedDocument"), new Object[] { carePlan }));
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
	protected static final String VALIDATE_CARE_PLAN_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->exists(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

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
					ConsolPlugin.INSTANCE.getString("CarePlanComponentOf"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanHealthConcernsSection"), new Object[] { carePlan }));
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
					ConsolPlugin.INSTANCE.getString("CarePlanGoalsSection"), new Object[] { carePlan }));
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
	protected static final String VALIDATE_CARE_PLAN_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthStatusEvaluationsOutcomesSection))";

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
					ConsolPlugin.INSTANCE.getString("CarePlanHealthStatusEvaluationsOutcomesSection"),
					new Object[] { carePlan }));
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
	protected static final String VALIDATE_CARE_PLAN_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanIIRoot(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan II Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanIIRoot(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

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
	public static boolean validateCarePlanIIRoot(CarePlan carePlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_II_ROOT,
						ConsolPlugin.INSTANCE.getString("CarePlanIIRoot"), new Object[] { eObject }));
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
	protected static final String VALIDATE_CARE_PLAN_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(rim::Role)))";

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
						ConsolPlugin.INSTANCE.getString("CarePlanInformationRecipientIntendedRecipient"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanAuthenticatorAssignedEntityId"),
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
			+ "value.code = 'SELF' and value.codeSystem = '2.16.840.1.113883.5.111'))";

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
						ConsolPlugin.INSTANCE.getString("CarePlanAuthenticatorAssignedEntityCode"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanAuthenticatorAssignedEntityCodeP"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanAuthenticatorTime"), new Object[] { eObject }));
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
						ConsolPlugin.INSTANCE.getString("CarePlanAuthenticatorSignatureCode"), new Object[] { eObject }));
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
						ConsolPlugin.INSTANCE.getString("CarePlanAuthenticatorAssignedEntity"),
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
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewAssociatedEntityClassCode"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewAssociatedEntityId"),
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
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewAssociatedEntityCodeP"),
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
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_ASSOCIATED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewAssociatedEntityCode"),
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
	protected static final String VALIDATE_CARE_PLAN_PARTICIPANT_CARE_PLAN_REVIEW_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IND)";

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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewTypeCode"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewFunctionCode"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewFunctionCodeP"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewTime"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCarePlanReviewAssociatedEntity"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName"),
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
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P,
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCaregiverAssociatedEntityClassCodeP"),
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
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCaregiverAssociatedEntityClassCode"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCaregiverAssociatedEntityAssociatedPerson"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCaregiverTypeCode"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanParticipantCaregiverAssociatedEntity"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOfServiceEventPerformerAssignedEntityId"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOfServiceEventPerformerAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanDocumentationOfServiceEventPerformerTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanDocumentationOfServiceEventPerformerTypeCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

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
	public static boolean validateCarePlanDocumentationOfServiceEventPerformerTypeCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOfServiceEventPerformerTypeCode"),
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
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOfServiceEventPerformerAssignedEntity"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOfServiceEventClassCode"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOfServiceEventEffectiveTime"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOfServiceEventPerformer1"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanDocumentationOfServiceEvent"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanRelatedDocumentParentDocumentSetId"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanRelatedDocumentParentDocumentVersionNumber"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanRelatedDocumentTypeCodeP"), new Object[] { eObject }));
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
						ConsolPlugin.INSTANCE.getString("CarePlanRelatedDocumentTypeCode"), new Object[] { eObject }));
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
						ConsolPlugin.INSTANCE.getString("CarePlanRelatedDocumentParentDocument"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCarePlanComponentOfEncompassingEncounterCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanComponentOfEncompassingEncounterCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateCarePlanComponentOfEncompassingEncounterCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Plan Component Of Encompassing Encounter Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCarePlanComponentOfEncompassingEncounterCode(CarePlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

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
	public static boolean validateCarePlanComponentOfEncompassingEncounterCode(CarePlan carePlan,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CARE_PLAN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(carePlan);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE,
						ConsolPlugin.INSTANCE.getString("CarePlanComponentOfEncompassingEncounterCode"),
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
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CARE_PLAN__CARE_PLAN_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("CarePlanComponentOfEncompassingEncounterEffectiveTime"),
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
						ConsolPlugin.INSTANCE.getString("CarePlanComponentOfEncompassingEncounter"),
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
				ConsolPackage.Literals.CARE_PLAN, ConsolPackage.Literals.CARE_PLAN.getEAllOperations().get(345));
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
				ConsolPackage.Literals.CARE_PLAN, ConsolPackage.Literals.CARE_PLAN.getEAllOperations().get(346));
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
	protected static final String GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthStatusEvaluationsOutcomesSection))->asSequence()->any(true).oclAsType(consol::HealthStatusEvaluationsOutcomesSection)";

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

	public static HealthStatusEvaluationsOutcomesSection getHealthStatusEvaluationsOutcomesSection(CarePlan carePlan) {
		if (GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CARE_PLAN, ConsolPackage.Literals.CARE_PLAN.getEAllOperations().get(347));
			try {
				GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_QRY = helper.createQuery(GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION__EOCL_QRY);
		return (HealthStatusEvaluationsOutcomesSection) query.evaluate(carePlan);
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
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"), new Object[] { carePlan }));
			}

			return false;
		}
		return true;
	}

} // CarePlanOperations
