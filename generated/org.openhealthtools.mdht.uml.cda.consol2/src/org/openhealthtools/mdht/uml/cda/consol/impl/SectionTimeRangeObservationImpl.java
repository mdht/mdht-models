/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.SectionTimeRangeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Time Range Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SectionTimeRangeObservationImpl extends ObservationImpl implements SectionTimeRangeObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionTimeRangeObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SECTION_TIME_RANGE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationIVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionTimeRangeObservationIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationIVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionTimeRangeObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionTimeRangeObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SectionTimeRangeObservationImpl
