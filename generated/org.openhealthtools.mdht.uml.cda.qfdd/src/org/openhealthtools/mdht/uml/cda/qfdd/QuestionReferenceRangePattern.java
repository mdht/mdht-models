/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.ReferenceRange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Reference Range Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage#getQuestionReferenceRangePattern()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='QuestionReferenceRangePatternTemplateId QuestionReferenceRangePatternTypeCode QuestionReferenceRangePatternObservationRange QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow QuestionReferenceRangePatternObservationRangeValue' templateId.root='2.16.840.1.113883.10.20.32.4.5' typeCode='REFV' constraints.validation.query='QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow QuestionReferenceRangePatternObservationRangeText QuestionReferenceRangePatternObservationRangeValue' constraints.validation.info='QuestionReferenceRangePatternObservationRangeText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionReferenceRangePatternObservationRange constraints.validation.info='QuestionReferenceRangePatternObservationRangeText' constraints.validation.error='QuestionReferenceRangePatternObservationRangeValue QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow' constraints.validation.query='QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/qfddQuestionReferenceRangePatternObservationRangeIVLINT constraints.validation.error='QuestionReferenceRangePatternObservationRangeIVLINTHigh QuestionReferenceRangePatternObservationRangeIVLINTLow'"
 * @generated
 */
public interface QuestionReferenceRangePattern extends ReferenceRange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.32.4.5\')'"
	 * @generated
	 */
	boolean validateQuestionReferenceRangePatternTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateQuestionReferenceRangePatternTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateQuestionReferenceRangePatternObservationRange(DiagnosticChain diagnostics,
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
	boolean validateQuestionReferenceRangePatternObservationRangeIVLINTHigh(DiagnosticChain diagnostics,
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
	boolean validateQuestionReferenceRangePatternObservationRangeIVLINTLow(DiagnosticChain diagnostics,
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
	boolean validateQuestionReferenceRangePatternObservationRangeText(DiagnosticChain diagnostics,
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
	boolean validateQuestionReferenceRangePatternObservationRangeValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionReferenceRangePattern init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionReferenceRangePattern init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // QuestionReferenceRangePattern
