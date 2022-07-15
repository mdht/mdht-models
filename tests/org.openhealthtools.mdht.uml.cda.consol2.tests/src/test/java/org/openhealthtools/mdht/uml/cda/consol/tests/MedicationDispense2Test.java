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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.Product;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispense2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Dispense2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispense2ContainsMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispense2ContainsImmunizationMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Immunization Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispense2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#getConsolMedicationSupplyOrder2() <em>Get Consol Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationDispense2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispense2ContainsMedicationInformation2() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispense2ContainsMedicationInformation2TestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispense2ContainsMedicationInformation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationDispense2 target) {
				MedicationInformation2 mi2 = ConsolFactory.eINSTANCE.createMedicationInformation2().init();
				Product product = CDAFactory.eINSTANCE.createProduct();
				product.setManufacturedProduct(mi2);
				target.setProduct(product);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispense2ContainsMedicationInformation2(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispense2ContainsMedicationInformation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispense2ContainsImmunizationMedicationInformation2() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispense2ContainsImmunizationMedicationInformation2TestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispense2ContainsImmunizationMedicationInformation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationDispense2 target) {
				Product p = CDAFactory.eINSTANCE.createProduct();
				p.setManufacturedProduct(ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
				target.setProduct(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispense2ContainsImmunizationMedicationInformation2(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispense2ContainsImmunizationMedicationInformation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationDispense2TemplateId() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispense2TemplateIdTestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispense2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense2 target) {

			}

			@Override
			protected void updateToPass(MedicationDispense2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispense2TemplateId(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispense2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseStatusCodeP() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispenseStatusCodePTestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispenseStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationDispense2 target) {
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispenseStatusCodeP(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationSupplyOrder2() {

		MedicationDispense2 target = objectFactory.create();
		target.getConsolMedicationSupplyOrder2();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseContainsMedicationOrImmunization() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispenseContainsMedicationOrImmunizationTestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispenseContainsMedicationOrImmunization",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense2 target) {
				target.init();
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationDispense2 target) {
						target.init();
						Product p = CDAFactory.eINSTANCE.createProduct();
						p.setManufacturedProduct(ConsolFactory.eINSTANCE.createMedicationInformation2().init());
						target.setProduct(p);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(MedicationDispense2 target) {
						target.init();
						Product p = CDAFactory.eINSTANCE.createProduct();
						p.setManufacturedProduct(
							ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
						target.setProduct(p);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispenseContainsMedicationOrImmunization(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseContainsMedicationOrImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseStatusCode() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispenseStatusCodeTestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispenseStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense2 target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS();
				target.setStatusCode(cs);
			}

			@Override
			protected void updateToPass(MedicationDispense2 target) {
				target.getStatusCode().setCode("completed");
			}

			@Override
			protected void setDependency(MedicationDispense2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationDispenseStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispenseStatusCode(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseRepeatNumber() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispenseRepeatNumberTestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispenseRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense2 target) {

			}

			@Override
			protected void updateToPass(MedicationDispense2 target) {
				target.init();
				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispenseRepeatNumber(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseMedicationSupplyOrder() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispenseMedicationSupplyOrderTestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispenseMedicationSupplyOrder",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense2 target) {

			}

			@Override
			protected void updateToPass(MedicationDispense2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createMedicationSupplyOrder2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispenseMedicationSupplyOrder(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseMedicationSupplyOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationDispense2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationDispense2> {
		@Override
		public MedicationDispense2 create() {
			return ConsolFactory.eINSTANCE.createMedicationDispense2();
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
	private static class ConstructorTestClass extends MedicationDispense2Operations {
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

} // MedicationDispense2Operations
