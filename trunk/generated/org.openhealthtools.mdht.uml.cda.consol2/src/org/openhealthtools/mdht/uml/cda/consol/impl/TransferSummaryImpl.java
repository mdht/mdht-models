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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;

import org.openhealthtools.mdht.uml.cda.consol.operations.TransferSummaryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TransferSummaryImpl extends USRealmHeader2Impl implements TransferSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.TRANSFER_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupport(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupport(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContact(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContact(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryIIRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryIIRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformer1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformer1(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferSummary init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferSummary init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // TransferSummaryImpl
