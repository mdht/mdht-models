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
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionMedicationsSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Medications Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Admission Medication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional2#getConsolAdmissionMedication2s() <em>Get Consol Admission Medication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionMedicationsSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication2() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication2TestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication2",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createAdmissionMedication2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication2(
					(HospitalAdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAdmissionMedication2s() {

		HospitalAdmissionMedicationsSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolAdmissionMedication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
					(HospitalAdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(
					(HospitalAdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HospitalAdmissionMedicationsSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(
					(HospitalAdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalAdmissionMedicationsSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements
			TestObjectFactory<HospitalAdmissionMedicationsSectionEntriesOptional2> {
		@Override
		public HospitalAdmissionMedicationsSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createHospitalAdmissionMedicationsSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends HospitalAdmissionMedicationsSectionEntriesOptional2Operations {
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

} // HospitalAdmissionMedicationsSectionEntriesOptional2Operations
