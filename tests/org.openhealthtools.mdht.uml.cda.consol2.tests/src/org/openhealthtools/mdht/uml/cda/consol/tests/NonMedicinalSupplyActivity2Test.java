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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.NonMedicinalSupplyActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Medicinal Supply Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivity2Instruction2InversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2 Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivity2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#getInstruction2() <em>Get Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2#validateNonMedicinalSupplyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Medicinal Supply Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NonMedicinalSupplyActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivity2Instruction2InversionInd() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivity2Instruction2InversionIndTestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivity2Instruction2InversionInd",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivity2Instruction2InversionInd(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivity2Instruction2InversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivity2Instruction2() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivity2Instruction2TestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivity2Instruction2",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivity2Instruction2(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivity2Instruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2() {

		NonMedicinalSupplyActivity2 target = objectFactory.create();
		target.getInstruction2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonMedicinalSupplyActivityTemplateId() {
		OperationsTestCase<NonMedicinalSupplyActivity2> validateNonMedicinalSupplyActivityTemplateIdTestCase = new OperationsTestCase<NonMedicinalSupplyActivity2>(
			"validateNonMedicinalSupplyActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NON_MEDICINAL_SUPPLY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonMedicinalSupplyActivity2 target) {

			}

			@Override
			protected void updateToPass(NonMedicinalSupplyActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonMedicinalSupplyActivity2Operations.validateNonMedicinalSupplyActivityTemplateId(
					(NonMedicinalSupplyActivity2) objectToTest, diagnostician, map);
			}

		};

		validateNonMedicinalSupplyActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NonMedicinalSupplyActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<NonMedicinalSupplyActivity2> {
		public NonMedicinalSupplyActivity2 create() {
			return ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2();
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
	private static class ConstructorTestClass extends NonMedicinalSupplyActivity2Operations {
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

} // NonMedicinalSupplyActivity2Operations
