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
 * A representation of the model object '<em><b>Procedure Activity Procedure2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureActivityProcedure2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureActivityProcedure2TemplateId ProcedureActivityProcedureInstructionsInversion ProcedureActivityProcedureServiceDeliveryLocationTypeCode ProcedureActivityProcedureTargetSiteCode ProcedureActivityProcedureMoodCode ProcedureActivityProcedureStatusCode ProcedureActivityProcedureStatusCodeP ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity' templateId.root='2.16.840.1.113883.10.20.22.4.14' templateId.extension='2014-06-09' constraints.validation.warning='ProcedureActivityProcedureCodeCodeSystems ProcedureActivityProcedureTargetSiteCodeP ProcedureActivityProcedurePerformer ProcedureActivityProcedure2AuthorParticipation' constraints.validation.info='ProcedureActivityProcedure2CodeSuggestedCodeSystems ProcedureActivityProcedureIndication ProcedureActivityProcedureMedicationActivity ProcedureActivityProcedurePatientInstruction ProcedureActivityProcedureSpecimen ProcedureActivityProcedure2ReactionObservation2' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.ProcedureActivityProcedureTargetSiteCode='ProcedureActivityProcedureTargetSiteCodeP' moodCode='EVN' constraints.validation.dependOn.ProcedureActivityProcedureStatusCode='ProcedureActivityProcedureStatusCodeP' constraints.validation.query='ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityProcedure2ProcedureActivityPerformer constraints.validation.error='ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityAssignedEntity constraints.validation.error='ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr ProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom'"
 * @generated
 */
public interface ProcedureActivityProcedure2 extends ProcedureActivityProcedure {
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
	boolean validateProcedureActivityProcedure2CodeSuggestedCodeSystems(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.14\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedure2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedureStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateProcedureActivityProcedure2AuthorParticipation(DiagnosticChain diagnostics,
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
	boolean validateProcedureActivityProcedure2ReactionObservation2(DiagnosticChain diagnostics,
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
	public ProcedureActivityProcedure2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedure2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureActivityProcedure2
