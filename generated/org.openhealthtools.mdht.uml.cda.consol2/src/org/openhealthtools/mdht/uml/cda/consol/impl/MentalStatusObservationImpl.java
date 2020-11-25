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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mental Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MentalStatusObservationImpl extends ObservationImpl implements MentalStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MENTAL_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationAssessmentScaleObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusObservationAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservationOperations.validateMentalStatusObservationAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return MentalStatusObservationOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MentalStatusObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // MentalStatusObservationImpl
