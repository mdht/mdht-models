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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirective;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveImpl extends ObservationImpl implements AdvanceDirective {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveAdvDirectiveCodeValueSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveAdvDirectiveCodeValueSet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveAdvDirectiveCodeCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveAdvDirectiveCodeCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasExternalReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasExternalReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasStartingTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasStartingTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasEndingTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasEndingTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveParticipantRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveParticipantRoleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasAddress(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasAddress(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasNameOfAgent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasNameOfAgent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveRepeatNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveRepeatNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveAdvanceDirectiveStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveAdvanceDirectiveStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveStatusObservation getAdvanceDirectiveStatusObservation() {
		return AdvanceDirectiveOperations.getAdvanceDirectiveStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirective init() {
    	CDAUtil.init(this);
    	return this;
	}
} //AdvanceDirectiveImpl
