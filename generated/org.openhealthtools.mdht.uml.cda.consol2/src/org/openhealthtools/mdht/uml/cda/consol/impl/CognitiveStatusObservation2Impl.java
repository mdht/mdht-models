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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;

import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusObservation2Operations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cognitive Status Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CognitiveStatusObservation2Impl extends ObservationImpl implements CognitiveStatusObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CognitiveStatusObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COGNITIVE_STATUS_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2ValueDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2ValueDatatype(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2ClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2MoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2CodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2Text(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2Text(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2StatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2StatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2StatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2StatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2Value(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2NonMedicinalSupplyActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2NonMedicinalSupplyActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2CaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2CaregiverCharacteristics(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2AssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2AssessmentScaleObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusObservation2ReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2ReferenceRange(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NonMedicinalSupplyActivity2> getNonMedicinalSupplyActivity2s() {
		return CognitiveStatusObservation2Operations.getNonMedicinalSupplyActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return CognitiveStatusObservation2Operations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return CognitiveStatusObservation2Operations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CognitiveStatusObservation2Impl
