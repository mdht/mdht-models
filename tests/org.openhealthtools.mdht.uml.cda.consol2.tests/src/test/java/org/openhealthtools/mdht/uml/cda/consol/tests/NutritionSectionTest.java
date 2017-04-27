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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutrition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#validateNutritionSectionNutritionalStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Section Nutritional Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection#getNutritionalStatusObservations() <em>Get Nutritional Status Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NutritionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionSectionTemplateId() {
		OperationsTestCase<NutritionSection> validateNutritionSectionTemplateIdTestCase = new OperationsTestCase<NutritionSection>(
			"validateNutritionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionSection target) {

			}

			@Override
			protected void updateToPass(NutritionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionSectionOperations.validateNutritionSectionTemplateId(
					(NutritionSection) objectToTest, diagnostician, map);
			}

		};

		validateNutritionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionSectionCode() {
		OperationsTestCase<NutritionSection> validateNutritionSectionCodeTestCase = new OperationsTestCase<NutritionSection>(
			"validateNutritionSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionSection target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(NutritionSection target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("61144-2", LOINC_ID));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionSectionOperations.validateNutritionSectionCode(
					(NutritionSection) objectToTest, diagnostician, map);
			}

		};

		validateNutritionSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionSectionCodeP() {
		OperationsTestCase<NutritionSection> validateNutritionSectionCodePTestCase = new OperationsTestCase<NutritionSection>(
			"validateNutritionSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionSection target) {
				target.init();
				target.setCode(null);
			}

			@Override
			protected void updateToPass(NutritionSection target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionSectionOperations.validateNutritionSectionCodeP(
					(NutritionSection) objectToTest, diagnostician, map);
			}

		};

		validateNutritionSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionSectionTitle() {
		OperationsTestCase<NutritionSection> validateNutritionSectionTitleTestCase = new OperationsTestCase<NutritionSection>(
			"validateNutritionSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionSection target) {

			}

			@Override
			protected void updateToPass(NutritionSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionSectionOperations.validateNutritionSectionTitle(
					(NutritionSection) objectToTest, diagnostician, map);
			}

		};

		validateNutritionSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionSectionText() {
		OperationsTestCase<NutritionSection> validateNutritionSectionTextTestCase = new OperationsTestCase<NutritionSection>(
			"validateNutritionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionSection target) {

			}

			@Override
			protected void updateToPass(NutritionSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionSectionOperations.validateNutritionSectionText(
					(NutritionSection) objectToTest, diagnostician, map);
			}

		};

		validateNutritionSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionSectionNutritionalStatusObservation() {
		OperationsTestCase<NutritionSection> validateNutritionSectionNutritionalStatusObservationTestCase = new OperationsTestCase<NutritionSection>(
			"validateNutritionSectionNutritionalStatusObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_SECTION_NUTRITIONAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(NutritionSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createNutritionalStatusObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionSectionOperations.validateNutritionSectionNutritionalStatusObservation(
					(NutritionSection) objectToTest, diagnostician, map);
			}

		};

		validateNutritionSectionNutritionalStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionalStatusObservations() {

		NutritionSection target = objectFactory.create();
		target.getNutritionalStatusObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NutritionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NutritionSection> {
		@Override
		public NutritionSection create() {
			return ConsolFactory.eINSTANCE.createNutritionSection();
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
	private static class ConstructorTestClass extends NutritionSectionOperations {
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

} // NutritionSectionOperations
