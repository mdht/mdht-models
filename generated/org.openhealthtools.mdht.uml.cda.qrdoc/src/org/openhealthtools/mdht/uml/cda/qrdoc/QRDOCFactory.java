/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage
 * @generated
 */
public interface QRDOCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QRDOCFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.qrdoc.impl.QRDOCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Document Header</em>'.
	 * @generated
	 */
	QuestionnaireResponseDocumentHeader createQuestionnaireResponseDocumentHeader();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Document</em>'.
	 * @generated
	 */
	QuestionnaireResponseDocument createQuestionnaireResponseDocument();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Section</em>'.
	 * @generated
	 */
	QuestionnaireResponseSection createQuestionnaireResponseSection();

	/**
	 * Returns a new object of class '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responses Organizer</em>'.
	 * @generated
	 */
	ResponsesOrganizer createResponsesOrganizer();

	/**
	 * Returns a new object of class '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Response Pattern Observation</em>'.
	 * @generated
	 */
	NumericResponsePatternObservation createNumericResponsePatternObservation();

	/**
	 * Returns a new object of class '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Choice Response Pattern Observation</em>'.
	 * @generated
	 */
	MultipleChoiceResponsePatternObservation createMultipleChoiceResponsePatternObservation();

	/**
	 * Returns a new object of class '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Response Pattern Observation</em>'.
	 * @generated
	 */
	TextResponsePatternObservation createTextResponsePatternObservation();

	/**
	 * Returns a new object of class '<em>Analog Slider Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Slider Response Pattern Observation</em>'.
	 * @generated
	 */
	AnalogSliderResponsePatternObservation createAnalogSliderResponsePatternObservation();

	/**
	 * Returns a new object of class '<em>Discrete Slider Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Slider Response Pattern Observation</em>'.
	 * @generated
	 */
	DiscreteSliderResponsePatternObservation createDiscreteSliderResponsePatternObservation();

	/**
	 * Returns a new object of class '<em>Response Media Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Media Pattern</em>'.
	 * @generated
	 */
	ResponseMediaPattern createResponseMediaPattern();

	/**
	 * Returns a new object of class '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Reference Range Pattern</em>'.
	 * @generated
	 */
	ResponseReferenceRangePattern createResponseReferenceRangePattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QRDOCPackage getQRDOCPackage();

} // QRDOCFactory
