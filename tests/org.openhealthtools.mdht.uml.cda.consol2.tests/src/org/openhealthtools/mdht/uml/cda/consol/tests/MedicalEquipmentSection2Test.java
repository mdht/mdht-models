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
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicalEquipmentSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionNonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2MedicalEquipmentOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Medical Equipment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2ProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#getConsolNonMedicinalSupplyActivity2s() <em>Get Consol Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#getMedicalEquipmentOrganizers() <em>Get Medical Equipment Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#getProcedureActivityProcedure2s() <em>Get Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicalEquipmentSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicalEquipmentSectionNonMedicinalSupplyActivity2() {
		OperationsTestCase<MedicalEquipmentSection2> validateMedicalEquipmentSectionNonMedicinalSupplyActivity2TestCase = new OperationsTestCase<MedicalEquipmentSection2>(
			"validateMedicalEquipmentSectionNonMedicinalSupplyActivity2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicalEquipmentSection2 target) {
				target.addSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSection2Operations.validateMedicalEquipmentSectionNonMedicinalSupplyActivity2(
					(MedicalEquipmentSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionNonMedicinalSupplyActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicalEquipmentSection2MedicalEquipmentOrganizer() {
		OperationsTestCase<MedicalEquipmentSection2> validateMedicalEquipmentSection2MedicalEquipmentOrganizerTestCase = new OperationsTestCase<MedicalEquipmentSection2>(
			"validateMedicalEquipmentSection2MedicalEquipmentOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicalEquipmentSection2 target) {
				target.addOrganizer(ConsolFactory.eINSTANCE.createMedicalEquipmentOrganizer().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSection2Operations.validateMedicalEquipmentSection2MedicalEquipmentOrganizer(
					(MedicalEquipmentSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSection2MedicalEquipmentOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicalEquipmentSection2ProcedureActivityProcedure2() {
		OperationsTestCase<MedicalEquipmentSection2> validateMedicalEquipmentSection2ProcedureActivityProcedure2TestCase = new OperationsTestCase<MedicalEquipmentSection2>(
			"validateMedicalEquipmentSection2ProcedureActivityProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicalEquipmentSection2 target) {
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSection2Operations.validateMedicalEquipmentSection2ProcedureActivityProcedure2(
					(MedicalEquipmentSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSection2ProcedureActivityProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolNonMedicinalSupplyActivity2s() {

		MedicalEquipmentSection2 target = objectFactory.create();
		target.getConsolNonMedicinalSupplyActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentOrganizers() {

		MedicalEquipmentSection2 target = objectFactory.create();
		target.getMedicalEquipmentOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityProcedure2s() {

		MedicalEquipmentSection2 target = objectFactory.create();
		target.getProcedureActivityProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentSectionTemplateId() {
		OperationsTestCase<MedicalEquipmentSection2> validateMedicalEquipmentSectionTemplateIdTestCase = new OperationsTestCase<MedicalEquipmentSection2>(
			"validateMedicalEquipmentSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection2 target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSection2Operations.validateMedicalEquipmentSectionTemplateId(
					(MedicalEquipmentSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentSectionCodeP() {
		OperationsTestCase<MedicalEquipmentSection2> validateMedicalEquipmentSectionCodePTestCase = new OperationsTestCase<MedicalEquipmentSection2>(
			"validateMedicalEquipmentSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection2 target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSection2Operations.validateMedicalEquipmentSectionCodeP(
					(MedicalEquipmentSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentSectionCode() {
		OperationsTestCase<MedicalEquipmentSection2> validateMedicalEquipmentSectionCodeTestCase = new OperationsTestCase<MedicalEquipmentSection2>(
			"validateMedicalEquipmentSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection2 target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicalEquipmentSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSection2Operations.validateMedicalEquipmentSectionCode(
					(MedicalEquipmentSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicalEquipmentSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalEquipmentSection2> {
		public MedicalEquipmentSection2 create() {
			return ConsolFactory.eINSTANCE.createMedicalEquipmentSection2();
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
	private static class ConstructorTestClass extends MedicalEquipmentSection2Operations {
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

} // MedicalEquipmentSection2Operations
