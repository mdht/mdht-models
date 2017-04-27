/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.ReferenceRange;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.ActRelationship;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.cda.qrdoc.*;
import org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.NumericResponsePatternObservation;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage
 * @generated
 */
public class QRDOCSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QRDOCPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRDOCSwitch() {
		if (modelPackage == null) {
			modelPackage = QRDOCPackage.eINSTANCE;
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
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER: {
				QuestionnaireResponseDocumentHeader questionnaireResponseDocumentHeader = (QuestionnaireResponseDocumentHeader)theEObject;
				T result = caseQuestionnaireResponseDocumentHeader(questionnaireResponseDocumentHeader);
				if (result == null) result = caseClinicalDocument(questionnaireResponseDocumentHeader);
				if (result == null) result = caseAct(questionnaireResponseDocumentHeader);
				if (result == null) result = caseInfrastructureRoot(questionnaireResponseDocumentHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_DOCUMENT: {
				QuestionnaireResponseDocument questionnaireResponseDocument = (QuestionnaireResponseDocument)theEObject;
				T result = caseQuestionnaireResponseDocument(questionnaireResponseDocument);
				if (result == null) result = caseQuestionnaireResponseDocumentHeader(questionnaireResponseDocument);
				if (result == null) result = caseClinicalDocument(questionnaireResponseDocument);
				if (result == null) result = caseAct(questionnaireResponseDocument);
				if (result == null) result = caseInfrastructureRoot(questionnaireResponseDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.QUESTIONNAIRE_RESPONSE_SECTION: {
				QuestionnaireResponseSection questionnaireResponseSection = (QuestionnaireResponseSection)theEObject;
				T result = caseQuestionnaireResponseSection(questionnaireResponseSection);
				if (result == null) result = caseSection(questionnaireResponseSection);
				if (result == null) result = caseAct(questionnaireResponseSection);
				if (result == null) result = caseInfrastructureRoot(questionnaireResponseSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.RESPONSES_ORGANIZER: {
				ResponsesOrganizer responsesOrganizer = (ResponsesOrganizer)theEObject;
				T result = caseResponsesOrganizer(responsesOrganizer);
				if (result == null) result = caseOrganizer(responsesOrganizer);
				if (result == null) result = caseClinicalStatement(responsesOrganizer);
				if (result == null) result = caseAct(responsesOrganizer);
				if (result == null) result = caseInfrastructureRoot(responsesOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.NUMERIC_RESPONSE_PATTERN_OBSERVATION: {
				NumericResponsePatternObservation numericResponsePatternObservation = (NumericResponsePatternObservation)theEObject;
				T result = caseNumericResponsePatternObservation(numericResponsePatternObservation);
				if (result == null) result = caseObservation(numericResponsePatternObservation);
				if (result == null) result = caseClinicalStatement(numericResponsePatternObservation);
				if (result == null) result = caseAct(numericResponsePatternObservation);
				if (result == null) result = caseInfrastructureRoot(numericResponsePatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.MULTIPLE_CHOICE_RESPONSE_PATTERN_OBSERVATION: {
				MultipleChoiceResponsePatternObservation multipleChoiceResponsePatternObservation = (MultipleChoiceResponsePatternObservation)theEObject;
				T result = caseMultipleChoiceResponsePatternObservation(multipleChoiceResponsePatternObservation);
				if (result == null) result = caseObservation(multipleChoiceResponsePatternObservation);
				if (result == null) result = caseClinicalStatement(multipleChoiceResponsePatternObservation);
				if (result == null) result = caseAct(multipleChoiceResponsePatternObservation);
				if (result == null) result = caseInfrastructureRoot(multipleChoiceResponsePatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.TEXT_RESPONSE_PATTERN_OBSERVATION: {
				TextResponsePatternObservation textResponsePatternObservation = (TextResponsePatternObservation)theEObject;
				T result = caseTextResponsePatternObservation(textResponsePatternObservation);
				if (result == null) result = caseObservation(textResponsePatternObservation);
				if (result == null) result = caseClinicalStatement(textResponsePatternObservation);
				if (result == null) result = caseAct(textResponsePatternObservation);
				if (result == null) result = caseInfrastructureRoot(textResponsePatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.ANALOG_SLIDER_RESPONSE_PATTERN_OBSERVATION: {
				AnalogSliderResponsePatternObservation analogSliderResponsePatternObservation = (AnalogSliderResponsePatternObservation)theEObject;
				T result = caseAnalogSliderResponsePatternObservation(analogSliderResponsePatternObservation);
				if (result == null) result = caseNumericResponsePatternObservation(analogSliderResponsePatternObservation);
				if (result == null) result = caseObservation(analogSliderResponsePatternObservation);
				if (result == null) result = caseClinicalStatement(analogSliderResponsePatternObservation);
				if (result == null) result = caseAct(analogSliderResponsePatternObservation);
				if (result == null) result = caseInfrastructureRoot(analogSliderResponsePatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.DISCRETE_SLIDER_RESPONSE_PATTERN_OBSERVATION: {
				DiscreteSliderResponsePatternObservation discreteSliderResponsePatternObservation = (DiscreteSliderResponsePatternObservation)theEObject;
				T result = caseDiscreteSliderResponsePatternObservation(discreteSliderResponsePatternObservation);
				if (result == null) result = caseMultipleChoiceResponsePatternObservation(discreteSliderResponsePatternObservation);
				if (result == null) result = caseObservation(discreteSliderResponsePatternObservation);
				if (result == null) result = caseClinicalStatement(discreteSliderResponsePatternObservation);
				if (result == null) result = caseAct(discreteSliderResponsePatternObservation);
				if (result == null) result = caseInfrastructureRoot(discreteSliderResponsePatternObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.RESPONSE_MEDIA_PATTERN: {
				ResponseMediaPattern responseMediaPattern = (ResponseMediaPattern)theEObject;
				T result = caseResponseMediaPattern(responseMediaPattern);
				if (result == null) result = caseObservation(responseMediaPattern);
				if (result == null) result = caseClinicalStatement(responseMediaPattern);
				if (result == null) result = caseAct(responseMediaPattern);
				if (result == null) result = caseInfrastructureRoot(responseMediaPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QRDOCPackage.RESPONSE_REFERENCE_RANGE_PATTERN: {
				ResponseReferenceRangePattern responseReferenceRangePattern = (ResponseReferenceRangePattern)theEObject;
				T result = caseResponseReferenceRangePattern(responseReferenceRangePattern);
				if (result == null) result = caseReferenceRange(responseReferenceRangePattern);
				if (result == null) result = caseActRelationship(responseReferenceRangePattern);
				if (result == null) result = caseInfrastructureRoot(responseReferenceRangePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Document Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseDocumentHeader(QuestionnaireResponseDocumentHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseDocument(QuestionnaireResponseDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseSection(QuestionnaireResponseSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responses Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responses Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsesOrganizer(ResponsesOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Response Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericResponsePatternObservation(NumericResponsePatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Choice Response Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChoiceResponsePatternObservation(MultipleChoiceResponsePatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Response Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextResponsePatternObservation(TextResponsePatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Slider Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Slider Response Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogSliderResponsePatternObservation(AnalogSliderResponsePatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Slider Response Pattern Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Slider Response Pattern Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteSliderResponsePatternObservation(DiscreteSliderResponsePatternObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Media Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Media Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMediaPattern(ResponseMediaPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Reference Range Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Reference Range Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseReferenceRangePattern(ResponseReferenceRangePattern object) {
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

} // QRDOCSwitch
