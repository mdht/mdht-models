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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' templateId.root='2.16.840.1.113883.3.88.11.83.5' code.displayName='Payment sources' constraints.validation.error='InsuranceProviderTemplateId InsuranceProviderPaymentProviders InsuranceProviderHealthInsuranceType InsuranceProviderInsuranceInformation InsuranceProviderPatientInformation InsuranceProviderMemberId InsuranceProviderRelationshipToSubscriber InsuranceProviderRelationshipToSubscriberCodeSystem InsuranceProviderPatientName InsuranceProviderSubscriberId InsuranceProviderSubscriberAddress InsuranceProviderFinancialResponsibilityPartyType InsuranceProviderFinancialResponsibilityPartyTypeCode CoverageActivityCode' code.codeSystemName='LOINC' constraints.validation.warning='InsuranceProviderPayerEntryID InsuranceProviderHealthPlanCoverageStartTime InsuranceProviderHealthPlanCoverageStopTime InsuranceProviderMemberIdRoot InsuranceProviderSubscriberInformation InsuranceProviderSubscriberIdRoot InsuranceProviderFinancialResponsibilityPartyAddress' code.code='48768-6' constraints.validation.info='InsuranceProviderInsuranceInfoSourceID InsuranceProviderInsuranceInfoSourceAddr'"
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
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.code.codeSystem = '2.16.840.1.113883.6.255.1336' and (a.code.code='12' or a.code.code='13' or a.code.code='14' or a.code.code='15' or a.code.code='16' or a.code.code='41' or a.code.code='42' or a.code.code='43' or a.code.code='47' or a.code.code='AP' or a.code.code='C1' or a.code.code='CO' or a.code.code='CP' or a.code.code='D' or a.code.code='DB' or a.code.code='EP' or a.code.code='FF' or a.code.code='GP' or a.code.code='HM' or a.code.code='HN' or a.code.code='HS' or a.code.code='IN' or a.code.code='IP' or a.code.code='LC' or a.code.code='LD' or a.code.code='LI' or a.code.code='LT' or a.code.code='MA' or a.code.code='MB' or a.code.code='MC' or a.code.code='MH' or a.code.code='MI' or a.code.code='MP' or a.code.code='OT' or a.code.code='PE' or a.code.code='PL' or a.code.code='PP' or a.code.code='PR' or a.code.code='PS' or a.code.code='QM' or a.code.code='RP' or a.code.code='SP' or a.code.code='TF' or a.code.code='WC' or a.code.code='WU'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.code.codeSystem = \'2.16.840.1.113883.6.255.1336\' and (a.code.code=\'12\' or a.code.code=\'13\' or a.code.code=\'14\' or a.code.code=\'15\' or a.code.code=\'16\' or a.code.code=\'41\' or a.code.code=\'42\' or a.code.code=\'43\' or a.code.code=\'47\' or a.code.code=\'AP\' or a.code.code=\'C1\' or a.code.code=\'CO\' or a.code.code=\'CP\' or a.code.code=\'D\' or a.code.code=\'DB\' or a.code.code=\'EP\' or a.code.code=\'FF\' or a.code.code=\'GP\' or a.code.code=\'HM\' or a.code.code=\'HN\' or a.code.code=\'HS\' or a.code.code=\'IN\' or a.code.code=\'IP\' or a.code.code=\'LC\' or a.code.code=\'LD\' or a.code.code=\'LI\' or a.code.code=\'LT\' or a.code.code=\'MA\' or a.code.code=\'MB\' or a.code.code=\'MC\' or a.code.code=\'MH\' or a.code.code=\'MI\' or a.code.code=\'MP\' or a.code.code=\'OT\' or a.code.code=\'PE\' or a.code.code=\'PL\' or a.code.code=\'PP\' or a.code.code=\'PR\' or a.code.code=\'PS\' or a.code.code=\'QM\' or a.code.code=\'RP\' or a.code.code=\'SP\' or a.code.code=\'TF\' or a.code.code=\'WC\' or a.code.code=\'WU\'))'"
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
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code.codeSystem = '2.16.840.1.113883.5.111' and (par.participantRole.code.code = 'FAMDEP' or par.participantRole.code.code='HANDIC' or par.participantRole.code.code ='INJ' or par.participantRole.code.code='SELF' or par.participantRole.code.code='SPON' or par.participantRole.code.code ='STUD' or par.participantRole.code.code='FSTUD' or par.participantRole.code.code='PSTUD')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code.codeSystem = \'2.16.840.1.113883.5.111\' and (par.participantRole.code.code = \'FAMDEP\' or par.participantRole.code.code=\'HANDIC\' or par.participantRole.code.code =\'INJ\' or par.participantRole.code.code=\'SELF\' or par.participantRole.code.code=\'SPON\' or par.participantRole.code.code =\'STUD\' or par.participantRole.code.code=\'FSTUD\' or par.participantRole.code.code=\'PSTUD\')))'"
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
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.code.codeSystem = '2.16.840.1.113883.5.110'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.code.codeSystem = \'2.16.840.1.113883.5.110\'))'"
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
