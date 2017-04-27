/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.qrdoc.*;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QRDOCFactoryImpl extends EFactoryImpl implements QRDOCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QRDOCFactory init() {
		try {
			QRDOCFactory theQRDOCFactory = (QRDOCFactory)EPackage.Registry.INSTANCE.getEFactory(QRDOCPackage.eNS_URI);
			if (theQRDOCFactory != null) {
				return theQRDOCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QRDOCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRDOCFactoryImpl() {
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
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER: return createQuestionnaireResponseDocumentHeader();
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_DOCUMENT: return createQuestionnaireResponseDocument();
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_SECTION: return createQuestionnaireResponseSection();
			case QRDOCPackage.RESPONSES_ORGANIZER: return createResponsesOrganizer();
			case QRDOCPackage.NUMERIC_RESPONSE_PATTERN_OBSERVATION: return createNumericResponsePatternObservation();
			case QRDOCPackage.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION: return createMultipleChoiceResponsePatternObservation();
			case QRDOCPackage.TEXT_RESPONSE_PATTERN_OBSERVATION: return createTextResponsePatternObservation();
			case QRDOCPackage.ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION: return createAnalogSliderResponsePatternObservation();
			case QRDOCPackage.DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION: return createDiscreteSliderResponsePatternObservation();
			case QRDOCPackage.RESPONSE_MEDIA_PATTERN: return createResponseMediaPattern();
			case QRDOCPackage.RESPONSE_REFERENCE_RANGE_PATTERN: return createResponseReferenceRangePattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseDocumentHeader createQuestionnaireResponseDocumentHeader() {
		QuestionnaireResponseDocumentHeaderImpl questionnaireResponseDocumentHeader = new QuestionnaireResponseDocumentHeaderImpl();
		return questionnaireResponseDocumentHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseDocument createQuestionnaireResponseDocument() {
		QuestionnaireResponseDocumentImpl questionnaireResponseDocument = new QuestionnaireResponseDocumentImpl();
		return questionnaireResponseDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseSection createQuestionnaireResponseSection() {
		QuestionnaireResponseSectionImpl questionnaireResponseSection = new QuestionnaireResponseSectionImpl();
		return questionnaireResponseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsesOrganizer createResponsesOrganizer() {
		ResponsesOrganizerImpl responsesOrganizer = new ResponsesOrganizerImpl();
		return responsesOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericResponsePatternObservation createNumericResponsePatternObservation() {
		NumericResponsePatternObservationImpl numericResponsePatternObservation = new NumericResponsePatternObservationImpl();
		return numericResponsePatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoiceResponsePatternObservation createMultipleChoiceResponsePatternObservation() {
		MultipleChoiceResponsePatternObservationImpl multipleChoiceResponsePatternObservation = new MultipleChoiceResponsePatternObservationImpl();
		return multipleChoiceResponsePatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextResponsePatternObservation createTextResponsePatternObservation() {
		TextResponsePatternObservationImpl textResponsePatternObservation = new TextResponsePatternObservationImpl();
		return textResponsePatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSliderResponsePatternObservation createAnalogSliderResponsePatternObservation() {
		AnalogSliderResponsePatternObservationImpl analogSliderResponsePatternObservation = new AnalogSliderResponsePatternObservationImpl();
		return analogSliderResponsePatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSliderResponsePatternObservation createDiscreteSliderResponsePatternObservation() {
		DiscreteSliderResponsePatternObservationImpl discreteSliderResponsePatternObservation = new DiscreteSliderResponsePatternObservationImpl();
		return discreteSliderResponsePatternObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMediaPattern createResponseMediaPattern() {
		ResponseMediaPatternImpl responseMediaPattern = new ResponseMediaPatternImpl();
		return responseMediaPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseReferenceRangePattern createResponseReferenceRangePattern() {
		ResponseReferenceRangePatternImpl responseReferenceRangePattern = new ResponseReferenceRangePatternImpl();
		return responseReferenceRangePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRDOCPackage getQRDOCPackage() {
		return (QRDOCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QRDOCPackage getPackage() {
		return QRDOCPackage.eINSTANCE;
	}

} // QRDOCFactoryImpl
