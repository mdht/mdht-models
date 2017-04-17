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
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.QuestionOptionsPatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Options Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionOptionsPatternObservationImpl extends ObservationImpl implements QuestionOptionsPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionOptionsPatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.QUESTION_OPTIONS_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionOptionsPatternObservationOperations.validateQuestionOptionsPatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionOptionsPatternObservationOperations.validateQuestionOptionsPatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionOptionsPatternObservationOperations.validateQuestionOptionsPatternObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionOptionsPatternObservationOperations.validateQuestionOptionsPatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionOptionsPatternObservationOperations.validateQuestionOptionsPatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionOptionsPatternObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionOptionsPatternObservationOperations.validateQuestionOptionsPatternObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionOptionsPatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionOptionsPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionOptionsPatternObservationImpl
