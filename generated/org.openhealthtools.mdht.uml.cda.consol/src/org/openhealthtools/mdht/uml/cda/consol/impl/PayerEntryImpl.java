/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.ParticipantRole;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PayerEntry;

import org.openhealthtools.mdht.uml.cda.consol.operations.PayerEntryOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payer Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PayerEntryImpl extends ActImpl implements PayerEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayerEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PAYER_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryPayerEntityIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryPayerEntityIsRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryCoveredPartyIsRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryCoveredPartyIsRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryCoveredPartyTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryCoveredPartyTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntrySubscriberIsAllowed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntrySubscriberIsAllowed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntrySubscriberTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntrySubscriberTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryEntryRelationshipREFR(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryEntryRelationshipREFR(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryEntryRelationshipTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryEntryRelationshipTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryPayerEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryPayerEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntryCoveredParty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntryCoveredParty(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntrySubscriber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayerEntryOperations.validatePayerEntrySubscriber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerEntry getPayerEntity() {
		return PayerEntryOperations.getPayerEntity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole getCoveredParty() {
		return PayerEntryOperations.getCoveredParty(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole getSubscriber() {
		return PayerEntryOperations.getSubscriber(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerEntry init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PayerEntryImpl
