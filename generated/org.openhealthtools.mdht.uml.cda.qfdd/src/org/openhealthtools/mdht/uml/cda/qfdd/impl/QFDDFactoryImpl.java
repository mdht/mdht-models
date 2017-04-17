/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.*;
import org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection;
import org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QFDDFactoryImpl extends EFactoryImpl implements QFDDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QFDDFactory init() {
		try {
			QFDDFactory theQFDDFactory = (QFDDFactory)EPackage.Registry.INSTANCE.getEFactory(QFDDPackage.eNS_URI);
			if (theQFDDFactory != null) {
				return theQFDDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QFDDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFDDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QFDDPackage.QUESTIONAIRE: return createQuestionaire();
			case QFDDPackage.QUESTIONAIRE_HEADER: return createQuestionaireHeader();
			case QFDDPackage.COPY_RIGHT_SECTION: return createCopyRightSection();
			case QFDDPackage.COPY_RIGHT_PATTERN_OBSERVATION: return createCopyRightPatternObservation();
			case QFDDPackage.QUESTIONNAIRE_FORM_DEFINITION_SECTION: return createQuestionnaireFormDefinitionSection();
			case QFDDPackage.QUESTIONS_ORGANIZER: return createQuestionsOrganizer();
			case QFDDPackage.NUMERIC_QUESTION_PATTERN_OBSERVATION: return createNumericQuestionPatternObservation();
			case QFDDPackage.QUESTION_HELP_TEXT_PATTERN_OBSERVATION: return createQuestionHelpTextPatternObservation();
			case QFDDPackage.MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION: return createMultipleChoiceQuestionPatternObservation();
			case QFDDPackage.QUESTION_OPTIONS_PATTERN_OBSERVATION: return createQuestionOptionsPatternObservation();
			case QFDDPackage.QUESTION_MEDIA_PATTERN: return createQuestionMediaPattern();
			case QFDDPackage.QUESTION_FEEDBACK_PATTERN_OBSERVATION: return createQuestionFeedbackPatternObservation();
			case QFDDPackage.TEXT_QUESTION_PATTERN_OBSERVATION: return createTextQuestionPatternObservation();
			case QFDDPackage.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION: return createAnalogSliderQuestionPatternObservation();
			case QFDDPackage.DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION: return createDiscreteSliderQuestionPatternObservation();
			case QFDDPackage.QUESTION_REFERENCE_RANGE_PATTERN: return createQuestionReferenceRangePattern();
			case QFDDPackage.PRECONDITION_PATTERN: return createPreconditionPattern();
			case QFDDPackage.CRITERION_PATTERN: return createCriterionPattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionaire createQuestionaire() {
		QuestionaireImpl questionaire = new QuestionaireImpl();
		return questionaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionaireHeader createQuestionaireHeader() {
		QuestionaireHeaderImpl questionaireHeader = new QuestionaireHeaderImpl();
		return questionaireHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsOrganizer createQuestionsOrganizer() {
		QuestionsOrganizerImpl questionsOrganizer = new QuestionsOrganizerImpl();
		return questionsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public NumericQuestionPatternObservation createNumericQuestionPatternObservation() {
		NumericQuestionPatternObservationImpl numericQuestionPatternObservation = new NumericQuestionPatternObservationImpl();
		return numericQuestionPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionHelpTextPatternObservation createQuestionHelpTextPatternObservation() {
		QuestionHelpTextPatternObservationImpl questionHelpTextPatternObservation = new QuestionHelpTextPatternObservationImpl();
		return questionHelpTextPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoiceQuestionPatternObservation createMultipleChoiceQuestionPatternObservation() {
		MultipleChoiceQuestionPatternObservationImpl multipleChoiceQuestionPatternObservation = new MultipleChoiceQuestionPatternObservationImpl();
		return multipleChoiceQuestionPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionOptionsPatternObservation createQuestionOptionsPatternObservation() {
		QuestionOptionsPatternObservationImpl questionOptionsPatternObservation = new QuestionOptionsPatternObservationImpl();
		return questionOptionsPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionMediaPattern createQuestionMediaPattern() {
		QuestionMediaPatternImpl questionMediaPattern = new QuestionMediaPatternImpl();
		return questionMediaPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionFeedbackPatternObservation createQuestionFeedbackPatternObservation() {
		QuestionFeedbackPatternObservationImpl questionFeedbackPatternObservation = new QuestionFeedbackPatternObservationImpl();
		return questionFeedbackPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public TextQuestionPatternObservation createTextQuestionPatternObservation() {
		TextQuestionPatternObservationImpl textQuestionPatternObservation = new TextQuestionPatternObservationImpl();
		return textQuestionPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSliderQuestionPatternObservation createAnalogSliderQuestionPatternObservation() {
		AnalogSliderQuestionPatternObservationImpl analogSliderQuestionPatternObservation = new AnalogSliderQuestionPatternObservationImpl();
		return analogSliderQuestionPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSliderQuestionPatternObservation createDiscreteSliderQuestionPatternObservation() {
		DiscreteSliderQuestionPatternObservationImpl discreteSliderQuestionPatternObservation = new DiscreteSliderQuestionPatternObservationImpl();
		return discreteSliderQuestionPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionReferenceRangePattern createQuestionReferenceRangePattern() {
		QuestionReferenceRangePatternImpl questionReferenceRangePattern = new QuestionReferenceRangePatternImpl();
		return questionReferenceRangePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public CopyRightPatternObservation createCopyRightPatternObservation() {
		CopyRightPatternObservationImpl copyRightPatternObservation = new CopyRightPatternObservationImpl();
		return copyRightPatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionPattern createPreconditionPattern() {
		PreconditionPatternImpl preconditionPattern = new PreconditionPatternImpl();
		return preconditionPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionPattern createCriterionPattern() {
		CriterionPatternImpl criterionPattern = new CriterionPatternImpl();
		return criterionPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFormDefinitionSection createQuestionnaireFormDefinitionSection() {
		QuestionnaireFormDefinitionSectionImpl questionnaireFormDefinitionSection = new QuestionnaireFormDefinitionSectionImpl();
		return questionnaireFormDefinitionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public CopyRightSection createCopyRightSection() {
		CopyRightSectionImpl copyRightSection = new CopyRightSectionImpl();
		return copyRightSection;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public QFDDPackage getQFDDPackage() {
		return (QFDDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QFDDPackage getPackage() {
		return QFDDPackage.eINSTANCE;
	}

} // QFDDFactoryImpl
