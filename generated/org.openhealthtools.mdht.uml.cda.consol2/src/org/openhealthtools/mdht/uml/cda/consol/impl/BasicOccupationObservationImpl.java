/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Observation;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.BasicOccupationObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Occupation Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BasicOccupationObservationImpl extends ObservationImpl implements BasicOccupationObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicOccupationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.BASIC_OCCUPATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationSubject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationBasicIndustryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationBasicIndustryObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationIVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicOccupationObservationIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return BasicOccupationObservationOperations.validateBasicOccupationObservationIVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getBasicIndustryObservation() {
		return BasicOccupationObservationOperations.getBasicIndustryObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicOccupationObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicOccupationObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BasicOccupationObservationImpl
