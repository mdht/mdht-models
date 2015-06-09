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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment;
import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutrition Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentValueOfTypeCDIsFromSnomed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Value Of Type CD Is From Snomed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment#validateNutritionAssessmentAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Assessment Author Participation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NutritionAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionAssessmentValueOfTypeCDIsFromSnomed() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentValueOfTypeCDIsFromSnomedTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentValueOfTypeCDIsFromSnomed",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_VALUE_OF_TYPE_CD_IS_FROM_SNOMED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.getValues().set(0, DatatypesFactory.eINSTANCE.createCD("hasCode", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentValueOfTypeCDIsFromSnomed(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentValueOfTypeCDIsFromSnomedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionAssessmentTemplateId() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentTemplateIdTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentTemplateId(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionAssessmentClassCode() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentClassCodeTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentClassCode(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionAssessmentMoodCode() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentMoodCodeTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentMoodCode(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionAssessmentId() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentIdTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentId",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentId(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionAssessmentCodeP() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentCodePTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentCodeP(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionAssessmentCode() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentCodeTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCode(BAD_CODE_VALUE);
				code.setCodeSystem(LOINC_ID);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				// code.setCode("230125005");
				// code.setCodeSystem(SNOMEDCT_ID);
				target.getCode().setCode("75303-8");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void setDependency(NutritionAssessment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NutritionAssessmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentCode(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionAssessmentStatusCode() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentStatusCodeTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentStatusCode(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionAssessmentStatusCodeP() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentStatusCodePTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentStatusCodeP(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionAssessmentEffectiveTime() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentEffectiveTimeTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentEffectiveTime(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionAssessmentValue() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentValueTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {

			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentValue(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionAssessmentAuthorParticipation() {
		OperationsTestCase<NutritionAssessment> validateNutritionAssessmentAuthorParticipationTestCase = new OperationsTestCase<NutritionAssessment>(
			"validateNutritionAssessmentAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_ASSESSMENT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionAssessment target) {
				target.init();
			}

			@Override
			protected void updateToPass(NutritionAssessment target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionAssessmentOperations.validateNutritionAssessmentAuthorParticipation(
					(NutritionAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNutritionAssessmentAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NutritionAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NutritionAssessment> {
		@Override
		public NutritionAssessment create() {
			return ConsolFactory.eINSTANCE.createNutritionAssessment();
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
	private static class ConstructorTestClass extends NutritionAssessmentOperations {
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

} // NutritionAssessmentOperations
