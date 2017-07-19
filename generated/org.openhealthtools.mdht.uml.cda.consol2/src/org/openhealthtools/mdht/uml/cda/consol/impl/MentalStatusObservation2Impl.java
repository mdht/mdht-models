/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mental Status Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MentalStatusObservation2Impl extends CognitiveStatusResultObservationImpl
		implements MentalStatusObservation2 {
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
	public EList<AssessmentScaleObservation> getConsolAssessmentScaleObservations() {
		return MentalStatusObservation2Operations.getConsolAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity> getConsolNonMedicinalSupplyActivities() {
		return MentalStatusObservation2Operations.getConsolNonMedicinalSupplyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaregiverCharacteristics> getConsolCaregiverCharacteristicss() {
		return MentalStatusObservation2Operations.getConsolCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationValueDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationValueDatatype(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationNoObservationRangeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationNoObservationRangeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationAuthorMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationAuthorMultiplicity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationInterpretationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationMethodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateResultObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationAssessmentScaleObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationReferenceRange(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationCaregiverCharacteristics(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultObservationReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationReferenceRangeObservationRange(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MentalStatusObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MentalStatusObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MentalStatusObservation2Impl
