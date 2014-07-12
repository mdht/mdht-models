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
import org.openhealthtools.mdht.uml.cda.Product;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSupplyOrder2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Supply Order2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2ContainsMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Immunization Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2ContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrder2InstructionInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order2 Instruction Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2#validateMedicationSupplyOrderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationSupplyOrder2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationSupplyOrder2ContainsMedicationInformation2() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrder2ContainsMedicationInformation2TestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrder2ContainsMedicationInformation2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				MedicationInformation2 mi2 = ConsolFactory.eINSTANCE.createMedicationInformation2().init();
				Product product = CDAFactory.eINSTANCE.createProduct();
				product.setManufacturedProduct(mi2);
				target.setProduct(product);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2ContainsMedicationInformation2(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrder2ContainsMedicationInformation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2TestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				Product p = CDAFactory.eINSTANCE.createProduct();
				p.setManufacturedProduct(ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
				target.setProduct(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrder2ContainsImmunizationMedicationInformation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationSupplyOrder2ContainsMedicationOrImmunization() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrder2ContainsMedicationOrImmunizationTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrder2ContainsMedicationOrImmunization",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {
				target.init();
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationSupplyOrder2 target) {
						target.init();
						Product p = CDAFactory.eINSTANCE.createProduct();
						p.setManufacturedProduct(ConsolFactory.eINSTANCE.createMedicationInformation2().init());
						target.setProduct(p);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationSupplyOrder2 target) {
						target.init();
						Product p = CDAFactory.eINSTANCE.createProduct();
						p.setManufacturedProduct(ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
						target.setProduct(p);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2ContainsMedicationOrImmunization(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrder2ContainsMedicationOrImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationSupplyOrder2InstructionInversionInd() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrder2InstructionInversionIndTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrder2InstructionInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER2_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.getEntryRelationships().get(0).setInversionInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrder2InstructionInversionInd(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrder2InstructionInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationSupplyOrderInstruction2() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrderInstruction2TestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrderInstruction2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderInstruction2(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderInstruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolInstruction2() {

		MedicationSupplyOrder2 target = objectFactory.create();
		target.getConsolInstruction2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderTemplateId() {
		OperationsTestCase<MedicationSupplyOrder2> validateMedicationSupplyOrderTemplateIdTestCase = new OperationsTestCase<MedicationSupplyOrder2>(
			"validateMedicationSupplyOrderTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder2 target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrder2Operations.validateMedicationSupplyOrderTemplateId(
					(MedicationSupplyOrder2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationSupplyOrder2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationSupplyOrder2> {
		public MedicationSupplyOrder2 create() {
			return ConsolFactory.eINSTANCE.createMedicationSupplyOrder2();
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
	private static class ConstructorTestClass extends MedicationSupplyOrder2Operations {
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

} // MedicationSupplyOrder2Operations
