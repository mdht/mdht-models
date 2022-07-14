/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getResultObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultObservation2TemplateId ResultObservationEffectiveTime ResultObservationText ResultObservationCodeP ResultObservationValue ResultObservationInterpretationCode ResultObservation2ReferenceRangeObservationRangeValue ResultObservation2ReferenceRangeObservationRangeCode ResultObservation2ReferenceRangeObservationRange' templateId.root='2.16.840.1.113883.10.20.22.4.2' templateId.extension='2015-08-01' constraints.validation.info='ResultObservationAuthorMultiplicity ResultObservationCodeValue ResultObservationTextReference ResultObservationReferenceValue ResultObservationTextReferenceValue ResultObservationNoObservationRangeCode' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.warning='ResultObservationCode ResultObservationInterpretationCodeP ResultObservation2AuthorParticipation ResultObservation2ReferenceRange' constraints.validation.dependOn.ResultObservationCode='ResultObservationCodeP' interpretationCode.codeSystem='2.16.840.1.113883.5.83' interpretationCode.codeSystemName='ObservationInterpretation' constraints.validation.dependOn.ResultObservationInterpretationCode='ResultObservationInterpretationCodeP' constraints.validation.query='ResultObservation2ReferenceRangeObservationRangeValue ResultObservation2ReferenceRangeObservationRangeCode ResultObservation2ReferenceRangeObservationRange'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultObservation2ReferenceRange constraints.validation.error='ResultObservation2ReferenceRangeObservationRange'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolResultObservation2ReferenceRangeObservationRange constraints.validation.error='ResultObservation2ReferenceRangeObservationRangeValue ResultObservation2ReferenceRangeObservationRangeCode'"
 *        annotation="duplicates"
 * @generated
 */
public interface ResultObservation2 extends ResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.2\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateResultObservation2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.interpretationCode-&gt;isEmpty() or self.interpretationCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateResultObservationInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateResultObservation2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange-&gt;exists(referenceRange : cda::ReferenceRange | not referenceRange.oclIsUndefined() and referenceRange.oclIsKindOf(cda::ReferenceRange))'"
	 * @generated
	 */
	boolean validateResultObservation2ReferenceRange(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange-&gt;excluding(null).observationRange-&gt;excluding(null)-&gt;reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateResultObservation2ReferenceRangeObservationRangeValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange-&gt;excluding(null).observationRange-&gt;excluding(null)-&gt;reject(code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateResultObservation2ReferenceRangeObservationRangeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.referenceRange-&gt;excluding(null)-&gt;reject(observationRange-&gt;one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange)))'"
	 * @generated
	 */
	boolean validateResultObservation2ReferenceRangeObservationRange(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultObservation2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResultObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ResultObservation2
