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

import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Referral Act</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPatientReferralAct()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PatientReferralActTemplateId PatientReferralActClassCode PatientReferralActMoodCode PatientReferralActId PatientReferralActCode PatientReferralActCodeP PatientReferralActStatusCode PatientReferralActStatusCodeP PatientReferralActEffectiveTime PatientReferralActEntryRelationshipObservationClassCode PatientReferralActEntryRelationshipObservationMoodCode PatientReferralActEntryRelationshipObservationCodeP PatientReferralActEntryRelationshipObservationCode PatientReferralActEntryRelationshipObservationStatusCode PatientReferralActEntryRelationshipObservationStatusCodeP PatientReferralActEntryRelationshipObservationValueP PatientReferralActEntryRelationshipTypeCodeP PatientReferralActEntryRelationshipTypeCode PatientReferralActEntryRelationshipObservation' templateId.root='2.16.840.1.113883.10.20.22.4.140' classCode='ACT' moodCode='INT' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.dependOn.PatientReferralActCode='PatientReferralActCodeP' statusCode.code='active' constraints.validation.info='PatientReferralActActReference PatientReferralActEntryRelationship' constraints.validation.query='PatientReferralActEntryRelationshipObservationClassCode PatientReferralActEntryRelationshipObservationMoodCode PatientReferralActEntryRelationshipObservationCodeP PatientReferralActEntryRelationshipObservationCode PatientReferralActEntryRelationshipObservationStatusCode PatientReferralActEntryRelationshipObservationStatusCodeP PatientReferralActEntryRelationshipObservationValue PatientReferralActEntryRelationshipObservationValueP PatientReferralActEntryRelationshipTypeCodeP PatientReferralActEntryRelationshipTypeCode PatientReferralActEntryRelationshipObservation' constraints.validation.dependOn.PatientReferralActEntryRelationshipObservationCode='PatientReferralActEntryRelationshipObservationCodeP' constraints.validation.warning='PatientReferralActEntryRelationshipObservationValue' constraints.validation.dependOn.PatientReferralActEntryRelationshipTypeCode='PatientReferralActEntryRelationshipTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPatientReferralActEntryRelationship typeCode='SUBJ' constraints.validation.error='PatientReferralActEntryRelationshipTypeCode PatientReferralActEntryRelationshipTypeCodeP PatientReferralActEntryRelationshipObservation' constraints.validation.dependOn.PatientReferralActEntryRelationshipTypeCode='PatientReferralActEntryRelationshipTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolPatientReferralActEntryRelationshipObservation classCode='OBS' constraints.validation.error='PatientReferralActEntryRelationshipObservationClassCode PatientReferralActEntryRelationshipObservationMoodCode PatientReferralActEntryRelationshipObservationCode PatientReferralActEntryRelationshipObservationCodeP PatientReferralActEntryRelationshipObservationStatusCode PatientReferralActEntryRelationshipObservationStatusCodeP PatientReferralActEntryRelationshipObservationValueP' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='assertion' constraints.validation.dependOn.PatientReferralActEntryRelationshipObservationCode='PatientReferralActEntryRelationshipObservationCodeP' statusCode.code='completed' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.warning='PatientReferralActEntryRelationshipObservationValue'"
 * @generated
 */
public interface PatientReferralAct extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.140\')'"
	 * @generated
	 */
	boolean validatePatientReferralActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validatePatientReferralActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::INT'"
	 * @generated
	 */
	boolean validatePatientReferralActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validatePatientReferralActId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientReferralActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'408293001\' or value.code = \'44383000\' or value.code = \'103697008\' or value.code = \'27217005\' or value.code = \'41920009\' or value.code = \'17294003\' or value.code = \'28214001\' or value.code = \'413293006\' or value.code = \'183877003\' or value.code = \'183686006\' or value.code = \'391034007\' or value.code = \'307836003\' or value.code = \'307834000\' or value.code = \'307835004\' or value.code = \'417073006\' or value.code = \'396150002\' or value.code = \'396158009\' or value.code = \'275821008\' or value.code = \'306101007\' or value.code = \'307837007\' or value.code = \'306206005\' or value.code = \'134403003\'))'"
	 * @generated
	 */
	boolean validatePatientReferralActCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'active\')'"
	 * @generated
	 */
	boolean validatePatientReferralActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientReferralActStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validatePatientReferralActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::ActReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)'"
	 * @generated
	 */
	boolean validatePatientReferralActActReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\'))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined() and statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'completed\'))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'370985002\' or value.code = \'170941001\' or value.code = \'170935008\' or value.code = \'268528005\' or value.code = \'170939002\' or value.code = \'268529002\' or value.code = \'170936009\' or value.code = \'170937000\' or value.code = \'170940000\'))))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipTypeCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::x_ActRelationshipEntryRelationship))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
	 * @generated
	 */
	boolean validatePatientReferralActEntryRelationshipObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ActReference)).oclAsType(consol::ActReference)'"
	 * @generated
	 */
	EList<ActReference> getActReferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientReferralAct init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientReferralAct init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PatientReferralAct
