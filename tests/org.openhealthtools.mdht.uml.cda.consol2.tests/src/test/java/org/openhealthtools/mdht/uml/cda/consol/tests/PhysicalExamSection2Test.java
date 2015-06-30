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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component5;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2WoundObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Wound Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2Component(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSection2ComponentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section2 Component Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#getWoundObservations() <em>Get Wound Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#getConsolPressureUlcerObservations() <em>Get Consol Pressure Ulcer Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#getConsolHighestPressureUlcerStages() <em>Get Consol Highest Pressure Ulcer Stages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#getConsolNumberOfPressureUlcersObservations() <em>Get Consol Number Of Pressure Ulcers Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionPressureUlcerObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Pressure Ulcer Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2#validatePhysicalExamSectionNumberOfPressureUlcersObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Number Of Pressure Ulcers Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicalExamSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicalExamSection2WoundObservation() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2WoundObservationTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2WoundObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createLongitudinalCareWoundObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2WoundObservation(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2WoundObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicalExamSection2Component() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2Component",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				Component5 c5 = CDAFactory.eINSTANCE.createComponent5();
				target.getComponents().add(c5);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2Component(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSectionCode() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionCodeTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {
				target.init();
				Component5 c5 = CDAFactory.eINSTANCE.createComponent5();
				target.getComponents().add(c5);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c5.setSection(sec);
			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				for (Component5 c5 : target.getComponents()) {
					c5.getSection().setCode(
						DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.6.1"));
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionCode(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSectionCodeP() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionCodePTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {
				target.init();
				Component5 c5 = CDAFactory.eINSTANCE.createComponent5();
				target.getComponents().add(c5);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c5.setSection(sec);
			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				for (Component5 c5 : target.getComponents()) {
					c5.getSection().setCode(DatatypesFactory.eINSTANCE.createCE());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionCodeP(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSectionTitle() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionTitleTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {
				target.init();
				Component5 c5 = CDAFactory.eINSTANCE.createComponent5();
				target.getComponents().add(c5);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c5.setSection(sec);
			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				for (Component5 c5 : target.getComponents()) {
					c5.getSection().setTitle(DatatypesFactory.eINSTANCE.createST());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionTitle(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSectionText() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionTextTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {
				target.init();
				Component5 c5 = CDAFactory.eINSTANCE.createComponent5();
				target.getComponents().add(c5);
				Section sec = CDAFactory.eINSTANCE.createSection();
				c5.setSection(sec);
			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				for (Component5 c5 : target.getComponents()) {
					StrucDocText sdt = CDAFactory.eINSTANCE.createStrucDocText();
					c5.getSection().setText(sdt);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSectionText(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicalExamSection2ComponentSection() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSection2ComponentSectionTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSection2ComponentSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION2_COMPONENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {
				target.init();
				Component5 c5 = CDAFactory.eINSTANCE.createComponent5();
				target.getComponents().add(c5);
			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				for (Component5 c5 : target.getComponents()) {
					c5.setSection(CDAFactory.eINSTANCE.createSection());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSection2ComponentSection(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSection2ComponentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetWoundObservations() {

		PhysicalExamSection2 target = objectFactory.create();
		target.getWoundObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPressureUlcerObservations() {

		PhysicalExamSection2 target = objectFactory.create();
		target.getConsolPressureUlcerObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolHighestPressureUlcerStages() {

		PhysicalExamSection2 target = objectFactory.create();
		target.getConsolHighestPressureUlcerStages();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolNumberOfPressureUlcersObservations() {

		PhysicalExamSection2 target = objectFactory.create();
		target.getConsolNumberOfPressureUlcersObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionTemplateId() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionTemplateIdTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionTemplateId(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCodeP() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionCodePTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionCodeP(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCode() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionCodeTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PhysicalExamSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionCode(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This association is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidatePhysicalExamSectionPressureUlcerObservation() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionPressureUlcerObservationTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionPressureUlcerObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionPressureUlcerObservation(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionPressureUlcerObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This association is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidatePhysicalExamSectionHighestPressureUlcerStage() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionHighestPressureUlcerStageTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionHighestPressureUlcerStage",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionHighestPressureUlcerStage(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionHighestPressureUlcerStageTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This association is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidatePhysicalExamSectionNumberOfPressureUlcersObservation() {
		OperationsTestCase<PhysicalExamSection2> validatePhysicalExamSectionNumberOfPressureUlcersObservationTestCase = new OperationsTestCase<PhysicalExamSection2>(
			"validatePhysicalExamSectionNumberOfPressureUlcersObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection2 target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSection2Operations.validatePhysicalExamSectionNumberOfPressureUlcersObservation(
					(PhysicalExamSection2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionNumberOfPressureUlcersObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicalExamSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalExamSection2> {
		@Override
		public PhysicalExamSection2 create() {
			return ConsolFactory.eINSTANCE.createPhysicalExamSection2();
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
	private static class ConstructorTestClass extends PhysicalExamSection2Operations {
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

} // PhysicalExamSection2Operations
