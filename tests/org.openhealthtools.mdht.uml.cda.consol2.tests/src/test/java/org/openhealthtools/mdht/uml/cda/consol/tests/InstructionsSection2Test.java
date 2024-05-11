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
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.InstructionsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Instructions Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#getConsolInstruction2s() <em>Get Consol Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2#validateInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InstructionsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInstructionsSection2TemplateId() {
		OperationsTestCase<InstructionsSection2> validateInstructionsSection2TemplateIdTestCase = new OperationsTestCase<InstructionsSection2>(
			"validateInstructionsSection2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return InstructionsSection2Operations.validateInstructionsSection2TemplateId(
					(InstructionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSection2NullFlavor() {
		OperationsTestCase<InstructionsSection2> validateInstructionsSection2NullFlavorTestCase = new OperationsTestCase<InstructionsSection2>(
			"validateInstructionsSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return InstructionsSection2Operations.validateInstructionsSection2NullFlavor(
					(InstructionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSection2NullFlavorTestCase.doValidationTest();
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
	* @generated NOT
	*/
	@Test
	public void testValidateInstructionsSectionInstructions() {
		OperationsTestCase<InstructionsSection2> validateInstructionsSectionInstructionsTestCase = new OperationsTestCase<InstructionsSection2>(
			"validateInstructionsSectionInstructions",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection2 target) {
				// target.init defaults to a nullFlavor of NI which allows a pass
			}

			@Override
			protected void updateToPass(InstructionsSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createInstruction2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSection2Operations.validateInstructionsSectionInstructions(
					(InstructionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionInstructionsTestCase.doValidationTest();
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

} // InstructionsSection2Operations
