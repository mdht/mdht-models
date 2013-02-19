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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolGeneralHeaderConstraintsTemplateId Mu2consolGeneralHeaderConstraintsCareTeamMembers Mu2consolGeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole' templateId.root='2.16.840.1.113883.10.20.22.1.1' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget constraints.validation.error='RecordTargetPatientRole RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP RecordTargetPatientRolePatientLanguageCommunicationLanguageCode RecordTargetPatientRolePatientEthnicGroupCode RecordTargetPatientRolePatientEthnicGroupCodeP RecordTargetPatientRolePatientRaceCode RecordTargetPatientRolePatientRaceCodeP RecordTargetPatientRolePatientLanguageCommunication RecordTargetPatientRolePatient' constraints.validation.query='RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP RecordTargetPatientRolePatientLanguageCommunicationLanguageCode RecordTargetPatientRolePatientEthnicGroupCode RecordTargetPatientRolePatientEthnicGroupCodeP RecordTargetPatientRolePatientRaceCode RecordTargetPatientRolePatientRaceCodeP RecordTargetPatientRolePatientLanguageCommunication RecordTargetPatientRolePatient' constraints.validation.dependOn.RecordTargetPatientRolePatientLanguageCommunicationLanguageCode='RecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole constraints.validation.error='PatientRolePatient PatientRolePatientLanguageCommunicationLanguageCodeP PatientRolePatientLanguageCommunicationLanguageCode PatientRolePatientEthnicGroupCode PatientRolePatientEthnicGroupCodeP PatientRolePatientRaceCode PatientRolePatientRaceCodeP PatientRolePatientLanguageCommunication' constraints.validation.query='PatientRolePatientLanguageCommunicationLanguageCodeP PatientRolePatientLanguageCommunicationLanguageCode PatientRolePatientEthnicGroupCode PatientRolePatientEthnicGroupCodeP PatientRolePatientRaceCode PatientRolePatientRaceCodeP PatientRolePatientLanguageCommunication' constraints.validation.dependOn.PatientRolePatientLanguageCommunicationLanguageCode='PatientRolePatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='PatientEthnicGroupCode PatientEthnicGroupCodeP PatientRaceCode PatientRaceCodeP PatientLanguageCommunication PatientLanguageCommunicationLanguageCodeP PatientLanguageCommunicationLanguageCode' raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.query='PatientLanguageCommunicationLanguageCodeP PatientLanguageCommunicationLanguageCode' constraints.validation.dependOn.PatientLanguageCommunicationLanguageCode='PatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='LanguageCommunicationLanguageCode LanguageCommunicationLanguageCodeP' constraints.validation.dependOn.LanguageCommunicationLanguageCode='LanguageCommunicationLanguageCodeP'"
 * @generated
 */
public interface GeneralHeaderConstraints extends
		org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent.performer->notEmpty()) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.encounterParticipant->notEmpty()) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.responsibleParty->notEmpty())'"
	 * @generated
	 */
	boolean validateMu2consolGeneralHeaderConstraintsCareTeamMembers(DiagnosticChain diagnostics, Map<Object, Object> context);

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
