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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionEntriesOptional2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Section Entries Optional2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2#validateMedicationsSectionEntriesOptional2AbsenceOfMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional2 Absence Of Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2#validateMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2#validateMedicationsSectionEntriesOptionalMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2#validateMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsSectionEntriesOptional2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationsSectionEntriesOptional2AbsenceOfMedications() {
		OperationsTestCase<MedicationsSectionEntriesOptional2> validateMedicationsSectionEntriesOptional2AbsenceOfMedicationsTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional2>(
			"validateMedicationsSectionEntriesOptional2AbsenceOfMedications",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2_ABSENCE_OF_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptional2AbsenceOfMedications(
					(MedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptional2AbsenceOfMedicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<MedicationsSectionEntriesOptional2> validateMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional2>(
			"validateMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptionalCodeP(
					(MedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalMedicationActivity2() {
		OperationsTestCase<MedicationsSectionEntriesOptional2> validateMedicationsSectionEntriesOptionalMedicationActivity2TestCase = new OperationsTestCase<MedicationsSectionEntriesOptional2>(
			"validateMedicationsSectionEntriesOptionalMedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional2 target) {
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptionalMedicationActivity2(
					(MedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationActivity2s() {

		MedicationsSectionEntriesOptional2 target = objectFactory.create();
		target.getConsolMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<MedicationsSectionEntriesOptional2> validateMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional2>(
			"validateMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptionalTemplateId(
					(MedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<MedicationsSectionEntriesOptional2> validateMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<MedicationsSectionEntriesOptional2>(
			"validateMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSectionEntriesOptional2 target) {

			}

			@Override
			protected void updateToPass(MedicationsSectionEntriesOptional2 target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationsSectionEntriesOptional2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionEntriesOptional2Operations.validateMedicationsSectionEntriesOptionalCode(
					(MedicationsSectionEntriesOptional2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsSectionEntriesOptional2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsSectionEntriesOptional2> {
		@Override
		public MedicationsSectionEntriesOptional2 create() {
			return ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional2();
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
	private static class ConstructorTestClass extends MedicationsSectionEntriesOptional2Operations {
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

} // MedicationsSectionEntriesOptional2Operations
