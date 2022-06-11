/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#getConsolAssessmentScaleObservations() <em>Get Consol Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#getConsolNonMedicinalSupplyActivities() <em>Get Consol Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#getConsolCaregiverCharacteristicss() <em>Get Consol Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateCognitiveStatusResultObservationValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationNoObservationRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation No Observation Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationAuthorMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Author Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateCognitiveStatusResultObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateCognitiveStatusResultObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateCognitiveStatusResultObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateCognitiveStatusResultObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateCognitiveStatusResultObservationReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MentalStatusObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMentalStatusObservation2TemplateId() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2TemplateIdTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateMentalStatusObservation2TemplateId(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2AuthorParticipation() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2AuthorParticipationTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2AuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateMentalStatusObservation2AuthorParticipation(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2CDTranslation() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2CDTranslationTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2CDTranslation", operationsForOCL.getOCLValue(
				"VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.getCode().getTranslations().set(0, DatatypesFactory.eINSTANCE.createCD("75275-8", LOINC_ID));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateMentalStatusObservation2CDTranslation(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2CDTranslationP() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2CDTranslationPTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2CDTranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateMentalStatusObservation2CDTranslationP(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2CDTranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetConsolAssessmentScaleObservations() {

		MentalStatusObservation2 target = objectFactory.create();
		target.getConsolAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetConsolNonMedicinalSupplyActivities() {

		MentalStatusObservation2 target = objectFactory.create();
		target.getConsolNonMedicinalSupplyActivities();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetConsolCaregiverCharacteristicss() {

		MentalStatusObservation2 target = objectFactory.create();
		target.getConsolCaregiverCharacteristicss();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationValueDatatype() {
		OperationsTestCase<MentalStatusObservation2> validateCognitiveStatusResultObservationValueDatatypeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateCognitiveStatusResultObservationValueDatatype",
			operationsForOCL.getOCLValue(
				"VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("notChecked", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationValueDatatype(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationValueDatatypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationTextReference() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationTextReferenceTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationTextReference(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationTextReferenceValue() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationTextReferenceValueTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationTextReferenceValue(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationReferenceValue() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationReferenceValueTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationReferenceValue(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationCodeValue() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationCodeValueTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationCodeValue(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationNoObservationRangeCode() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationNoObservationRangeCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationNoObservationRangeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationNoObservationRangeCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationNoObservationRangeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationAuthorMultiplicity() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationAuthorMultiplicityTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationAuthorMultiplicity", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationAuthorMultiplicity(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationAuthorMultiplicityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultObservationClassCode() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationClassCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationClassCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultObservationMoodCode() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationMoodCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationMoodCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationId() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationIdTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationId(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultObservationCodeP() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationCodePTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationCodeP(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationCode() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.getCode().setCodeSystem(SNOMEDCT_ID);
				target.getCode().setCode("373930000");
			}

			@Override
			protected void setDependency(MentalStatusObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultObservationStatusCodeP() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationStatusCodePTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationStatusCodeP(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultObservationStatusCode() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationStatusCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(MentalStatusObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationStatusCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultObservationEffectiveTime() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationEffectiveTimeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationEffectiveTime(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultObservationValue() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationValueTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationValue(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationText() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationTextTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationText",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();
				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationText(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationInterpretationCode() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationInterpretationCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationInterpretationCode", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationInterpretationCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationMethodCode() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationMethodCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationMethodCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationTargetSiteCode() {
		OperationsTestCase<MentalStatusObservation2> validateResultObservationTargetSiteCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateResultObservationTargetSiteCode", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateResultObservationTargetSiteCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationAssessmentScaleObservation() {
		OperationsTestCase<MentalStatusObservation2> validateCognitiveStatusResultObservationAssessmentScaleObservationTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateCognitiveStatusResultObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationAssessmentScaleObservation(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationReferenceRange() {
		OperationsTestCase<MentalStatusObservation2> validateCognitiveStatusResultObservationReferenceRangeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateCognitiveStatusResultObservationReferenceRange",
			operationsForOCL.getOCLValue(
				"VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationReferenceRange(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateCognitiveStatusResultObservationAuthor() {
		OperationsTestCase<MentalStatusObservation2> validateCognitiveStatusResultObservationAuthorTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateCognitiveStatusResultObservationAuthor", operationsForOCL.getOCLValue(
				"VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationAuthor(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateCognitiveStatusResultObservationNonMedicinalSupplyActivity() {
		OperationsTestCase<MentalStatusObservation2> validateCognitiveStatusResultObservationNonMedicinalSupplyActivityTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateCognitiveStatusResultObservationNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue(
				"VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateCognitiveStatusResultObservationCaregiverCharacteristics() {
		OperationsTestCase<MentalStatusObservation2> validateCognitiveStatusResultObservationCaregiverCharacteristicsTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateCognitiveStatusResultObservationCaregiverCharacteristics",
			operationsForOCL.getOCLValue(
				"VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationCaregiverCharacteristics(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode() {
		OperationsTestCase<MentalStatusObservation2> validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateCognitiveStatusResultObservationReferenceRangeObservationRange() {
		OperationsTestCase<MentalStatusObservation2> validateCognitiveStatusResultObservationReferenceRangeObservationRangeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateCognitiveStatusResultObservationReferenceRangeObservationRange",
			operationsForOCL.getOCLValue(
				"VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateCognitiveStatusResultObservationReferenceRangeObservationRange(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeObservationRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MentalStatusObservation2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<MentalStatusObservation2> {
		public MentalStatusObservation2 create() {
			return ConsolFactory.eINSTANCE.createMentalStatusObservation2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends MentalStatusObservation2Operations {
	}

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // MentalStatusObservation2Operations
