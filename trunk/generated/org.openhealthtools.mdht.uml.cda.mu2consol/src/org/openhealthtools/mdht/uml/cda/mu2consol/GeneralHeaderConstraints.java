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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='MU2CONSOLGeneralHeaderConstraintsTemplateId MU2CONSOLGeneralHeaderConstraintsCareTeamMembers MU2CONSOLGeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatient MU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole' templateId.root='2.16.840.1.113883.10.20.22.1.1' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient MU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatient' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='PatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode' raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='PatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP'"
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
	boolean validateMU2CONSOLGeneralHeaderConstraintsCareTeamMembers(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateMU2CONSOLGeneralHeaderConstraintsRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))'"
	 * @generated
	 */
	boolean validateMU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole(DiagnosticChain diagnostics, Map<Object, Object> context);

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
