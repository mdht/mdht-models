/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.QuestionFeedbackPatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Feedback Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionFeedbackPatternObservationImpl extends ObservationImpl implements
		QuestionFeedbackPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionFeedbackPatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.QUESTION_FEEDBACK_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionFeedbackPatternObservationOperations.validateQuestionFeedbackPatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionFeedbackPatternObservationOperations.validateQuestionFeedbackPatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionFeedbackPatternObservationOperations.validateQuestionFeedbackPatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionFeedbackPatternObservationOperations.validateQuestionFeedbackPatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionFeedbackPatternObservationOperations.validateQuestionFeedbackPatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionFeedbackPatternObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionFeedbackPatternObservationOperations.validateQuestionFeedbackPatternObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionFeedbackPatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionFeedbackPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionFeedbackPatternObservationImpl
