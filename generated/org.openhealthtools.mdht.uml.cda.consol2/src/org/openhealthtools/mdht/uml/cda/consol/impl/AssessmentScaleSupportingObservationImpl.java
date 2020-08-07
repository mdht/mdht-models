/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentScaleSupportingObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Scale Supporting Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssessmentScaleSupportingObservationImpl extends ObservationImpl
		implements AssessmentScaleSupportingObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentScaleSupportingObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationCodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationCodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationValueTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationValueTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssessmentScaleSupportingObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentScaleSupportingObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentScaleSupportingObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AssessmentScaleSupportingObservationImpl
