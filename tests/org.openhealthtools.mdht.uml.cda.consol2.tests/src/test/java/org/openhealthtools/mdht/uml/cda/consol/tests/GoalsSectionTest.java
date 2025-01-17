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
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.GoalsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Goals Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection#validateGoalsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goals Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection#validateGoalsSectionNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goals Section Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection#validateGoalsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goals Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection#validateGoalsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goals Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection#validateGoalsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goals Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection#validateGoalsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goals Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection#validateGoalsSectionGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goals Section Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection#getGoalObservations() <em>Get Goal Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GoalsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalsSectionTemplateId() {
		OperationsTestCase<GoalsSection> validateGoalsSectionTemplateIdTestCase = new OperationsTestCase<GoalsSection>(
			"validateGoalsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GOALS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalsSection target) {

			}

			@Override
			protected void updateToPass(GoalsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalsSectionOperations.validateGoalsSectionTemplateId(
					(GoalsSection) objectToTest, diagnostician, map);
			}

		};

		validateGoalsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalsSectionNullFlavor() {
		OperationsTestCase<GoalsSection> validateGoalsSectionNullFlavorTestCase = new OperationsTestCase<GoalsSection>(
			"validateGoalsSectionNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_GOALS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalsSection target) {

			}

			@Override
			protected void updateToPass(GoalsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalsSectionOperations.validateGoalsSectionNullFlavor(
					(GoalsSection) objectToTest, diagnostician, map);
			}

		};

		validateGoalsSectionNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalsSectionCode() {
		OperationsTestCase<GoalsSection> validateGoalsSectionCodeTestCase = new OperationsTestCase<GoalsSection>(
			"validateGoalsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_GOALS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalsSection target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(GoalsSection target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("61146-7", LOINC_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalsSectionOperations.validateGoalsSectionCode((GoalsSection) objectToTest, diagnostician, map);
			}

		};

		validateGoalsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalsSectionCodeP() {
		OperationsTestCase<GoalsSection> validateGoalsSectionCodePTestCase = new OperationsTestCase<GoalsSection>(
			"validateGoalsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GOALS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalsSection target) {
				target.init();
				target.setCode(null);
			}

			@Override
			protected void updateToPass(GoalsSection target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalsSectionOperations.validateGoalsSectionCodeP(
					(GoalsSection) objectToTest, diagnostician, map);
			}

		};

		validateGoalsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalsSectionTitle() {
		OperationsTestCase<GoalsSection> validateGoalsSectionTitleTestCase = new OperationsTestCase<GoalsSection>(
			"validateGoalsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_GOALS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalsSection target) {

			}

			@Override
			protected void updateToPass(GoalsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalsSectionOperations.validateGoalsSectionTitle(
					(GoalsSection) objectToTest, diagnostician, map);
			}

		};

		validateGoalsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalsSectionText() {
		OperationsTestCase<GoalsSection> validateGoalsSectionTextTestCase = new OperationsTestCase<GoalsSection>(
			"validateGoalsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_GOALS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalsSection target) {

			}

			@Override
			protected void updateToPass(GoalsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalsSectionOperations.validateGoalsSectionText((GoalsSection) objectToTest, diagnostician, map);
			}

		};

		validateGoalsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalsSectionGoalObservation() {
		OperationsTestCase<GoalsSection> validateGoalsSectionGoalObservationTestCase = new OperationsTestCase<GoalsSection>(
			"validateGoalsSectionGoalObservation",
			operationsForOCL.getOCLValue("VALIDATE_GOALS_SECTION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalsSection target) {
				target.init();
				// need to remove NI as that allows pass
				target.unsetNullFlavor();
			}

			@Override
			protected void updateToPass(GoalsSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createGoalObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalsSectionOperations.validateGoalsSectionGoalObservation(
					(GoalsSection) objectToTest, diagnostician, map);
			}

		};

		validateGoalsSectionGoalObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGoalObservations() {

		GoalsSection target = objectFactory.create();
		target.getGoalObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GoalsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GoalsSection> {
		@Override
		public GoalsSection create() {
			return ConsolFactory.eINSTANCE.createGoalsSection();
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
	private static class ConstructorTestClass extends GoalsSectionOperations {
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

} // GoalsSectionOperations
