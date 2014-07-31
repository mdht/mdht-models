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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.WoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.WoundObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Wound Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationWoundMeasurementObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Wound Measurement Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationWoundCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Wound Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDCRCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCRCD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDCRName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDCRNameP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Name P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDCRValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CDCR Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#validateWoundObservationCDQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Observation CD Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#getWoundMeasurementObservations() <em>Get Wound Measurement Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#getWoundCharacteristicss() <em>Get Wound Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation#getHighestPressureUlcerStage() <em>Get Highest Pressure Ulcer Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class WoundObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundObservationTemplateId() {
		OperationsTestCase<WoundObservation> validateWoundObservationTemplateIdTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {

			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationTemplateId(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundObservationClassCode() {
		OperationsTestCase<WoundObservation> validateWoundObservationClassCodeTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {

			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationClassCode(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundObservationMoodCode() {
		OperationsTestCase<WoundObservation> validateWoundObservationMoodCodeTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {

			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationMoodCode(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundObservationCodeP() {
		OperationsTestCase<WoundObservation> validateWoundObservationCodePTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {

			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationCodeP(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationCode() {
		OperationsTestCase<WoundObservation> validateWoundObservationCodeTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4"));
			}

			@Override
			protected void setDependency(WoundObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.WoundObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationCode(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationValue() {
		OperationsTestCase<WoundObservation> validateWoundObservationValueTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.getValues().set(0, DatatypesFactory.eINSTANCE.createCD("NotCurrentlyTested", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationValue(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationValueP() {
		OperationsTestCase<WoundObservation> validateWoundObservationValuePTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {

			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationValueP(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundObservationTargetSiteCodeP() {
		OperationsTestCase<WoundObservation> validateWoundObservationTargetSiteCodePTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {

			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationTargetSiteCodeP(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationTargetSiteCode() {
		OperationsTestCase<WoundObservation> validateWoundObservationTargetSiteCodeTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.getTargetSiteCodes().set(
					0, DatatypesFactory.eINSTANCE.createCD("CurrentlyMustExistOnly", SNOMEDCT_ID));
			}

			@Override
			protected void setDependency(WoundObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.WoundObservationTargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationTargetSiteCode(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationWoundMeasurementObservation() {
		OperationsTestCase<WoundObservation> validateWoundObservationWoundMeasurementObservationTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationWoundMeasurementObservation",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_WOUND_MEASUREMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createWoundMeasurementObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationWoundMeasurementObservation(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationWoundMeasurementObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationWoundCharacteristics() {
		OperationsTestCase<WoundObservation> validateWoundObservationWoundCharacteristicsTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationWoundCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_WOUND_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createWoundCharacteristics().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationWoundCharacteristics(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationWoundCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationHighestPressureUlcerStage() {
		OperationsTestCase<WoundObservation> validateWoundObservationHighestPressureUlcerStageTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationHighestPressureUlcerStage",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createHighestPressureUlcerStage().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationHighestPressureUlcerStage(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationHighestPressureUlcerStageTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationAuthorParticipation() {
		OperationsTestCase<WoundObservation> validateWoundObservationAuthorParticipationTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				AuthorParticipation ap = ConsolFactory.eINSTANCE.createAuthorParticipation().init();
				target.getAuthors().add(ap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationAuthorParticipation(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationCDCRCDCode() {
		OperationsTestCase<WoundObservation> validateWoundObservationCDCRCDCodeTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationCDCRCDCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_CDCRCD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
				CR qual = DatatypesFactory.eINSTANCE.createCR();
				target.getTargetSiteCodes().get(0).getQualifiers().add(qual);
				CD val = DatatypesFactory.eINSTANCE.createCD();
				qual.setValue(val);
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).getValue().setCode("HasACode");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationCDCRCDCode(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationCDCRCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationCDCRName() {
		OperationsTestCase<WoundObservation> validateWoundObservationCDCRNameTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationCDCRName",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_CDCR_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
				target.getTargetSiteCodes().get(0).getQualifiers().add(DatatypesFactory.eINSTANCE.createCR());
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				CV name = DatatypesFactory.eINSTANCE.createCV();
				name.setCode("272741003");
				name.setCodeSystem(SNOMEDCT_ID);
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).setName(name);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationCDCRName(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationCDCRNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationCDCRNameP() {
		OperationsTestCase<WoundObservation> validateWoundObservationCDCRNamePTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationCDCRNameP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_CDCR_NAME_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
				target.getTargetSiteCodes().get(0).getQualifiers().add(DatatypesFactory.eINSTANCE.createCR());
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).setName(DatatypesFactory.eINSTANCE.createCV());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationCDCRNameP(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationCDCRNamePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationCDCRValue() {
		OperationsTestCase<WoundObservation> validateWoundObservationCDCRValueTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationCDCRValue",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_CDCR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
				target.getTargetSiteCodes().get(0).getQualifiers().add(DatatypesFactory.eINSTANCE.createCR());
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().get(0).setValue(
					DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationCDCRValue(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationCDCRValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundObservationCDQualifier() {
		OperationsTestCase<WoundObservation> validateWoundObservationCDQualifierTestCase = new OperationsTestCase<WoundObservation>(
			"validateWoundObservationCDQualifier",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_OBSERVATION_CD_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(WoundObservation target) {
				target.getTargetSiteCodes().get(0).getQualifiers().add(DatatypesFactory.eINSTANCE.createCR());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundObservationOperations.validateWoundObservationCDQualifier(
					(WoundObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundObservationCDQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetWoundMeasurementObservations() {

		WoundObservation target = objectFactory.create();
		target.getWoundMeasurementObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetWoundCharacteristicss() {

		WoundObservation target = objectFactory.create();
		target.getWoundCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHighestPressureUlcerStage() {

		WoundObservation target = objectFactory.create();
		target.getHighestPressureUlcerStage();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends WoundObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WoundObservation> {
		public WoundObservation create() {
			return ConsolFactory.eINSTANCE.createWoundObservation();
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
	private static class ConstructorTestClass extends WoundObservationOperations {
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

} // WoundObservationOperations
