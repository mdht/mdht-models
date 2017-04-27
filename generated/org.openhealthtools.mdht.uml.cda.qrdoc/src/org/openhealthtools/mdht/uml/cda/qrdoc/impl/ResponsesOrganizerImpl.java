/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;
import org.openhealthtools.mdht.uml.cda.qrdoc.AnalogSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.DiscreteSliderResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.MultipleChoiceResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.NumericResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponsesOrganizer;
import org.openhealthtools.mdht.uml.cda.qrdoc.TextResponsePatternObservation;
import org.openhealthtools.mdht.uml.cda.qrdoc.operations.ResponsesOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responses Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponsesOrganizerImpl extends OrganizerImpl implements ResponsesOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsesOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRDOCPackage.Literals.RESPONSES_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerNumericResponsePatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerNumericResponsePatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerMultipleChoiceResponsePatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerMultipleChoiceResponsePatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerTextQuestionResponseObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerTextQuestionResponseObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerAnalogSliderResponsePatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerAnalogSliderResponsePatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesOrganizerDiscreteSliderResponsePatternObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponsesOrganizerOperations.validateResponsesOrganizerDiscreteSliderResponsePatternObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumericResponsePatternObservation> getNumericResponsePatternObservations() {
		return ResponsesOrganizerOperations.getNumericResponsePatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultipleChoiceResponsePatternObservation> getMultipleChoiceResponsePatternObservations() {
		return ResponsesOrganizerOperations.getMultipleChoiceResponsePatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextResponsePatternObservation> getTextQuestionResponseObservations() {
		return ResponsesOrganizerOperations.getTextQuestionResponseObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogSliderResponsePatternObservation> getAnalogSliderResponsePatternObservations() {
		return ResponsesOrganizerOperations.getAnalogSliderResponsePatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteSliderResponsePatternObservation> getDiscreteSliderResponsePatternObservations() {
		return ResponsesOrganizerOperations.getDiscreteSliderResponsePatternObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsesOrganizer init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponsesOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ResponsesOrganizerImpl
