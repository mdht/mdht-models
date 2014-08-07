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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReferralNote;

import org.openhealthtools.mdht.uml.cda.consol.operations.ReferralNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referral Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferralNoteImpl extends USRealmHeader2Impl implements ReferralNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REFERRAL_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiver(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiver(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContact(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContact(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteChiefComplaintSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteChiefComplaintAndReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientPersonPNFamily(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientPersonPNFamily(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientPersonPNGiven(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientPersonPNGiven(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientReceivedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientReceivedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCaregiverAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateReferralNoteParticipantCallbackContactAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChiefComplaintSection> getChiefComplaintSections() {
		return ReferralNoteOperations.getChiefComplaintSections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return ReferralNoteOperations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferralNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferralNote init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferralNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ReferralNoteImpl
