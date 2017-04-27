/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.MultipleChoiceQuestionPatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice Question Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MultipleChoiceQuestionPatternObservationImpl extends ObservationImpl implements
		MultipleChoiceQuestionPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceQuestionPatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationPrecondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationCECode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationCECode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationCECodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationCECodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceQuestionPatternObservationCEDisplayName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceQuestionPatternObservationOperations.validateMultipleChoiceQuestionPatternObservationCEDisplayName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionHelpTextPatternObservation> getQuestionHelpTextPatternObservations() {
		return MultipleChoiceQuestionPatternObservationOperations.getQuestionHelpTextPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionOptionsPatternObservation> getQuestionOptionsPatternObservations() {
		return MultipleChoiceQuestionPatternObservationOperations.getQuestionOptionsPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionMediaPattern> getQuestionMediaPatterns() {
		return MultipleChoiceQuestionPatternObservationOperations.getQuestionMediaPatterns(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionFeedbackPatternObservation> getQuestionFeedbackPatternObservations() {
		return MultipleChoiceQuestionPatternObservationOperations.getQuestionFeedbackPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextQuestionPatternObservation> getTextQuestionPatternObservations() {
		return MultipleChoiceQuestionPatternObservationOperations.getTextQuestionPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoiceQuestionPatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultipleChoiceQuestionPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // MultipleChoiceQuestionPatternObservationImpl
