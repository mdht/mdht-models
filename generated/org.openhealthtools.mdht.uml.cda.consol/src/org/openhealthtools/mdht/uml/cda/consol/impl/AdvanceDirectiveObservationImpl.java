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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservationImpl extends ObservationImpl implements AdvanceDirectiveObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationHasStartingTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationHasStartingTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationHasEndingTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationHasEndingTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationVerifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationVerifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationVerifierTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationVerifierTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationVerifierTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationVerifierTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationVerifierParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationVerifierParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianCustodianRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocumentText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationReferenceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AdvanceDirectiveObservationImpl
