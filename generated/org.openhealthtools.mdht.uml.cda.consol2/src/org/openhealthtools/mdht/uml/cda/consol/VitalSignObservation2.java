/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Sign Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getVitalSignObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='VitalSignObservationTemplateId VitalSignObservationEffectiveTime VitalSignObservationValue VitalSignObservationText VitalSignObservationInterpretationCode VitalSignObservationAuthor VitalSignObservation2PQUnit' templateId.root='2.16.840.1.113883.10.20.22.4.27' templateId.extension='2014-06-09' constraints.validation.info='VitalSignObservationTextReference VitalSignObservationReferenceValue VitalSignObservationTextReferenceValue VitalSignObservationInterpretationCodeP' interpretationCode.codeSystem='2.16.840.1.113883.5.83' interpretationCode.codeSystemName='ObservationInterpretation' constraints.validation.dependOn.VitalSignObservationInterpretationCode='VitalSignObservationInterpretationCodeP' constraints.validation.warning='VitalSignObservation2AuthorParticipation' constraints.validation.query='VitalSignObservation2PQUnit'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolVitalSignObservation2PQ unit='1' constraints.validation.error='VitalSignObservation2PQUnit'"
 * @generated
 */
public interface VitalSignObservation2 extends VitalSignObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())'"
	 * @generated
	 */
	boolean validateVitalSignObservationInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateVitalSignObservation2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not unit.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateVitalSignObservation2PQUnit(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignObservation2
