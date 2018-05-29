/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.eclipse.mdht.uml.hl7.datatypes.CR;
import org.eclipse.mdht.uml.hl7.datatypes.CV;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.LongitudinalCareWoundObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Longitudinal Care Wound Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationWoundMeasurementObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Measurement Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationWoundCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Wound Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation Number Of Pressure Ulcers Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRCDValueTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Value Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCRCD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRNameP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Name P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDCRValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CDCR Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateLongitudinalCareWoundObservationCDQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Longitudinal Care Wound Observation CD Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#getWoundMeasurementObservations() <em>Get Wound Measurement Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#getWoundCharacteristicss() <em>Get Wound Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#getHighestPressureUlcerStage() <em>Get Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#getNumberOfPressureUlcersObservation2s() <em>Get Number Of Pressure Ulcers Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation#validateProblemObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LongitudinalCareWoundObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationClassCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationClassCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationClassCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationMoodCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationMoodCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationMoodCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCodeP() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCodePTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCodeP(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4"));
			}

			@Override
			protected void setDependency(LongitudinalCareWoundObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationValueP() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationValuePTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationValueP(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationValue() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationValueTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.getValues().set(0, DatatypesFactory.eINSTANCE.createCD("NotCurrentlyTested", SNOMEDCT_ID));
			}

			@Override
			protected void setDependency(LongitudinalCareWoundObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationValue(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationTargetSiteCodeP() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationTargetSiteCodePTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationTargetSiteCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationTargetSiteCodeP(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationTargetSiteCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationTargetSiteCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationTargetSiteCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.getTargetSiteCodes().set(
					0, DatatypesFactory.eINSTANCE.createCD("CurrentlyMustExistOnly", SNOMEDCT_ID));
			}

			@Override
			protected void setDependency(LongitudinalCareWoundObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservationTargetSiteCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationTargetSiteCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationWoundMeasurementObservation() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationWoundMeasurementObservationTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationWoundMeasurementObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createWoundMeasurementObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationWoundMeasurementObservation(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationWoundMeasurementObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationWoundCharacteristics() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationWoundCharacteristicsTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationWoundCharacteristics",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createWoundCharacteristic().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationWoundCharacteristics(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationWoundCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationHighestPressureUlcerStage() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationHighestPressureUlcerStageTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationHighestPressureUlcerStage",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createHighestPressureUlcerStage().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationHighestPressureUlcerStage(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationHighestPressureUlcerStageTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationAuthorParticipation() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationAuthorParticipationTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationAuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				AuthorParticipation ap = ConsolFactory.eINSTANCE.createAuthorParticipation().init();
				target.getAuthors().add(ap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationAuthorParticipation(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2TestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createNumberOfPressureUlcersObservation2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationNumberOfPressureUlcersObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRCDValueTerminology() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRCDValueTerminologyTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRCDValueTerminology",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_VALUE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Modified OCL in operations due to inline datatype OCL generation issue

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				target.getTargetSiteCodes().get(0).getQualifiers().add(qual);
				CD val = DatatypesFactory.eINSTANCE.createCD();
				val.setCode(BAD_CODE_VALUE);
				qual.setValue(val);
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).getValue().setCode(SNOMEDCT_ID);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRCDValueTerminology(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRCDValueTerminologyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRCDCode() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRCDCodeTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRCDCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Modified OCL in operations due to inline datatype OCL generation issue

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				target.getTargetSiteCodes().get(0).getQualifiers().add(qual);
				CD val = DatatypesFactory.eINSTANCE.createCD();
				qual.setValue(val);
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).getValue().setCode("HasACode");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRCDCode(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRName() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRNameTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRName",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Modified OCL in operations due to inline datatype OCL generation issue

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
				target.getTargetSiteCodes().get(0).getQualifiers().add(DatatypesFactory.eINSTANCE.createCR());
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				CV name = DatatypesFactory.eINSTANCE.createCV();
				name.setCode("272741003");
				name.setCodeSystem(SNOMEDCT_ID);
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).setName(name);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRName(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRNameP() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRNamePTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRNameP",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Modified OCL in operations due to inline datatype OCL generation issue

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
				target.getTargetSiteCodes().get(0).getQualifiers().add(DatatypesFactory.eINSTANCE.createCR());
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).setName(
					DatatypesFactory.eINSTANCE.createCV());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRNameP(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRNamePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDCRValue() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDCRValueTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDCRValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Modified OCL in operations due to inline datatype OCL generation issue

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
				target.getTargetSiteCodes().get(0).getQualifiers().add(DatatypesFactory.eINSTANCE.createCR());
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).setValue(
					DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDCRValue(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDCRValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateLongitudinalCareWoundObservationCDQualifier() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateLongitudinalCareWoundObservationCDQualifierTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateLongitudinalCareWoundObservationCDQualifier",
			operationsForOCL.getOCLValue(
				"VALIDATE_LONGITUDINAL_CARE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Modified OCL in operations due to inline datatype OCL generation issue

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().add(DatatypesFactory.eINSTANCE.createCR());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateLongitudinalCareWoundObservationCDQualifier(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateLongitudinalCareWoundObservationCDQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetWoundMeasurementObservations() {

		LongitudinalCareWoundObservation target = objectFactory.create();
		target.getWoundMeasurementObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetWoundCharacteristicss() {

		LongitudinalCareWoundObservation target = objectFactory.create();
		target.getWoundCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHighestPressureUlcerStage() {

		LongitudinalCareWoundObservation target = objectFactory.create();
		target.getHighestPressureUlcerStage();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNumberOfPressureUlcersObservation2s() {

		LongitudinalCareWoundObservation target = objectFactory.create();
		target.getNumberOfPressureUlcersObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservation2TemplateId() {
		OperationsTestCase<LongitudinalCareWoundObservation> validateProblemObservation2TemplateIdTestCase = new OperationsTestCase<LongitudinalCareWoundObservation>(
			"validateProblemObservation2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LongitudinalCareWoundObservation target) {

			}

			@Override
			protected void updateToPass(LongitudinalCareWoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LongitudinalCareWoundObservationOperations.validateProblemObservation2TemplateId(
					(LongitudinalCareWoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservation2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LongitudinalCareWoundObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LongitudinalCareWoundObservation> {
		public LongitudinalCareWoundObservation create() {
			return ConsolFactory.eINSTANCE.createLongitudinalCareWoundObservation();
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
	private static class ConstructorTestClass extends LongitudinalCareWoundObservationOperations {
	};

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

} // LongitudinalCareWoundObservationOperations
