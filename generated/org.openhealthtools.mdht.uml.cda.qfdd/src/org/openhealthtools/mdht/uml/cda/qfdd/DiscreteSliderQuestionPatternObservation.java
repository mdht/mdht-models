/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Slider Question Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage#getDiscreteSliderQuestionPatternObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DiscreteSliderQuestionPatternObservationTemplateId' templateId.root='2.16.840.1.113883.10.20.32.4.11'"
 * @generated
 */
public interface DiscreteSliderQuestionPatternObservation extends MultipleChoiceQuestionPatternObservation {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSliderQuestionPatternObservation init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscreteSliderQuestionPatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DiscreteSliderQuestionPatternObservation
