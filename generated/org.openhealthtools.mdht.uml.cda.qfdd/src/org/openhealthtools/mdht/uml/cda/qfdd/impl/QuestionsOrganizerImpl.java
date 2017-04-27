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
import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer;
import org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.QuestionsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questions Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionsOrganizerImpl extends OrganizerImpl implements QuestionsOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionsOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.QUESTIONS_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerPrecondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerPrecondition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerNumericQuestionPatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerNumericQuestionPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerTextQuestionPatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerTextQuestionPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerAnalogSliderQuestionPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionsOrganizerOperations.validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumericQuestionPatternObservation> getNumericQuestionPatternObservations() {
		return QuestionsOrganizerOperations.getNumericQuestionPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultipleChoiceQuestionPatternObservation> getMultipleChoiceQuestionPatternObservations() {
		return QuestionsOrganizerOperations.getMultipleChoiceQuestionPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextQuestionPatternObservation> getTextQuestionPatternObservations() {
		return QuestionsOrganizerOperations.getTextQuestionPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogSliderQuestionPatternObservation> getAnalogSliderQuestionPatternObservations() {
		return QuestionsOrganizerOperations.getAnalogSliderQuestionPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteSliderQuestionPatternObservation> getDiscreteSliderQuestionPatternObservations() {
		return QuestionsOrganizerOperations.getDiscreteSliderQuestionPatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsOrganizer init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionsOrganizerImpl
