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
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.QuestionHelpTextPatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Help Text Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionHelpTextPatternObservationImpl extends ObservationImpl implements
		QuestionHelpTextPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionHelpTextPatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.QUESTION_HELP_TEXT_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionHelpTextPatternObservationOperations.validateQuestionHelpTextPatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionHelpTextPatternObservationOperations.validateQuestionHelpTextPatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionHelpTextPatternObservationOperations.validateQuestionHelpTextPatternObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionHelpTextPatternObservationOperations.validateQuestionHelpTextPatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionHelpTextPatternObservationOperations.validateQuestionHelpTextPatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionHelpTextPatternObservationOperations.validateQuestionHelpTextPatternObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservationLanguageCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionHelpTextPatternObservationOperations.validateQuestionHelpTextPatternObservationLanguageCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionHelpTextPatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionHelpTextPatternObservationOperations.validateQuestionHelpTextPatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionHelpTextPatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionHelpTextPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionHelpTextPatternObservationImpl
