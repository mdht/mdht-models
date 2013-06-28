/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getProcedure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.info='emspcrProcedureAbandonedProcedureRelationship emspcrProcedureAirwayConfirmationRelationship emspcrProcedureStatusCodeP emspcrProcedureApproachSiteCodeP emspcrProcedureNegationInd' constraints.validation.error='emspcrProcedureProcedurePriorRelationship emspcrProcedureProcedureNumberOfAttemptsRelationship emspcrProcedureProcedureSuccessfulRelationship emspcrProcedureProcedureComplicationsRelationship emspcrProcedureProcedurePatientResponseRelationship emspcrProcedureProcedurePerformer emspcrProcedureTemplateId emspcrProcedureCode emspcrProcedureEffectiveTime emspcrProcedureStatusCode emspcrProcedureApproachSiteCode' templateId.root='2.16.840.1.1133883.17.3.10.1.98' statusCode.code='Aborted' constraints.validation.dependOn.emspcrProcedureStatusCode='emspcrProcedureStatusCodeP' approachSiteCode.codeSystem='2.16.840.1.113883.6.1' approachSiteCode.codeSystemName='LOINC' constraints.validation.dependOn.emspcrProcedureApproachSiteCode='emspcrProcedureApproachSiteCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAbandonedProcedureRelationship constraints.validation.error='AbandonedProcedureRelationshipAbandonedProcedureReasonObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedurePriorRelationship constraints.validation.error='ProcedurePriorRelationshipProcedurePriorIndicator'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedureNumberOfAttemptsRelationship constraints.validation.error='ProcedureNumberOfAttemptsRelationshipProcedureNumberOfAttemptsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedureSuccessfulRelationship constraints.validation.error='ProcedureSuccessfulRelationshipProcedureSuccessfulObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedureComplicationsRelationship constraints.validation.error='ProcedureComplicationsRelationshipProcedureComplicationsObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedurePatientResponseRelationship constraints.validation.error='ProcedurePatientResponseRelationshipProcedurePatientResponseObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedurePerformer constraints.validation.error='ProcedurePerformerProcedurePerformerEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureProcedurePerformerProcedurePerformerEntity code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='ProcedurePerformerEntityCode ProcedurePerformerEntityCodeP ProcedurePerformerEntityId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAirwayConfirmationRelationship constraints.validation.error='AirwayConfirmationRelationshipAirwayConfirmationObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureReasonProcedureNotAttemptedRelationship constraints.validation.error='ReasonProcedureNotAttemptedRelationshipReasonProcedureNotAttemptedObservation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAirwayDeviceParticipant constraints.validation.error='AirwayDeviceParticipantAirwayDeviceParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAirwayDeviceParticipantAirwayDeviceParticipantRole constraints.validation.error='AirwayDeviceParticipantRoleAirwayDeviceParticipantType'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrProcedureAirwayDeviceParticipantAirwayDeviceParticipantRoleAirwayDeviceParticipantType code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.error='AirwayDeviceParticipantTypeCode'"
 * @generated
 */
public interface Procedure extends ProcedureActivityProcedure {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	* @generated
	*/
	boolean validateEmspcrProcedureEmspcrProcedureAbandonedProcedureRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	* @generated
	*/
	boolean validateEmspcrProcedureEmspcrProcedureProcedurePriorRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	* @generated
	*/
	boolean validateEmspcrProcedureEmspcrProcedureProcedureNumberOfAttemptsRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	* @generated
	*/
	boolean validateEmspcrProcedureEmspcrProcedureProcedureSuccessfulRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	* @generated
	*/
	boolean validateEmspcrProcedureEmspcrProcedureProcedureComplicationsRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	* @generated
	*/
	boolean validateEmspcrProcedureEmspcrProcedureProcedurePatientResponseRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	* @generated
	*/
	boolean validateEmspcrProcedureEmspcrProcedureProcedurePerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	* @generated
	*/
	boolean validateEmspcrProcedureEmspcrProcedureAirwayConfirmationRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateEmspcrProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	* @generated
	*/
	boolean validateEmspcrProcedureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEmspcrProcedureStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'Aborted\')'"
	* @generated
	*/
	boolean validateEmspcrProcedureStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())'"
	* @generated
	*/
	boolean validateEmspcrProcedureApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'LA18112-5\' or value.code = \'LA18113-3\' or value.code = \'LA18757-7\' or value.code = \'LA18758-5\' or value.code = \'LA18790-8\' or value.code = \'LA18791-6\' or value.code = \'LA18792-4\' or value.code = \'LA18793-2\' or value.code = \'LA18794-0\' or value.code = \'LA18795-7\' or value.code = \'LA18796-5\' or value.code = \'LA18797-3\' or value.code = \'LA18798-1\' or value.code = \'LA18799-9\' or value.code = \'LA18800-5\' or value.code = \'LA18801-3\' or value.code = \'LA18802-1\' or value.code = \'LA18803-9\' or value.code = \'LA18804-7\' or value.code = \'LA18805-4\' or value.code = \'LA18806-2\' or value.code = \'LA18807-0\' or value.code = \'LA18808-8\' or value.code = \'LA18809-6\' or value.code = \'LA18810-4\' or value.code = \'LA18811-2\' or value.code = \'LA18812-0\' or value.code = \'LA18813-8\' or value.code = \'LA18814-6\' or value.code = \'LA18815-3\' or value.code = \'LA18816-1\' or value.code = \'LA18817-9\' or value.code = \'LA18818-7\')))'"
	* @generated
	*/
	boolean validateEmspcrProcedureApproachSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.negationInd.oclIsUndefined()'"
	* @generated
	*/
	boolean validateEmspcrProcedureNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public Procedure init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // Procedure
