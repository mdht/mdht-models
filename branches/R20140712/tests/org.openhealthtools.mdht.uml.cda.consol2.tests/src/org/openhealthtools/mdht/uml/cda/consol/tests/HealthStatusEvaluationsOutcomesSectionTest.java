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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusEvaluationsOutcomesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Status Evaluations Outcomes Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Evaluations Outcomes Section Outcome Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection#getOutcomeObservations() <em>Get Outcome Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthStatusEvaluationsOutcomesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsOutcomesSectionTemplateId() {
		OperationsTestCase<HealthStatusEvaluationsOutcomesSection> validateHealthStatusEvaluationsOutcomesSectionTemplateIdTestCase = new OperationsTestCase<HealthStatusEvaluationsOutcomesSection>(
			"validateHealthStatusEvaluationsOutcomesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionTemplateId(
					(HealthStatusEvaluationsOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsOutcomesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsOutcomesSectionCode() {
		OperationsTestCase<HealthStatusEvaluationsOutcomesSection> validateHealthStatusEvaluationsOutcomesSectionCodeTestCase = new OperationsTestCase<HealthStatusEvaluationsOutcomesSection>(
			"validateHealthStatusEvaluationsOutcomesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionCode(
					(HealthStatusEvaluationsOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsOutcomesSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsOutcomesSectionCodeP() {
		OperationsTestCase<HealthStatusEvaluationsOutcomesSection> validateHealthStatusEvaluationsOutcomesSectionCodePTestCase = new OperationsTestCase<HealthStatusEvaluationsOutcomesSection>(
			"validateHealthStatusEvaluationsOutcomesSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsOutcomesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionCodeP(
					(HealthStatusEvaluationsOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsOutcomesSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsOutcomesSectionTitle() {
		OperationsTestCase<HealthStatusEvaluationsOutcomesSection> validateHealthStatusEvaluationsOutcomesSectionTitleTestCase = new OperationsTestCase<HealthStatusEvaluationsOutcomesSection>(
			"validateHealthStatusEvaluationsOutcomesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsOutcomesSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionTitle(
					(HealthStatusEvaluationsOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsOutcomesSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusEvaluationsOutcomesSectionText() {
		OperationsTestCase<HealthStatusEvaluationsOutcomesSection> validateHealthStatusEvaluationsOutcomesSectionTextTestCase = new OperationsTestCase<HealthStatusEvaluationsOutcomesSection>(
			"validateHealthStatusEvaluationsOutcomesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsOutcomesSection target) {

			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsOutcomesSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionText(
					(HealthStatusEvaluationsOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsOutcomesSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthStatusEvaluationsOutcomesSectionOutcomeObservation() {
		OperationsTestCase<HealthStatusEvaluationsOutcomesSection> validateHealthStatusEvaluationsOutcomesSectionOutcomeObservationTestCase = new OperationsTestCase<HealthStatusEvaluationsOutcomesSection>(
			"validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION_OUTCOME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusEvaluationsOutcomesSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthStatusEvaluationsOutcomesSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createOutcomeObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusEvaluationsOutcomesSectionOperations.validateHealthStatusEvaluationsOutcomesSectionOutcomeObservation(
					(HealthStatusEvaluationsOutcomesSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusEvaluationsOutcomesSectionOutcomeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetOutcomeObservations() {

		HealthStatusEvaluationsOutcomesSection target = objectFactory.create();
		target.getOutcomeObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthStatusEvaluationsOutcomesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthStatusEvaluationsOutcomesSection> {
		public HealthStatusEvaluationsOutcomesSection create() {
			return ConsolFactory.eINSTANCE.createHealthStatusEvaluationsOutcomesSection();
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
	private static class ConstructorTestClass extends HealthStatusEvaluationsOutcomesSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // HealthStatusEvaluationsOutcomesSectionOperations
