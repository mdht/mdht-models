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
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication;

import org.openhealthtools.mdht.uml.cda.consol.operations.HandoffCommunicationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handoff Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HandoffCommunicationImpl extends ActImpl implements HandoffCommunication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandoffCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HANDOFF_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoffCommunicationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HandoffCommunicationOperations.validateHandoffCommunicationParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandoffCommunication init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandoffCommunication init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HandoffCommunicationImpl
