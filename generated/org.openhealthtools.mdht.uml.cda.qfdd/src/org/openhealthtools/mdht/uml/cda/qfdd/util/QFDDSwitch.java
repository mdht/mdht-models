/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Criterion;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Precondition;
import org.eclipse.mdht.uml.cda.ReferenceRange;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.ActRelationship;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.cda.qfdd.*;
import org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection;
import org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern;
import org.openhealthtools.mdht.uml.cda.qfdd.Questionaire;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer;
import org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage
 * @generated
 */
public class QFDDSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QFDDPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFDDSwitch() {
		if (modelPackage == null) {
			modelPackage = QFDDPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QFDDPackage.QUESTIONAIRE: {
				Questionaire questionaire = (Questionaire)theEObject;
				T result = caseQuestionaire(questionaire);
				if (result == null) result = caseQuestionaireHeader(questionaire);
				if (result == null) result = caseClinicalDocument(questionaire);
				if (result == null) result = caseAct(questionaire);
				if (result == null) result = caseInfrastructureRoot(questionaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.QUESTIONAIRE_HEADER: {
				QuestionaireHeader questionaireHeader = (QuestionaireHeader)theEObject;
				T result = caseQuestionaireHeader(questionaireHeader);
				if (result == null) result = caseClinicalDocument(questionaireHeader);
				if (result == null) result = caseAct(questionaireHeader);
				if (result == null) result = caseInfrastructureRoot(questionaireHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.COPY_RIGHT_SECTION: {
				CopyRightSection copyRightSection = (CopyRightSection)theEObject;
				T result = caseCopyRightSection(copyRightSection);
				if (result == null) result = caseSection(copyRightSection);
				if (result == null) result = caseAct(copyRightSection);
				if (result == null) result = caseInfrastructureRoot(copyRightSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.COPY_RIGHT_PATTERN_OBSERVATION: {
				CopyRightPatternObservation copyRightPatternObservation = (CopyRightPatternObservation)theEObject;
				T result = caseCopyRightPatternObservation(copyRightPatternObservation);
				if (result == null) result = caseObservation(copyRightPatternObservation);
				if (result == null) result = caseClinicalStatement(copyRightPatternObservation);
				if (result == null) result = caseAct(copyRightPatternObservation);
				if (result == null) result = caseInfrastructureRoot(copyRightPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.QUESTIONNAIRE_FORM_DEFINITION_SECTION: {
				QuestionnaireFormDefinitionSection questionnaireFormDefinitionSection = (QuestionnaireFormDefinitionSection)theEObject;
				T result = caseQuestionnaireFormDefinitionSection(questionnaireFormDefinitionSection);
				if (result == null) result = caseSection(questionnaireFormDefinitionSection);
				if (result == null) result = caseAct(questionnaireFormDefinitionSection);
				if (result == null) result = caseInfrastructureRoot(questionnaireFormDefinitionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.QUESTIONS_ORGANIZER: {
				QuestionsOrganizer questionsOrganizer = (QuestionsOrganizer)theEObject;
				T result = caseQuestionsOrganizer(questionsOrganizer);
				if (result == null) result = caseOrganizer(questionsOrganizer);
				if (result == null) result = caseClinicalStatement(questionsOrganizer);
				if (result == null) result = caseAct(questionsOrganizer);
				if (result == null) result = caseInfrastructureRoot(questionsOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.NUMERIC_QUESTION_PATTERN_OBSERVATION: {
				NumericQuestionPatternObservation numericQuestionPatternObservation = (NumericQuestionPatternObservation)theEObject;
				T result = caseNumericQuestionPatternObservation(numericQuestionPatternObservation);
				if (result == null) result = caseObservation(numericQuestionPatternObservation);
				if (result == null) result = caseClinicalStatement(numericQuestionPatternObservation);
				if (result == null) result = caseAct(numericQuestionPatternObservation);
				if (result == null) result = caseInfrastructureRoot(numericQuestionPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.QUESTION_HELP_TEXT_PATTERN_OBSERVATION: {
				QuestionHelpTextPatternObservation questionHelpTextPatternObservation = (QuestionHelpTextPatternObservation)theEObject;
				T result = caseQuestionHelpTextPatternObservation(questionHelpTextPatternObservation);
				if (result == null) result = caseObservation(questionHelpTextPatternObservation);
				if (result == null) result = caseClinicalStatement(questionHelpTextPatternObservation);
				if (result == null) result = caseAct(questionHelpTextPatternObservation);
				if (result == null) result = caseInfrastructureRoot(questionHelpTextPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION: {
				MultipleChoiceQuestionPatternObservation multipleChoiceQuestionPatternObservation = (MultipleChoiceQuestionPatternObservation)theEObject;
				T result = caseMultipleChoiceQuestionPatternObservation(multipleChoiceQuestionPatternObservation);
				if (result == null) result = caseObservation(multipleChoiceQuestionPatternObservation);
				if (result == null) result = caseClinicalStatement(multipleChoiceQuestionPatternObservation);
				if (result == null) result = caseAct(multipleChoiceQuestionPatternObservation);
				if (result == null) result = caseInfrastructureRoot(multipleChoiceQuestionPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.QUESTION_OPTIONS_PATTERN_OBSERVATION: {
				QuestionOptionsPatternObservation questionOptionsPatternObservation = (QuestionOptionsPatternObservation)theEObject;
				T result = caseQuestionOptionsPatternObservation(questionOptionsPatternObservation);
				if (result == null) result = caseObservation(questionOptionsPatternObservation);
				if (result == null) result = caseClinicalStatement(questionOptionsPatternObservation);
				if (result == null) result = caseAct(questionOptionsPatternObservation);
				if (result == null) result = caseInfrastructureRoot(questionOptionsPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.QUESTION_MEDIA_PATTERN: {
				QuestionMediaPattern questionMediaPattern = (QuestionMediaPattern)theEObject;
				T result = caseQuestionMediaPattern(questionMediaPattern);
				if (result == null) result = caseObservation(questionMediaPattern);
				if (result == null) result = caseClinicalStatement(questionMediaPattern);
				if (result == null) result = caseAct(questionMediaPattern);
				if (result == null) result = caseInfrastructureRoot(questionMediaPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.QUESTION_FEEDBACK_PATTERN_OBSERVATION: {
				QuestionFeedbackPatternObservation questionFeedbackPatternObservation = (QuestionFeedbackPatternObservation)theEObject;
				T result = caseQuestionFeedbackPatternObservation(questionFeedbackPatternObservation);
				if (result == null) result = caseObservation(questionFeedbackPatternObservation);
				if (result == null) result = caseClinicalStatement(questionFeedbackPatternObservation);
				if (result == null) result = caseAct(questionFeedbackPatternObservation);
				if (result == null) result = caseInfrastructureRoot(questionFeedbackPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.TEXT_QUESTION_PATTERN_OBSERVATION: {
				TextQuestionPatternObservation textQuestionPatternObservation = (TextQuestionPatternObservation)theEObject;
				T result = caseTextQuestionPatternObservation(textQuestionPatternObservation);
				if (result == null) result = caseObservation(textQuestionPatternObservation);
				if (result == null) result = caseClinicalStatement(textQuestionPatternObservation);
				if (result == null) result = caseAct(textQuestionPatternObservation);
				if (result == null) result = caseInfrastructureRoot(textQuestionPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION: {
				AnalogSliderQuestionPatternObservation analogSliderQuestionPatternObservation = (AnalogSliderQuestionPatternObservation)theEObject;
				T result = caseAnalogSliderQuestionPatternObservation(analogSliderQuestionPatternObservation);
				if (result == null) result = caseNumericQuestionPatternObservation(analogSliderQuestionPatternObservation);
				if (result == null) result = caseObservation(analogSliderQuestionPatternObservation);
				if (result == null) result = caseClinicalStatement(analogSliderQuestionPatternObservation);
				if (result == null) result = caseAct(analogSliderQuestionPatternObservation);
				if (result == null) result = caseInfrastructureRoot(analogSliderQuestionPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION: {
				DiscreteSliderQuestionPatternObservation discreteSliderQuestionPatternObservation = (DiscreteSliderQuestionPatternObservation)theEObject;
				T result = caseDiscreteSliderQuestionPatternObservation(discreteSliderQuestionPatternObservation);
				if (result == null) result = caseMultipleChoiceQuestionPatternObservation(discreteSliderQuestionPatternObservation);
				if (result == null) result = caseObservation(discreteSliderQuestionPatternObservation);
				if (result == null) result = caseClinicalStatement(discreteSliderQuestionPatternObservation);
				if (result == null) result = caseAct(discreteSliderQuestionPatternObservation);
				if (result == null) result = caseInfrastructureRoot(discreteSliderQuestionPatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.QUESTION_REFERENCE_RANGE_PATTERN: {
				QuestionReferenceRangePattern questionReferenceRangePattern = (QuestionReferenceRangePattern)theEObject;
				T result = caseQuestionReferenceRangePattern(questionReferenceRangePattern);
				if (result == null) result = caseReferenceRange(questionReferenceRangePattern);
				if (result == null) result = caseActRelationship(questionReferenceRangePattern);
				if (result == null) result = caseInfrastructureRoot(questionReferenceRangePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.PRECONDITION_PATTERN: {
				PreconditionPattern preconditionPattern = (PreconditionPattern)theEObject;
				T result = casePreconditionPattern(preconditionPattern);
				if (result == null) result = casePrecondition(preconditionPattern);
				if (result == null) result = caseActRelationship(preconditionPattern);
				if (result == null) result = caseInfrastructureRoot(preconditionPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QFDDPackage.CRITERION_PATTERN: {
				CriterionPattern criterionPattern = (CriterionPattern)theEObject;
				T result = caseCriterionPattern(criterionPattern);
				if (result == null) result = caseCriterion(criterionPattern);
				if (result == null) result = caseAct(criterionPattern);
				if (result == null) result = caseInfrastructureRoot(criterionPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionaire(Questionaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionaire Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionaireHeader(QuestionaireHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questions Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionsOrganizer(QuestionsOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Question Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericQuestionPatternObservation(NumericQuestionPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Help Text Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionHelpTextPatternObservation(QuestionHelpTextPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Choice Question Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChoiceQuestionPatternObservation(MultipleChoiceQuestionPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Options Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Options Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionOptionsPatternObservation(QuestionOptionsPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Media Pattern</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Media Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionMediaPattern(QuestionMediaPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Feedback Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Feedback Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionFeedbackPatternObservation(QuestionFeedbackPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Question Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextQuestionPatternObservation(TextQuestionPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Slider Question Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogSliderQuestionPatternObservation(AnalogSliderQuestionPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Slider Question Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteSliderQuestionPatternObservation(DiscreteSliderQuestionPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Reference Range Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionReferenceRangePattern(QuestionReferenceRangePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Right Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Right Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyRightPatternObservation(CopyRightPatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition Pattern</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreconditionPattern(PreconditionPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion Pattern</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriterionPattern(CriterionPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActRelationship(ActRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceRange(ReferenceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriterion(Criterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Form Definition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireFormDefinitionSection(QuestionnaireFormDefinitionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Right Section</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Right Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyRightSection(CopyRightSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch, but this is the last case anyway.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // QFDDSwitch
