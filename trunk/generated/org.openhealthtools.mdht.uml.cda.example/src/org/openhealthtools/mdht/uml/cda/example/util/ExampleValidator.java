/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.example.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.ExamplePlugin;
import org.openhealthtools.mdht.uml.cda.example.MyDocument;
import org.openhealthtools.mdht.uml.cda.example.MyObservation;
import org.openhealthtools.mdht.uml.cda.example.MySection;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.example.ExamplePackage
 * @generated
 */
public class ExampleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExampleValidator INSTANCE = new ExampleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.example";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Document Template Id' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Document My Section' of 'My Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_DOCUMENT__MY_DOCUMENT_MY_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Template Id' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_TEMPLATE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Code' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Confidentiality Code' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_CONFIDENTIALITY_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Title' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_TITLE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section My Observation' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_MY_OBSERVATION = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Medication' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_MEDICATION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Section Encounter' of 'My Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_SECTION__MY_SECTION_ENCOUNTER = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Class Code' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_CLASS_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Code' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Effective Time' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_EFFECTIVE_TIME = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Value' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_VALUE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate My Observation Target Site Code' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__MY_OBSERVATION_TARGET_SITE_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'My Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MY_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 15;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 15;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsolValidator consolValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		consolValidator = ConsolValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return ExamplePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ExamplePackage.MY_DOCUMENT:
				return validateMyDocument((MyDocument) value, diagnostics, context);
			case ExamplePackage.MY_SECTION:
				return validateMySection((MySection) value, diagnostics, context);
			case ExamplePackage.MY_OBSERVATION:
				return validateMyObservation((MyObservation) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument(MyDocument myDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(myDocument, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(myDocument, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonName(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(
				myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMyDocument_validateMyDocumentTemplateId(myDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMyDocument_validateMyDocumentMySection(myDocument, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMyDocumentTemplateId constraint of '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument_validateMyDocumentTemplateId(MyDocument myDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return myDocument.validateMyDocumentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMyDocumentMySection constraint of '<em>My Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyDocument_validateMyDocumentMySection(MyDocument myDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return myDocument.validateMyDocumentMySection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection(MySection mySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mySection, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(mySection, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMySection_validateMySectionTemplateId(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMySection_validateMySectionCode(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMySection_validateMySectionConfidentialityCode(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMySection_validateMySectionTitle(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMySection_validateMySectionMyObservation(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMySection_validateMySectionMedication(mySection, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMySection_validateMySectionEncounter(mySection, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMySectionTemplateId constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionTemplateId(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mySection.validateMySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionCode constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionCode(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mySection.validateMySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionConfidentialityCode constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionConfidentialityCode(MySection mySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mySection.validateMySectionConfidentialityCode(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionTitle constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionTitle(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mySection.validateMySectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionMyObservation constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionMyObservation(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mySection.validateMySectionMyObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionMedication constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionMedication(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mySection.validateMySectionMedication(diagnostics, context);
	}

	/**
	 * Validates the validateMySectionEncounter constraint of '<em>My Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMySection_validateMySectionEncounter(MySection mySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return mySection.validateMySectionEncounter(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation(MyObservation myObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(myObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(myObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHasTextReference(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationTextReferenceValue(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHasTextReferenceValue(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHasOnsetDate(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHasResolutionDate(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValueNullFlavor(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationAgeObservationInversion(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValueTranslation(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValueTranslationCode(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMyObservation_validateProblemObservationTemplateId(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationClassCode(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationMoodCode(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationNegationInd(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationId(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationCodeP(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationCode(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationText(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationStatusCode(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationEffectiveTime(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValue(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValueP(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationAgeObservation(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHealthStatusObservation(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationProblemStatus(
				myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMyObservation_validateMyObservationClassCode(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMyObservation_validateMyObservationCode(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMyObservation_validateMyObservationEffectiveTime(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMyObservation_validateMyObservationTargetSiteCode(myObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMyObservation_validateMyObservationValue(myObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMyObservationClassCode constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationClassCode(MyObservation myObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMyObservationCode constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationCode(MyObservation myObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMyObservationEffectiveTime constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationEffectiveTime(MyObservation myObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateMyObservationValue constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationValue(MyObservation myObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateMyObservationTargetSiteCode constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateMyObservationTargetSiteCode(MyObservation myObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateMyObservationTargetSiteCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>My Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservation_validateProblemObservationTemplateId(MyObservation myObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return myObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExamplePlugin.INSTANCE;
	}

} // ExampleValidator
