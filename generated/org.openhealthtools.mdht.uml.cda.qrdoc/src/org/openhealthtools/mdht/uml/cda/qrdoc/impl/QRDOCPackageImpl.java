/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.util.AnnotationBasedInitializer;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.NumericResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCFactory;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocument;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseSection;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponseMediaPattern;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer;
import org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QRDOCPackageImpl extends EPackageImpl implements QRDOCPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass questionnaireResponseDocumentHeaderEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass questionnaireResponseDocumentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass questionnaireResponseSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass responsesOrganizerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass numericResponsePatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass multipleChoiceResponsePatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass textResponsePatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass analogSliderResponsePatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass discreteSliderResponsePatternObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass responseMediaPatternEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass responseReferenceRangePatternEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private QRDOCPackageImpl() {
        super(eNS_URI, QRDOCFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link QRDOCPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static QRDOCPackage init() {
        if (isInited) return (QRDOCPackage)EPackage.Registry.INSTANCE.getEPackage(QRDOCPackage.eNS_URI);

        // Obtain or create and register package
        QRDOCPackageImpl theQRDOCPackage = (QRDOCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QRDOCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QRDOCPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        QFDDPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theQRDOCPackage.createPackageContents();

        // Initialize created meta-data
        theQRDOCPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theQRDOCPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return QRDOCValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theQRDOCPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.qrdoc", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theQRDOCPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(QRDOCPackage.eNS_URI, theQRDOCPackage);
        return theQRDOCPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionnaireResponseDocumentHeader() {
        return questionnaireResponseDocumentHeaderEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionnaireResponseDocument() {
        return questionnaireResponseDocumentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getQuestionnaireResponseSection() {
        return questionnaireResponseSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResponsesOrganizer() {
        return responsesOrganizerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNumericResponsePatternObservation() {
        return numericResponsePatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMultipleChoiceResponsePatternObservation() {
        return multipleChoiceResponsePatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTextResponsePatternObservation() {
        return textResponsePatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAnalogSliderResponsePatternObservation() {
        return analogSliderResponsePatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDiscreteSliderResponsePatternObservation() {
        return discreteSliderResponsePatternObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResponseMediaPattern() {
        return responseMediaPatternEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResponseReferenceRangePattern() {
        return responseReferenceRangePatternEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QRDOCFactory getQRDOCFactory() {
        return (QRDOCFactory)getEFactoryInstance();
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
        questionnaireResponseDocumentHeaderEClass = createEClass(QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER);

        questionnaireResponseDocumentEClass = createEClass(QUESTIONNAIRE_RESPONSE_DOCUMENT);

        questionnaireResponseSectionEClass = createEClass(QUESTIONNAIRE_RESPONSE_SECTION);

        responsesOrganizerEClass = createEClass(RESPONSES_ORGANIZER);

        numericResponsePatternObservationEClass = createEClass(NUMERIC_RESPONSE_PATTERN_OBSERVATION);

        multipleChoiceResponsePatternObservationEClass = createEClass(MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION);

        textResponsePatternObservationEClass = createEClass(TEXT_RESPONSE_PATTERN_OBSERVATION);

        analogSliderResponsePatternObservationEClass = createEClass(ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION);

        discreteSliderResponsePatternObservationEClass = createEClass(DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION);

        responseMediaPatternEClass = createEClass(RESPONSE_MEDIA_PATTERN);

        responseReferenceRangePatternEClass = createEClass(RESPONSE_REFERENCE_RANGE_PATTERN);
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
        QFDDPackage theQFDDPackage = (QFDDPackage)EPackage.Registry.INSTANCE.getEPackage(QFDDPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        questionnaireResponseDocumentHeaderEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
        questionnaireResponseDocumentEClass.getESuperTypes().add(this.getQuestionnaireResponseDocumentHeader());
        questionnaireResponseSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        responsesOrganizerEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
        numericResponsePatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        multipleChoiceResponsePatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        textResponsePatternObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        analogSliderResponsePatternObservationEClass.getESuperTypes().add(this.getNumericResponsePatternObservation());
        discreteSliderResponsePatternObservationEClass.getESuperTypes().add(this.getMultipleChoiceResponsePatternObservation());
        responseMediaPatternEClass.getESuperTypes().add(theCDAPackage.getObservation());
        responseReferenceRangePatternEClass.getESuperTypes().add(theCDAPackage.getReferenceRange());

        // Initialize classes and features; add operations and parameters
        initEClass(questionnaireResponseDocumentHeaderEClass, QuestionnaireResponseDocumentHeader.class, "QuestionnaireResponseDocumentHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderTypeId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderDataEnterer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderInformant", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderInformationRecipient", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderLegalAuthenticator", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseDocumentHeaderEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentHeaderInFulfillmentOf", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(questionnaireResponseDocumentEClass, QuestionnaireResponseDocument.class, "QuestionnaireResponseDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionnaireResponseDocumentEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseDocumentQuestionnaireResponseSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(questionnaireResponseDocumentEClass, this.getQuestionnaireResponseSection(), "getQuestionnaireResponseSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(questionnaireResponseSectionEClass, QuestionnaireResponseSection.class, "QuestionnaireResponseSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(questionnaireResponseSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseSectionLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(questionnaireResponseSectionEClass, ecorePackage.getEBoolean(), "validateQuestionnaireResponseSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(responsesOrganizerEClass, ResponsesOrganizer.class, "ResponsesOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerNumericResponsePatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerMultipleChoiceResponsePatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerTextQuestionResponseObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerAnalogSliderResponsePatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responsesOrganizerEClass, ecorePackage.getEBoolean(), "validateResponsesOrganizerDiscreteSliderResponsePatternObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(responsesOrganizerEClass, this.getNumericResponsePatternObservation(), "getNumericResponsePatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(responsesOrganizerEClass, this.getMultipleChoiceResponsePatternObservation(), "getMultipleChoiceResponsePatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(responsesOrganizerEClass, this.getTextResponsePatternObservation(), "getTextQuestionResponseObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(responsesOrganizerEClass, this.getAnalogSliderResponsePatternObservation(), "getAnalogSliderResponsePatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(responsesOrganizerEClass, this.getDiscreteSliderResponsePatternObservation(), "getDiscreteSliderResponsePatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(numericResponsePatternObservationEClass, NumericResponsePatternObservation.class, "NumericResponsePatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationReferenceRange", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationCDCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationCDCodeSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(numericResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateNumericResponsePatternObservationCDOriginalText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(multipleChoiceResponsePatternObservationEClass, MultipleChoiceResponsePatternObservation.class, "MultipleChoiceResponsePatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationLanguageCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationCDCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationCDCodeSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationCDOriginalText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationCECode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationCECodeSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(multipleChoiceResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateMultipleChoiceResponsePatternObservationCEDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(multipleChoiceResponsePatternObservationEClass, this.getTextResponsePatternObservation(), "getTextQuestionResponseObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(multipleChoiceResponsePatternObservationEClass, theQFDDPackage.getQuestionHelpTextPatternObservation(), "getQuestionHelpTextPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(multipleChoiceResponsePatternObservationEClass, theQFDDPackage.getQuestionOptionsPatternObservation(), "getQuestionOptionsPatternObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(textResponsePatternObservationEClass, TextResponsePatternObservation.class, "TextResponsePatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(textResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateTextResponsePatternObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateTextResponsePatternObservationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateTextResponsePatternObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateTextResponsePatternObservationId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateTextResponsePatternObservationLanguageCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateTextResponsePatternObservationLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(textResponsePatternObservationEClass, ecorePackage.getEBoolean(), "validateTextResponsePatternObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(analogSliderResponsePatternObservationEClass, AnalogSliderResponsePatternObservation.class, "AnalogSliderResponsePatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(discreteSliderResponsePatternObservationEClass, DiscreteSliderResponsePatternObservation.class, "DiscreteSliderResponsePatternObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(responseMediaPatternEClass, ResponseMediaPattern.class, "ResponseMediaPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(responseMediaPatternEClass, ecorePackage.getEBoolean(), "validateResponseMediaPatternTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(responseReferenceRangePatternEClass, ResponseReferenceRangePattern.class, "ResponseReferenceRangePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(responseReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateResponseReferenceRangePatternTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responseReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateResponseReferenceRangePatternTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responseReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateResponseReferenceRangePatternObservationRange", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responseReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateResponseReferenceRangePatternObservationRangeIVLINTHigh", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responseReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateResponseReferenceRangePatternObservationRangeIVLINTLow", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responseReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateResponseReferenceRangePatternObservationRangeText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(responseReferenceRangePatternEClass, ecorePackage.getEBoolean(), "validateResponseReferenceRangePatternObservationRangeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
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
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTarget
        createQrdocQuestionnaireResponseDocumentHeaderRecordTargetAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRole
        createQrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRoleAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatient
        createQrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatientAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthor
        createQrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPerson
        createQrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDevice
        createQrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDeviceAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderDataEnterer
        createQrdocQuestionnaireResponseDocumentHeaderDataEntererAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderDataEntererAssignedEntity
        createQrdocQuestionnaireResponseDocumentHeaderDataEntererAssignedEntityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12AssignedEntity
        createQrdocQuestionnaireResponseDocumentHeaderInformant12AssignedEntityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntity
        createQrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntityPerson
        createQrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntityPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodian
        createQrdocQuestionnaireResponseDocumentHeaderCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodian
        createQrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodianAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganization
        createQrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipient
        createQrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientPerson
        createQrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticator
        createQrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntity
        createQrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityPerson
        createQrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityPersonAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTEL
        createQrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTELAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderParticipant
        createQrdocQuestionnaireResponseDocumentHeaderParticipantAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInFulfillmentOf
        createQrdocQuestionnaireResponseDocumentHeaderInFulfillmentOfAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInFulfillmentOfOrder
        createQrdocQuestionnaireResponseDocumentHeaderInFulfillmentOfOrderAnnotations();
        // duplicates
        createDuplicatesAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocNumericResponsePatternObservationCD
        createQrdocNumericResponsePatternObservationCDAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocMultipleChoiceResponsePatternObservationCE
        createQrdocMultipleChoiceResponsePatternObservationCEAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocMultipleChoiceResponsePatternObservationCD
        createQrdocMultipleChoiceResponsePatternObservationCDAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocResponseReferenceRangePatternObservationRange
        createQrdocResponseReferenceRangePatternObservationRangeAnnotations();
        // http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocResponseReferenceRangePatternObservationRangeIVLINT
        createQrdocResponseReferenceRangePatternObservationRangeIVLINTAnnotations();
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
             "initializers", "org.openhealthtools.mdht.uml.cda.qrdoc"
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
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderTemplateId QuestionnaireResponseDocumentHeaderConfidentialityCode QuestionnaireResponseDocumentHeaderEffectiveTime QuestionnaireResponseDocumentHeaderId QuestionnaireResponseDocumentHeaderLanguageCode QuestionnaireResponseDocumentHeaderRealmCode QuestionnaireResponseDocumentHeaderTitle QuestionnaireResponseDocumentHeaderTypeId QuestionnaireResponseDocumentHeaderRecordTarget QuestionnaireResponseDocumentHeaderAuthor QuestionnaireResponseDocumentHeaderCustodian",
             "templateId.root", "2.16.840.1.113883.10.20.33",
             "constraints.validation.info", "QuestionnaireResponseDocumentHeaderDataEnterer QuestionnaireResponseDocumentHeaderInformant QuestionnaireResponseDocumentHeaderInformationRecipient",
             "constraints.validation.warning", "QuestionnaireResponseDocumentHeaderLegalAuthenticator QuestionnaireResponseDocumentHeaderInFulfillmentOf"
           });                                                                            
        addAnnotation
          (questionnaireResponseDocumentEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentTemplateId QuestionnaireResponseDocumentQuestionnaireResponseSection",
             "templateId.root", "2.16.840.1.113883.10.20.33.1.1"
           });          
        addAnnotation
          (questionnaireResponseSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseSectionTemplateId QuestionnaireResponseSectionCode QuestionnaireResponseSectionText",
             "templateId.root", "2.16.840.1.113883.10.20.33.2.1",
             "constraints.validation.warning", "QuestionnaireResponseSectionLanguageCode QuestionnaireResponseSectionTitle"
           });                    
        addAnnotation
          (responsesOrganizerEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResponsesOrganizerTemplateId ResponsesOrganizerId ResponsesOrganizerMoodCode ResponsesOrganizerStatusCode",
             "templateId.root", "2.16.840.1.113883.10.20.33.4.1",
             "constraints.validation.warning", "ResponsesOrganizerCode",
             "constraints.validation.info", "ResponsesOrganizerNumericResponsePatternObservation ResponsesOrganizerMultipleChoiceResponsePatternObservation ResponsesOrganizerTextQuestionResponseObservation ResponsesOrganizerAnalogSliderResponsePatternObservation ResponsesOrganizerDiscreteSliderResponsePatternObservation"
           });                                        
        addAnnotation
          (numericResponsePatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "NumericResponsePatternObservationTemplateId NumericResponsePatternObservationClassCode NumericResponsePatternObservationCode NumericResponsePatternObservationId NumericResponsePatternObservationMoodCode NumericResponsePatternObservationStatusCode NumericResponsePatternObservationStatusCodeP NumericResponsePatternObservationCDCode NumericResponsePatternObservationCDCodeSystem NumericResponsePatternObservationCDOriginalText",
             "templateId.root", "2.16.840.1.113883.10.20.33.4.4",
             "classCode", "OBS",
             "moodCode", "EVN",
             "constraints.validation.warning", "NumericResponsePatternObservationLanguageCode NumericResponsePatternObservationReferenceRange",
             "statusCode.code", "completed",
             "constraints.validation.query", "NumericResponsePatternObservationCDCode NumericResponsePatternObservationCDCodeSystem NumericResponsePatternObservationCDOriginalText"
           });                                          
        addAnnotation
          (multipleChoiceResponsePatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MultipleChoiceResponsePatternObservationTemplateId MultipleChoiceResponsePatternObservationClassCode MultipleChoiceResponsePatternObservationCode MultipleChoiceResponsePatternObservationId MultipleChoiceResponsePatternObservationLanguageCode MultipleChoiceResponsePatternObservationMoodCode MultipleChoiceResponsePatternObservationStatusCode MultipleChoiceResponsePatternObservationStatusCodeP MultipleChoiceResponsePatternObservationCDCode MultipleChoiceResponsePatternObservationCDCodeSystem MultipleChoiceResponsePatternObservationCDOriginalText MultipleChoiceResponsePatternObservationCECode MultipleChoiceResponsePatternObservationCECodeSystem MultipleChoiceResponsePatternObservationCEDisplayName",
             "templateId.root", "2.16.840.1.113883.10.20.33.4.5",
             "classCode", "OBS",
             "constraints.validation.warning", "MultipleChoiceResponsePatternObservationLanguageCodeP",
             "constraints.validation.dependOn.MultipleChoiceResponsePatternObservationLanguageCode", "MultipleChoiceResponsePatternObservationLanguageCodeP",
             "moodCode", "EVN",
             "statusCode.code", "completed",
             "constraints.validation.query", "MultipleChoiceResponsePatternObservationCDCode MultipleChoiceResponsePatternObservationCDCodeSystem MultipleChoiceResponsePatternObservationCDOriginalText MultipleChoiceResponsePatternObservationCECode MultipleChoiceResponsePatternObservationCECodeSystem MultipleChoiceResponsePatternObservationCEDisplayName"
           });                                                       
        addAnnotation
          (textResponsePatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "TextResponsePatternObservationTemplateId TextResponsePatternObservationClassCode TextResponsePatternObservationCode TextResponsePatternObservationId TextResponsePatternObservationLanguageCode TextResponsePatternObservationMoodCode",
             "templateId.root", "2.16.840.1.113883.10.20.33.4.6",
             "classCode", "OBS",
             "constraints.validation.warning", "TextResponsePatternObservationLanguageCodeP",
             "constraints.validation.dependOn.TextResponsePatternObservationLanguageCode", "TextResponsePatternObservationLanguageCodeP",
             "moodCode", "EVN"
           });                          
        addAnnotation
          (analogSliderResponsePatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "AnalogSliderResponsePatternObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.33.4.7"
           });      
        addAnnotation
          (discreteSliderResponsePatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "DiscreteSliderResponsePatternObservationTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.33.4.8"
           });      
        addAnnotation
          (responseMediaPatternEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResponseMediaPatternTemplateId",
             "templateId.root", "2.16.840.1.113883.10.20.33.4.3",
             "classCode", "OBS",
             "moodCode", "DEF"
           });        
        addAnnotation
          (responseReferenceRangePatternEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResponseReferenceRangePatternTemplateId ResponseReferenceRangePatternTypeCode ResponseReferenceRangePatternObservationRange ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow ResponseReferenceRangePatternObservationRangeValue",
             "templateId.root", "2.16.840.1.113883.10.20.33.4.3",
             "typeCode", "REFV",
             "constraints.validation.query", "ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow ResponseReferenceRangePatternObservationRangeText ResponseReferenceRangePatternObservationRangeValue",
             "constraints.validation.info", "ResponseReferenceRangePatternObservationRangeText"
           });                       
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTarget</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderRecordTargetAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTarget";       
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderRecordTargetPatientRole"
           });                                                                                                                                                                                                                                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRole</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRoleAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRole";        
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderRecordTargetPatientRoleAddr QuestionnaireResponseDocumentHeaderRecordTargetPatientRoleId QuestionnaireResponseDocumentHeaderRecordTargetPatientRoleTelecom QuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatient"
           });                                                                                                                                                                                                                                                                              
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatient</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatientAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatient";         
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatientAdministrativeGenderCode QuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatientBirthTime QuestionnaireResponseDocumentHeaderRecordTargetPatientRolePatientName"
           });                                                                                                                                                                                                                                                                             
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthor</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthor";          
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorCode QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorId",
             "constraints.validation.warning", "QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAssignedAuthoringDevice QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAssignedPerson"
           });                                                                                                                                                                                                                                                                            
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPerson</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPersonAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPerson";           
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPersonTemplateId QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorPersonName",
             "templateId.root", "null"
           });                                                                                                                                                                                                                                                                           
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDevice</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDeviceAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDevice";            
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName QuestionnaireResponseDocumentHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName"
           });                                                                                                                                                                                                                                                                          
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderDataEnterer</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderDataEntererAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderDataEnterer";             
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderDataEntererAssignedEntity"
           });                                                                                                                                                                                                                                                                         
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderDataEntererAssignedEntity</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderDataEntererAssignedEntityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderDataEntererAssignedEntity";              
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderDataEntererAssignedEntityAddr QuestionnaireResponseDocumentHeaderDataEntererAssignedEntityId QuestionnaireResponseDocumentHeaderDataEntererAssignedEntityTelecom"
           });                                                                                                                                                                                                                                                                        
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12AssignedEntity</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderInformant12AssignedEntityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12AssignedEntity";               
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.warning", "QuestionnaireResponseDocumentHeaderInformant12AssignedEntityAddr QuestionnaireResponseDocumentHeaderInformant12AssignedEntityId",
             "constraints.validation.info", "QuestionnaireResponseDocumentHeaderInformant12AssignedEntityCode",
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderInformant12AssignedEntityAssignedPerson"
           });                                                                                                                                                                                                                                                                       
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntity</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntity";                
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.warning", "QuestionnaireResponseDocumentHeaderInformant12RelatedEntityAddr",
             "constraints.validation.info", "QuestionnaireResponseDocumentHeaderInformant12RelatedEntityCode",
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderInformant12RelatedEntityRelatedPerson"
           });                                                                                                                                                                                                                                                                      
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntityPerson</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntityPersonAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformant12RelatedEntityPerson";                 
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderInformant12RelatedEntityPersonName"
           });                                                                                                                                                                                                                                                                     
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodian</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodian";                  
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderCustodianAssignedCustodian"
           });                                                                                                                                                                                                                                                                    
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodian</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodianAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodian";                   
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianRepresentedCustodianOrganization"
           });                                                                                                                                                                                                                                                                   
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganization</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganization";                    
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationAddr QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationId QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationTelecom QuestionnaireResponseDocumentHeaderCustodianAssignedCustodianCustodianOrganizationName"
           });                                                                                                                                                                                                                                                                  
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipient</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipient";                     
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.warning", "QuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientId",
             "constraints.validation.info", "QuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientInformationRecipient QuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientReceivedOrganization"
           });                                                                                                                                                                                                                                                                 
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientPerson</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientPersonAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientPerson";                      
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderInformationRecipientIntendedRecipientPersonName"
           });                                                                                                                                                                                                                                                                
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticator</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticator";                       
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "signatureCode.code", "S",
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderLegalAuthenticatorSignatureCode QuestionnaireResponseDocumentHeaderLegalAuthenticatorSignatureCodeP QuestionnaireResponseDocumentHeaderLegalAuthenticatorTime QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntity",
             "constraints.validation.dependOn.QuestionnaireResponseDocumentHeaderLegalAuthenticatorSignatureCode", "QuestionnaireResponseDocumentHeaderLegalAuthenticatorSignatureCodeP"
           });                                                                                                                                                                                                                                                               
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntity</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntity";                        
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityAddr QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityId QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTelecom QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityAssignedPerson QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTELUse",
             "constraints.validation.info", "QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityCode",
             "constraints.validation.query", "QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTELUse"
           });                                                                                                                                                                                                                                                              
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityPerson</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityPersonAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityPerson";                         
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityPersonName"
           });                                                                                                                                                                                                                                                             
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTEL</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTELAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTEL";                          
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderLegalAuthenticatorAssignedEntityTELUse"
           });                                                                                                                                                                                                                                                            
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderParticipant</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderParticipantAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderParticipant";                           
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderParticipantTime"
           });                                                                                                                                                                                                                                                           
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInFulfillmentOf</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderInFulfillmentOfAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInFulfillmentOf";                            
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderInFulfillmentOfOrder"
           });                                                                                                                                                                                                                                                          
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInFulfillmentOfOrder</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocQuestionnaireResponseDocumentHeaderInFulfillmentOfOrderAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocQuestionnaireResponseDocumentHeaderInFulfillmentOfOrder";                             
        addAnnotation
          (questionnaireResponseDocumentHeaderEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "QuestionnaireResponseDocumentHeaderInFulfillmentOfOrderTemplateId",
             "templateId.root", "null"
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
          (questionnaireResponseDocumentEClass, 
           source, 
           new String[] {
           });                                                                                                                                                                             
        addAnnotation
          (analogSliderResponsePatternObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (discreteSliderResponsePatternObservationEClass, 
           source, 
           new String[] {
           });                            
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocNumericResponsePatternObservationCD</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocNumericResponsePatternObservationCDAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocNumericResponsePatternObservationCD";                                                                                                                                         
        addAnnotation
          (numericResponsePatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "NumericResponsePatternObservationCDCode NumericResponsePatternObservationCDCodeSystem NumericResponsePatternObservationCDOriginalText"
           });                                                                                                                                             
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocMultipleChoiceResponsePatternObservationCE</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocMultipleChoiceResponsePatternObservationCEAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocMultipleChoiceResponsePatternObservationCE";                                                                                                                                                                               
        addAnnotation
          (multipleChoiceResponsePatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MultipleChoiceResponsePatternObservationCECode MultipleChoiceResponsePatternObservationCECodeSystem MultipleChoiceResponsePatternObservationCEDisplayName"
           });                                                                                                       
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocMultipleChoiceResponsePatternObservationCD</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocMultipleChoiceResponsePatternObservationCDAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocMultipleChoiceResponsePatternObservationCD";                                                                                                                                                                                
        addAnnotation
          (multipleChoiceResponsePatternObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MultipleChoiceResponsePatternObservationCDCode MultipleChoiceResponsePatternObservationCDCodeSystem MultipleChoiceResponsePatternObservationCDOriginalText"
           });                                                                                                      
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocResponseReferenceRangePatternObservationRange</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocResponseReferenceRangePatternObservationRangeAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocResponseReferenceRangePatternObservationRange";                                                                                                                                                                                                                                                                
        addAnnotation
          (responseReferenceRangePatternEClass, 
           source, 
           new String[] {
             "constraints.validation.info", "ResponseReferenceRangePatternObservationRangeText",
             "constraints.validation.error", "ResponseReferenceRangePatternObservationRangeValue ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow",
             "constraints.validation.query", "ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow"
           });                      
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocResponseReferenceRangePatternObservationRangeIVLINT</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createQrdocResponseReferenceRangePatternObservationRangeIVLINTAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocResponseReferenceRangePatternObservationRangeIVLINT";                                                                                                                                                                                                                                                                 
        addAnnotation
          (responseReferenceRangePatternEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow"
           });                     
    }

} // QRDOCPackageImpl
