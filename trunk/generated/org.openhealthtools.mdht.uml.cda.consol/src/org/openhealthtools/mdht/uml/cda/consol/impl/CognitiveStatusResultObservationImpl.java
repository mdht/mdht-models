/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cognitive Status Result Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CognitiveStatusResultObservationImpl extends ResultObservationImpl implements
		CognitiveStatusResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CognitiveStatusResultObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationValueDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationValueDatatype(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationMethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationCaregiverCharacteristics(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationAssessmentScaleObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultObservationReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRangeObservationRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities() {
		return CognitiveStatusResultObservationOperations.getNonMedicinalSupplyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return CognitiveStatusResultObservationOperations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return CognitiveStatusResultObservationOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusResultObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public CognitiveStatusResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // CognitiveStatusResultObservationImpl
