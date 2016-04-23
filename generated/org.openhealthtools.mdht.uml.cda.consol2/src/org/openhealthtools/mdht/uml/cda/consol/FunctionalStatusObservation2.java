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
 * A representation of the model object '<em><b>Functional Status Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFunctionalStatusObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultObservationTemplateId ResultObservationCode ResultObservationCodeP ResultObservationText ResultObservationInterpretationCode ResultObservationMethodCode ResultObservationTargetSiteCode FunctionalStatusResultObservationAuthor FunctionalStatusResultObservationReferenceRangeObservationRange' templateId.root='2.16.840.1.113883.10.20.22.4.67' templateId.extension='2014-06-09' constraints.validation.info='ResultObservationTextReference ResultObservationTextReferenceValue FunctionalStatusResultObservationReferenceRange FunctionalStatusResultObservationNonMedicinalSupplyActivity FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode' code.code='54522-8' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Functional status' constraints.validation.dependOn.ResultObservationCode='ResultObservationCodeP' constraints.validation.warning='FunctionalStatusObservation2AuthorParticipation' constraints.validation.query='FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode FunctionalStatusResultObservationReferenceRangeObservationRange'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusObservation2ReferenceRange constraints.validation.error='FunctionalStatusResultObservationReferenceRangeObservationRange'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolFunctionalStatusObservation2ReferenceRangeObservationRange constraints.validation.info='FunctionalStatusResultObservationReferenceRangeObservationRangeNoCode'"
 * @generated
 */
public interface FunctionalStatusObservation2 extends FunctionalStatusResultObservation {
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
	boolean validateFunctionalStatusObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2))->asSequence()->any(true).oclAsType(consol::NonMedicinalSupplyActivity2)'"
	 * @generated
	 */
	NonMedicinalSupplyActivity2 getConsolNonMedicinalSupplyActivity2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusObservation2
