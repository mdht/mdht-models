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
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>General Header Constraints</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCareTeamMembers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Care Team Members</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Language Communication Language Code Term Case Insensitive</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#retrieveHospitalAdmissionDiagnosisSection()
 * <em>Retrieve Hospital Admission Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Language Communication Language Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Ethnic Group Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Ethnic Group Code P</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Race Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Race Code P</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Language Communication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GeneralHeaderConstraintsOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GeneralHeaderConstraintsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsCareTeamMembers(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Care Team Members</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsCareTeamMembers(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CARE_TEAM_MEMBERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent.performer->notEmpty()) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.encounterParticipant->notEmpty()) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter.responsibleParty->notEmpty())";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsCareTeamMembers(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Care Team Members</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsCareTeamMembers(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CARE_TEAM_MEMBERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCareTeamMembers(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CARE_TEAM_MEMBERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CARE_TEAM_MEMBERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CARE_TEAM_MEMBERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_GENERAL_HEADER_CONSTRAINTS_CARE_TEAM_MEMBERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CARE_TEAM_MEMBERS,
								Mu2consolPlugin.INSTANCE
										.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsCareTeamMembers"),
								new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_TERM_CASE_INSENSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_TERM_CASE_INSENSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_TERM_CASE_INSENSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_TERM_CASE_INSENSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_TERM_CASE_INSENSITIVE,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalAdmissionDiagnosisSection)
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalAdmissionDiagnosisSection retrieveHospitalAdmissionDiagnosisSection(
			GeneralHeaderConstraints generalHeaderConstraints) {
		if (RETRIEVE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS,
					Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS
							.getEAllOperations().get(294));
			try {
				RETRIEVE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY = helper
						.createQuery(RETRIEVE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(RETRIEVE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalAdmissionDiagnosisSection) query
				.evaluate(generalHeaderConstraints);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.1.1')
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
								Mu2consolPlugin.INSTANCE
										.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsTemplateId"),
								new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code Term Case Insensitive</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_TERM_CASE_INSENSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject(not languageCode.oclIsUndefined() and languageCode.isNullFlavorUndefined() implies (languageCode.oclIsKindOf(datatypes::CS) and let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in value.code.toLower() = 'aar' or value.code.toLower() = 'abk' or value.code.toLower() = 'afr' or value.code.toLower() = 'aka' or value.code.toLower() = 'sqi' or value.code.toLower() = 'amh' or value.code.toLower() = 'ara' or value.code.toLower() = 'arg' or value.code.toLower() = 'hye' or value.code.toLower() = 'asm' or value.code.toLower() = 'ava' or value.code.toLower() = 'ave' or value.code.toLower() = 'aym' or value.code.toLower() = 'aze' or value.code.toLower() = 'bak' or value.code.toLower() = 'bam' or value.code.toLower() = 'eus' or value.code.toLower() = 'bel' or value.code.toLower() = 'ben' or value.code.toLower() = 'bih' or value.code.toLower() = 'bis' or value.code.toLower() = 'bod' or value.code.toLower() = 'bos' or value.code.toLower() = 'bre' or value.code.toLower() = 'bul' or value.code.toLower() = 'mya' or value.code.toLower() = 'cat' or value.code.toLower() = 'ces' or value.code.toLower() = 'cha' or value.code.toLower() = 'che' or value.code.toLower() = 'zho' or value.code.toLower() = 'chu' or value.code.toLower() = 'chv' or value.code.toLower() = 'cor' or value.code.toLower() = 'cos' or value.code.toLower() = 'cre' or value.code.toLower() = 'cym' or value.code.toLower() = 'dan' or value.code.toLower() = 'deu' or value.code.toLower() = 'div' or value.code.toLower() = 'nld' or value.code.toLower() = 'dzo' or value.code.toLower() = 'ell' or value.code.toLower() = 'eng' or value.code.toLower() = 'epo' or value.code.toLower() = 'est' or value.code.toLower() = 'ewe' or value.code.toLower() = 'fao' or value.code.toLower() = 'fas' or value.code.toLower() = 'fij' or value.code.toLower() = 'fin' or value.code.toLower() = 'fra' or value.code.toLower() = 'fry' or value.code.toLower() = 'ful' or value.code.toLower() = 'kat' or value.code.toLower() = 'ger' or value.code.toLower() = 'gla' or value.code.toLower() = 'gle' or value.code.toLower() = 'glg' or value.code.toLower() = 'glv' or value.code.toLower() = 'grn' or value.code.toLower() = 'guj' or value.code.toLower() = 'hat' or value.code.toLower() = 'hau' or value.code.toLower() = 'heb' or value.code.toLower() = 'her' or value.code.toLower() = 'hin' or value.code.toLower() = 'hmo' or value.code.toLower() = 'hrv' or value.code.toLower() = 'hun' or value.code.toLower() = 'ibo' or value.code.toLower() = 'isl' or value.code.toLower() = 'ido' or value.code.toLower() = 'iii' or value.code.toLower() = 'iku' or value.code.toLower() = 'ile' or value.code.toLower() = 'ina' or value.code.toLower() = 'ind' or value.code.toLower() = 'ipk' or value.code.toLower() = 'ita' or value.code.toLower() = 'jav' or value.code.toLower() = 'jpn' or value.code.toLower() = 'kal' or value.code.toLower() = 'kan' or value.code.toLower() = 'kas' or value.code.toLower() = 'kau' or value.code.toLower() = 'kaz' or value.code.toLower() = 'khm' or value.code.toLower() = 'kik' or value.code.toLower() = 'kin' or value.code.toLower() = 'kir' or value.code.toLower() = 'kom' or value.code.toLower() = 'kon' or value.code.toLower() = 'kor' or value.code.toLower() = 'kua' or value.code.toLower() = 'kur' or value.code.toLower() = 'lao' or value.code.toLower() = 'lat' or value.code.toLower() = 'lav' or value.code.toLower() = 'lim' or value.code.toLower() = 'lin' or value.code.toLower() = 'lit' or value.code.toLower() = 'ltz' or value.code.toLower() = 'lub' or value.code.toLower() = 'lug' or value.code.toLower() = 'mkd' or value.code.toLower() = 'mah' or value.code.toLower() = 'mal' or value.code.toLower() = 'mri' or value.code.toLower() = 'mar' or value.code.toLower() = 'msa' or value.code.toLower() = 'mlg' or value.code.toLower() = 'mlt' or value.code.toLower() = 'mon' or value.code.toLower() = 'nau' or value.code.toLower() = 'nav' or value.code.toLower() = 'nbl' or value.code.toLower() = 'nde' or value.code.toLower() = 'ndo' or value.code.toLower() = 'nep' or value.code.toLower() = 'nno' or value.code.toLower() = 'nob' or value.code.toLower() = 'nor' or value.code.toLower() = 'nya' or value.code.toLower() = 'oci' or value.code.toLower() = 'oji' or value.code.toLower() = 'ori' or value.code.toLower() = 'orm' or value.code.toLower() = 'oss' or value.code.toLower() = 'pan' or value.code.toLower() = 'pli' or value.code.toLower() = 'pol' or value.code.toLower() = 'por' or value.code.toLower() = 'pus' or value.code.toLower() = 'que' or value.code.toLower() = 'roh' or value.code.toLower() = 'ron' or value.code.toLower() = 'run' or value.code.toLower() = 'rus' or value.code.toLower() = 'sag' or value.code.toLower() = 'san' or value.code.toLower() = 'sin' or value.code.toLower() = 'slk' or value.code.toLower() = 'slv' or value.code.toLower() = 'sme' or value.code.toLower() = 'smo' or value.code.toLower() = 'sna' or value.code.toLower() = 'snd' or value.code.toLower() = 'som' or value.code.toLower() = 'sot' or value.code.toLower() = 'spa' or value.code.toLower() = 'srd' or value.code.toLower() = 'srp' or value.code.toLower() = 'ssw' or value.code.toLower() = 'sun' or value.code.toLower() = 'swa' or value.code.toLower() = 'swe' or value.code.toLower() = 'tah' or value.code.toLower() = 'tam' or value.code.toLower() = 'tat' or value.code.toLower() = 'tel' or value.code.toLower() = 'tgk' or value.code.toLower() = 'tgl' or value.code.toLower() = 'tha' or value.code.toLower() = 'tir' or value.code.toLower() = 'ton' or value.code.toLower() = 'tsn' or value.code.toLower() = 'tso' or value.code.toLower() = 'tuk' or value.code.toLower() = 'tur' or value.code.toLower() = 'twi' or value.code.toLower() = 'uig' or value.code.toLower() = 'ukr' or value.code.toLower() = 'urd' or value.code.toLower() = 'uzb' or value.code.toLower() = 'ven' or value.code.toLower() = 'vie' or value.code.toLower() = 'vol' or value.code.toLower() = 'wln' or value.code.toLower() = 'wol' or value.code.toLower() = 'xho' or value.code.toLower() = 'yid' or value.code.toLower() = 'yor' or value.code.toLower() = 'zha' or value.code.toLower() = 'zul'))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code Term Case Insensitive</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_TERM_CASE_INSENSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsRecordTarget(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(generalHeaderConstraints)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET,
								Mu2consolPlugin.INSTANCE
										.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTarget"),
								new Object[] { generalHeaderConstraints }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->excluding(null).patientRole->excluding(null).patient->
	 * excluding
	 * (null).languageCommunication->excluding(null)->reject((languageCode
	 * .oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not
	 * languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS)
	 * and let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in
	 * value.code = 'aar' or value.code = 'abk' or value.code = 'afr' or
	 * value.code = 'aka' or value.code = 'sqi' or value.code = 'amh' or
	 * value.code = 'ara' or value.code = 'arg' or value.code = 'hye' or
	 * value.code = 'asm' or value.code = 'ava' or value.code = 'ave' or
	 * value.code = 'aym' or value.code = 'aze' or value.code = 'bak' or
	 * value.code = 'bam' or value.code = 'eus' or value.code = 'bel' or
	 * value.code = 'ben' or value.code = 'bih' or value.code = 'bis' or
	 * value.code = 'bod' or value.code = 'bos' or value.code = 'bre' or
	 * value.code = 'bul' or value.code = 'mya' or value.code = 'cat' or
	 * value.code = 'ces' or value.code = 'cha' or value.code = 'che' or
	 * value.code = 'zho' or value.code = 'chu' or value.code = 'chv' or
	 * value.code = 'cor' or value.code = 'cos' or value.code = 'cre' or
	 * value.code = 'cym' or value.code = 'dan' or value.code = 'deu' or
	 * value.code = 'div' or value.code = 'nld' or value.code = 'dzo' or
	 * value.code = 'ell' or value.code = 'eng' or value.code = 'epo' or
	 * value.code = 'est' or value.code = 'ewe' or value.code = 'fao' or
	 * value.code = 'fas' or value.code = 'fij' or value.code = 'fin' or
	 * value.code = 'fra' or value.code = 'fry' or value.code = 'ful' or
	 * value.code = 'kat' or value.code = 'ger' or value.code = 'gla' or
	 * value.code = 'gle' or value.code = 'glg' or value.code = 'glv' or
	 * value.code = 'grn' or value.code = 'guj' or value.code = 'hat' or
	 * value.code = 'hau' or value.code = 'heb' or value.code = 'her' or
	 * value.code = 'hin' or value.code = 'hmo' or value.code = 'hrv' or
	 * value.code = 'hun' or value.code = 'ibo' or value.code = 'isl' or
	 * value.code = 'ido' or value.code = 'iii' or value.code = 'iku' or
	 * value.code = 'ile' or value.code = 'ina' or value.code = 'ind' or
	 * value.code = 'ipk' or value.code = 'ita' or value.code = 'jav' or
	 * value.code = 'jpn' or value.code = 'kal' or value.code = 'kan' or
	 * value.code = 'kas' or value.code = 'kau' or value.code = 'kaz' or
	 * value.code = 'khm' or value.code = 'kik' or value.code = 'kin' or
	 * value.code = 'kir' or value.code = 'kom' or value.code = 'kon' or
	 * value.code = 'kor' or value.code = 'kua' or value.code = 'kur' or
	 * value.code = 'lao' or value.code = 'lat' or value.code = 'lav' or
	 * value.code = 'lim' or value.code = 'lin' or value.code = 'lit' or
	 * value.code = 'ltz' or value.code = 'lub' or value.code = 'lug' or
	 * value.code = 'mkd' or value.code = 'mah' or value.code = 'mal' or
	 * value.code = 'mri' or value.code = 'mar' or value.code = 'msa' or
	 * value.code = 'mlg' or value.code = 'mlt' or value.code = 'mon' or
	 * value.code = 'nau' or value.code = 'nav' or value.code = 'nbl' or
	 * value.code = 'nde' or value.code = 'ndo' or value.code = 'nep' or
	 * value.code = 'nno' or value.code = 'nob' or value.code = 'nor' or
	 * value.code = 'nya' or value.code = 'oci' or value.code = 'oji' or
	 * value.code = 'ori' or value.code = 'orm' or value.code = 'oss' or
	 * value.code = 'pan' or value.code = 'pli' or value.code = 'pol' or
	 * value.code = 'por' or value.code = 'pus' or value.code = 'que' or
	 * value.code = 'roh' or value.code = 'ron' or value.code = 'run' or
	 * value.code = 'rus' or value.code = 'sag' or value.code = 'san' or
	 * value.code = 'sin' or value.code = 'slk' or value.code = 'slv' or
	 * value.code = 'sme' or value.code = 'smo' or value.code = 'sna' or
	 * value.code = 'snd' or value.code = 'som' or value.code = 'sot' or
	 * value.code = 'spa' or value.code = 'srd' or value.code = 'srp' or
	 * value.code = 'ssw' or value.code = 'sun' or value.code = 'swa' or
	 * value.code = 'swe' or value.code = 'tah' or value.code = 'tam' or
	 * value.code = 'tat' or value.code = 'tel' or value.code = 'tgk' or
	 * value.code = 'tgl' or value.code = 'tha' or value.code = 'tir' or
	 * value.code = 'ton' or value.code = 'tsn' or value.code = 'tso' or
	 * value.code = 'tuk' or value.code = 'tur' or value.code = 'twi' or
	 * value.code = 'uig' or value.code = 'ukr' or value.code = 'urd' or
	 * value.code = 'uzb' or value.code = 'ven' or value.code = 'vie' or
	 * value.code = 'vol' or value.code = 'wln' or value.code = 'wol' or
	 * value.code = 'xho' or value.code = 'yid' or value.code = 'yor' or
	 * value.code = 'zha' or value.code = 'zul'))
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->excluding(null).patientRole->excluding(null).patient->
	 * excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or
	 * ethnicGroupCode.isNullFlavorUndefined()) implies (not
	 * ethnicGroupCode.oclIsUndefined()))
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->excluding(null).patientRole->excluding(null).patient->
	 * excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or
	 * ethnicGroupCode.isNullFlavorUndefined()) implies (not
	 * ethnicGroupCode.oclIsUndefined()))
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->excluding(null).patientRole->excluding(null).patient->
	 * excluding(null)->reject((raceCode.oclIsUndefined() or
	 * raceCode.isNullFlavorUndefined()) implies (not
	 * raceCode.oclIsUndefined()))
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->excluding(null).patientRole->excluding(null).patient->
	 * excluding(null)->reject((raceCode.oclIsUndefined() or
	 * raceCode.isNullFlavorUndefined()) implies (not
	 * raceCode.oclIsUndefined()))
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->excluding(null).patientRole->excluding(null).patient->
	 * excluding(null)->reject(languageCommunication->one(languageCommunication
	 * : cda::LanguageCommunication | not languageCommunication.oclIsUndefined()
	 * and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.WARNING,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.recordTarget->excluding(null).patientRole->excluding(null)->reject(
	 * patient->one(patient : cda::Patient | not patient.oclIsUndefined() and
	 * patient.oclIsKindOf(cda::Patient)))
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRolePatient"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #retrieveHospitalAdmissionDiagnosisSection(GeneralHeaderConstraints)
	 * <em>Retrieve Hospital Admission Diagnosis Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrieveHospitalAdmissionDiagnosisSection(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionDiagnosisSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #retrieveHospitalAdmissionDiagnosisSection(GeneralHeaderConstraints)
	 * <em>Retrieve Hospital Admission Diagnosis Section</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrieveHospitalAdmissionDiagnosisSection(GeneralHeaderConstraints)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Template Id</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target</em>}' invariant
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTarget(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined() and ethnicGroupCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5')))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (not raceCode.oclIsUndefined() and raceCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '1002-5' or value.code = '2028-9' or value.code = '2076-8' or value.code = '2106-3' or value.code = '2054-5')))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Race Code P</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (not raceCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Race Code P</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->exists(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient</em>}
	 * ' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role Patient</em>}
	 * ' invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate General Header Constraints Record Target Patient Role</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateGeneralHeaderConstraintsRecordTargetPatientRole(GeneralHeaderConstraints,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * @param generalHeaderConstraints
	 *            The receiving '<em><b>General Header Constraints</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateGeneralHeaderConstraintsRecordTargetPatientRole(
			GeneralHeaderConstraints generalHeaderConstraints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS);
			try {
				OCLExpression<EClassifier> oclExpression = helper
						.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV
						.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY
				.evaluate(generalHeaderConstraints);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics
							.add(new BasicDiagnostic(
									Diagnostic.ERROR,
									Mu2consolValidator.DIAGNOSTIC_SOURCE,
									Mu2consolValidator.GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE,
									Mu2consolPlugin.INSTANCE
											.getString("GeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole"),
									new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // GeneralHeaderConstraintsOperations