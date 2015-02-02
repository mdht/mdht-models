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
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeMedicationsSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Discharge Medication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#getConsolDischargeMedication2s() <em>Get Consol Discharge Medication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2#validateHospitalDischargeMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeMedicationsSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2() {
		OperationsTestCase<DischargeMedicationsSectionEntriesOptional2> validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2TestCase = new OperationsTestCase<DischargeMedicationsSectionEntriesOptional2>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(DischargeMedicationsSectionEntriesOptional2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createDischargeMedication2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSectionEntriesOptional2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2(
					(DischargeMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolDischargeMedication2s() {

		DischargeMedicationsSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolDischargeMedication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<DischargeMedicationsSectionEntriesOptional2> validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<DischargeMedicationsSectionEntriesOptional2>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSectionEntriesOptional2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
					(DischargeMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<DischargeMedicationsSectionEntriesOptional2> validateHospitalDischargeMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<DischargeMedicationsSectionEntriesOptional2>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedicationsSectionEntriesOptional2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSectionEntriesOptional2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(
					(DischargeMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<DischargeMedicationsSectionEntriesOptional2> validateHospitalDischargeMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<DischargeMedicationsSectionEntriesOptional2>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSectionEntriesOptional2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(DischargeMedicationsSectionEntriesOptional2 target) {
				target.getCode().setCode("75311-1");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void setDependency(DischargeMedicationsSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptionalCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSectionEntriesOptional2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalCode(
					(DischargeMedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeMedicationsSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeMedicationsSectionEntriesOptional2> {
		@Override
		public DischargeMedicationsSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createDischargeMedicationsSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends DischargeMedicationsSectionEntriesOptional2Operations {
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

} // DischargeMedicationsSectionEntriesOptional2Operations
