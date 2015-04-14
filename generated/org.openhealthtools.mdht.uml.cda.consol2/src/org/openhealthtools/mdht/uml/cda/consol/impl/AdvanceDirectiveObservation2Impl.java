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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservation2Impl extends AdvanceDirectiveObservationImpl implements
		AdvanceDirectiveObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation2HasStartingTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2HasStartingTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation2HasEndingTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2HasEndingTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2Value(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2IVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation2IVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2IVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRole(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianRole(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationVerifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationVerifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCustodian(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationReferenceExternalDocumentText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectiveObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectiveObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AdvanceDirectiveObservation2Impl
