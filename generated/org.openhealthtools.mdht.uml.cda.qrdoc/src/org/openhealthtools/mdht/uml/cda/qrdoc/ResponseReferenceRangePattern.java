/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.ReferenceRange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Reference Range Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage#getResponseReferenceRangePattern()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResponseReferenceRangePatternTemplateId ResponseReferenceRangePatternTypeCode ResponseReferenceRangePatternObservationRange ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow ResponseReferenceRangePatternObservationRangeValue' templateId.root='2.16.840.1.113883.10.20.33.4.3' typeCode='REFV' constraints.validation.query='ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow ResponseReferenceRangePatternObservationRangeText ResponseReferenceRangePatternObservationRangeValue' constraints.validation.info='ResponseReferenceRangePatternObservationRangeText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocResponseReferenceRangePatternObservationRange constraints.validation.info='ResponseReferenceRangePatternObservationRangeText' constraints.validation.error='ResponseReferenceRangePatternObservationRangeValue ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow' constraints.validation.query='ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qrdocResponseReferenceRangePatternObservationRangeIVLINT constraints.validation.error='ResponseReferenceRangePatternObservationRangeIVLINTHigh ResponseReferenceRangePatternObservationRangeIVLINTLow'"
 * @generated
 */
public interface ResponseReferenceRangePattern extends ReferenceRange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.33.4.3\')'"
	 * @generated
	 */
	boolean validateResponseReferenceRangePatternTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'typeCode\')'"
	 * @generated
	 */
	boolean validateResponseReferenceRangePatternTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange))'"
	 * @generated
	 */
	boolean validateResponseReferenceRangePatternObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.observationRange->excluding(null).value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateResponseReferenceRangePatternObservationRangeIVLINTHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.observationRange->excluding(null).value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateResponseReferenceRangePatternObservationRangeIVLINTLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.observationRange->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateResponseReferenceRangePatternObservationRangeText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::IVL_INT)))'"
	 * @generated
	 */
	boolean validateResponseReferenceRangePatternObservationRangeValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseReferenceRangePattern init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResponseReferenceRangePattern init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ResponseReferenceRangePattern
