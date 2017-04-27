/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Slider Response Pattern Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage#getAnalogSliderResponsePatternObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AnalogSliderResponsePatternObservationTemplateId' templateId.root='2.16.840.1.113883.10.20.33.4.7'"
 * @generated
 */
public interface AnalogSliderResponsePatternObservation extends NumericResponsePatternObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSliderResponsePatternObservation init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnalogSliderResponsePatternObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AnalogSliderResponsePatternObservation
