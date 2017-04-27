/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage
 * @generated
 */
public class QFDDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QFDDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFDDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QFDDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QFDDSwitch<Adapter> modelSwitch = new QFDDSwitch<Adapter>() {
			@Override
			public Adapter caseQuestionaire(Questionaire object) {
				return createQuestionaireAdapter();
			}
			@Override
			public Adapter caseQuestionaireHeader(QuestionaireHeader object) {
				return createQuestionaireHeaderAdapter();
			}
			@Override
			public Adapter caseCopyRightSection(CopyRightSection object) {
				return createCopyRightSectionAdapter();
			}
			@Override
			public Adapter caseCopyRightPatternObservation(CopyRightPatternObservation object) {
				return createCopyRightPatternObservationAdapter();
			}
			@Override
			public Adapter caseQuestionnaireFormDefinitionSection(QuestionnaireFormDefinitionSection object) {
				return createQuestionnaireFormDefinitionSectionAdapter();
			}
			@Override
			public Adapter caseQuestionsOrganizer(QuestionsOrganizer object) {
				return createQuestionsOrganizerAdapter();
			}
			@Override
			public Adapter caseNumericQuestionPatternObservation(NumericQuestionPatternObservation object) {
				return createNumericQuestionPatternObservationAdapter();
			}
			@Override
			public Adapter caseQuestionHelpTextPatternObservation(QuestionHelpTextPatternObservation object) {
				return createQuestionHelpTextPatternObservationAdapter();
			}
			@Override
			public Adapter caseMultipleChoiceQuestionPatternObservation(MultipleChoiceQuestionPatternObservation object) {
				return createMultipleChoiceQuestionPatternObservationAdapter();
			}
			@Override
			public Adapter caseQuestionOptionsPatternObservation(QuestionOptionsPatternObservation object) {
				return createQuestionOptionsPatternObservationAdapter();
			}
			@Override
			public Adapter caseQuestionMediaPattern(QuestionMediaPattern object) {
				return createQuestionMediaPatternAdapter();
			}
			@Override
			public Adapter caseQuestionFeedbackPatternObservation(QuestionFeedbackPatternObservation object) {
				return createQuestionFeedbackPatternObservationAdapter();
			}
			@Override
			public Adapter caseTextQuestionPatternObservation(TextQuestionPatternObservation object) {
				return createTextQuestionPatternObservationAdapter();
			}
			@Override
			public Adapter caseAnalogSliderQuestionPatternObservation(AnalogSliderQuestionPatternObservation object) {
				return createAnalogSliderQuestionPatternObservationAdapter();
			}
			@Override
			public Adapter caseDiscreteSliderQuestionPatternObservation(DiscreteSliderQuestionPatternObservation object) {
				return createDiscreteSliderQuestionPatternObservationAdapter();
			}
			@Override
			public Adapter caseQuestionReferenceRangePattern(QuestionReferenceRangePattern object) {
				return createQuestionReferenceRangePatternAdapter();
			}
			@Override
			public Adapter casePreconditionPattern(PreconditionPattern object) {
				return createPreconditionPatternAdapter();
			}
			@Override
			public Adapter caseCriterionPattern(CriterionPattern object) {
				return createCriterionPatternAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseOrganizer(Organizer object) {
				return createOrganizerAdapter();
			}
			@Override
			public Adapter caseActRelationship(ActRelationship object) {
				return createActRelationshipAdapter();
			}
			@Override
			public Adapter caseReferenceRange(ReferenceRange object) {
				return createReferenceRangeAdapter();
			}
			@Override
			public Adapter casePrecondition(Precondition object) {
				return createPreconditionAdapter();
			}
			@Override
			public Adapter caseCriterion(Criterion object) {
				return createCriterionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.Questionaire <em>Questionaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.Questionaire
	 * @generated
	 */
	public Adapter createQuestionaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader <em>Questionaire Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader
	 * @generated
	 */
	public Adapter createQuestionaireHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer <em>Questions Organizer</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer
	 * @generated
	 */
	public Adapter createQuestionsOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation <em>Numeric Question Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.NumericQuestionPatternObservation
	 * @generated
	 */
	public Adapter createNumericQuestionPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation <em>Question Help Text Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionHelpTextPatternObservation
	 * @generated
	 */
	public Adapter createQuestionHelpTextPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation <em>Multiple Choice Question Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.MultipleChoiceQuestionPatternObservation
	 * @generated
	 */
	public Adapter createMultipleChoiceQuestionPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation <em>Question Options Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionOptionsPatternObservation
	 * @generated
	 */
	public Adapter createQuestionOptionsPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern <em>Question Media Pattern</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionMediaPattern
	 * @generated
	 */
	public Adapter createQuestionMediaPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation <em>Question Feedback Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionFeedbackPatternObservation
	 * @generated
	 */
	public Adapter createQuestionFeedbackPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation <em>Text Question Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.TextQuestionPatternObservation
	 * @generated
	 */
	public Adapter createTextQuestionPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation <em>Analog Slider Question Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation
	 * @generated
	 */
	public Adapter createAnalogSliderQuestionPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation <em>Discrete Slider Question Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.DiscreteSliderQuestionPatternObservation
	 * @generated
	 */
	public Adapter createDiscreteSliderQuestionPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern <em>Question Reference Range Pattern</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionReferenceRangePattern
	 * @generated
	 */
	public Adapter createQuestionReferenceRangePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation <em>Copy Right Pattern Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation
	 * @generated
	 */
	public Adapter createCopyRightPatternObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern <em>Precondition Pattern</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern
	 * @generated
	 */
	public Adapter createPreconditionPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern <em>Criterion Pattern</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern
	 * @generated
	 */
	public Adapter createCriterionPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection <em>Questionnaire Form Definition Section</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection
	 * @generated
	 */
	public Adapter createQuestionnaireFormDefinitionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection <em>Copy Right Section</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection
	 * @generated
	 */
	public Adapter createCopyRightSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.ActRelationship <em>Act Relationship</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.ActRelationship
	 * @generated
	 */
	public Adapter createActRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ReferenceRange <em>Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ReferenceRange
	 * @generated
	 */
	public Adapter createReferenceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Precondition
	 * @generated
	 */
	public Adapter createPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Criterion
	 * @generated
	 */
	public Adapter createCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	* This default implementation returns null.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // QFDDAdapterFactory
