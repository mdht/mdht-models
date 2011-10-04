/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getInsuranceProvider()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.5' constraints.validation.error='InsuranceProviderTemplateId InsuranceProviderPaymentProviders InsuranceProviderHealthInsuranceType InsuranceProviderInsuranceInformation InsuranceProviderPatientInformation InsuranceProviderMemberId InsuranceProviderRelationshipToSubscriber InsuranceProviderRelationshipToSubscriberCodeSystem InsuranceProviderPatientName InsuranceProviderSubscriberId InsuranceProviderSubscriberAddress InsuranceProviderFinancialResponsibilityPartyType InsuranceProviderFinancialResponsibilityPartyTypeCode' constraints.validation.warning='InsuranceProviderPayerEntryID InsuranceProviderHealthPlanCoverageStartTime InsuranceProviderHealthPlanCoverageStopTime InsuranceProviderMemberIdRoot InsuranceProviderSubscriberInformation InsuranceProviderSubscriberIdRoot InsuranceProviderFinancialResponsibilityPartyAddress' constraints.validation.info='InsuranceProviderInsuranceInfoSourceID InsuranceProviderInsuranceInfoSourceAddr'"
 * @generated
 */
public interface InsuranceProvider extends CoverageEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))'"
	 * @generated
	 */
	boolean validateInsuranceProviderPaymentProviders(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | not a.id.root->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | not a.id.root->isEmpty())'"
	 * @generated
	 */
	boolean validateInsuranceProviderPayerEntryID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.code.codeSystem = '2.16.840.1.113883.3.88.12.3221.5.2')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.code.codeSystem = \'2.16.840.1.113883.3.88.12.3221.5.2\')'"
	 * @generated
	 */
	boolean validateInsuranceProviderHealthInsuranceType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderInsuranceInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.id->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.id->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderInsuranceInfoSourceID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.addr->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.addr->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderInsuranceInfoSourceAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.low->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.low->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderHealthPlanCoverageStartTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.high->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.high->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderHealthPlanCoverageStopTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT))'"
	 * @generated
	 */
	boolean validateInsuranceProviderPatientInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderMemberId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id.root->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id.root->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderMemberIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderRelationshipToSubscriber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code.codeSystem = '2.16.840.1.113883.1.11.18877'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code.codeSystem = \'2.16.840.1.113883.1.11.18877\'))'"
	 * @generated
	 */
	boolean validateInsuranceProviderRelationshipToSubscriberCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.playingEntity.name->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.playingEntity.name->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderPatientName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD))'"
	 * @generated
	 */
	boolean validateInsuranceProviderSubscriberInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderSubscriberId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id.root->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id.root->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderSubscriberIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.addr->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.addr->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderSubscriberAddress(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.typeCode = vocab::ParticipationPhysicalPerformer::PRF and per.assignedEntity.code->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.typeCode = vocab::ParticipationPhysicalPerformer::PRF and per.assignedEntity.code->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderFinancialResponsibilityPartyType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.code.codeSystem = '2.16.840.1.113883.1.11.10416'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.code.codeSystem = \'2.16.840.1.113883.1.11.10416\'))'"
	 * @generated
	 */
	boolean validateInsuranceProviderFinancialResponsibilityPartyTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.addr->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.addr->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderFinancialResponsibilityPartyAddress(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.5')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.5\')'"
	 * @generated
	 */
	boolean validateInsuranceProviderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceProvider init();
} // InsuranceProvider
