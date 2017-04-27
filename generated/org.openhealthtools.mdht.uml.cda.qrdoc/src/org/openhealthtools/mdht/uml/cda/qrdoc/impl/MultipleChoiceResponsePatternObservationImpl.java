/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.operations.MultipleChoiceResponsePatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice Response Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MultipleChoiceResponsePatternObservationImpl extends ObservationImpl implements
		MultipleChoiceResponsePatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceResponsePatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRDOCPackage.Literals.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationLanguageCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationLanguageCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationCDCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationCDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationCDCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationCDCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationCDOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationCDOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationCECode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationCECode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationCECodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationCECodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoiceResponsePatternObservationCEDisplayName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultipleChoiceResponsePatternObservationOperations.validateMultipleChoiceResponsePatternObservationCEDisplayName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextResponsePatternObservation> getTextQuestionResponseObservations() {
		return MultipleChoiceResponsePatternObservationOperations.getTextQuestionResponseObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionHelpTextPatternObservation> getQuestionHelpTextPatternObservations() {
		return MultipleChoiceResponsePatternObservationOperations.getQuestionHelpTextPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionOptionsPatternObservation> getQuestionOptionsPatternObservations() {
		return MultipleChoiceResponsePatternObservationOperations.getQuestionOptionsPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoiceResponsePatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MultipleChoiceResponsePatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // MultipleChoiceResponsePatternObservationImpl
