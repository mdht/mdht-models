/*******************************************************************************
 * Copyright (c) 2015 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								   as it required the use of select instead of reject
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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>US Realm Header Patient Generated Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient If More Than One Lang Comm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author CE Code System And Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author CE Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Has Related Entity Or Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian Represented Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity CE Code System And Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity CE Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant If Type Code IND Then AE Class Code From IND Roleclass Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class USRealmHeaderPatientGeneratedDocumentOperations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USRealmHeaderPatientGeneratedDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTarget"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthor(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthor(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthor(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthor(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthor(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthor"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDataEnterer"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformant(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformant(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformant(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformant(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformant(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformant"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentCustodian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentCustodian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentCustodian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentCustodian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentCustodian(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentCustodian"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformationRecipient"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthenticator"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipant(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipant(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipant(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipant(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentParticipant(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentParticipant"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOf"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP",
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
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Language Communication Preference Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Language Communication Preference Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient If More Than One Lang Comm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_MORE_THAN_ONE_LANG_COMM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->size() > 1 implies languageCommunication->one( langCom : cda::LanguageCommunication | langCom.preferenceInd.value))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient If More Than One Lang Comm</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_MORE_THAN_ONE_LANG_COMM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_MORE_THAN_ONE_LANG_COMM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_MORE_THAN_ONE_LANG_COMM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_MORE_THAN_ONE_LANG_COMM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_MORE_THAN_ONE_LANG_COMM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_MORE_THAN_ONE_LANG_COMM,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Guardian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Language Communication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->exists(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient Language Communication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Patient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PATIENT,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Provider Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(providerOrganization->one(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role Provider Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author CE Code System And Terminology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies (codeSystem = '2.16.840.1.113883.5.111'))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author CE Code System And Terminology</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE_SYSTEM_AND_TERMINOLOGY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author CE Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author CE Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Author Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP",
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
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Data Enterer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DATA_ENTERER_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).relatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP",
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
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).relatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Has Related Entity Or Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_HAS_RELATED_ENTITY_OR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null)->reject(relatedEntity->one(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(cda::RelatedEntity)) xor assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Has Related Entity Or Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_HAS_RELATED_ENTITY_OR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_HAS_RELATED_ENTITY_OR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_HAS_RELATED_ENTITY_OR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_HAS_RELATED_ENTITY_OR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_HAS_RELATED_ENTITY_OR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_HAS_RELATED_ENTITY_OR_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null)->reject(relatedEntity->one(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(cda::RelatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Informant Related Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMANT_RELATED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian Represented Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian Represented Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian Represented Custodian Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian Represented Custodian Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Custodian Assigned Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient II Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient II Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_II_ROOT,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Information Recipient Intended Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_INFORMATION_RECIPIENT_INTENDED_RECIPIENT,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity CE Code System And Terminology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies (codeSystem = '2.16.840.1.113883.5.111'))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity CE Code System And Terminology</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE_SYSTEM_AND_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE_SYSTEM_AND_TERMINOLOGY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity CE Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity CE Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Legal Authenticator Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP",
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
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Authenticator Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_AUTHENTICATOR_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP",
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
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant If Type Code IND Then AE Class Code From IND Roleclass Codes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(p : cda::Participant1 | p.typeCode = vocab::ParticipationType::IND and not ( p.associatedEntity.classCode = vocab::RoleClassAssociative::PRS  or p.associatedEntity.classCode = vocab::RoleClassAssociative::NOK or p.associatedEntity.classCode = vocab::RoleClassAssociative::CAREGIVER or p.associatedEntity.classCode = vocab::RoleClassAssociative::AGNT or p.associatedEntity.classCode = vocab::RoleClassAssociative::GUAR or p.associatedEntity.classCode = vocab::RoleClassAssociative::ECON or p.associatedEntity.isNullFlavorDefined() ) or p.associatedEntity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant If Type Code IND Then AE Class Code From IND Roleclass Codes</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_IF_TYPE_CODE_IND_THEN_AE_CLASS_CODE_FROM_IND_ROLECLASS_CODES,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Participant Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_PARTICIPANT_ASSOCIATED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of Order Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of Order Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document In Fulfillment Of Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_IN_FULFILLMENT_OF_ORDER,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP",
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
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP",
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
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.90' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header Patient Generated Document Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			usRealmHeaderPatientGeneratedDocument);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT_DOCUMENTATION_OF_SERVICE_EVENT,
							ConsolPlugin.INSTANCE.getString(
								"USRealmHeaderPatientGeneratedDocumentUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.29.1' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(USRealmHeaderPatientGeneratedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderPatientGeneratedDocument The receiving '<em><b>US Realm Header Patient Generated Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(
			USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				usRealmHeaderPatientGeneratedDocument)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"USRealmHeaderPatientGeneratedDocumentGeneralHeaderConstraintsTemplateId"),
						new Object[] { usRealmHeaderPatientGeneratedDocument }));
			}

			return false;
		}
		return true;
	}

} // USRealmHeaderPatientGeneratedDocumentOperations
