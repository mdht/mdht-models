/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>General Header Constraints</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getGeneralHeaderConstraints()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolGeneralHeaderConstraintsTemplateId Mu2consolGeneralHeaderConstraintsRecordTarget Mu2consolGeneralHeaderConstraintsDocumentationOf GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent GeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant GeneralHeaderConstraintsComponent1EncompassingEncounter' templateId.root='2.16.840.1.113883.10.20.22.1.1' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent GeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant GeneralHeaderConstraintsComponent1EncompassingEncounter' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget constraints.validation.error='RecordTargetPatientRole RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP RecordTargetPatientRolePatientLanguageCommunicationLanguageCode RecordTargetPatientRolePatientEthnicGroupCode RecordTargetPatientRolePatientEthnicGroupCodeP RecordTargetPatientRolePatientRaceCode RecordTargetPatientRolePatientRaceCodeP RecordTargetPatientRolePatientLanguageCommunication RecordTargetPatientRolePatient' constraints.validation.query='RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP RecordTargetPatientRolePatientLanguageCommunicationLanguageCode RecordTargetPatientRolePatientEthnicGroupCode RecordTargetPatientRolePatientEthnicGroupCodeP RecordTargetPatientRolePatientRaceCode RecordTargetPatientRolePatientRaceCodeP RecordTargetPatientRolePatientLanguageCommunication RecordTargetPatientRolePatient' constraints.validation.dependOn.RecordTargetPatientRolePatientLanguageCommunicationLanguageCode='RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole constraints.validation.error='PatientRolePatient PatientRolePatientLanguageCommunicationLanguageCodeP PatientRolePatientLanguageCommunicationLanguageCode PatientRolePatientEthnicGroupCode PatientRolePatientEthnicGroupCodeP PatientRolePatientRaceCode PatientRolePatientRaceCodeP PatientRolePatientLanguageCommunication' constraints.validation.query='PatientRolePatientLanguageCommunicationLanguageCodeP PatientRolePatientLanguageCommunicationLanguageCode PatientRolePatientEthnicGroupCode PatientRolePatientEthnicGroupCodeP PatientRolePatientRaceCode PatientRolePatientRaceCodeP PatientRolePatientLanguageCommunication' constraints.validation.dependOn.PatientRolePatientLanguageCommunicationLanguageCode='PatientRolePatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='PatientEthnicGroupCode PatientEthnicGroupCodeP PatientRaceCode PatientRaceCodeP PatientLanguageCommunication PatientLanguageCommunicationLanguageCodeP PatientLanguageCommunicationLanguageCode' raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.query='PatientLanguageCommunicationLanguageCodeP PatientLanguageCommunicationLanguageCode' constraints.validation.dependOn.PatientLanguageCommunicationLanguageCode='PatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='LanguageCommunicationLanguageCode LanguageCommunicationLanguageCodeP' constraints.validation.dependOn.LanguageCommunicationLanguageCode='LanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOf constraints.validation.error='DocumentationOfServiceEvent DocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson DocumentationOfServiceEventPerformer1AssignedEntity DocumentationOfServiceEventPerformer' constraints.validation.query='DocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson DocumentationOfServiceEventPerformer1AssignedEntity DocumentationOfServiceEventPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEvent constraints.validation.error='ServiceEventPerformer ServiceEventPerformer1AssignedEntityAssignedPerson ServiceEventPerformer1AssignedEntity' constraints.validation.query='ServiceEventPerformer1AssignedEntityAssignedPerson ServiceEventPerformer1AssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1 constraints.validation.error='Performer1AssignedEntity Performer1AssignedEntityAssignedPerson' constraints.validation.query='Performer1AssignedEntityAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity constraints.validation.error='AssignedEntityAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1 constraints.validation.error='Component1EncompassingEncounter Component1EncompassingEncounterEncounterParticipant' constraints.validation.query='Component1EncompassingEncounterEncounterParticipant'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsComponent1EncompassingEncounter constraints.validation.error='EncompassingEncounterEncounterParticipant'"
 * @generated
 */
public interface GeneralHeaderConstraints extends
		org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->exists(recordTarget : cda::RecordTarget | not
	 * recordTarget.oclIsUndefined() and
	 * recordTarget.oclIsKindOf(cda::RecordTarget))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateMu2consolGeneralHeaderConstraintsRecordTarget(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.documentationOf->exists(documentationOf : cda::DocumentationOf | not
	 * documentationOf.oclIsUndefined() and
	 * documentationOf.oclIsKindOf(cda::DocumentationOf))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateMu2consolGeneralHeaderConstraintsDocumentationOf(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.documentationOf->excluding(null).serviceEvent->excluding(null).
	 * performer
	 * ->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson
	 * ->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined()
	 * and assignedPerson.oclIsKindOf(rim::Entity)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject(encounterParticipant->exists(encounterParticipant :
	 * cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and
	 * encounterParticipant.oclIsKindOf(rim::Participation)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->exists(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(rim::Participation)))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.componentOf->excluding(null)->reject(encompassingEncounter->one(
	 * encompassingEncounter : cda::EncompassingEncounter | not
	 * encompassingEncounter.oclIsUndefined() and
	 * encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsComponent1EncompassingEncounter(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalAdmissionDiagnosisSection) <!--
	 * end-model-doc -->
	 * 
	 * @model required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionDiagnosisSection)'"
	 * @generated
	 */
	HospitalAdmissionDiagnosisSection retrieveHospitalAdmissionDiagnosisSection();

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public GeneralHeaderConstraints init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public GeneralHeaderConstraints init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // GeneralHeaderConstraints
