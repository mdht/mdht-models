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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations;
import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionRecommendationsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutrition Recommendations</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations#validateNutritionRecommendationsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendations Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NutritionRecommendationsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationsTemplateId() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsTemplateIdTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsTemplateId(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationsClassCode() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsClassCodeTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsClassCode(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationsMoodCodeP() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsMoodCodePTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsMoodCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsMoodCodeP(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsMoodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT 
	*/
	@Test
	public void testValidateNutritionRecommendationsMoodCode() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsMoodCodeTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.INT);
			}

			@Override
			protected void setDependency(NutritionRecommendations target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationsMoodCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsMoodCode(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationsCodeP() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsCodePTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsCodeP(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationsCode() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsCodeTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCode("61310001");
				code.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(code);
			}

			@Override
			protected void setDependency(NutritionRecommendations target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsCode(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationsStatusCode() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsStatusCodeTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsStatusCode(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationsStatusCodeP() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsStatusCodePTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsStatusCodeP(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationsEffectiveTime() {
		OperationsTestCase<NutritionRecommendations> validateNutritionRecommendationsEffectiveTimeTestCase = new OperationsTestCase<NutritionRecommendations>(
			"validateNutritionRecommendationsEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATIONS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendations target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendations target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationsOperations.validateNutritionRecommendationsEffectiveTime(
					(NutritionRecommendations) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationsEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NutritionRecommendationsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NutritionRecommendations> {
		@Override
		public NutritionRecommendations create() {
			return ConsolFactory.eINSTANCE.createNutritionRecommendations();
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
	private static class ConstructorTestClass extends NutritionRecommendationsOperations {
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

} // NutritionRecommendationsOperations
