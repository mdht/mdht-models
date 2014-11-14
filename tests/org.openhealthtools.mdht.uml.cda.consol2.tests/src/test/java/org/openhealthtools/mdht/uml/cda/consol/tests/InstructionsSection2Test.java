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
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.InstructionsSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Instructions Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSectionInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#getConsolInstruction2s() <em>Get Consol Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InstructionsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInstructionsSectionInstruction2() {
		OperationsTestCase<InstructionsSection2> validateInstructionsSectionInstruction2TestCase = new OperationsTestCase<InstructionsSection2>(
			"validateInstructionsSectionInstruction2",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(InstructionsSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createInstruction2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSection2Operations.validateInstructionsSectionInstruction2(
					(InstructionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionInstruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolInstruction2s() {

		InstructionsSection2 target = objectFactory.create();
		target.getConsolInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSectionTemplateId() {
		OperationsTestCase<InstructionsSection2> validateInstructionsSectionTemplateIdTestCase = new OperationsTestCase<InstructionsSection2>(
			"validateInstructionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection2 target) {

			}

			@Override
			protected void updateToPass(InstructionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSection2Operations.validateInstructionsSectionTemplateId(
					(InstructionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSectionCodeP() {
		OperationsTestCase<InstructionsSection2> validateInstructionsSectionCodePTestCase = new OperationsTestCase<InstructionsSection2>(
			"validateInstructionsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection2 target) {

			}

			@Override
			protected void updateToPass(InstructionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSection2Operations.validateInstructionsSectionCodeP(
					(InstructionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSectionCode() {
		OperationsTestCase<InstructionsSection2> validateInstructionsSectionCodeTestCase = new OperationsTestCase<InstructionsSection2>(
			"validateInstructionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection2 target) {

			}

			@Override
			protected void updateToPass(InstructionsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(InstructionsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.InstructionsSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSection2Operations.validateInstructionsSectionCode(
					(InstructionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InstructionsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<InstructionsSection2> {
		@Override
		public InstructionsSection2 create() {
			return ConsolFactory.eINSTANCE.createInstructionsSection2();
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
	private static class ConstructorTestClass extends InstructionsSection2Operations {
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

} // InstructionsSection2Operations
