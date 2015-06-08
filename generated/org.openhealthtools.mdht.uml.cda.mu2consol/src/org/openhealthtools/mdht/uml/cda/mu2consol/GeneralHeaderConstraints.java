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
 * @model annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId GeneralHeaderConstraintsCareTeamMembers GeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole' templateId.root='2.16.840.1.113883.10.20.22.1.1' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication'"
 *        annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTarget constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRole'"
 *        annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRole constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatient'"
 *        annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatient ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP' raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication'"
 *        annotation=
 *        "http://www.openhealthtools.org/mdht/uml/cda/annotation/mu2consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode'"
 * @generated
 */
public interface GeneralHeaderConstraints extends
		org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent.performer->notEmpty()) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.encounterParticipant->notEmpty()) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.responsibleParty->notEmpty())'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCareTeamMembers(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject(not languageCode.oclIsUndefined() and languageCode.isNullFlavorUndefined() implies (languageCode.oclIsKindOf(datatypes::CS) and let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in value.code.toLower() = \'aar\' or value.code.toLower() = \'abk\' or value.code.toLower() = \'afr\' or value.code.toLower() = \'aka\' or value.code.toLower() = \'sqi\' or value.code.toLower() = \'amh\' or value.code.toLower() = \'ara\' or value.code.toLower() = \'arg\' or value.code.toLower() = \'hye\' or value.code.toLower() = \'asm\' or value.code.toLower() = \'ava\' or value.code.toLower() = \'ave\' or value.code.toLower() = \'aym\' or value.code.toLower() = \'aze\' or value.code.toLower() = \'bak\' or value.code.toLower() = \'bam\' or value.code.toLower() = \'eus\' or value.code.toLower() = \'bel\' or value.code.toLower() = \'ben\' or value.code.toLower() = \'bih\' or value.code.toLower() = \'bis\' or value.code.toLower() = \'bod\' or value.code.toLower() = \'bos\' or value.code.toLower() = \'bre\' or value.code.toLower() = \'bul\' or value.code.toLower() = \'mya\' or value.code.toLower() = \'cat\' or value.code.toLower() = \'ces\' or value.code.toLower() = \'cha\' or value.code.toLower() = \'che\' or value.code.toLower() = \'zho\' or value.code.toLower() = \'chu\' or value.code.toLower() = \'chv\' or value.code.toLower() = \'cor\' or value.code.toLower() = \'cos\' or value.code.toLower() = \'cre\' or value.code.toLower() = \'cym\' or value.code.toLower() = \'dan\' or value.code.toLower() = \'deu\' or value.code.toLower() = \'div\' or value.code.toLower() = \'nld\' or value.code.toLower() = \'dzo\' or value.code.toLower() = \'ell\' or value.code.toLower() = \'eng\' or value.code.toLower() = \'epo\' or value.code.toLower() = \'est\' or value.code.toLower() = \'ewe\' or value.code.toLower() = \'fao\' or value.code.toLower() = \'fas\' or value.code.toLower() = \'fij\' or value.code.toLower() = \'fin\' or value.code.toLower() = \'fra\' or value.code.toLower() = \'fry\' or value.code.toLower() = \'ful\' or value.code.toLower() = \'kat\' or value.code.toLower() = \'ger\' or value.code.toLower() = \'gla\' or value.code.toLower() = \'gle\' or value.code.toLower() = \'glg\' or value.code.toLower() = \'glv\' or value.code.toLower() = \'grn\' or value.code.toLower() = \'guj\' or value.code.toLower() = \'hat\' or value.code.toLower() = \'hau\' or value.code.toLower() = \'heb\' or value.code.toLower() = \'her\' or value.code.toLower() = \'hin\' or value.code.toLower() = \'hmo\' or value.code.toLower() = \'hrv\' or value.code.toLower() = \'hun\' or value.code.toLower() = \'ibo\' or value.code.toLower() = \'isl\' or value.code.toLower() = \'ido\' or value.code.toLower() = \'iii\' or value.code.toLower() = \'iku\' or value.code.toLower() = \'ile\' or value.code.toLower() = \'ina\' or value.code.toLower() = \'ind\' or value.code.toLower() = \'ipk\' or value.code.toLower() = \'ita\' or value.code.toLower() = \'jav\' or value.code.toLower() = \'jpn\' or value.code.toLower() = \'kal\' or value.code.toLower() = \'kan\' or value.code.toLower() = \'kas\' or value.code.toLower() = \'kau\' or value.code.toLower() = \'kaz\' or value.code.toLower() = \'khm\' or value.code.toLower() = \'kik\' or value.code.toLower() = \'kin\' or value.code.toLower() = \'kir\' or value.code.toLower() = \'kom\' or value.code.toLower() = \'kon\' or value.code.toLower() = \'kor\' or value.code.toLower() = \'kua\' or value.code.toLower() = \'kur\' or value.code.toLower() = \'lao\' or value.code.toLower() = \'lat\' or value.code.toLower() = \'lav\' or value.code.toLower() = \'lim\' or value.code.toLower() = \'lin\' or value.code.toLower() = \'lit\' or value.code.toLower() = \'ltz\' or value.code.toLower() = \'lub\' or value.code.toLower() = \'lug\' or value.code.toLower() = \'mkd\' or value.code.toLower() = \'mah\' or value.code.toLower() = \'mal\' or value.code.toLower() = \'mri\' or value.code.toLower() = \'mar\' or value.code.toLower() = \'msa\' or value.code.toLower() = \'mlg\' or value.code.toLower() = \'mlt\' or value.code.toLower() = \'mon\' or value.code.toLower() = \'nau\' or value.code.toLower() = \'nav\' or value.code.toLower() = \'nbl\' or value.code.toLower() = \'nde\' or value.code.toLower() = \'ndo\' or value.code.toLower() = \'nep\' or value.code.toLower() = \'nno\' or value.code.toLower() = \'nob\' or value.code.toLower() = \'nor\' or value.code.toLower() = \'nya\' or value.code.toLower() = \'oci\' or value.code.toLower() = \'oji\' or value.code.toLower() = \'ori\' or value.code.toLower() = \'orm\' or value.code.toLower() = \'oss\' or value.code.toLower() = \'pan\' or value.code.toLower() = \'pli\' or value.code.toLower() = \'pol\' or value.code.toLower() = \'por\' or value.code.toLower() = \'pus\' or value.code.toLower() = \'que\' or value.code.toLower() = \'roh\' or value.code.toLower() = \'ron\' or value.code.toLower() = \'run\' or value.code.toLower() = \'rus\' or value.code.toLower() = \'sag\' or value.code.toLower() = \'san\' or value.code.toLower() = \'sin\' or value.code.toLower() = \'slk\' or value.code.toLower() = \'slv\' or value.code.toLower() = \'sme\' or value.code.toLower() = \'smo\' or value.code.toLower() = \'sna\' or value.code.toLower() = \'snd\' or value.code.toLower() = \'som\' or value.code.toLower() = \'sot\' or value.code.toLower() = \'spa\' or value.code.toLower() = \'srd\' or value.code.toLower() = \'srp\' or value.code.toLower() = \'ssw\' or value.code.toLower() = \'sun\' or value.code.toLower() = \'swa\' or value.code.toLower() = \'swe\' or value.code.toLower() = \'tah\' or value.code.toLower() = \'tam\' or value.code.toLower() = \'tat\' or value.code.toLower() = \'tel\' or value.code.toLower() = \'tgk\' or value.code.toLower() = \'tgl\' or value.code.toLower() = \'tha\' or value.code.toLower() = \'tir\' or value.code.toLower() = \'ton\' or value.code.toLower() = \'tsn\' or value.code.toLower() = \'tso\' or value.code.toLower() = \'tuk\' or value.code.toLower() = \'tur\' or value.code.toLower() = \'twi\' or value.code.toLower() = \'uig\' or value.code.toLower() = \'ukr\' or value.code.toLower() = \'urd\' or value.code.toLower() = \'uzb\' or value.code.toLower() = \'ven\' or value.code.toLower() = \'vie\' or value.code.toLower() = \'vol\' or value.code.toLower() = \'wln\' or value.code.toLower() = \'wol\' or value.code.toLower() = \'xho\' or value.code.toLower() = \'yid\' or value.code.toLower() = \'yor\' or value.code.toLower() = \'zha\' or value.code.toLower() = \'zul\'))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(
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
	 * 
	 * @generated
	 */
	@Override
	public GeneralHeaderConstraints init();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public GeneralHeaderConstraints init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // GeneralHeaderConstraints
