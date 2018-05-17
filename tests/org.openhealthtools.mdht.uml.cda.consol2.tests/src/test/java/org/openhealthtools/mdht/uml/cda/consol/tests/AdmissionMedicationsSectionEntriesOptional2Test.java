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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionMedicationsSectionEntriesOptional2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Medications Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#getConsolAdmissionMedication2s() <em>Get Consol Admission Medication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2#validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdmissionMedicationsSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAdmissionMedication2s() {

		AdmissionMedicationsSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolAdmissionMedication2s();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
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
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
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
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AdmissionMedicationsSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
		OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2> validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<AdmissionMedicationsSectionEntriesOptional2>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdmissionMedicationsSectionEntriesOptional2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createAdmissionMedication2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationsSectionEntriesOptional2Operations.validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
					(AdmissionMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdmissionMedicationsSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdmissionMedicationsSectionEntriesOptional2> {
		@Override
		public AdmissionMedicationsSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createAdmissionMedicationsSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends AdmissionMedicationsSectionEntriesOptional2Operations {
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

} // AdmissionMedicationsSectionEntriesOptional2Operations
