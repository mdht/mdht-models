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
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispense2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispense2ContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense2 Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseMedicationSupplyOrder2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#getConsolMedicationSupplyOrder2() <em>Get Consol Medication Supply Order2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2#validateMedicationDispenseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}</li>
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
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE2_CONTAINS_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispense2ContainsMedicationOrImmunization() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispense2ContainsMedicationOrImmunizationTestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispense2ContainsMedicationOrImmunization",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE2_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						p.setManufacturedProduct(ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2().init());
						target.setProduct(p);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispense2Operations.validateMedicationDispense2ContainsMedicationOrImmunization(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispense2ContainsMedicationOrImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseMedicationSupplyOrder2() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispenseMedicationSupplyOrder2TestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispenseMedicationSupplyOrder2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationDispense2Operations.validateMedicationDispenseMedicationSupplyOrder2(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseMedicationSupplyOrder2TestCase.doValidationTest();
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
	* @generated
	*/
	@Test
	public void testValidateMedicationDispenseTemplateId() {
		OperationsTestCase<MedicationDispense2> validateMedicationDispenseTemplateIdTestCase = new OperationsTestCase<MedicationDispense2>(
			"validateMedicationDispenseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationDispense2Operations.validateMedicationDispenseTemplateId(
					(MedicationDispense2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseTemplateIdTestCase.doValidationTest();
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

} // MedicationDispense2Operations
