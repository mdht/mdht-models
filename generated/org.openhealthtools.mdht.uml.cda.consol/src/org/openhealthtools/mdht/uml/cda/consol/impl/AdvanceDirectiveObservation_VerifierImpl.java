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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservation_VerifierOperations;

import org.openhealthtools.mdht.uml.cda.impl.Participant2Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Observation Verifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservation_VerifierImpl extends Participant2Impl implements
		AdvanceDirectiveObservation_Verifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservation_VerifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifierTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation_VerifierOperations.validateVerifierTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifierTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation_VerifierOperations.validateVerifierTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifierParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation_VerifierOperations.validateVerifierParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation_Verifier init() {
    	CDAUtil.init(this);
    	return this;
	}
} // AdvanceDirectiveObservation_VerifierImpl
