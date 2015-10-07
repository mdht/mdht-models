/**
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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;

import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusObservation2Operations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mental Status Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MentalStatusObservation2Impl extends ObservationImpl implements MentalStatusObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2ValueDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2ValueDatatype(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2MoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2StatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2Value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2Value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2AssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2AssessmentScaleObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2ReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2ReferenceRange(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2CDTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2CDTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservation2CDTranslationP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateMentalStatusObservation2CDTranslationP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return MentalStatusObservation2Operations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MentalStatusObservation2Impl
