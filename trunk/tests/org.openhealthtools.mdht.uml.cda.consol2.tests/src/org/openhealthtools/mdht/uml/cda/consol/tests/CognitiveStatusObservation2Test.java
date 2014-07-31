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
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Status Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2ValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2NonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2CaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2AssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#validateCognitiveStatusObservation2ReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Observation2 Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#getNonMedicinalSupplyActivity2s() <em>Get Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CognitiveStatusObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusObservation2ValueDatatype() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2ValueDatatypeTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2ValueDatatype",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("notChecked", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2ValueDatatype(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2ValueDatatypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2TemplateId() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2TemplateIdTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2TemplateId(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2ClassCode() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2ClassCodeTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2ClassCode(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2MoodCode() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2MoodCodeTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2MoodCode(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusObservation2Id() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2IdTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2Id",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2Id(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2CodeP() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2CodePTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2CodeP(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2Code() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2CodeTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2Code",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

			}

			@Override
			protected void setDependency(CognitiveStatusObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2Code(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2Text() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2TextTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2Text",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2Text(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2StatusCode() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2StatusCodeTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2StatusCode(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2StatusCodeP() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2StatusCodePTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2StatusCodeP(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2EffectiveTime() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2EffectiveTimeTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2EffectiveTime(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusObservation2Value() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2ValueTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2Value",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2Value(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusObservation2AuthorParticipation() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2AuthorParticipationTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2AuthorParticipation(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusObservation2NonMedicinalSupplyActivity2() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2NonMedicinalSupplyActivity2TestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2NonMedicinalSupplyActivity2",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2NonMedicinalSupplyActivity2(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2NonMedicinalSupplyActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusObservation2CaregiverCharacteristics() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2CaregiverCharacteristicsTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2CaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2CaregiverCharacteristics(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2CaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusObservation2AssessmentScaleObservation() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2AssessmentScaleObservationTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2AssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2AssessmentScaleObservation(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2AssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusObservation2ReferenceRange() {
		OperationsTestCase<CognitiveStatusObservation2> validateCognitiveStatusObservation2ReferenceRangeTestCase = new OperationsTestCase<CognitiveStatusObservation2>(
			"validateCognitiveStatusObservation2ReferenceRange",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusObservation2 target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusObservation2Operations.validateCognitiveStatusObservation2ReferenceRange(
					(CognitiveStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusObservation2ReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivity2s() {

		CognitiveStatusObservation2 target = objectFactory.create();
		target.getNonMedicinalSupplyActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		CognitiveStatusObservation2 target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		CognitiveStatusObservation2 target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CognitiveStatusObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<CognitiveStatusObservation2> {
		public CognitiveStatusObservation2 create() {
			return ConsolFactory.eINSTANCE.createCognitiveStatusObservation2();
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
	private static class ConstructorTestClass extends CognitiveStatusObservation2Operations {
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

} // CognitiveStatusObservation2Operations
