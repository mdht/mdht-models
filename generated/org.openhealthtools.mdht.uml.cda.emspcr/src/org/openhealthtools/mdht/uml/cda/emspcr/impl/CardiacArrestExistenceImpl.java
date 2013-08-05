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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestExistenceOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardiac Arrest Existence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CardiacArrestExistenceImpl extends ObservationImpl implements CardiacArrestExistence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacArrestExistenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CARDIAC_ARREST_EXISTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceCardiacArrestCauseRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceCardiacArrestCauseRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceCardiacArrestInformantParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceCardiacArrestInformantParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistencePriorCPRRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistencePriorCPRRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistencePriorAEDRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistencePriorAEDRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceSpontaneousCirculationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceSpontaneousCirculationRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceDestinationRhythmRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceDestinationRhythmRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceArrestRhythmRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceArrestRhythmRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestExistenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestExistenceOperations.validateCardiacArrestExistenceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestExistence init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestExistence init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CardiacArrestExistenceImpl
