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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.ComplicationsSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complications Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2#validateComplicationsSection2ExplicitComplications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section2 Explicit Complications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2#validateComplicationsSectionProblemObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Problem Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2#validateComplicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2#validateComplicationsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2#validateComplicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complications Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComplicationsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateComplicationsSection2ExplicitComplications() {
		OperationsTestCase<ComplicationsSection2> validateComplicationsSection2ExplicitComplicationsTestCase = new OperationsTestCase<ComplicationsSection2>(
			"validateComplicationsSection2ExplicitComplications",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION2_EXPLICIT_COMPLICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection2 target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSection2Operations.validateComplicationsSection2ExplicitComplications(
					(ComplicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSection2ExplicitComplicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateComplicationsSectionProblemObservation2() {
		OperationsTestCase<ComplicationsSection2> validateComplicationsSectionProblemObservation2TestCase = new OperationsTestCase<ComplicationsSection2>(
			"validateComplicationsSectionProblemObservation2",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ComplicationsSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSection2Operations.validateComplicationsSectionProblemObservation2(
					(ComplicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionProblemObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemObservation2s() {

		ComplicationsSection2 target = objectFactory.create();
		target.getConsolProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplicationsSectionTemplateId() {
		OperationsTestCase<ComplicationsSection2> validateComplicationsSectionTemplateIdTestCase = new OperationsTestCase<ComplicationsSection2>(
			"validateComplicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection2 target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSection2Operations.validateComplicationsSectionTemplateId(
					(ComplicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplicationsSectionCodeP() {
		OperationsTestCase<ComplicationsSection2> validateComplicationsSectionCodePTestCase = new OperationsTestCase<ComplicationsSection2>(
			"validateComplicationsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection2 target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSection2Operations.validateComplicationsSectionCodeP(
					(ComplicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComplicationsSectionCode() {
		OperationsTestCase<ComplicationsSection2> validateComplicationsSectionCodeTestCase = new OperationsTestCase<ComplicationsSection2>(
			"validateComplicationsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_COMPLICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComplicationsSection2 target) {

			}

			@Override
			protected void updateToPass(ComplicationsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ComplicationsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ComplicationsSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComplicationsSection2Operations.validateComplicationsSectionCode(
					(ComplicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateComplicationsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComplicationsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ComplicationsSection2> {
		@Override
		public ComplicationsSection2 create() {
			return ConsolFactory.eINSTANCE.createComplicationsSection2();
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
	private static class ConstructorTestClass extends ComplicationsSection2Operations {
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

} // ComplicationsSection2Operations
