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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyObservationImpl extends ObservationImpl implements AllergyObservation {
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
	public boolean validateAllergyObservationValueOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationValueOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationOriginalTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationOriginalTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyStatusInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyStatusInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationReactionInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationSeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationSeverityInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationProblemEntryReactionObservationContainer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationProblemEntryReactionObservationContainer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationSeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationSeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public boolean validateAllergyObservationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionObservation> getProblemEntryReactionObservationContainers() {
		return AllergyObservationOperations.getProblemEntryReactionObservationContainers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation getSeverity() {
		return AllergyObservationOperations.getSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyStatusObservation getAllergyStatusObservation() {
		return AllergyObservationOperations.getAllergyStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // AllergyObservationImpl
