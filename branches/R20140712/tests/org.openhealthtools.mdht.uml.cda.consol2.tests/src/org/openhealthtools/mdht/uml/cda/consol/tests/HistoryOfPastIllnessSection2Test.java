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
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryOfPastIllnessSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Past Illness Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2#validateHistoryOfPastIllnessSectionProblemObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Problem Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2#validateHistoryOfPastIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2#validateHistoryOfPastIllnessSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2#validateHistoryOfPastIllnessSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryOfPastIllnessSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionProblemObservation2() {
		OperationsTestCase<HistoryOfPastIllnessSection2> validateHistoryOfPastIllnessSectionProblemObservation2TestCase = new OperationsTestCase<HistoryOfPastIllnessSection2>(
			"validateHistoryOfPastIllnessSectionProblemObservation2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSection2Operations.validateHistoryOfPastIllnessSectionProblemObservation2(
					(HistoryOfPastIllnessSection2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionProblemObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemObservation2s() {

		HistoryOfPastIllnessSection2 target = objectFactory.create();
		target.getConsolProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionTemplateId() {
		OperationsTestCase<HistoryOfPastIllnessSection2> validateHistoryOfPastIllnessSectionTemplateIdTestCase = new OperationsTestCase<HistoryOfPastIllnessSection2>(
			"validateHistoryOfPastIllnessSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection2 target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSection2Operations.validateHistoryOfPastIllnessSectionTemplateId(
					(HistoryOfPastIllnessSection2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionCodeP() {
		OperationsTestCase<HistoryOfPastIllnessSection2> validateHistoryOfPastIllnessSectionCodePTestCase = new OperationsTestCase<HistoryOfPastIllnessSection2>(
			"validateHistoryOfPastIllnessSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection2 target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSection2Operations.validateHistoryOfPastIllnessSectionCodeP(
					(HistoryOfPastIllnessSection2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionCode() {
		OperationsTestCase<HistoryOfPastIllnessSection2> validateHistoryOfPastIllnessSectionCodeTestCase = new OperationsTestCase<HistoryOfPastIllnessSection2>(
			"validateHistoryOfPastIllnessSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection2 target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HistoryOfPastIllnessSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSection2Operations.validateHistoryOfPastIllnessSectionCode(
					(HistoryOfPastIllnessSection2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryOfPastIllnessSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryOfPastIllnessSection2> {
		public HistoryOfPastIllnessSection2 create() {
			return ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection2();
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
	private static class ConstructorTestClass extends HistoryOfPastIllnessSection2Operations {
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

} // HistoryOfPastIllnessSection2Operations
