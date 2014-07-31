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
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedProcedureSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Procedure Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2#validatePlannedProcedureSectionPlannedProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Planned Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2#getConsolPlannedProcedure2s() <em>Get Consol Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2#validatePlannedProcedureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2#validatePlannedProcedureSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2#validatePlannedProcedureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedProcedureSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedProcedureSectionPlannedProcedure2() {
		OperationsTestCase<PlannedProcedureSection2> validatePlannedProcedureSectionPlannedProcedure2TestCase = new OperationsTestCase<PlannedProcedureSection2>(
			"validatePlannedProcedureSectionPlannedProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedProcedureSection2 target) {
				target.addProcedure(ConsolFactory.eINSTANCE.createPlannedProcedure2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSection2Operations.validatePlannedProcedureSectionPlannedProcedure2(
					(PlannedProcedureSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionPlannedProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPlannedProcedure2s() {

		PlannedProcedureSection2 target = objectFactory.create();
		target.getConsolPlannedProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedureSectionTemplateId() {
		OperationsTestCase<PlannedProcedureSection2> validatePlannedProcedureSectionTemplateIdTestCase = new OperationsTestCase<PlannedProcedureSection2>(
			"validatePlannedProcedureSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSection2Operations.validatePlannedProcedureSectionTemplateId(
					(PlannedProcedureSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedureSectionCodeP() {
		OperationsTestCase<PlannedProcedureSection2> validatePlannedProcedureSectionCodePTestCase = new OperationsTestCase<PlannedProcedureSection2>(
			"validatePlannedProcedureSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSection2Operations.validatePlannedProcedureSectionCodeP(
					(PlannedProcedureSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedureSectionCode() {
		OperationsTestCase<PlannedProcedureSection2> validatePlannedProcedureSectionCodeTestCase = new OperationsTestCase<PlannedProcedureSection2>(
			"validatePlannedProcedureSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection2 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedProcedureSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSection2Operations.validatePlannedProcedureSectionCode(
					(PlannedProcedureSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedProcedureSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedProcedureSection2> {
		public PlannedProcedureSection2 create() {
			return ConsolFactory.eINSTANCE.createPlannedProcedureSection2();
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
	private static class ConstructorTestClass extends PlannedProcedureSection2Operations {
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

} // PlannedProcedureSection2Operations
