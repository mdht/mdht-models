/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.util.AnnotationBasedInitializer;
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
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QFDDPackageImpl extends EPackageImpl implements QFDDPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass questionaireEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass questionaireHeaderEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass questionsOrganizerEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass numericQuestionPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass questionHelpTextPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass multipleChoiceQuestionPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass questionOptionsPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass questionMediaPatternEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass questionFeedbackPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass textQuestionPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass analogSliderQuestionPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass discreteSliderQuestionPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass questionReferenceRangePatternEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass copyRightPatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass preconditionPatternEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass criterionPatternEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass questionnaireFormDefinitionSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	private EClass copyRightSectionEClass = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private QFDDPackageImpl() {
        super(eNS_URI, QFDDFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link QFDDPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static QFDDPackage init() {
        if (isInited) return (QFDDPackage)EPackage.Registry.INSTANCE.getEPackage(QFDDPackage.eNS_URI);

        // Obtain or create and register package
        QFDDPackageImpl theQFDDPackage = (QFDDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QFDDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QFDDPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CDAPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theQFDDPackage.createPackageContents();

        // Initialize created meta-data
        theQFDDPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theQFDDPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return QFDDValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theQFDDPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.qfdd", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theQFDDPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(QFDDPackage.eNS_URI, theQFDDPackage);
        return theQFDDPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionaire() {
        return questionaireEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionaireHeader() {
        return questionaireHeaderEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionsOrganizer() {
        return questionsOrganizerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getNumericQuestionPatternObservation() {
        return numericQuestionPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionHelpTextPatternObservation() {
        return questionHelpTextPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getMultipleChoiceQuestionPatternObservation() {
        return multipleChoiceQuestionPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionOptionsPatternObservation() {
        return questionOptionsPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionMediaPattern() {
        return questionMediaPatternEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionFeedbackPatternObservation() {
        return questionFeedbackPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getTextQuestionPatternObservation() {
        return textQuestionPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getAnalogSliderQuestionPatternObservation() {
        return analogSliderQuestionPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getDiscreteSliderQuestionPatternObservation() {
        return discreteSliderQuestionPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionReferenceRangePattern() {
        return questionReferenceRangePatternEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getCopyRightPatternObservation() {
        return copyRightPatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getPreconditionPattern() {
        return preconditionPatternEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getCriterionPattern() {
        return criterionPatternEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionnaireFormDefinitionSection() {
        return questionnaireFormDefinitionSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public EClass getCopyRightSection() {
        return copyRightSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	public QFDDFactory getQFDDFactory() {
        return (QFDDFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        questionaireEClass = createEClass(QUESTIONAIRE);

        questionaireHeaderEClass = createEClass(QUESTIONAIRE_HEADER);

        copyRightSectionEClass = createEClass(COPY_RIGHT_SECTION);

        copyRightPatternObservationEClass = createEClass(COPY_RIGHT_PATTERN_OBSERVATION);

        questionnaireFormDefinitionSectionEClass = createEClass(QUESTIONNAIRE_FORM_DEFINITION_SECTION);

        questionsOrganizerEClass = createEClass(QUESTIONS_ORGANIZER);

        numericQuestionPatternObservationEClass = createEClass(NUMERIC_QUESTION_PATTERN_OBSERVATION);

        questionHelpTextPatternObservationEClass = createEClass(QUESTION_HELP_TEXT_PATTERN_OBSERVATION);

        multipleChoiceQuestionPatternObservationEClass = createEClass(MULTIPLE_CHOICE_QUESTION_PATTERN_OBSERVATION);

        questionOptionsPatternObservationEClass = createEClass(QUESTION_OPTIONS_PATTERN_OBSERVATION);

        questionMediaPatternEClass = createEClass(QUESTION_MEDIA_PATTERN);

        questionFeedbackPatternObservationEClass = createEClass(QUESTION_FEEDBACK_PATTERN_OBSERVATION);

        textQuestionPatternObservationEClass = createEClass(TEXT_QUESTION_PATTERN_OBSERVATION);

        analogSliderQuestionPatternObservationEClass = createEClass(ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION);

        discreteSliderQuestionPatternObservationEClass = createEClass(DISCRETE_SLIDER_QUESTION_PATTERN_OBSERVATION);

        questionReferenceRangePatternEClass = createEClass(QUESTION_REFERENCE_RANGE_PATTERN);

        preconditionPatternEClass = createEClass(PRECONDITION_PATTERN);

        criterionPatternEClass = createEClass(CRITERION_PATTERN);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        questionaireEClass.getESuperTypes().add(this.getQuestionaireHeader());
        questionaireHeaderEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
        copyRightSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        copyRightPatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        questionnaireFormDefinitionSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        questionsOrganizerEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
        numericQuestionPatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        questionHelpTextPatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        multipleChoiceQuestionPatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        questionOptionsPatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        questionMediaPatternEClass.getESuperTypes().add(theCDAPackage.getObservation());
        questionFeedbackPatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        textQuestionPatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        analogSliderQuestionPatternObservationEClass.getESuperTypes().add(this.getNumericQuestionPatternObservation());
        discreteSliderQuestionPatternObservationEClass.getESuperTypes().add(this.getMultipleChoiceQuestionPatternObservation());
        questionReferenceRangePatternEClass.getESuperTypes().add(theCDAPackage.getReferenceRange());
        preconditionPatternEClass.getESuperTypes().add(theCDAPackage.getPrecondition());
        criterionPatternEClass.getESuperTypes().add(theCDAPackage.getCriterion());

        // Initialize classes and features; add operations and parameters
        initEClass(questionaireEClass, Questionaire.class, "Questionaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(questionaireEClass, ecorePackage.getEBoolean(), "validateQuestionaireCopyRightSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireEClass, ecorePackage.getEBoolean(), "validateQuestionaireQuestionnaireFormDefinitionSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(questionaireEClass, this.getCopyRightSection(), "getCopyRightSections", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(questionaireEClass, this.getQuestionnaireFormDefinitionSection(), "getQuestionnaireFormDefinitionSections", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(questionaireHeaderEClass, QuestionaireHeader.class, "QuestionaireHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderConfidentialityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderLanguageCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderRealmCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderTypeId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderTypeIdExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderTypeIdRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorPersonName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorAddr", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorTelecom", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderAuthorTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderCustodianAssignedCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderRecordTargetPatientRoleId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionaireHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionaireHeaderRecordTargetPatientRole", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(copyRightSectionEClass, CopyRightSection.class, "CopyRightSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(copyRightSectionEClass, ecorePackage.getEBoolean(), "validateCopyRightSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightSectionEClass, ecorePackage.getEBoolean(), "validateCopyRightSectionLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightSectionEClass, ecorePackage.getEBoolean(), "validateCopyRightSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightSectionEClass, ecorePackage.getEBoolean(), "validateCopyRightSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightSectionEClass, ecorePackage.getEBoolean(), "validateCopyRightSectionCopyRightPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(copyRightSectionEClass, this.getCopyRightPatternObservation(), "getCopyRightPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(copyRightPatternObservationEClass, CopyRightPatternObservation.class, "CopyRightPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(copyRightPatternObservationEClass, ecorePackage.getEBoolean(), "validateCopyRightPatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightPatternObservationEClass, ecorePackage.getEBoolean(), "validateCopyRightPatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightPatternObservationEClass, ecorePackage.getEBoolean(), "validateCopyRightPatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightPatternObservationEClass, ecorePackage.getEBoolean(), "validateCopyRightPatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightPatternObservationEClass, ecorePackage.getEBoolean(), "validateCopyRightPatternObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(copyRightPatternObservationEClass, ecorePackage.getEBoolean(), "validateCopyRightPatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(questionnaireFormDefinitionSectionEClass, QuestionnaireFormDefinitionSection.class, "QuestionnaireFormDefinitionSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionnaireFormDefinitionSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireFormDefinitionSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireFormDefinitionSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireFormDefinitionSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireFormDefinitionSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireFormDefinitionSectionLanguageCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireFormDefinitionSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireFormDefinitionSectionLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireFormDefinitionSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireFormDefinitionSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireFormDefinitionSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireFormDefinitionSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireFormDefinitionSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireFormDefinitionSectionQuestionsOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(questionnaireFormDefinitionSectionEClass, this.getQuestionsOrganizer(), "getQuestionsOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(questionsOrganizerEClass, QuestionsOrganizer.class, "QuestionsOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerPrecondition", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerNumericQuestionPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerMultipleChoiceQuestionPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerTextQuestionPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerAnalogSliderQuestionPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionsOrganizerEClass, ecorePackage.getEBoolean(), "validateQuestionsOrganizerDiscreteSliderQuestionPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(questionsOrganizerEClass, this.getNumericQuestionPatternObservation(), "getNumericQuestionPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(questionsOrganizerEClass, this.getMultipleChoiceQuestionPatternObservation(), "getMultipleChoiceQuestionPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(questionsOrganizerEClass, this.getTextQuestionPatternObservation(), "getTextQuestionPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(questionsOrganizerEClass, this.getAnalogSliderQuestionPatternObservation(), "getAnalogSliderQuestionPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(questionsOrganizerEClass, this.getDiscreteSliderQuestionPatternObservation(), "getDiscreteSliderQuestionPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(numericQuestionPatternObservationEClass, NumericQuestionPatternObservation.class, "NumericQuestionPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationQuestionHelpTextPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationQuestionFeedbackPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationPrecondition", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericQuestionPatternObservationReferenceRange", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(numericQuestionPatternObservationEClass, this.getQuestionHelpTextPatternObservation(), "getQuestionHelpTextPatternObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(questionHelpTextPatternObservationEClass, QuestionHelpTextPatternObservation.class, "QuestionHelpTextPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionHelpTextPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionHelpTextPatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionHelpTextPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionHelpTextPatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionHelpTextPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionHelpTextPatternObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionHelpTextPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionHelpTextPatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionHelpTextPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionHelpTextPatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionHelpTextPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionHelpTextPatternObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionHelpTextPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionHelpTextPatternObservationLanguageCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionHelpTextPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionHelpTextPatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(multipleChoiceQuestionPatternObservationEClass, MultipleChoiceQuestionPatternObservation.class, "MultipleChoiceQuestionPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationQuestionMediaPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationTextQuestionPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationPrecondition", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationCECode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationCECodeSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceQuestionPatternObservationCEDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(multipleChoiceQuestionPatternObservationEClass, this.getQuestionHelpTextPatternObservation(), "getQuestionHelpTextPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(multipleChoiceQuestionPatternObservationEClass, this.getQuestionOptionsPatternObservation(), "getQuestionOptionsPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(multipleChoiceQuestionPatternObservationEClass, this.getQuestionMediaPattern(), "getQuestionMediaPatterns", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(multipleChoiceQuestionPatternObservationEClass, this.getQuestionFeedbackPatternObservation(), "getQuestionFeedbackPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(multipleChoiceQuestionPatternObservationEClass, this.getTextQuestionPatternObservation(), "getTextQuestionPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(questionOptionsPatternObservationEClass, QuestionOptionsPatternObservation.class, "QuestionOptionsPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionOptionsPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionOptionsPatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionOptionsPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionOptionsPatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionOptionsPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionOptionsPatternObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionOptionsPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionOptionsPatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionOptionsPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionOptionsPatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionOptionsPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionOptionsPatternObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(questionMediaPatternEClass, QuestionMediaPattern.class, "QuestionMediaPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionMediaPatternEClass, ecorePackage.getEBoolean(), "validateQuestionMediaPatternTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(questionFeedbackPatternObservationEClass, QuestionFeedbackPatternObservation.class, "QuestionFeedbackPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionFeedbackPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionFeedbackPatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionFeedbackPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionFeedbackPatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionFeedbackPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionFeedbackPatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionFeedbackPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionFeedbackPatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionFeedbackPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionFeedbackPatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionFeedbackPatternObservationEClass, ecorePackage.getEBoolean(), "validateQuestionFeedbackPatternObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(textQuestionPatternObservationEClass, TextQuestionPatternObservation.class, "TextQuestionPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationQuestionHelpTextPatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationQuestionMediaPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateTextQuestionPatternObservationPrecondition", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(textQuestionPatternObservationEClass, this.getQuestionHelpTextPatternObservation(), "getQuestionHelpTextPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(textQuestionPatternObservationEClass, this.getQuestionMediaPattern(), "getQuestionMediaPatterns", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(analogSliderQuestionPatternObservationEClass, AnalogSliderQuestionPatternObservation.class, "AnalogSliderQuestionPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(analogSliderQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateAnalogSliderQuestionPatternObservationReferenceRange", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(analogSliderQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(analogSliderQuestionPatternObservationEClass, ecorePackage.getEBoolean(), "validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(discreteSliderQuestionPatternObservationEClass, DiscreteSliderQuestionPatternObservation.class, "DiscreteSliderQuestionPatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(questionReferenceRangePatternEClass, QuestionReferenceRangePattern.class, "QuestionReferenceRangePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateQuestionReferenceRangePatternTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateQuestionReferenceRangePatternTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateQuestionReferenceRangePatternObservationRange", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateQuestionReferenceRangePatternObservationRangeIVLINTHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateQuestionReferenceRangePatternObservationRangeIVLINTLow", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateQuestionReferenceRangePatternObservationRangeText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateQuestionReferenceRangePatternObservationRangeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(preconditionPatternEClass, PreconditionPattern.class, "PreconditionPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(preconditionPatternEClass, ecorePackage.getEBoolean(), "validatePreconditionPatternTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(preconditionPatternEClass, ecorePackage.getEBoolean(), "validatePreconditionPatternTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(preconditionPatternEClass, ecorePackage.getEBoolean(), "validatePreconditionPatternCriterion", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(criterionPatternEClass, CriterionPattern.class, "CriterionPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(criterionPatternEClass, ecorePackage.getEBoolean(), "validateCriterionPatternTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(criterionPatternEClass, ecorePackage.getEBoolean(), "validateCriterionPatternClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(criterionPatternEClass, ecorePackage.getEBoolean(), "validateCriterionPatternCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(criterionPatternEClass, ecorePackage.getEBoolean(), "validateCriterionPatternMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(criterionPatternEClass, ecorePackage.getEBoolean(), "validateCriterionPatternValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.openhealthtools.org/mdht/uml
        createUmlAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation
        createAnnotationAnnotations();
        // duplicates
        createDuplicatesAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderTypeId
        createQfddQuestionaireHeaderTypeIdAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTarget
        createQfddQuestionaireHeaderRecordTargetAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTargetPatientRole
        createQfddQuestionaireHeaderRecordTargetPatientRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTargetPatientRoleII
        createQfddQuestionaireHeaderRecordTargetPatientRoleIIAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthor
        createQfddQuestionaireHeaderAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthor
        createQfddQuestionaireHeaderAuthorAssignedAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthorPerson
        createQfddQuestionaireHeaderAuthorAssignedAuthorPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthorAuthoringDevice
        createQfddQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodian
        createQfddQuestionaireHeaderCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodianAssignedCustodian
        createQfddQuestionaireHeaderCustodianAssignedCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodianAssignedCustodianCustodianOrganization
        createQfddQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddMultipleChoiceQuestionPatternObservationCE
        createQfddMultipleChoiceQuestionPatternObservationCEAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddAnalogSliderQuestionPatternObservationReferenceRange
        createQfddAnalogSliderQuestionPatternObservationReferenceRangeAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddAnalogSliderQuestionPatternObservationReferenceRangeObservationRange
        createQfddAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionReferenceRangePatternObservationRange
        createQfddQuestionReferenceRangePatternObservationRangeAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionReferenceRangePatternObservationRangeIVLINT
        createQfddQuestionReferenceRangePatternObservationRangeIVLINTAnnotations();
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createUmlAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml";     
        addAnnotation
          (this, 
           source, 
           new String[] {
             "initializers", "org.openhealthtools.mdht.uml.cda.qfdd"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createAnnotationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (questionaireEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireTemplateId QuestionaireCopyRightSection QuestionaireQuestionnaireFormDefinitionSection",
             "templateId.root", "2.16.840.1.113883.10.20.32"
           });              
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderTemplateId QuestionaireHeaderCode QuestionaireHeaderCodeP QuestionaireHeaderConfidentialityCode QuestionaireHeaderConfidentialityCodeP QuestionaireHeaderEffectiveTime QuestionaireHeaderLanguageCode QuestionaireHeaderLanguageCodeP QuestionaireHeaderRealmCode QuestionaireHeaderRealmCodeP QuestionaireHeaderTitle QuestionaireHeaderTypeId QuestionaireHeaderId QuestionaireHeaderAuthor QuestionaireHeaderCustodian QuestionaireHeaderRecordTarget QuestionaireHeaderTypeIdExtension QuestionaireHeaderTypeIdRoot QuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName QuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName QuestionaireHeaderAuthorAssignedAuthorPersonName QuestionaireHeaderAuthorAssignedAuthorAddr QuestionaireHeaderAuthorAssignedAuthorId QuestionaireHeaderAuthorAssignedAuthorTelecom QuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization QuestionaireHeaderAuthorTime QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom QuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization QuestionaireHeaderCustodianAssignedCustodian QuestionaireHeaderRecordTargetPatientRoleIINullFlavor QuestionaireHeaderRecordTargetPatientRoleId QuestionaireHeaderRecordTargetPatientRole",
             "templateId.root", "2.16.840.1.113883.10.20.32",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "constraints.validation.dependOn.QuestionaireHeaderCode", "QuestionaireHeaderCodeP",
             "confidentialityCode.codeSystem", "2.16.840.1.113883.5.25",
             "confidentialityCode.codeSystemName", "ConfidentialityCode",
             "constraints.validation.dependOn.QuestionaireHeaderConfidentialityCode", "QuestionaireHeaderConfidentialityCodeP",
             "constraints.validation.query", "QuestionaireHeaderTypeIdExtension QuestionaireHeaderTypeIdRoot QuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName QuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName QuestionaireHeaderAuthorAssignedAuthorPersonName QuestionaireHeaderAuthorAssignedAuthorAddr QuestionaireHeaderAuthorAssignedAuthorId QuestionaireHeaderAuthorAssignedAuthorTelecom QuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice QuestionaireHeaderAuthorAssignedAuthorAssignedPerson QuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization QuestionaireHeaderAuthorTime QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom QuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization QuestionaireHeaderCustodianAssignedCustodian QuestionaireHeaderRecordTargetPatientRoleIINullFlavor QuestionaireHeaderRecordTargetPatientRoleId QuestionaireHeaderRecordTargetPatientRole",
             "constraints.validation.warning", "QuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice QuestionaireHeaderAuthorAssignedAuthorAssignedPerson QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName"
           });                                                                                                                               
        addAnnotation
          (copyRightSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "CopyRightSectionTemplateId CopyRightSectionText CopyRightSectionCopyRightPatternObservation",
             "templateId.root", "2.16.840.1.113883.10.20.32.2.2",
             "constraints.validation.warning", "CopyRightSectionLanguageCode CopyRightSectionTitle"
           });                     
        addAnnotation
          (copyRightPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "CopyRightPatternObservationTemplateId CopyRightPatternObservationClassCode CopyRightPatternObservationCode CopyRightPatternObservationMoodCode CopyRightPatternObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.21",
             "classCode", "OBS",
             "code.code", "COPY",
             "code.codeSystem", "2.16.840.1.113883.5.4",
             "code.codeSystemName", "ActCode",
             "moodCode", "EVN",
             "constraints.validation.warning", "CopyRightPatternObservationLanguageCode"
           });                       
        addAnnotation
          (questionnaireFormDefinitionSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireFormDefinitionSectionTemplateId QuestionnaireFormDefinitionSectionCode QuestionnaireFormDefinitionSectionLanguageCode QuestionnaireFormDefinitionSectionText QuestionnaireFormDefinitionSectionQuestionsOrganizer",
             "templateId.root", "2.16.840.1.113883.10.20.32.2.1",
             "constraints.validation.warning", "QuestionnaireFormDefinitionSectionLanguageCodeP QuestionnaireFormDefinitionSectionTitle",
             "constraints.validation.dependOn.QuestionnaireFormDefinitionSectionLanguageCode", "QuestionnaireFormDefinitionSectionLanguageCodeP"
           });                           
        addAnnotation
          (questionsOrganizerEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionsOrganizerTemplateId QuestionsOrganizerClassCode QuestionsOrganizerId QuestionsOrganizerMoodCode QuestionsOrganizerStatusCode",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.1",
             "moodCode", "EVN",
             "constraints.validation.info", "QuestionsOrganizerPrecondition QuestionsOrganizerNumericQuestionPatternObservation QuestionsOrganizerMultipleChoiceQuestionPatternObservation QuestionsOrganizerTextQuestionPatternObservation QuestionsOrganizerAnalogSliderQuestionPatternObservation QuestionsOrganizerDiscreteSliderQuestionPatternObservation"
           });                                           
        addAnnotation
          (numericQuestionPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "NumericQuestionPatternObservationTemplateId NumericQuestionPatternObservationClassCode NumericQuestionPatternObservationCode NumericQuestionPatternObservationId NumericQuestionPatternObservationMoodCode",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.7",
             "constraints.validation.warning", "NumericQuestionPatternObservationLanguageCode NumericQuestionPatternObservationQuestionFeedbackPatternObservation NumericQuestionPatternObservationPrecondition NumericQuestionPatternObservationReferenceRange",
             "constraints.validation.info", "NumericQuestionPatternObservationQuestionHelpTextPatternObservation"
           });                                    
        addAnnotation
          (questionHelpTextPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionHelpTextPatternObservationTemplateId QuestionHelpTextPatternObservationClassCode QuestionHelpTextPatternObservationCode QuestionHelpTextPatternObservationCodeP QuestionHelpTextPatternObservationMoodCode QuestionHelpTextPatternObservationValue QuestionHelpTextPatternObservationLanguageCode",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.19",
             "classCode", "OBS",
             "code.code", "48767-8",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Annotation Comment",
             "constraints.validation.dependOn.QuestionHelpTextPatternObservationCode", "QuestionHelpTextPatternObservationCodeP",
             "moodCode", "EVN",
             "constraints.validation.warning", "QuestionHelpTextPatternObservationLanguageCodeP",
             "constraints.validation.dependOn.QuestionHelpTextPatternObservationLanguageCode", "QuestionHelpTextPatternObservationLanguageCodeP"
           });                             
        addAnnotation
          (multipleChoiceQuestionPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MultipleChoiceQuestionPatternObservationTemplateId MultipleChoiceQuestionPatternObservationClassCode MultipleChoiceQuestionPatternObservationCode MultipleChoiceQuestionPatternObservationId MultipleChoiceQuestionPatternObservationMoodCode MultipleChoiceQuestionPatternObservationCECode MultipleChoiceQuestionPatternObservationCECodeSystem MultipleChoiceQuestionPatternObservationCEDisplayName",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.8",
             "classCode", "OBS",
             "constraints.validation.warning", "MultipleChoiceQuestionPatternObservationLanguageCode MultipleChoiceQuestionPatternObservationQuestionHelpTextPatternObservation MultipleChoiceQuestionPatternObservationQuestionOptionsPatternObservation MultipleChoiceQuestionPatternObservationQuestionMediaPattern MultipleChoiceQuestionPatternObservationQuestionFeedbackPatternObservation MultipleChoiceQuestionPatternObservationTextQuestionPatternObservation MultipleChoiceQuestionPatternObservationPrecondition",
             "moodCode", "EVN",
             "constraints.validation.query", "MultipleChoiceQuestionPatternObservationCECode MultipleChoiceQuestionPatternObservationCECodeSystem MultipleChoiceQuestionPatternObservationCEDisplayName"
           });                                                        
        addAnnotation
          (questionOptionsPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionOptionsPatternObservationTemplateId QuestionOptionsPatternObservationClassCode QuestionOptionsPatternObservationCode QuestionOptionsPatternObservationCodeP QuestionOptionsPatternObservationMoodCode QuestionOptionsPatternObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.20",
             "classCode", "OBS",
             "code.code", "74467-2",
             "code.codeSystem", "2.16.840.1.113883.6.1",
             "code.codeSystemName", "LOINC",
             "code.displayName", "Number of Options",
             "constraints.validation.dependOn.QuestionOptionsPatternObservationCode", "QuestionOptionsPatternObservationCodeP",
             "moodCode", "EVN"
           });                       
        addAnnotation
          (questionMediaPatternEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionMediaPatternTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.2",
             "classCode", "OBS",
             "moodCode", "DEF"
           });        
        addAnnotation
          (questionFeedbackPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionFeedbackPatternObservationTemplateId QuestionFeedbackPatternObservationClassCode QuestionFeedbackPatternObservationCode QuestionFeedbackPatternObservationMoodCode QuestionFeedbackPatternObservationValue",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.6",
             "constraints.validation.warning", "QuestionFeedbackPatternObservationLanguageCode"
           });                       
        addAnnotation
          (textQuestionPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TextQuestionPatternObservationTemplateId TextQuestionPatternObservationClassCode TextQuestionPatternObservationCode TextQuestionPatternObservationId TextQuestionPatternObservationMoodCode",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.9",
             "classCode", "OBS",
             "constraints.validation.warning", "TextQuestionPatternObservationLanguageCode TextQuestionPatternObservationQuestionMediaPattern TextQuestionPatternObservationPrecondition",
             "moodCode", "EVN",
             "constraints.validation.info", "TextQuestionPatternObservationQuestionHelpTextPatternObservation"
           });                                  
        addAnnotation
          (analogSliderQuestionPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AnalogSliderQuestionPatternObservationTemplateId AnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue AnalogSliderQuestionPatternObservationReferenceRangeTypeCode",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.10",
             "constraints.validation.warning", "AnalogSliderQuestionPatternObservationReferenceRange",
             "constraints.validation.query", "AnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue AnalogSliderQuestionPatternObservationReferenceRangeTypeCode"
           });                 
        addAnnotation
          (discreteSliderQuestionPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "DiscreteSliderQuestionPatternObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.11"
           });      
        addAnnotation
          (questionReferenceRangePatternEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionReferenceRangePatternTemplateId QuestionReferenceRangePatternTypeCode QuestionReferenceRangePatternObservationRange QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow QuestionReferenceRangePatternObservationRangeValue",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.5",
             "typeCode", "REFV",
             "constraints.validation.query", "QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow QuestionReferenceRangePatternObservationRangeText QuestionReferenceRangePatternObservationRangeValue",
             "constraints.validation.info", "QuestionReferenceRangePatternObservationRangeText"
           });                            
        addAnnotation
          (preconditionPatternEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PreconditionPatternTemplateId PreconditionPatternTypeCode PreconditionPatternCriterion",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.4",
             "typeCode", "PRCN"
           });              
        addAnnotation
          (criterionPatternEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "CriterionPatternTemplateId CriterionPatternClassCode CriterionPatternCode CriterionPatternMoodCode CriterionPatternValue",
             "templateId.root", "2.16.840.1.113883.10.20.32.4.3",
             "classCode", "OBS",
             "moodCode", "EVN.CRT"
           });               
    }

	/**
     * Initializes the annotations for <b>duplicates</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createDuplicatesAnnotations() {
        String source = "duplicates";       
        addAnnotation
          (questionaireEClass, 
           source, 
           new String[] {
           });                                                                                                                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (analogSliderQuestionPatternObservationEClass, 
           source, 
           new String[] {
           });               
        addAnnotation
          (discreteSliderQuestionPatternObservationEClass, 
           source, 
           new String[] {
           });                                                  
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderTypeId</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderTypeIdAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderTypeId";                 
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "extension", "POCD_HD000040",
             "constraints.validation.error", "QuestionaireHeaderTypeIdExtension QuestionaireHeaderTypeIdRoot",
             "root", "2.16.840.1.113883.1.3"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTarget</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderRecordTargetAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTarget";                  
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderRecordTargetPatientRole"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTargetPatientRole</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderRecordTargetPatientRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTargetPatientRole";                   
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderRecordTargetPatientRoleId QuestionaireHeaderRecordTargetPatientRoleIINullFlavor",
             "constraints.validation.query", "QuestionaireHeaderRecordTargetPatientRoleIINullFlavor"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTargetPatientRoleII</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderRecordTargetPatientRoleIIAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderRecordTargetPatientRoleII";                    
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "nullFlavor", "NI",
             "constraints.validation.error", "QuestionaireHeaderRecordTargetPatientRoleIINullFlavor"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthor</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthor";                     
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderAuthorTime"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthor</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderAuthorAssignedAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthor";                      
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderAuthorAssignedAuthorAddr QuestionaireHeaderAuthorAssignedAuthorId QuestionaireHeaderAuthorAssignedAuthorTelecom QuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization",
             "constraints.validation.warning", "QuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice QuestionaireHeaderAuthorAssignedAuthorAssignedPerson"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthorPerson</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderAuthorAssignedAuthorPersonAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthorPerson";                       
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderAuthorAssignedAuthorPersonName"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthorAuthoringDevice</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderAuthorAssignedAuthorAuthoringDevice";                        
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName QuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodian</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodian";                         
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderCustodianAssignedCustodian"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodianAssignedCustodian</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderCustodianAssignedCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodianAssignedCustodian";                          
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodianAssignedCustodianCustodianOrganization</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionaireHeaderCustodianAssignedCustodianCustodianOrganization";                           
        addAnnotation
          (questionaireHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom",
             "constraints.validation.warning", "QuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName"
           });                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddMultipleChoiceQuestionPatternObservationCE</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddMultipleChoiceQuestionPatternObservationCEAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddMultipleChoiceQuestionPatternObservationCE";                                                                                                                                                                                                                                                                                                       
        addAnnotation
          (multipleChoiceQuestionPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MultipleChoiceQuestionPatternObservationCECode MultipleChoiceQuestionPatternObservationCECodeSystem MultipleChoiceQuestionPatternObservationCEDisplayName"
           });                                                                                                                                                                                           
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddAnalogSliderQuestionPatternObservationReferenceRange</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddAnalogSliderQuestionPatternObservationReferenceRangeAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddAnalogSliderQuestionPatternObservationReferenceRange";                                                                                                                                                                                                                                                                                                                                                                                                                                   
        addAnnotation
          (analogSliderQuestionPatternObservationEClass, 
           source, 
           new String[] {
             "typeCode", "REFV",
             "constraints.validation.error", "AnalogSliderQuestionPatternObservationReferenceRangeTypeCode"
           });                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddAnalogSliderQuestionPatternObservationReferenceRangeObservationRange</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddAnalogSliderQuestionPatternObservationReferenceRangeObservationRange";                                                                                                                                                                                                                                                                                                                                                                                                                                    
        addAnnotation
          (analogSliderQuestionPatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue"
           });                                                              
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionReferenceRangePatternObservationRange</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionReferenceRangePatternObservationRangeAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionReferenceRangePatternObservationRange";                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        addAnnotation
          (questionReferenceRangePatternEClass, 
           source, 
           new String[] {
             "constraints.validation.info", "QuestionReferenceRangePatternObservationRangeText",
             "constraints.validation.error", "QuestionReferenceRangePatternObservationRangeValue QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow",
             "constraints.validation.query", "QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow"
           });                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionReferenceRangePatternObservationRangeIVLINT</b>.
     * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
     * @generated
     */
	protected void createQfddQuestionReferenceRangePatternObservationRangeIVLINTAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionReferenceRangePatternObservationRangeIVLINT";                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        addAnnotation
          (questionReferenceRangePatternEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow"
           });                                               
    }

} // QFDDPackageImpl
