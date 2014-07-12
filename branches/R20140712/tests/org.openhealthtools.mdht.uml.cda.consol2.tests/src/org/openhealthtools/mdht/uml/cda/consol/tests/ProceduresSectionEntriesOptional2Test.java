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
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalProcedureActivityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalProcedureActivityAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#getConsolProcedureActivityProcedure2s() <em>Get Consol Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#getConsolProcedureActivityObservation2() <em>Get Consol Procedure Activity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#getConsolProcedureActivityAct2() <em>Get Consol Procedure Activity Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureActivityProcedure2() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalProcedureActivityProcedure2TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalProcedureActivityProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalProcedureActivityProcedure2(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureActivityObservation2() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalProcedureActivityObservation2TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalProcedureActivityObservation2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalProcedureActivityObservation2(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureActivityAct2() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalProcedureActivityAct2TestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalProcedureActivityAct2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalProcedureActivityAct2(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityProcedure2s() {

		ProceduresSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolProcedureActivityProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityObservation2() {

		ProceduresSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolProcedureActivityObservation2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityAct2() {

		ProceduresSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolProcedureActivityAct2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalTemplateId(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalCodeP(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCode() {
		OperationsTestCase<ProceduresSectionEntriesOptional2> validateProceduresSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional2>(
			"validateProceduresSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProceduresSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptional2Operations.validateProceduresSectionEntriesOptionalCode(
					(ProceduresSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresSectionEntriesOptional2> {
		public ProceduresSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends ProceduresSectionEntriesOptional2Operations {
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

} // ProceduresSectionEntriesOptional2Operations
