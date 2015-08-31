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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProblemObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProblemObservationTemplateId ProblemObservationHasOnsetDate ProblemObservationEffectiveTime ProblemObservationValueP ProblemObservationCodeP ProblemObservationText ProblemObservationStatusCode ProblemObservationStatusCodeP ProblemObservationHealthStatusObservation ProblemObservation2CDCodeTranslationP' templateId.root='2.16.840.1.113883.10.20.22.4.4' templateId.extension='2015-08-01' constraints.validation.info='ProblemObservationHasTextReference ProblemObservationTextReferenceValue ProblemObservationHasTextReferenceValue ProblemObservationHasResolutionDate ProblemObservationValueNullFlavor ProblemObservationValueNullFlavorUnknown ProblemObservationNegationInd ProblemObservation2PrognosisObservation ProblemObservation2PriorityPreference ProblemObservationProblemStatus ProblemObservation2CDQualifier ProblemObservation2CDCode' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.warning='ProblemObservationValue ProblemObservationCode ProblemObservation2AuthorParticipation ProblemObservation2CDCodeTranslation' constraints.validation.dependOn.ProblemObservationValue='ProblemObservationValueP' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.dependOn.ProblemObservationCode='ProblemObservationCodeP' statusCode.code='completed' constraints.validation.dependOn.ProblemObservationStatusCode='ProblemObservationStatusCodeP' constraints.validation.query='ProblemObservation2CDQualifier ProblemObservation2CDCode ProblemObservation2CDCodeTranslation ProblemObservation2CDCodeTranslationP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProblemObservation2CD constraints.validation.info='ProblemObservation2CDQualifier ProblemObservation2CDCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProblemObservation2CDCode translation.codeSystem='2.16.840.1.113883.6.1' translation.codeSystemName='LOINC' constraints.validation.warning='ProblemObservation2CDCodeTranslation' constraints.validation.error='ProblemObservation2CDCodeTranslationP'"
 * @generated
 */
public interface ProblemObservation2 extends ProblemObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean validateProblemObservationValueNullFlavorUnknown(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProblemObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PrognosisObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateProblemObservation2PrognosisObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
	 * @generated
	 */
	boolean validateProblemObservation2PriorityPreference(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProblemObservation2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((qualifier->isEmpty() or qualifier->exists(element | element.isNullFlavorUndefined())) implies (not qualifier->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateProblemObservation2CDQualifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateProblemObservation2CDCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty() and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'75326-9\' or value.code = \'75325-1\' or value.code = \'75324-4\' or value.code = \'75323-6\' or value.code = \'29308-4\' or value.code = \'75322-8\' or value.code = \'75275-8\' or value.code = \'75321-0\' or value.code = \'75319-4\' or value.code = \'75318-6\' or value.code = \'75317-8\' or value.code = \'75316-0\' or value.code = \'75315-2\' or value.code = \'75314-5\' or value.code = \'75313-7\' or value.code = \'75312-9\'))) )))'"
	 * @generated
	 */
	boolean validateProblemObservation2CDCodeTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateProblemObservation2CDCodeTranslationP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PrognosisObservation))->asSequence()->any(true).oclAsType(consol::PrognosisObservation)'"
	 * @generated
	 */
	PrognosisObservation getPrognosisObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)'"
	 * @generated
	 */
	EList<PriorityPreference> getPriorityPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemStatus))->asSequence()->any(true).oclAsType(consol::ProblemStatus)'"
	 * @generated
	 */
	ProblemStatus getConsolProblemStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation))->asSequence()->any(true).oclAsType(consol::HealthStatusObservation)'"
	 * @generated
	 */
	HealthStatusObservation getConsolHealthStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProblemObservation2
