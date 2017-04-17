/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage
 * @generated
 */
public interface QFDDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFDDFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.qfdd.impl.QFDDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Questionaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionaire</em>'.
	 * @generated
	 */
	Questionaire createQuestionaire();

	/**
	 * Returns a new object of class '<em>Questionaire Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionaire Header</em>'.
	 * @generated
	 */
	QuestionaireHeader createQuestionaireHeader();

	/**
	 * Returns a new object of class '<em>Questions Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Questions Organizer</em>'.
	 * @generated
	 */
	QuestionsOrganizer createQuestionsOrganizer();

	/**
	 * Returns a new object of class '<em>Numeric Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Question Pattern Observation</em>'.
	 * @generated
	 */
	NumericQuestionPatternObservation createNumericQuestionPatternObservation();

	/**
	 * Returns a new object of class '<em>Question Help Text Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Help Text Pattern Observation</em>'.
	 * @generated
	 */
	QuestionHelpTextPatternObservation createQuestionHelpTextPatternObservation();

	/**
	 * Returns a new object of class '<em>Multiple Choice Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Choice Question Pattern Observation</em>'.
	 * @generated
	 */
	MultipleChoiceQuestionPatternObservation createMultipleChoiceQuestionPatternObservation();

	/**
	 * Returns a new object of class '<em>Question Options Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Options Pattern Observation</em>'.
	 * @generated
	 */
	QuestionOptionsPatternObservation createQuestionOptionsPatternObservation();

	/**
	 * Returns a new object of class '<em>Question Media Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Media Pattern</em>'.
	 * @generated
	 */
	QuestionMediaPattern createQuestionMediaPattern();

	/**
	 * Returns a new object of class '<em>Question Feedback Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Feedback Pattern Observation</em>'.
	 * @generated
	 */
	QuestionFeedbackPatternObservation createQuestionFeedbackPatternObservation();

	/**
	 * Returns a new object of class '<em>Text Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Question Pattern Observation</em>'.
	 * @generated
	 */
	TextQuestionPatternObservation createTextQuestionPatternObservation();

	/**
	 * Returns a new object of class '<em>Analog Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Slider Question Pattern Observation</em>'.
	 * @generated
	 */
	AnalogSliderQuestionPatternObservation createAnalogSliderQuestionPatternObservation();

	/**
	 * Returns a new object of class '<em>Discrete Slider Question Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Slider Question Pattern Observation</em>'.
	 * @generated
	 */
	DiscreteSliderQuestionPatternObservation createDiscreteSliderQuestionPatternObservation();

	/**
	 * Returns a new object of class '<em>Question Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Reference Range Pattern</em>'.
	 * @generated
	 */
	QuestionReferenceRangePattern createQuestionReferenceRangePattern();

	/**
	 * Returns a new object of class '<em>Copy Right Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Right Pattern Observation</em>'.
	 * @generated
	 */
	CopyRightPatternObservation createCopyRightPatternObservation();

	/**
	 * Returns a new object of class '<em>Precondition Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition Pattern</em>'.
	 * @generated
	 */
	PreconditionPattern createPreconditionPattern();

	/**
	 * Returns a new object of class '<em>Criterion Pattern</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion Pattern</em>'.
	 * @generated
	 */
	CriterionPattern createCriterionPattern();

	/**
	 * Returns a new object of class '<em>Questionnaire Form Definition Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Form Definition Section</em>'.
	 * @generated
	 */
	QuestionnaireFormDefinitionSection createQuestionnaireFormDefinitionSection();

	/**
	 * Returns a new object of class '<em>Copy Right Section</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Right Section</em>'.
	 * @generated
	 */
	CopyRightSection createCopyRightSection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QFDDPackage getQFDDPackage();

} // QFDDFactory
