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
import org.eclipse.mdht.uml.cda.ObservationRange;
import org.eclipse.mdht.uml.cda.ReferenceRange;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservation2ReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservation2ReferenceRangeObservationRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Reference Range Observation Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservation2ReferenceRangeObservationRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Reference Range Observation Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservation2ReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Reference Range Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationAuthorMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Author Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationNoObservationRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation No Observation Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2#validateResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Interpretation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationCodeP() {
		OperationsTestCase<ResultObservation2> validateResultObservationCodePTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationCodeP(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationInterpretationCodeP() {
		OperationsTestCase<ResultObservation2> validateResultObservationInterpretationCodePTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationInterpretationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationInterpretationCodeP(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationInterpretationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservation2AuthorParticipation() {
		OperationsTestCase<ResultObservation2> validateResultObservation2AuthorParticipationTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservation2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservation2AuthorParticipation(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservation2ReferenceRange() {
		OperationsTestCase<ResultObservation2> validateResultObservation2ReferenceRangeTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservation2ReferenceRange", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservation2ReferenceRange(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservation2ReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservation2ReferenceRangeObservationRangeValue() {
		OperationsTestCase<ResultObservation2> validateResultObservation2ReferenceRangeObservationRangeValueTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservation2ReferenceRangeObservationRangeValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION2_REFERENCE_RANGE_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.getReferenceRanges().get(0).getObservationRange().setValue(
					DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservation2ReferenceRangeObservationRangeValue(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservation2ReferenceRangeObservationRangeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservation2ReferenceRangeObservationRangeCode() {
		// Note: Modified operation OCL due to inline OCL 0..0 generation issue
		OperationsTestCase<ResultObservation2> validateResultObservation2ReferenceRangeObservationRangeCodeTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservation2ReferenceRangeObservationRangeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION2_REFERENCE_RANGE_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);
				target.getReferenceRanges().get(0).getObservationRange().setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.getReferenceRanges().get(0).getObservationRange().setCode(null);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservation2ReferenceRangeObservationRangeCode(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservation2ReferenceRangeObservationRangeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservation2ReferenceRangeObservationRange() {
		OperationsTestCase<ResultObservation2> validateResultObservation2ReferenceRangeObservationRangeTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservation2ReferenceRangeObservationRange",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION2_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.getReferenceRanges().get(0).setObservationRange(CDAFactory.eINSTANCE.createObservationRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservation2ReferenceRangeObservationRange(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservation2ReferenceRangeObservationRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationAuthorMultiplicity() {
		OperationsTestCase<ResultObservation2> validateResultObservationAuthorMultiplicityTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationAuthorMultiplicity", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationAuthorMultiplicity(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationAuthorMultiplicityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationCodeValue() {
		OperationsTestCase<ResultObservation2> validateResultObservationCodeValueTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				// setting invalid codeSystem to cause failure
				code.setCodeSystem(BAD_CODESYSTEM_ID);
				target.setCode(code);
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ResultObservation2 target) {
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						// setting valid codeSystem 1
						code.setCodeSystem("2.16.840.1.113883.6.1");
						target.setCode(code);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ResultObservation2 target) {
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						// setting valid codeSystem 2
						code.setCodeSystem(SNOMEDCT_ID);
						target.setCode(code);
					}
				});
			};

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationCodeValue(
					(ResultObservation2) objectToTest, diagnostician, map);
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
	public void testValidateResultObservationTextReference() {
		OperationsTestCase<ResultObservation2> validateResultObservationTextReferenceTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationTextReference(
					(ResultObservation2) objectToTest, diagnostician, map);
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
	public void testValidateResultObservationReferenceValue() {
		OperationsTestCase<ResultObservation2> validateResultObservationReferenceValueTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationReferenceValue(
					(ResultObservation2) objectToTest, diagnostician, map);
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
	public void testValidateResultObservationTextReferenceValue() {
		OperationsTestCase<ResultObservation2> validateResultObservationTextReferenceValueTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationTextReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationTextReferenceValue(
					(ResultObservation2) objectToTest, diagnostician, map);
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
	public void testValidateResultObservationNoObservationRangeCode() {
		OperationsTestCase<ResultObservation2> validateResultObservationNoObservationRangeCodeTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationNoObservationRangeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationNoObservationRangeCode(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationNoObservationRangeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
		OperationsTestCase<ResultObservation2> validateResultObservationTemplateIdTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationTemplateId(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationEffectiveTime() {
		OperationsTestCase<ResultObservation2> validateResultObservationEffectiveTimeTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationEffectiveTime(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This attribute is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateResultObservationText() {
		OperationsTestCase<ResultObservation2> validateResultObservationTextTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationText",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationText(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationCode() {
		OperationsTestCase<ResultObservation2> validateResultObservationCodeTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void setDependency(ResultObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationCode(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationValue() {
		OperationsTestCase<ResultObservation2> validateResultObservationValueTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {

			}

			@Override
			protected void updateToPass(ResultObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationValue(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationInterpretationCode() {
		OperationsTestCase<ResultObservation2> validateResultObservationInterpretationCodeTestCase = new OperationsTestCase<ResultObservation2>(
			"validateResultObservationInterpretationCode", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation2 target) {
				target.init();
				target.getInterpretationCodes().clear();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			String[] subsetOfCodesToTest = "A H > < H> L< SYN-S _GeneticObservationInterpretation AC".split(" ");

			final String OBSERVATION_INTERPRETATION_CS = "2.16.840.1.113883.5.83";

			@Override
			public void addPassTests() {

				for (final String codeToTest : subsetOfCodesToTest) {
					addPassTest(new PassTest() {
						@Override
						public void updateToPass(ResultObservation2 target) {
							target.init();
							target.getInterpretationCodes().clear();
							target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
							for (CE icode : target.getInterpretationCodes()) {
								icode.setCode(codeToTest);
								icode.setCodeSystem(OBSERVATION_INTERPRETATION_CS);
							}
						};
					});
				}

				// Due to errata 963 DSTU Update 2 the value set is DYNAMIC (and the specific codes are no longer enforced in MDHT, only the
				// codeSystem is enforced)
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ResultObservation2 target) {
						target.init();
						target.getInterpretationCodes().clear();
						target.getInterpretationCodes().add(
							DatatypesFactory.eINSTANCE.createCE(BAD_CODE_VALUE, OBSERVATION_INTERPRETATION_CS));
					}
				});

			};

			@Override
			protected void setDependency(ResultObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationInterpretationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservation2Operations.validateResultObservationInterpretationCode(
					(ResultObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultObservation2> {
		@Override
		public ResultObservation2 create() {
			return ConsolFactory.eINSTANCE.createResultObservation2();
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
	private static class ConstructorTestClass extends ResultObservation2Operations {
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

} // ResultObservation2Operations
