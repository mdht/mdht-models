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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureIndicationsSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Indications Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#validateProcedureIndicationsSectionIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#validateProcedureIndicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#validateProcedureIndicationsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2#validateProcedureIndicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureIndicationsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureIndicationsSectionIndication2() {
		OperationsTestCase<ProcedureIndicationsSection2> validateProcedureIndicationsSectionIndication2TestCase = new OperationsTestCase<ProcedureIndicationsSection2>(
			"validateProcedureIndicationsSectionIndication2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createIndication2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSection2Operations.validateProcedureIndicationsSectionIndication2(
					(ProcedureIndicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionIndication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolIndication2s() {

		ProcedureIndicationsSection2 target = objectFactory.create();
		target.getConsolIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureIndicationsSectionTemplateId() {
		OperationsTestCase<ProcedureIndicationsSection2> validateProcedureIndicationsSectionTemplateIdTestCase = new OperationsTestCase<ProcedureIndicationsSection2>(
			"validateProcedureIndicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection2 target) {

			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSection2Operations.validateProcedureIndicationsSectionTemplateId(
					(ProcedureIndicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureIndicationsSectionCodeP() {
		OperationsTestCase<ProcedureIndicationsSection2> validateProcedureIndicationsSectionCodePTestCase = new OperationsTestCase<ProcedureIndicationsSection2>(
			"validateProcedureIndicationsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection2 target) {

			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSection2Operations.validateProcedureIndicationsSectionCodeP(
					(ProcedureIndicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureIndicationsSectionCode() {
		OperationsTestCase<ProcedureIndicationsSection2> validateProcedureIndicationsSectionCodeTestCase = new OperationsTestCase<ProcedureIndicationsSection2>(
			"validateProcedureIndicationsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection2 target) {

			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureIndicationsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSection2Operations.validateProcedureIndicationsSectionCode(
					(ProcedureIndicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureIndicationsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureIndicationsSection2> {
		public ProcedureIndicationsSection2 create() {
			return ConsolFactory.eINSTANCE.createProcedureIndicationsSection2();
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
	private static class ConstructorTestClass extends ProcedureIndicationsSection2Operations {
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

} // ProcedureIndicationsSection2Operations
