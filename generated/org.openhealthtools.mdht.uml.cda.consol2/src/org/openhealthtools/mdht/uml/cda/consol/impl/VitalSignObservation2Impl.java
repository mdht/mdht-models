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
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;

import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Sign Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignObservation2Impl extends VitalSignObservationImpl implements VitalSignObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.VITAL_SIGN_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservationInterpretationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationInterpretationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservation2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservation2PQUnit(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservation2PQUnit(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationInterpretationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignObservation2Operations.validateVitalSignObservationAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // VitalSignObservation2Impl
