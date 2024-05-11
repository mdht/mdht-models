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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureFindingsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Findings Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2#validateProcedureFindingsSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2#validateProcedureFindingsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2#validateProcedureFindingsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2#validateProcedureFindingsSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Findings Section Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureFindingsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureFindingsSection2TemplateId() {
		OperationsTestCase<ProcedureFindingsSection2> validateProcedureFindingsSection2TemplateIdTestCase = new OperationsTestCase<ProcedureFindingsSection2>(
			"validateProcedureFindingsSection2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_FINDINGS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection2 target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSection2Operations.validateProcedureFindingsSection2TemplateId(
					(ProcedureFindingsSection2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemObservation2s() {

		ProcedureFindingsSection2 target = objectFactory.create();
		target.getConsolProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureFindingsSectionCodeP() {
		OperationsTestCase<ProcedureFindingsSection2> validateProcedureFindingsSectionCodePTestCase = new OperationsTestCase<ProcedureFindingsSection2>(
			"validateProcedureFindingsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_FINDINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection2 target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSection2Operations.validateProcedureFindingsSectionCodeP(
					(ProcedureFindingsSection2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureFindingsSectionCode() {
		OperationsTestCase<ProcedureFindingsSection2> validateProcedureFindingsSectionCodeTestCase = new OperationsTestCase<ProcedureFindingsSection2>(
			"validateProcedureFindingsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_FINDINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection2 target) {

			}

			@Override
			protected void updateToPass(ProcedureFindingsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedureFindingsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSection2Operations.validateProcedureFindingsSectionCode(
					(ProcedureFindingsSection2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureFindingsSectionProblemObservation() {
		OperationsTestCase<ProcedureFindingsSection2> validateProcedureFindingsSectionProblemObservationTestCase = new OperationsTestCase<ProcedureFindingsSection2>(
			"validateProcedureFindingsSectionProblemObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_FINDINGS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureFindingsSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureFindingsSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureFindingsSection2Operations.validateProcedureFindingsSectionProblemObservation(
					(ProcedureFindingsSection2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureFindingsSectionProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureFindingsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureFindingsSection2> {
		@Override
		public ProcedureFindingsSection2 create() {
			return ConsolFactory.eINSTANCE.createProcedureFindingsSection2();
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
	private static class ConstructorTestClass extends ProcedureFindingsSection2Operations {
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

} // ProcedureFindingsSection2Operations
