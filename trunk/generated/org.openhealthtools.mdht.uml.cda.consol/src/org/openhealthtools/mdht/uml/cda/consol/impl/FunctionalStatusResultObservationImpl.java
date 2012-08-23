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

import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;

import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Result Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusResultObservationImpl extends ResultObservationImpl implements
		FunctionalStatusResultObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FunctionalStatusResultObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FUNCTIONAL_STATUS_RESULT_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationTextReference(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationValueDatatype(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationValueDatatype(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationInterpretationCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationMethodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationMethodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationTargetSiteCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationAuthor(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationNonMedicinalSupplyActivity(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationCaregiverCharacteristics(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationAssessmentScaleObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRange(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultObservationReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRangeObservationRange(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public NonMedicinalSupplyActivity getNonMedicinalSupplyActivity() {
		return FunctionalStatusResultObservationOperations.getNonMedicinalSupplyActivity(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public CaregiverCharacteristics getCaregiverCharacteristics() {
		return FunctionalStatusResultObservationOperations.getCaregiverCharacteristics(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public AssessmentScaleObservation getAssessmentScaleObservation() {
		return FunctionalStatusResultObservationOperations.getAssessmentScaleObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusResultObservationOperations.validateResultObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public FunctionalStatusResultObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FunctionalStatusResultObservationImpl
