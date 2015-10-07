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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2ValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2AssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2ReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#validateMentalStatusObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MentalStatusObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2ValueDatatype() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2ValueDatatypeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2ValueDatatype",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2ValueDatatype(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2ValueDatatypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservation2TemplateId() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2TemplateIdTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservation2ClassCode() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2ClassCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2ClassCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservation2MoodCode() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2MoodCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2MoodCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2Id() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2IdTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2Id",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2Id(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservation2CodeP() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2CodePTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2CodeP(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2Code() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2CodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2Code",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateMentalStatusObservation2Code(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservation2StatusCode() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2StatusCodeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservation2Operations.validateMentalStatusObservation2StatusCode(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservation2StatusCodeP() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2StatusCodePTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2StatusCodeP(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservation2EffectiveTime() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2EffectiveTimeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2EffectiveTime(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservation2Value() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2ValueTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2Value",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2Value(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2AuthorParticipation() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2AuthorParticipationTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	public void testValidateMentalStatusObservation2AssessmentScaleObservation() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2AssessmentScaleObservationTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2AssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2AssessmentScaleObservation(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2AssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2ReferenceRange() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2ReferenceRangeTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2ReferenceRange",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MentalStatusObservation2Operations.validateMentalStatusObservation2ReferenceRange(
					(MentalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservation2ReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservation2CDTranslation() {
		OperationsTestCase<MentalStatusObservation2> validateMentalStatusObservation2CDTranslationTestCase = new OperationsTestCase<MentalStatusObservation2>(
			"validateMentalStatusObservation2CDTranslation",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	public void testGetAssessmentScaleObservations() {

		MentalStatusObservation2 target = objectFactory.create();
		target.getAssessmentScaleObservations();

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

} // MentalStatusObservation2Operations
