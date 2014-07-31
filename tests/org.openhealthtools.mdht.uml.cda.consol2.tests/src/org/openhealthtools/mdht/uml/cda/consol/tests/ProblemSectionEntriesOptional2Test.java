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
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptionalProblemConcernAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Problem Concern Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptional2HealthStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional2 Health Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#getConsolProblemConcernAct2s() <em>Get Consol Problem Concern Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#getHealthStatusObservation2() <em>Get Health Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2#validateProblemSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalProblemConcernAct2() {
		OperationsTestCase<ProblemSectionEntriesOptional2> validateProblemSectionEntriesOptionalProblemConcernAct2TestCase = new OperationsTestCase<ProblemSectionEntriesOptional2>(
			"validateProblemSectionEntriesOptionalProblemConcernAct2",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createProblemConcernAct2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptionalProblemConcernAct2(
					(ProblemSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalProblemConcernAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemSectionEntriesOptional2HealthStatusObservation2() {
		OperationsTestCase<ProblemSectionEntriesOptional2> validateProblemSectionEntriesOptional2HealthStatusObservation2TestCase = new OperationsTestCase<ProblemSectionEntriesOptional2>(
			"validateProblemSectionEntriesOptional2HealthStatusObservation2",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createHealthStatusObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptional2HealthStatusObservation2(
					(ProblemSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptional2HealthStatusObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemConcernAct2s() {

		ProblemSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolProblemConcernAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthStatusObservation2() {

		ProblemSectionEntriesOptional2 target = objectFactory.create();
		target.getHealthStatusObservation2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProblemSectionEntriesOptional2> validateProblemSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProblemSectionEntriesOptional2>(
			"validateProblemSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptionalTemplateId(
					(ProblemSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProblemSectionEntriesOptional2> validateProblemSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProblemSectionEntriesOptional2>(
			"validateProblemSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptionalCodeP(
					(ProblemSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalCode() {
		OperationsTestCase<ProblemSectionEntriesOptional2> validateProblemSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProblemSectionEntriesOptional2>(
			"validateProblemSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProblemSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProblemSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSectionEntriesOptional2Operations.validateProblemSectionEntriesOptionalCode(
					(ProblemSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemSectionEntriesOptional2> {
		public ProblemSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends ProblemSectionEntriesOptional2Operations {
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

} // ProblemSectionEntriesOptional2Operations
