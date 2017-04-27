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
import org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.NumericQuestionPatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Question Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NumericQuestionPatternObservationImpl extends ObservationImpl implements NumericQuestionPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericQuestionPatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.NUMERIC_QUESTION_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationPrecondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericQuestionPatternObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return NumericQuestionPatternObservationOperations.validateNumericQuestionPatternObservationReferenceRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionHelpTextPatternObservation getQuestionHelpTextPatternObservation() {
		return NumericQuestionPatternObservationOperations.getQuestionHelpTextPatternObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericQuestionPatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericQuestionPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NumericQuestionPatternObservationImpl
