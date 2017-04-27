/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Slider Question Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage#getAnalogSliderQuestionPatternObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AnalogSliderQuestionPatternObservationTemplateId AnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue AnalogSliderQuestionPatternObservationReferenceRangeTypeCode' templateId.root='2.16.840.1.113883.10.20.32.4.10' constraints.validation.warning='AnalogSliderQuestionPatternObservationReferenceRange' constraints.validation.query='AnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue AnalogSliderQuestionPatternObservationReferenceRangeTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddAnalogSliderQuestionPatternObservationReferenceRange typeCode='REFV' constraints.validation.error='AnalogSliderQuestionPatternObservationReferenceRangeTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddAnalogSliderQuestionPatternObservationReferenceRangeObservationRange constraints.validation.error='AnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue'"
 * @generated
 */
public interface AnalogSliderQuestionPatternObservation extends NumericQuestionPatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->exists(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))'"
	 * @generated
	 */
	boolean validateAnalogSliderQuestionPatternObservationReferenceRange(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null).observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAnalogSliderQuestionPatternObservationReferenceRangeObservationRangeValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange->excluding(null)->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateAnalogSliderQuestionPatternObservationReferenceRangeTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSliderQuestionPatternObservation init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalogSliderQuestionPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AnalogSliderQuestionPatternObservation
