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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentAndPlanSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment And Plan Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#validateAssessmentAndPlanSectionPlannedAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Planned Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#getConsolPlannedAct2s() <em>Get Consol Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#validateAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#validateAssessmentAndPlanSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2#validateAssessmentAndPlanSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentAndPlanSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionPlannedAct2() {
		OperationsTestCase<AssessmentAndPlanSection2> validateAssessmentAndPlanSectionPlannedAct2TestCase = new OperationsTestCase<AssessmentAndPlanSection2>(
			"validateAssessmentAndPlanSectionPlannedAct2",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createPlannedAct2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSection2Operations.validateAssessmentAndPlanSectionPlannedAct2(
					(AssessmentAndPlanSection2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionPlannedAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPlannedAct2s() {

		AssessmentAndPlanSection2 target = objectFactory.create();
		target.getConsolPlannedAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionTemplateId() {
		OperationsTestCase<AssessmentAndPlanSection2> validateAssessmentAndPlanSectionTemplateIdTestCase = new OperationsTestCase<AssessmentAndPlanSection2>(
			"validateAssessmentAndPlanSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection2 target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSection2Operations.validateAssessmentAndPlanSectionTemplateId(
					(AssessmentAndPlanSection2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionCodeP() {
		OperationsTestCase<AssessmentAndPlanSection2> validateAssessmentAndPlanSectionCodePTestCase = new OperationsTestCase<AssessmentAndPlanSection2>(
			"validateAssessmentAndPlanSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection2 target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSection2Operations.validateAssessmentAndPlanSectionCodeP(
					(AssessmentAndPlanSection2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionCode() {
		OperationsTestCase<AssessmentAndPlanSection2> validateAssessmentAndPlanSectionCodeTestCase = new OperationsTestCase<AssessmentAndPlanSection2>(
			"validateAssessmentAndPlanSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection2 target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AssessmentAndPlanSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSection2Operations.validateAssessmentAndPlanSectionCode(
					(AssessmentAndPlanSection2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentAndPlanSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentAndPlanSection2> {
		public AssessmentAndPlanSection2 create() {
			return ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2();
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
	private static class ConstructorTestClass extends AssessmentAndPlanSection2Operations {
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

} // AssessmentAndPlanSection2Operations
