/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardiac Arrest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CardiacArrestImpl extends ObservationImpl implements CardiacArrest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacArrestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CARDIAC_ARREST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestCauseRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestCauseRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestInformantParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestInformantParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestPriorCPRRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestPriorCPRRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestPriorAEDRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestPriorAEDRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestSpontaneousCirculationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestSpontaneousCirculationRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestDestinationRhythmRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestDestinationRhythmRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestArrestRhythmRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestArrestRhythmRelationship(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestOperations.validateCardiacArrestValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrest init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrest init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CardiacArrestImpl
