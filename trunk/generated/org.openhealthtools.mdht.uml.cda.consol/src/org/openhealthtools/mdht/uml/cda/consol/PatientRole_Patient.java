/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Patient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Role Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPatientRole_Patient()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' religiousAffiliationCode.codeSystem='2.16.840.1.113883.5.1076' maritalStatusCode.codeSystemName='MaritalStatus' constraints.validation.error='PatientBirthTimePreciseToYear PatientBirthTime PatientMaritalStatusCode PatientName PatientRaceCode PatientReligiousAffiliationCode' constraints.validation.warning='PatientBirthTimePreciseToDay PatientLanguageCommunication' maritalStatusCode.codeSystem='2.16.840.1.113883.5.2' religiousAffiliationCode.codeSystemName='ReligiousAffiliation' constraints.validation.info='PatientEthnicGroupCode PatientGuardian PatientBirthplace'"
 * @generated
 */
public interface PatientRole_Patient extends Patient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.birthTime.value.size() >= 4
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.birthTime.value.size() >= 4'"
	 * @generated
	 */
	boolean validatePatientBirthTimePreciseToYear(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.birthTime.value.size() >= 6
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.birthTime.value.size() >= 6'"
	 * @generated
	 */
	boolean validatePatientBirthTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.birthTime.oclIsUndefined() or self.birthTime.isNullFlavorUndefined()) implies (not self.birthTime.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.birthTime.oclIsUndefined() or self.birthTime.isNullFlavorUndefined()) implies (not self.birthTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientBirthTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.ethnicGroupCode.oclIsUndefined() or self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.ethnicGroupCode.oclIsUndefined() or self.ethnicGroupCode.isNullFlavorUndefined()) implies (not self.ethnicGroupCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePatientEthnicGroupCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.maritalStatusCode.oclIsUndefined() or self.maritalStatusCode.isNullFlavorUndefined()) implies (self.maritalStatusCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'T' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'S' or value.code = 'P' or value.code = 'W')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.maritalStatusCode.oclIsUndefined() or self.maritalStatusCode.isNullFlavorUndefined()) implies (self.maritalStatusCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.maritalStatusCode.oclAsType(datatypes::CE) in (\r\nvalue.codeSystem = \'2.16.840.1.113883.5.2\' and (value.code = \'A\' or value.code = \'D\' or value.code = \'T\' or value.code = \'I\' or value.code = \'L\' or value.code = \'M\' or value.code = \'S\' or value.code = \'P\' or value.code = \'W\')))'"
	 * @generated
	 */
	boolean validatePatientMaritalStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())'"
	 * @generated
	 */
	boolean validatePatientName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.raceCode.oclIsUndefined() or self.raceCode.isNullFlavorUndefined()) implies (self.raceCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.raceCode.oclIsUndefined() or self.raceCode.isNullFlavorUndefined()) implies (self.raceCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.raceCode.oclAsType(datatypes::CE) in (\r\nvalue.codeSystem = \'2.16.840.1.113883.6.238\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientRaceCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.religiousAffiliationCode.oclIsUndefined() or self.religiousAffiliationCode.isNullFlavorUndefined()) implies (self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.1076' and not value.code.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.religiousAffiliationCode.oclIsUndefined() or self.religiousAffiliationCode.isNullFlavorUndefined()) implies (self.religiousAffiliationCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.religiousAffiliationCode.oclAsType(datatypes::CE) in (\r\nvalue.codeSystem = \'2.16.840.1.113883.5.1076\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validatePatientReligiousAffiliationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian))'"
	 * @generated
	 */
	boolean validatePatientGuardian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace))'"
	 * @generated
	 */
	boolean validatePatientBirthplace(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.languageCommunication->one(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.languageCommunication->one(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication))'"
	 * @generated
	 */
	boolean validatePatientLanguageCommunication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRole_Patient init();
} // PatientRole_Patient
