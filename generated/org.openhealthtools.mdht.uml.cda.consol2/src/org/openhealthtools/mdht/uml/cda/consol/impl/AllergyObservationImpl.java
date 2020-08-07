/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AllergyObservationImpl extends SubstanceOrDeviceAllergyObservationImpl implements AllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationValueOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationValueOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationOriginalTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationOriginalTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationOriginalTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationReactionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationSeverityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationSeverityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReactionObservation> getConsolReactionObservations() {
		return AllergyObservationOperations.getConsolReactionObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation getConsolSeverityObservation() {
		return AllergyObservationOperations.getConsolSeverityObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyStatusObservation getConsolAllergyStatusObservation() {
		return AllergyObservationOperations.getConsolAllergyStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AllergyObservationImpl
