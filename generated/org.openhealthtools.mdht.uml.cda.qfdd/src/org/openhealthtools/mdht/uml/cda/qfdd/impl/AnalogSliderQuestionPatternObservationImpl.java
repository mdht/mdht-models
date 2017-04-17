/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.qfdd.AnalogSliderQuestionPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.AnalogSliderQuestionPatternObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Slider Question Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnalogSliderQuestionPatternObservationImpl extends NumericQuestionPatternObservationImpl implements
		AnalogSliderQuestionPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogSliderQuestionPatternObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.ANALOG_SLIDER_QUESTION_PATTERN_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderQuestionPatternObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnalogSliderQuestionPatternObservationOperations.validateAnalogSliderQuestionPatternObservationReferenceRange(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AnalogSliderQuestionPatternObservationOperations.validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnalogSliderQuestionPatternObservationOperations.validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNumericQuestionPatternObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnalogSliderQuestionPatternObservationOperations.validateNumericQuestionPatternObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSliderQuestionPatternObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalogSliderQuestionPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // AnalogSliderQuestionPatternObservationImpl
