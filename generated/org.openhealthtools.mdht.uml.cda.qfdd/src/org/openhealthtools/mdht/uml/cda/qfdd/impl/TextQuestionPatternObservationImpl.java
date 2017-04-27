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
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.TextQuestionPatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Question Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextQuestionPatternObservationImpl extends ObservationImpl implements TextQuestionPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextQuestionPatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.TEXT_QUESTION_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationQuestionHelpTextPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationQuestionMediaPattern(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationQuestionMediaPattern(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextQuestionPatternObservationPrecondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TextQuestionPatternObservationOperations.validateTextQuestionPatternObservationPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionHelpTextPatternObservation> getQuestionHelpTextPatternObservations() {
		return TextQuestionPatternObservationOperations.getQuestionHelpTextPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionMediaPattern> getQuestionMediaPatterns() {
		return TextQuestionPatternObservationOperations.getQuestionMediaPatterns(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextQuestionPatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextQuestionPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TextQuestionPatternObservationImpl
