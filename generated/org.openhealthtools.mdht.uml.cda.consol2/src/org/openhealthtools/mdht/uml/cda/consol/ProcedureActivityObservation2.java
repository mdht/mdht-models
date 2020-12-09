/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Activity Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureActivityObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureActivityObservation2TemplateId ProcedureActivityObservationInstructionsInversion ProcedureActivityObservationTargetSiteCode ProcedureActivityObservationMoodCode ProcedureActivityObservationStatusCode ProcedureActivityObservationStatusCodeP ProcedureActivityObservationValue ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom ProcedureActivityObservationProcedureObservationPerformerAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.13' templateId.extension='2014-06-09' constraints.validation.warning='ProcedureActivityObservationCodeCodeSystems ProcedureActivityObservationTargetSiteCodeP ProcedureActivityObservationPerformer ProcedureActivityObservation2AuthorParticipation' constraints.validation.info='ProcedureActivityObservation2CodeSuggestedCodeSystems ProcedureActivityObservationIndication ProcedureActivityObservationMedicationActivity ProcedureActivityObservationInstructions ProcedureActivityObservation2ReactionObservation2 ProcedureActivityObservation2ANYNullFlavor' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.ProcedureActivityObservationTargetSiteCode='ProcedureActivityObservationTargetSiteCodeP' moodCode='EVN' constraints.validation.dependOn.ProcedureActivityObservationStatusCode='ProcedureActivityObservationStatusCodeP' constraints.validation.query='ProcedureActivityObservation2ANYNullFlavor ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom ProcedureActivityObservationProcedureObservationPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityObservation2ANY constraints.validation.info='ProcedureActivityObservation2ANYNullFlavor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityObservation2ProcedureObservationPerformer constraints.validation.error='ProcedureActivityObservationProcedureObservationPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityObservation2ProcedureObservationPerformerProcedureObservationAssignedEntity constraints.validation.error='ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr ProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom'"
 *        annotation="duplicates"
 * @generated
 */
public interface ProcedureActivityObservation2 extends ProcedureActivityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not code.oclIsUndefined() and self.code.isNullFlavorUndefined() implies self.code.codeSystem = \'2.16.840.1.113883.6.12\' or self.code.codeSystem = \'2.16.840.1.113883.6.4\' or self.code.codeSystem = \'2.16.840.1.113883.6.13\''"
	 * @generated
	 */
	boolean validateProcedureActivityObservation2CodeSuggestedCodeSystems(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.13\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureActivityObservation2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateProcedureActivityObservation2ReactionObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (isDefined(\'nullFlavor\') )))'"
	 * @generated
	 */
	boolean validateProcedureActivityObservation2ANYNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)'"
	 * @generated
	 */
	EList<Indication2> getConsolIndication2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()-&gt;select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity2)).oclAsType(consol::MedicationActivity2)'"
	 * @generated
	 */
	EList<MedicationActivity2> getConsolMedicationActivity2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2))-&gt;asSequence()-&gt;any(true).oclAsType(consol::Instruction2)'"
	 * @generated
	 */
	Instruction2 getConsolInstruction2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)).oclAsType(consol::ReactionObservation2)'"
	 * @generated
	 */
	EList<ReactionObservation2> getReactionObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureActivityObservation2
